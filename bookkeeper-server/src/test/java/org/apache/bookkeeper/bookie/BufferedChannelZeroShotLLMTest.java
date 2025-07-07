package org.apache.bookkeeper.bookie;

import static org.junit.Assert.assertEquals;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BufferedChannelZeroShotLLMTest {

    private static final int WRITE_CAPACITY = 1024;
    private static final int READ_CAPACITY = 1024;
    private File tempFile;
    private FileChannel fileChannel;
    private BufferedChannel bufferedChannel;
    private ByteBufAllocator allocator;

    @Before
    public void setUp() throws IOException {
        tempFile = File.createTempFile("buffered-channel-test", ".tmp");
        fileChannel = new RandomAccessFile(tempFile, "rw").getChannel();
        allocator = ByteBufAllocator.DEFAULT;
    }

    @After
    public void tearDown() throws IOException {
        if (bufferedChannel != null) {
            bufferedChannel.close();
        }
        if (fileChannel != null) {
            fileChannel.close();
        }
        tempFile.delete();
    }

    @Test
    public void testWriteBelowCapacity() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, WRITE_CAPACITY);
        ByteBuf data = Unpooled.wrappedBuffer("test data".getBytes());
        bufferedChannel.write(data);

        assertEquals(data.readableBytes(), bufferedChannel.position());
        assertEquals(data.readableBytes(), bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals(0, bufferedChannel.getFileChannelPosition());
    }

    @Test
    public void testWriteExceedingCapacity() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 10);
        ByteBuf data = Unpooled.wrappedBuffer("this is a long string".getBytes());
        bufferedChannel.write(data);

        assertEquals(data.readableBytes(), bufferedChannel.position());
        assertEquals(data.readableBytes() % 10, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals(data.readableBytes() - (data.readableBytes() % 10), bufferedChannel.getFileChannelPosition());
    }

    @Test
    public void testFlush() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, WRITE_CAPACITY);
        ByteBuf data = Unpooled.wrappedBuffer("flush test".getBytes());
        bufferedChannel.write(data);

        bufferedChannel.flush();

        assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
        assertEquals(data.readableBytes(), bufferedChannel.getFileChannelPosition());
        assertEquals(data.readableBytes(), fileChannel.size());
    }

    @Test
    public void testForceWrite() throws IOException {
        FileChannel mockFileChannel = mock(FileChannel.class);
        bufferedChannel = new BufferedChannel(allocator, mockFileChannel, WRITE_CAPACITY);

        bufferedChannel.forceWrite(true);
        verify(mockFileChannel, times(1)).force(true);

        bufferedChannel.forceWrite(false);
        verify(mockFileChannel, times(1)).force(false);
    }

    @Test
    public void testFlushAndForceWrite() throws IOException {
        FileChannel mockFileChannel = mock(FileChannel.class);
        when(mockFileChannel.position()).thenReturn(0L);
        when(mockFileChannel.write(any(ByteBuffer.class))).thenAnswer(invocation -> {
            ByteBuffer buf = invocation.getArgument(0);
            int remaining = buf.remaining();
            buf.position(buf.limit());
            return remaining;
        });

        bufferedChannel = new BufferedChannel(allocator, mockFileChannel, WRITE_CAPACITY);
        ByteBuf data = Unpooled.wrappedBuffer("data".getBytes());
        bufferedChannel.write(data);

        bufferedChannel.flushAndForceWrite(true);

        verify(mockFileChannel, times(1)).write(any(ByteBuffer.class));
        verify(mockFileChannel, times(1)).force(true);
    }

    @Test
    public void testUnpersistedBytesBound() throws IOException {
        FileChannel mockFileChannel = mock(FileChannel.class);
        when(mockFileChannel.position()).thenReturn(0L);
        when(mockFileChannel.write(any(ByteBuffer.class))).thenAnswer(invocation -> {
            ByteBuffer buf = invocation.getArgument(0);
            int remaining = buf.remaining();
            buf.position(buf.limit());
            return remaining;
        });

        long unpersistedBytesBound = 5;
        bufferedChannel = new BufferedChannel(allocator, mockFileChannel, WRITE_CAPACITY, READ_CAPACITY, unpersistedBytesBound);

        ByteBuf data1 = Unpooled.wrappedBuffer("123".getBytes());
        bufferedChannel.write(data1);

        assertEquals(3, bufferedChannel.getUnpersistedBytes());
        verify(mockFileChannel, never()).force(anyBoolean());

        ByteBuf data2 = Unpooled.wrappedBuffer("456".getBytes());
        bufferedChannel.write(data2);

        assertEquals(0, bufferedChannel.getUnpersistedBytes());
        verify(mockFileChannel, times(1)).force(false);
    }


    @Test
    public void testReadFromWriteBuffer() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, WRITE_CAPACITY);
        ByteBuf data = Unpooled.wrappedBuffer("read test".getBytes());
        bufferedChannel.write(data.copy());

        ByteBuf readBuffer = Unpooled.buffer(data.readableBytes());
        int bytesRead = bufferedChannel.read(readBuffer, 0, data.readableBytes());

        assertEquals(data.readableBytes(), bytesRead);
        assertEquals(data, readBuffer);
    }

    @Test
    public void testReadFromFile() throws IOException {
        ByteBuf data = Unpooled.wrappedBuffer("file read test".getBytes());
        fileChannel.write(data.nioBuffer());
        fileChannel.force(true);

        bufferedChannel = new BufferedChannel(allocator, fileChannel, WRITE_CAPACITY);

        ByteBuf readBuffer = Unpooled.buffer(data.readableBytes());
        int bytesRead = bufferedChannel.read(readBuffer, 0, data.readableBytes());

        assertEquals(data.readableBytes(), bytesRead);
        assertEquals(data, readBuffer);
    }

    @Test
    public void testReadFromBothBuffers() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, 10);
        ByteBuf data = Unpooled.wrappedBuffer("read from both buffers".getBytes());
        bufferedChannel.write(data.copy()); // This will cause a flush

        ByteBuf readBuffer = Unpooled.buffer(data.readableBytes());
        int bytesRead = bufferedChannel.read(readBuffer, 0, data.readableBytes());

        assertEquals(data.readableBytes(), bytesRead);
        assertEquals(data, readBuffer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadPastEOF() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, WRITE_CAPACITY);
        ByteBuf data = Unpooled.wrappedBuffer("data".getBytes());
        bufferedChannel.write(data);
        bufferedChannel.flush();

        ByteBuf readBuffer = Unpooled.buffer(10);
        bufferedChannel.read(readBuffer, 10, 1);
    }

    @Test
    public void testClose() throws IOException {
        FileChannel mockFileChannel = mock(FileChannel.class);
        bufferedChannel = new BufferedChannel(allocator, mockFileChannel, WRITE_CAPACITY);
        bufferedChannel.close();

        verify(mockFileChannel, times(1)).close();

        // Should be idempotent
        bufferedChannel.close();
        verify(mockFileChannel, times(1)).close();
    }

    @Test
    public void testClear() throws IOException {
        bufferedChannel = new BufferedChannel(allocator, fileChannel, WRITE_CAPACITY);
        ByteBuf data = Unpooled.wrappedBuffer("clear test".getBytes());
        bufferedChannel.write(data);

        bufferedChannel.clear();
        assertEquals(0, bufferedChannel.getNumOfBytesInWriteBuffer());
    }
}