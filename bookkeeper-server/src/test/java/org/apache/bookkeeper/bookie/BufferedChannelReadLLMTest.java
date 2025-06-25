package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.*;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import static org.junit.Assert.*;

public class BufferedChannelReadLLMTest {

    private static final Path TEST_PATH = Paths.get("src/test/java/org/apache/bookkeeper/bookie/fileUtils/llmRead.txt");
    private FileChannel fc;
    private BufferedChannel bufferedChannel;
    private static final int CAPACITY = 512;

    @Before
    public void setup() throws IOException {
        if (Files.notExists(TEST_PATH)) {
            Files.createFile(TEST_PATH);
        }
        fc = FileChannel.open(TEST_PATH, StandardOpenOption.READ, StandardOpenOption.WRITE);
        fc.truncate(0);
        bufferedChannel = new BufferedChannel(Unpooled.directBuffer().alloc(), fc, CAPACITY);
    }

    @After
    public void cleanup() throws IOException {
        if (fc != null && fc.isOpen()) {
            fc.close();
        }
        if (bufferedChannel != null) {
            bufferedChannel.close();
        }
        Files.deleteIfExists(TEST_PATH);
    }

    @Test
    public void testReadPartialFromWriteBufferAndFile() throws IOException {
        byte[] writeBufData = new byte[100];
        for (int i = 0; i < 100; i++) writeBufData[i] = (byte) i;
        ByteBuf tempBuf = Unpooled.wrappedBuffer(writeBufData);
        bufferedChannel.write(tempBuf);

        byte[] fileData = new byte[200];
        for (int i = 0; i < 200; i++) fileData[i] = (byte) (100 + i);
        ByteBuf fileDataBuf = Unpooled.wrappedBuffer(fileData);
        bufferedChannel.write(fileDataBuf);  // scrive anche nel fileChannel internamente
        bufferedChannel.flush(); // forza la scrittura sul file


        ByteBuf dest = Unpooled.buffer(150);
        int read = bufferedChannel.read(dest, 50, 150);
        assertEquals(150, read);

        for (int i = 0; i < 50; i++) assertEquals((byte) (50 + i), dest.getByte(i));
        for (int i = 50; i < 150; i++) assertEquals((byte) (100 + i - 50), dest.getByte(i));
    }

    @Test
    public void testReadFromFilePopulatesReadBuffer() throws IOException {
        // Scrittura di 128 byte tramite bufferedChannel
        byte[] fileContent = new byte[128];
        for (int i = 0; i < 128; i++) {
            fileContent[i] = (byte) (i + 1);
        }
        ByteBuf src = Unpooled.wrappedBuffer(fileContent);
        bufferedChannel.write(src);
        bufferedChannel.flush(); // molto importante: forza la scrittura nel FileChannel

        // Lettura dei primi 64 byte
        ByteBuf dest = Unpooled.buffer(64);
        int read = bufferedChannel.read(dest, 0, 64);
        assertEquals(64, read);

        for (int i = 0; i < 64; i++) {
            assertEquals((byte) (i + 1), dest.getByte(i));
        }
    }

    @Test
    public void testReadEndsExactlyAtEndOfWriteBuffer() throws IOException {
        byte[] data = new byte[128];
        for (int i = 0; i < 128; i++) data[i] = (byte) i;
        ByteBuf buf = Unpooled.wrappedBuffer(data);
        bufferedChannel.write(buf);

        ByteBuf dest = Unpooled.buffer(128);
        int read = bufferedChannel.read(dest, 0, 128);
        assertEquals(128, read);

        for (int i = 0; i < 128; i++) assertEquals((byte) i, dest.getByte(i));
    }

    @Test
    public void testReadFromAdvancedReadBufferStartPosition() throws IOException {
        // Scrivi 128 byte tramite BufferedChannel
        byte[] content = new byte[128];
        for (int i = 0; i < 128; i++) {
            content[i] = (byte) (i + 1);
        }
        bufferedChannel.write(Unpooled.wrappedBuffer(content));
        bufferedChannel.flush(); // Scrive effettivamente sul FileChannel

        // Leggi 32 byte dalla posizione 64
        ByteBuf dest = Unpooled.buffer(32);
        int read = bufferedChannel.read(dest, 64, 32);
        assertEquals(32, read);

        // Verifica contenuto letto
        for (int i = 0; i < 32; i++) {
            assertEquals((byte) (65 + i), dest.getByte(i));
        }
    }

    @Test
    public void testReadFromEmptyFileButFullWriteBuffer() throws IOException {
        byte[] bufferData = new byte[64];
        for (int i = 0; i < 64; i++) bufferData[i] = (byte) (255 - i);
        bufferedChannel.writeBuffer.writeBytes(bufferData);
        bufferedChannel.writeBufferStartPosition.set(0);

        ByteBuf dest = Unpooled.buffer(64);
        int read = bufferedChannel.read(dest, 0, 64);
        assertEquals(64, read);

        for (int i = 0; i < 64; i++) assertEquals((byte) (255 - i), dest.getByte(i));
    }
}
