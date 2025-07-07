package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Suite di test massivamente estesa per la classe BufferedChannel.
 * L'obiettivo è una validazione esaustiva che copra non solo i percorsi felici,
 * ma anche un'ampia gamma di edge case, input invalidi e sequenze operative complesse.
 */
@RunWith(MockitoJUnitRunner.class)
public class BufferedChannelGuidedToTLLMTest {

    private static final int BUFFER_CAPACITY = 1024;
    private static final long UNPERSISTED_BOUND = 2048;

    @Mock
    private FileChannel mockFileChannel;

    @Mock
    private ByteBufAllocator mockAllocator;

    private ByteBuf writeBuffer;

    private BufferedChannel bufferedChannel;

    // Variabile per catturare i dati scritti sul mock FileChannel
    private ByteBuffer writtenDataToFile;

    /**
     * Setup prima di ogni test.
     * Inizializza i mock, il buffer di scrittura reale (per testare la logica interna)
     * e l'istanza di BufferedChannel da testare.
     * Simula il comportamento base del FileChannel.
     */
    @Before
    public void setUp() throws IOException {
        // Usiamo un buffer reale per testare la logica di manipolazione del buffer,
        // ma viene fornito da un allocator mockato, come da requisito.
        writeBuffer = Unpooled.directBuffer(BUFFER_CAPACITY);

        // Cattura ciò che viene scritto nel FileChannel per poterlo verificare
        writtenDataToFile = ByteBuffer.allocate(BUFFER_CAPACITY * 4);

        when(mockAllocator.directBuffer(anyInt())).thenReturn(writeBuffer);
        when(mockFileChannel.position()).thenReturn(0L);

        // Simula la scrittura sul FileChannel, copiando i dati nel nostro buffer di cattura
        when(mockFileChannel.write(any(ByteBuffer.class))).thenAnswer(invocation -> {
            ByteBuffer source = invocation.getArgument(0);
            int bytesWritten = source.remaining();
            writtenDataToFile.put(source);
            when(mockFileChannel.position()).thenReturn((long) writtenDataToFile.position());
            return bytesWritten;
        });

        bufferedChannel = new BufferedChannel(mockAllocator, mockFileChannel, BUFFER_CAPACITY, UNPERSISTED_BOUND);
    }

    /**
     * Pulizia dopo ogni test.
     * Rilascia il buffer per evitare memory leak nei test.
     */
    @After
    public void tearDown(){
        if (writeBuffer.refCnt() > 0) {
            writeBuffer.release();
        }
    }

    // --- Categoria: Costruzione e Inizializzazione ---

    /**
     * Testa che il costruttore inizializzi correttamente lo stato interno.
     * Verifica che la posizione iniziale, la capacità e i byte non persistiti siano impostati come atteso.
     */
    @Test
    public void testConstructor_SuccessfulInitialization() throws IOException {
        assertEquals("Initial position should be 0", 0, bufferedChannel.position());
        assertEquals("Write buffer capacity should be correct", BUFFER_CAPACITY, bufferedChannel.writeCapacity);
        assertEquals("Unpersisted bytes should be 0 initially", 0, bufferedChannel.getUnpersistedBytes());
        assertEquals("FileChannel position should be 0", 0, bufferedChannel.getFileChannelPosition());
        verify(mockAllocator).directBuffer(BUFFER_CAPACITY);
        verify(mockFileChannel).position();
    }

    /**
     * Testa che il costruttore fallisca se il FileChannel fornito è nullo.
     * Si aspetta una NullPointerException, tipica quando si invoca un metodo su un oggetto nullo.
     */
    @Test(expected = NullPointerException.class)
    public void testConstructor_NullFileChannel_ShouldThrowException() throws IOException {
        new BufferedChannel(mockAllocator, null, BUFFER_CAPACITY);
    }

    /**
     * Testa il comportamento del costruttore quando il FileChannel è già chiuso.
     * L'invocazione di `fc.position()` dovrebbe lanciare una ClosedChannelException.
     */
    @Test(expected = ClosedChannelException.class)
    public void testConstructor_ClosedFileChannel_ShouldThrowException() throws IOException {
        when(mockFileChannel.position()).thenThrow(new ClosedChannelException());
        new BufferedChannel(mockAllocator, mockFileChannel, BUFFER_CAPACITY);
    }

    // --- Categoria: Operazioni di Scrittura (`write`) ---

    /**
     * Testa una singola scrittura di dimensioni inferiori alla capacità del buffer.
     * Il buffer non dovrebbe essere svuotato (flush) e i dati dovrebbero risiedere solo nel buffer di scrittura.
     */
    @Test
    public void testWrite_LessThanBufferCapacity_ShouldBuffer() throws IOException {
        ByteBuf data = Unpooled.wrappedBuffer("test-data".getBytes());
        bufferedChannel.write(data);

        assertEquals("Position should be updated to data length", data.readableBytes(), bufferedChannel.position());
        assertEquals("Write buffer should contain the written data", data.readableBytes(), bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals("Unpersisted bytes should be updated", data.readableBytes(), bufferedChannel.getUnpersistedBytes());
        verify(mockFileChannel, never()).write(any(ByteBuffer.class));
    }

    /**
     * Testa una singola scrittura di dimensioni esattamente uguali alla capacità del buffer.
     * Questo non dovrebbe ancora triggerare un flush, che avviene solo quando il buffer è pieno e si tenta di scrivere ancora.
     */

    /*
    @Test
    public void testWrite_EqualToBufferCapacity_ShouldFillBuffer() throws IOException {
        ByteBuf data = Unpooled.buffer(BUFFER_CAPACITY);
        data.writeBytes(new byte[BUFFER_CAPACITY]);

        bufferedChannel.write(data);

        assertEquals("Position should be updated", BUFFER_CAPACITY, bufferedChannel.position());
        //Errore nel test generato: quando il buffer è esattamente pieno. Si svuota tramite fflush, quindi Expected 0
        assertEquals("Write buffer should be full", BUFFER_CAPACITY, bufferedChannel.getNumOfBytesInWriteBuffer());
        verify(mockFileChannel, never()).write(any(ByteBuffer.class));
    }*/

    /**
     * Testa una scrittura che eccede la capacità del buffer.
     * Questo deve forzare un flush automatico del buffer sul FileChannel.
     */
    @Test
    public void testWrite_MoreThanBufferCapacity_ShouldFlush() throws IOException {
        ByteBuf data = Unpooled.buffer(BUFFER_CAPACITY + 100);
        byte[] largeData = new byte[BUFFER_CAPACITY + 100];
        data.writeBytes(largeData);

        bufferedChannel.write(data);

        assertEquals("Position should be updated correctly", BUFFER_CAPACITY + 100, bufferedChannel.position());
        assertEquals("Remaining data should be in the new buffer", 100, bufferedChannel.getNumOfBytesInWriteBuffer());
        verify(mockFileChannel, times(1)).write(any(ByteBuffer.class));
        assertEquals("File channel should have received the first chunk", BUFFER_CAPACITY, writtenDataToFile.position());
    }

    /**
     * Testa lo scenario di scritture multiple e piccole che, sommate, superano la capacità del buffer.
     * Verifica che il flush avvenga solo quando il buffer si riempie.
     */

    /*
    @Test
    public void testWrite_MultipleSmallWrites_ShouldFlushWhenFull() throws IOException {
        ByteBuf smallData = Unpooled.wrappedBuffer(new byte[BUFFER_CAPACITY / 2]);
        bufferedChannel.write(smallData.slice());
        verify(mockFileChannel, never()).write(any(ByteBuffer.class));

        bufferedChannel.write(smallData.slice());
        //Già qui il flush è triggerato!
        verify(mockFileChannel, never()).write(any(ByteBuffer.class));

        bufferedChannel.write(Unpooled.wrappedBuffer("a".getBytes())); // Questo triggera il flush
        assertEquals("Buffer should contain only the last byte", 1, bufferedChannel.getNumOfBytesInWriteBuffer());
        //verify(mockFileChannel, times(1)).write(any(ByteBuffer.class));
        assertEquals("Full buffer should be written to file", BUFFER_CAPACITY, writtenDataToFile.position());
    }*/

    /**
     * Testa la scrittura di un ByteBuf vuoto.
     * Non dovrebbe accadere nulla, nessuno stato dovrebbe cambiare e nessuna operazione di I/O dovrebbe essere eseguita.
     */
    @Test
    public void testWrite_EmptyByteBuf_ShouldDoNothing() throws IOException {
        ByteBuf emptyData = Unpooled.EMPTY_BUFFER;
        bufferedChannel.write(emptyData);

        assertEquals(0, bufferedChannel.position());
        assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals(0, bufferedChannel.getUnpersistedBytes());
        verify(mockFileChannel, never()).write(any(ByteBuffer.class));
    }

    // --- Categoria: Flush, Force e unpersistedBytesBound ---

    /**
     * Testa che la chiamata `flush()` su un buffer parzialmente pieno scriva i suoi contenuti sul FileChannel.
     */
    @Test
    public void testFlush_PartialBuffer_ShouldWriteToFile() throws IOException {
        ByteBuf data = Unpooled.wrappedBuffer("partial-data".getBytes());
        int dataSize = data.readableBytes();
        bufferedChannel.write(data);

        bufferedChannel.flush();

        assertEquals("Buffer should be empty after flush", 0, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals("File channel position should be updated", dataSize, bufferedChannel.getFileChannelPosition());
        verify(mockFileChannel, times(1)).write(any(ByteBuffer.class));
        assertEquals("Correct data size should be written to file", dataSize, writtenDataToFile.position());
    }


    /**
     * Testa che `forceWrite(false)` invochi `fileChannel.force(false)` e resetti `unpersistedBytes`.
     */
    @Test
    public void testForceWrite_ShouldInvokeFileChannelForce() throws IOException {
        ByteBuf data = Unpooled.wrappedBuffer("some data".getBytes());
        bufferedChannel.write(data);
        bufferedChannel.flush();

        assertTrue(bufferedChannel.getUnpersistedBytes() > 0);

        bufferedChannel.forceWrite(false);

        verify(mockFileChannel).force(false);
        // unpersistedBytes viene resettato al contenuto attuale del buffer (che è 0)
        assertEquals("Unpersisted bytes should be reset", 0, bufferedChannel.getUnpersistedBytes());
    }

    /**
     * Testa che una scrittura che supera `unpersistedBytesBound` triggeri un flush e un force automatici.
     */
    @Test
    public void testWrite_TriggeringUnpersistedBound_ShouldFlushAndForce() throws IOException {
        ByteBuf data = Unpooled.buffer((int) UNPERSISTED_BOUND);
        data.writeBytes(new byte[(int) UNPERSISTED_BOUND]);

        bufferedChannel.write(data);

        // La scrittura di UNPERSISTED_BOUND byte triggera flush e force.
        // Il primo flush avviene quando il primo blocco da 1024 riempie il buffer.
        // Il secondo flush + force avviene perché il totale supera la soglia.
        verify(mockFileChannel, atLeast(2)).write(any(ByteBuffer.class));
        verify(mockFileChannel, times(1)).force(false);
        assertEquals("Total written bytes to file", UNPERSISTED_BOUND, writtenDataToFile.position());
    }


    /**
     * Testa `flushAndForceWrite` per garantire che chiami sia `flush` che `forceWrite`.
     */

    /*
    @Test
    public void testFlushAndForceWrite_ShouldCallBothMethods() throws IOException {
        ByteBuf data = Unpooled.wrappedBuffer("data".getBytes());
        bufferedChannel.write(data);

        bufferedChannel.flushAndForceWrite(true);

        ArgumentCaptor<ByteBuffer> captor = ArgumentCaptor.forClass(ByteBuffer.class);
        verify(mockFileChannel, times(1)).write(captor.capture());
        verify(mockFileChannel, times(1)).force(true);

        assertEquals("Data written should match", data.readableBytes(), captor.getValue().remaining());
        assertEquals("Buffer should be empty", 0, bufferedChannel.getNumOfBytesInWriteBuffer());
    }*/

    // --- Categoria: Operazioni di Lettura (`read`) ---

    /**
     * Testa la lettura di dati che si trovano interamente nel buffer di scrittura.
     * La lettura non dovrebbe coinvolgere il FileChannel.
     */
    @Test
    public void testRead_FromWriteBuffer_ShouldSucceed() throws IOException {
        byte[] testData = "buffered-read-test".getBytes();
        ByteBuf data = Unpooled.wrappedBuffer(testData);
        bufferedChannel.write(data);

        ByteBuf dest = Unpooled.buffer(testData.length);
        int bytesRead = bufferedChannel.read(dest, 0, testData.length);

        assertEquals("Should read all bytes", testData.length, bytesRead);
        byte[] readBytes = new byte[testData.length];
        dest.readBytes(readBytes);
        assertArrayEquals("Read data should match written data", testData, readBytes);
        verify(mockFileChannel, never()).read(any(ByteBuffer.class), anyLong());
    }

    /**
     * Testa la lettura di dati che si trovano interamente nel FileChannel (non nel buffer).
     */
    @Test
    public void testRead_FromFlushedFileChannel_ShouldSucceed() throws IOException {
        byte[] testData = "file-read-test".getBytes();
        ByteBuf data = Unpooled.wrappedBuffer(testData);
        bufferedChannel.write(data);
        bufferedChannel.flush(); // I dati sono ora (simulati) nel file

        // Simula la lettura dal FileChannel
        when(mockFileChannel.read(any(ByteBuffer.class), eq(0L))).thenAnswer(invocation -> {
            ByteBuffer dest = invocation.getArgument(0);
            dest.put(testData);
            return testData.length;
        });

        ByteBuf dest = Unpooled.buffer(testData.length);
        int bytesRead = bufferedChannel.read(dest, 0, testData.length);

        assertEquals("Should read all bytes from file", testData.length, bytesRead);
        byte[] readBytes = new byte[testData.length];
        dest.readBytes(readBytes);
        assertArrayEquals("Read data should match flushed data", testData, readBytes);
    }

    /**
     * Testa una lettura "a cavallo", che inizia nel FileChannel e termina nel buffer di scrittura.
     * Questo è uno scenario critico e complesso.
     */
    @Test
    public void testRead_SpanningFileAndWriteBuffer_ShouldSucceed() throws IOException {
        byte[] fileData = new byte[500];
        for (int i = 0; i < 500; i++) fileData[i] = 'F';

        byte[] bufferData = new byte[500];
        for (int i = 0; i < 500; i++) bufferData[i] = 'B';

        // Simula i dati già presenti nel file
        when(mockFileChannel.read(any(ByteBuffer.class), eq(250L))).thenAnswer(invocation -> {
            ByteBuffer dest = invocation.getArgument(0);
            dest.put(fileData, 250, 250); // Metti gli ultimi 250 byte del file nel buffer di lettura
            return 250;
        });

        // Scrivi dati nel buffer di scrittura
        bufferedChannel.flush(); // Svuota il buffer per avere uno stato di partenza pulito
        when(mockFileChannel.position()).thenReturn(500L); // Simula che il file ora ha 500 byte
        bufferedChannel = new BufferedChannel(mockAllocator, mockFileChannel, BUFFER_CAPACITY, 0); // Ricrea per aggiornare la posizione
        bufferedChannel.write(Unpooled.wrappedBuffer(bufferData)); // Ora il buffer di scrittura contiene i dati 'B'

        ByteBuf dest = Unpooled.buffer(500);
        int bytesRead = bufferedChannel.read(dest, 250, 500); // Leggi 250 byte dal file e 250 dal buffer

        assertEquals("Should read 500 bytes in total", 500, bytesRead);
        byte[] result = new byte[500];
        dest.readBytes(result);

        for (int i = 0; i < 250; i++) {
            assertEquals("First part should be from file ('F')", 'F', result[i]);
        }
        for (int i = 250; i < 500; i++) {
            assertEquals("Second part should be from buffer ('B')", 'B', result[i]);
        }
    }

    /**
     * Testa una lettura oltre la fine dei dati disponibili (EOF).
     * Dovrebbe lanciare un'eccezione.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRead_PastEOFInWriteBuffer_ShouldThrowException() throws IOException {
        bufferedChannel.write(Unpooled.wrappedBuffer("data".getBytes()));
        ByteBuf dest = Unpooled.buffer(10);
        bufferedChannel.read(dest, 10, 1); // Cerca di leggere oltre la fine dei dati bufferizzati
    }

    // --- Categoria: Input Invalidi e Robustezza ---

    /**
     * Testa che la lettura con una lunghezza negativa lanci un'eccezione appropriata.
     */

    /*
    //Errore nel test, deve ritornare 0
    @Test(expected = IllegalArgumentException.class)
    public void testRead_WithNegativeLength_ShouldThrowException() throws IOException {
        bufferedChannel.read(Unpooled.buffer(10), 0, -10);
    }*/

    /**
     * Testa che la lettura con una posizione negativa lanci un'eccezione (in questo caso IOException perché
     * la logica di read entra in un loop infinito o stato inconsistente che risulta in un errore di short read).
     */
    @Test(expected = IOException.class)
    public void testRead_WithNegativePosition_ShouldThrowException() throws IOException {
        // La logica interna non gestisce `pos < 0` esplicitamente, ma fallisce perché
        // `readBufferStartPosition` diventa negativo, portando a un fallimento nella read dal channel.
        bufferedChannel.read(Unpooled.buffer(10), -1, 10);
    }

    /**
     * Testa che la lettura in un buffer di destinazione troppo piccolo lanci un'eccezione.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRead_DestinationBufferTooSmall_ShouldThrowException() throws IOException {
        ByteBuf dest = Unpooled.buffer(5);
        bufferedChannel.read(dest, 0, 10); // Prova a leggere 10 byte in un buffer da 5
    }

    // --- Categoria: Ciclo di Vita (`close`) ---

    /**
     * Testa che il metodo `close()` rilasci correttamente il `writeBuffer`.
     * Utilizza la verifica di Mockito sul buffer (anche se reale) per confermare il rilascio.
     * In questo test, sostituiamo il buffer reale con un mock per poter verificare `release()`.
     */
    @Test
    public void testClose_ShouldReleaseWriteBuffer() throws IOException {
        ByteBuf mockBuffer = mock(ByteBuf.class);
        when(mockAllocator.directBuffer(anyInt())).thenReturn(mockBuffer);

        BufferedChannel chanToClose = new BufferedChannel(mockAllocator, mockFileChannel, BUFFER_CAPACITY);
        chanToClose.close();

        verify(mockBuffer, times(1)).release();
    }

    /**
     * Testa che `close()` invochi `close()` sul FileChannel sottostante.
     */
    @Test
    public void testClose_ShouldCloseFileChannel() throws IOException {
        bufferedChannel.close();
        verify(mockFileChannel, times(1)).close();
    }

    /**
     * Testa che chiamare `close()` più volte non abbia effetti collaterali e chiuda il FileChannel una sola volta.
     */
    @Test
    public void testClose_MultipleCalls_ShouldBeIdempotent() throws IOException {
        bufferedChannel.close();
        bufferedChannel.close();
        bufferedChannel.close();

        verify(mockFileChannel, times(1)).close();
    }

    /**
     * Testa che qualsiasi operazione di scrittura dopo la chiusura fallisca.
     * Ci si aspetta un NullPointerException perché il buffer interno viene deallocato.
     */
    /*
    //Errore: Return IllegalReferenceCountException
    @Test(expected = NullPointerException.class)
    public void testWrite_AfterClose_ShouldFail() throws IOException {
        bufferedChannel.close();
        bufferedChannel.write(Unpooled.wrappedBuffer("fail".getBytes()));
    }
    */

    /**
     * Correzione test manualmente:
     */

    @Test
    public void testWrite_EqualToBufferCapacity_ShouldFillBuffer() throws IOException {
        ByteBuf data = Unpooled.buffer(BUFFER_CAPACITY);
        data.writeBytes(new byte[BUFFER_CAPACITY]);

        bufferedChannel.write(data);

        assertEquals("Position should be updated", BUFFER_CAPACITY, bufferedChannel.position());
        assertEquals("Write buffer should be full", 0, bufferedChannel.getNumOfBytesInWriteBuffer());
    }

    /**
     * Testa lo scenario di scritture multiple e piccole che, sommate, superano la capacità del buffer.
     * Verifica che il flush avvenga solo quando il buffer si riempie.
     */

    @Test
    public void testWrite_MultipleSmallWrites_ShouldFlushWhenFull() throws IOException {
        ByteBuf smallData = Unpooled.wrappedBuffer(new byte[BUFFER_CAPACITY / 2]);
        bufferedChannel.write(smallData.slice());
        verify(mockFileChannel, never()).write(any(ByteBuffer.class));

        bufferedChannel.write(smallData.slice());

        verify(mockFileChannel, times(1)).write(any(ByteBuffer.class));

        bufferedChannel.write(Unpooled.wrappedBuffer("a".getBytes())); // Questo triggera il flush
        assertEquals("Buffer should contain only the last byte", 1, bufferedChannel.getNumOfBytesInWriteBuffer());

    }

    /**
     * Testa `flushAndForceWrite` per garantire che chiami sia `flush` che `forceWrite`.
     * Fixed by LLM
     */
    @Test
    public void testFlushAndForceWrite_ShouldCallBothMethods() throws IOException {
        ByteBuf data = Unpooled.wrappedBuffer("data".getBytes());
        bufferedChannel.write(data);

        bufferedChannel.flushAndForceWrite(true);

        ArgumentCaptor<ByteBuffer> captor = ArgumentCaptor.forClass(ByteBuffer.class);
        verify(mockFileChannel, times(1)).write(captor.capture());
        verify(mockFileChannel, times(1)).force(true);

        // **FIXED**: Controlliamo il `limit` del buffer, non i byte rimanenti,
        // perché il buffer viene consumato durante la scrittura mockata.
        // Il `limit` indica la dimensione totale dei dati che erano pronti per essere scritti.
        assertEquals("Data written should match", data.readableBytes(), captor.getValue().limit());
        assertEquals("Buffer should be empty", 0, bufferedChannel.getNumOfBytesInWriteBuffer());
    }

    /**
     * Testa che la lettura con una lunghezza negativa lanci un'eccezione appropriata.
     */
    @Test
    public void testRead_WithNegativeLength_ShouldThrowException() throws IOException {
        assertEquals(0, bufferedChannel.read(Unpooled.buffer(10), 0, -10));
    }


}