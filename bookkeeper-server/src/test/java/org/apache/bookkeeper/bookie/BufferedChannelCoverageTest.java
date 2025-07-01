package org.apache.bookkeeper.bookie;

import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import static org.mockito.Mockito.*;



/**
 * Classe di test dedicata a coprire metodi specifici di BufferedChannel
 * non coperti da test parametrici complessi.
 */
public class BufferedChannelCoverageTest {

    private BufferedChannel bufferedChannel;
    private FileChannel fc;
    private static final int CAPACITY = 1024;
    private final static Path PATH = Paths.get("src/test/java/org/apache/bookkeeper/bookie/fileUtils/testCoverage.txt");

    @Before
    public void setUp() throws IOException {
        // Assicura che la directory e il file di test esistano
        Files.createDirectories(PATH.getParent());
        this.fc = FileChannel.open(PATH, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE, StandardOpenOption.READ);
        bufferedChannel = new BufferedChannel(UnpooledByteBufAllocator.DEFAULT, fc, CAPACITY, CAPACITY);
    }

    @After
    public void tearDown() throws IOException {
        if (bufferedChannel != null) {
            // La chiusura del BufferedChannel chiude anche il FileChannel sottostante.
            bufferedChannel.close();
        } else if (fc != null && fc.isOpen()) {
            fc.close();
        }
    }


    @Test
    public void forceWriteTest() throws IOException {
        //Scriviamo in un buffer facendo incrementare unpersistedBytes:
        bufferedChannel.write(Unpooled.buffer().writeBytes(new byte[32]));

        long positionBefore = bufferedChannel.getFileChannelPosition();
        long positionAfter = bufferedChannel.forceWrite(true);

        Assert.assertEquals(positionAfter, positionBefore);

        //Ora vediamo se il tutto funziona ancora quando non ci sono dati da salavare
        positionBefore = bufferedChannel.getFileChannelPosition();
        positionAfter = bufferedChannel.forceWrite(true);

        Assert.assertEquals(positionAfter, positionBefore);
    }

    @Test
    public void flushAndForceWriteTest() throws IOException {
        bufferedChannel.write(Unpooled.buffer().writeBytes(new byte[32]));
        bufferedChannel.flushAndForceWrite(true);

        Assert.assertEquals(0, bufferedChannel.getUnpersistedBytes());
        Assert.assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());

    }

    /*
    @Test
    public void testClear() throws IOException {
        bufferedChannel.write(Unpooled.buffer().writeBytes(new byte[32]));
        Assert.assertTrue(bufferedChannel.getUnpersistedBytes()>0);
        Assert.assertTrue(bufferedChannel.getNumOfBytesInWriteBuffer()>0);

        bufferedChannel.clear();

        Mi aspettavo che clear resettasse anche getUnpersistedBytes, ma resetta solo il buffer
        //Assert.assertEquals(0, bufferedChannel.getUnpersistedBytes());
        Assert.assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());

    }
    */

    /*Modify for mutation*/
    @Test
    public void testClear() throws IOException {
        // Scrivo dati nel writeBuffer
        bufferedChannel.write(Unpooled.buffer().writeBytes(new byte[32]));

        // Forzo il flush per scrivere i dati su disco
        bufferedChannel.flush();

        // Ora leggo da posizione 0, i dati sono presenti nel file
        bufferedChannel.read(Unpooled.buffer(64), 0, 32);

        // Ora il readBuffer dovrebbe contenere dati (non vuoto)
        Assert.assertTrue(bufferedChannel.readBuffer.readableBytes() > 0);

        // Chiamo clear()
        bufferedChannel.clear();

        // Verifico che il readBuffer sia svuotato
        Assert.assertEquals(0, bufferedChannel.readBuffer.readableBytes());

        // Verifico che anche il writeBuffer sia svuotato
        Assert.assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
    }

    //Test added for mutation:
    @Test
    public void testWriteBufferStartPositionIsSetOnConstruction() throws IOException {
        FileChannel mockFc = mock(FileChannel.class);
        when(mockFc.position()).thenReturn(1024L);

        BufferedChannel bufferedChannel = new BufferedChannel(PooledByteBufAllocator.DEFAULT, mockFc, 1000, 1000, 100);

        Assert.assertEquals(1024L, bufferedChannel.writeBufferStartPosition.get());
    }







}