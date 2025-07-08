package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.NonWritableChannelException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collection;

import static org.mockito.Mockito.*;

@RunWith(Parameterized.class)
public class BufferedChannelWriteTest {

    // Parametri del test
    private final String description;
    private final ByteBuf src;
    private final byte[] initialData;
    private final long unpersistedBytesBound;
    private final Class<? extends Exception> expectedException;
    private final boolean expectFlush;
    private final boolean expectForceWrite;
    private final long expectedFinalPosition;
    private final long expectedBytesInWriteBuffer;
    private final FileStatus fileStatus;

    // Stato del test
    private BufferedChannel bufferedChannel;
    private FileChannel fc; // Canale reale, non più un mock

    // Capacità fissa per i test
    private static final int CAPACITY = 1024;
    // Percorso fisso per il file di test
    private final static Path PATH = Paths.get("src/test/java/org/apache/bookkeeper/bookie/fileUtils/testWrite.txt");

    /**
     * Enum per definire lo stato del FileChannel prima del test.
     */
    private enum FileStatus {
        READ_WRITE,
        ONLY_READ,
    }

    public BufferedChannelWriteTest(String description, ByteBuf src, byte[] initialData, long unpersistedBytesBound,
                                    Class<? extends Exception> expectedException, FileStatus fileStatus,
                                    boolean expectFlush, boolean expectForceWrite,
                                    long expectedFinalPosition, long expectedBytesInWriteBuffer) {
        this.description = description;
        this.src = src;
        this.initialData = initialData;
        this.unpersistedBytesBound = unpersistedBytesBound;
        this.expectedException = expectedException;
        this.fileStatus = fileStatus;
        this.expectFlush = expectFlush;
        this.expectForceWrite = expectForceWrite;
        this.expectedFinalPosition = expectedFinalPosition;
        this.expectedBytesInWriteBuffer = expectedBytesInWriteBuffer;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // --- DESCRIZIONE, SRC, INITIAL_DATA, UNPERSISTED_BOUND, EXCEPTION, FILE_STATUS, EXPECT_FLUSH, EXPECT_FORCE, FINAL_POS, FINAL_BYTES_IN_BUFFER ---

                // --- CASI DI BASE (SENZA FLUSH/FORCE) ---
                {"Buffer vuoto: scrittura su writeBuffer", Unpooled.copiedBuffer(new byte[128]), null, 0, null, FileStatus.READ_WRITE, false, false, 128, 128},
                {"Buffer non vuoto, scrittura ancora su writeBuffer", Unpooled.copiedBuffer(new byte[256]), new byte[100], 0, null, FileStatus.READ_WRITE, false, false, 100 + 256, 100 + 256},
                {"Src vuoto", Unpooled.EMPTY_BUFFER, new byte[100], 0, null, FileStatus.READ_WRITE, false, false, 100, 100},
                {"Src deallocato", deallocatedBuffer(), new byte[0], 0, IndexOutOfBoundsException.class, FileStatus.READ_WRITE, false, false, 0, 0},
                // --- CASI CHE CAUSANO FLUSH ---
                {"Scrittura che riempie esattamente il buffer(inizialmente vuoto): chiamata flush()", Unpooled.copiedBuffer(new byte[CAPACITY]), null, 0, null, FileStatus.READ_WRITE, true, false, (long) CAPACITY, 0},
                {"Scrittura che riempe esattamente il buffer(non vuoto): chiamata flush() e buffer vuoto", Unpooled.copiedBuffer(new byte[CAPACITY - 100]), new byte[100], 0, null, FileStatus.READ_WRITE, true, false, (long) CAPACITY, 0},
                {"Scrittura che supera la capacità del buffer(inizialmente vuoto): chiamata flush() e buffer non vuoto", Unpooled.copiedBuffer(new byte[CAPACITY + 256]), null, 0, null, FileStatus.READ_WRITE, true, false, (long) CAPACITY + 256, 256},


                // --- CASI CON UNPERSISTEDBYTESBOUND ---
                {"Unpersisted: Scrittura sotto la soglia", Unpooled.copiedBuffer(new byte[CAPACITY + 511]), null, CAPACITY + 512, null, FileStatus.READ_WRITE, true, false, CAPACITY + 511, 511},
                {"Unpersisted: Scrittura uguale alla soglia", Unpooled.copiedBuffer(new byte[CAPACITY + 512]), null, CAPACITY + 512, null, FileStatus.READ_WRITE, true, true, CAPACITY + 512, 0},
                {"Unpersisted: Scrittura sopra la soglia", Unpooled.copiedBuffer(new byte[CAPACITY + 513]), null, CAPACITY + 513, null, FileStatus.READ_WRITE, true, true, CAPACITY + 513, 0L},


                // --- CASI DI ERRORE ---
                {"Src null", null, null, 0, NullPointerException.class, FileStatus.READ_WRITE, false, false, 0, 0},
                {"Scrittura su canale di sola lettura", Unpooled.copiedBuffer(new byte[CAPACITY + 512]), null, CAPACITY + 512, NonWritableChannelException.class, FileStatus.ONLY_READ, true, true, CAPACITY + 512, 0},
        });
    }

    @Before
    public void setUp() throws IOException {
        // Assicura che la directory esista
        Files.createDirectories(PATH.getParent());

        // Apri il FileChannel in base allo stato richiesto dal test
        switch (fileStatus) {
            case READ_WRITE:
                // Apre in lettura/scrittura, creando il file e svuotandolo se esiste
                this.fc = FileChannel.open(PATH, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE, StandardOpenOption.READ);
                break;
            case ONLY_READ:
                // Apre in sola lettura. Un tentativo di scrittura causerà un'eccezione.
                this.fc = FileChannel.open(PATH, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.READ);
                break;
        }

        // Usiamo spy sul FileChannel reale per verificare le chiamate a write()
        this.fc = spy(this.fc);

        // Crea l'istanza di BufferedChannel usando 'spy' per verificare le chiamate a forceWrite()
        bufferedChannel = spy(new BufferedChannel(UnpooledByteBufAllocator.DEFAULT, fc, CAPACITY, CAPACITY, unpersistedBytesBound));

        // Imposta lo stato iniziale se necessario
        if (initialData != null && initialData.length > 0) {
            ByteBuf initialContent = Unpooled.copiedBuffer(initialData);
            // Questa scrittura è parte del setup, quindi non la verificheremo.
            // Il reset dei mock/spy garantisce che solo le interazioni nel test vengano contate.
            bufferedChannel.write(initialContent);
            reset(fc);
            reset(bufferedChannel);
        }
    }

    @Test
    public void testWrite() {
        try {
            bufferedChannel.write(src);

            if (expectedException != null) {
                Assert.fail("Test case '" + description + "' expected an exception of type "
                        + expectedException.getName() + " but none was thrown.");
            }

            // Verifica dello stato finale del BufferedChannel
            Assert.assertEquals("Position is not as expected for test: " + description,
                    expectedFinalPosition, bufferedChannel.position());
            Assert.assertEquals("Bytes in write buffer are not as expected for test: " + description,
                    expectedBytesInWriteBuffer, bufferedChannel.getNumOfBytesInWriteBuffer());


            if (expectFlush) {
                // Verifica che flush sia stato chiamato.
                verify(fc, atLeastOnce()).write(any(java.nio.ByteBuffer.class));
            } else {
                // Verifica che flush() NON sia stato chiamato
                verify(fc, never()).write(any(java.nio.ByteBuffer.class));
            }

            if (expectForceWrite) {
                // Verifica che forceWrite() sia stato chiamato
                verify(bufferedChannel, times(1)).forceWrite(false);
            } else {
                // Verifica che forceWrite() NON sia stato chiamato
                verify(bufferedChannel, never()).forceWrite(anyBoolean());
            }

        } catch (Exception e) {
            if (expectedException == null) {
                Assert.fail("Test case '" + description + "' threw an unexpected exception: " + e.getClass().getName());
            }
            // Verifica che il tipo di eccezione sia quello atteso.
            Assert.assertTrue("Exception type is not as expected for test: " + description +
                            ". Expected: " + expectedException.getName() + ", Got: " + e.getClass().getName(),
                    expectedException.isAssignableFrom(e.getClass()));
        }
    }

    @After
    public void tearDown() throws IOException {
        //Modified for test Src deallocato
        if (src != null && src.refCnt() > 0) {
            src.release();
        }
        if (bufferedChannel != null) {
            bufferedChannel.close(); // Questo chiude anche il FileChannel sottostante
        }
    }

    private static ByteBuf deallocatedBuffer() {
        ByteBuf buf = Unpooled.buffer(16);
        buf.writeBytes(new byte[]{1, 2, 3, 4});
        buf.release();  // Dealloca il buffer
        return buf;
    }

}