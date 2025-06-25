package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.apache.bookkeeper.bookie.fileUtils.Cases;
import org.apache.bookkeeper.bookie.fileUtils.FileStatus;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.nio.channels.NonReadableChannelException;
import java.nio.file.*;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

import static org.mockito.Mockito.*;

@RunWith(Parameterized.class)
public class BufferedChannelReadTest {
    private BufferedChannel bufferedChannel;
    private final ByteBuf dest;
    private final long pos;
    private final int length;
    private int intOutput;
    private Class<? extends Exception> exceptionOutput;
    private final FileStatus fileConstraints;
    private FileChannel fc;
    private Set<PosixFilePermission> originalPermissions;
    private boolean fileClose;
    private final static Path PATH = Paths.get("src/test/java/org/apache/bookkeeper/bookie/fileUtils/testRead.txt");
    private final Cases env;
    private ByteBufAllocator allocator;

    public BufferedChannelReadTest(ByteBuf dest, long pos, int length, Object output, FileStatus fileConstraints, Cases env) {
        this.dest = dest;
        this.pos = pos;
        this.length = length;
        this.fileConstraints = fileConstraints;

        if (output instanceof Class && Exception.class.isAssignableFrom((Class<?>) output))
            this.exceptionOutput = (Class<? extends Exception>) output;
        else
            this.intOutput = (int) output;

        this.env = env;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        // test file size is 512 bytes
        return Arrays.asList(new Object[][] {
                //------INVALID INPUT TESTS---------
                { Unpooled.directBuffer(1024), -1, 1, IllegalArgumentException.class, FileStatus.READ_WRITE, Cases.DEFAULT },
                { null, 0, 1, NullPointerException.class, FileStatus.READ_WRITE, Cases.DEFAULT },
                {Unpooled.buffer(0), 0, 1, IllegalArgumentException.class, FileStatus.READ_WRITE, Cases.DEFAULT },

                // -----VALID INPUT TESTS--------
                { Unpooled.directBuffer(1024), 0, -1, 0, FileStatus.READ_WRITE, Cases.DEFAULT},


                { Unpooled.directBuffer(64), 0, 1, 64, FileStatus.READ_WRITE, Cases.START_POSITION_BIG },
                { Unpooled.directBuffer(64), 0, 0, 0, FileStatus.READ_WRITE, Cases.WRITEBUFFER_NOTEMPTY },

                { Unpooled.directBuffer(64), 1, 1, 63, FileStatus.READ_WRITE, Cases.WRITEBUFFER_NOTEMPTY },
                { Unpooled.directBuffer(64), 1, 0, 0, FileStatus.READ_WRITE, Cases.WRITEBUFFER_NOTEMPTY },



                { Unpooled.directBuffer(1024), 256, 0, IOException.class, FileStatus.READ_WRITE, Cases.START_POSITION_BIG },
                { Unpooled.directBuffer(1024), 255, 1, 1, FileStatus.READ_WRITE, Cases.START_POSITION_BIG },
                { Unpooled.directBuffer(1024), 255, 0, 0, FileStatus.READ_WRITE, Cases.START_POSITION_BIG },

                //-----TEST ON FILESTATUS:
                { Unpooled.directBuffer(64), 0, 1, 64, FileStatus.ONLY_WRITE, Cases.WRITEBUFFER_NOTEMPTY},
                { Unpooled.directBuffer(64), 0, 1, NonReadableChannelException.class, FileStatus.ONLY_WRITE, Cases.START_POSITION_BIG },
                { Unpooled.directBuffer(64), 0, 1, ClosedChannelException.class, FileStatus.CLOSE_CHANNEL, Cases.START_POSITION_BIG },




        });
    }

    @Before
    public void setUp() throws IOException {
        int capacity = 1024;
        setParam(fileConstraints);

        /* set up file and write 256 bytes on it */
        if (!fileConstraints.equals(FileStatus.EMPTY)) {
            ByteBuf buf = Unpooled.buffer(capacity);
            buf.writeBytes(new byte[256]);
            fc.write(buf.nioBuffer());
            fc.position(0);
        }

        if (!env.equals(Cases.NULL)) {
            bufferedChannel = spy(new BufferedChannel(UnpooledByteBufAllocator.DEFAULT, fc, capacity));
            setEnv(env);
        } else {
            setEnv(env);
            bufferedChannel = spy(new BufferedChannel(allocator, fc, capacity));
        }

        if (fileClose)
            fc.close();
    }

    @Test
    public void test() {
        int ret;
        try {
            ret = bufferedChannel.read(dest, pos, length);
            Assert.assertEquals(intOutput, ret);
        } catch (Exception e) {
            Assert.assertEquals(exceptionOutput, e.getClass());
        }
    }

    private void setParam(FileStatus param) throws IOException {
        if (Files.notExists(PATH)) {
            Files.createFile(PATH);
        }

        switch(param) {
            case ONLY_READ:
                fc = FileChannel.open(PATH, StandardOpenOption.READ, StandardOpenOption.CREATE);
                break;
            case ONLY_WRITE:
                fc = FileChannel.open(PATH, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
                break;
            case READ_WRITE:
                fc = FileChannel.open(PATH, StandardOpenOption.READ, StandardOpenOption.WRITE);
                break;
            case NO_PERMISSION:
            if (Files.notExists(PATH)) {
                Files.createFile(PATH);
            }
            fc = FileChannel.open(PATH, StandardOpenOption.READ, StandardOpenOption.CREATE);
            originalPermissions = Files.getPosixFilePermissions(PATH);
            Set<PosixFilePermission> noPerms = PosixFilePermissions.fromString("---------");
            Files.setPosixFilePermissions(PATH, noPerms);
            break;
            case CLOSE_CHANNEL:
                fc = FileChannel.open(PATH, StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
                fileClose = true;
                break;
            case EMPTY:
                fc = FileChannel.open(PATH, StandardOpenOption.WRITE, StandardOpenOption.READ);
                break;
        }
    }

    private void setEnv(Cases env) {
        switch (env) {
            case START_POSITION_BIG:
                /* Or you can move cursor in file, but is more simple in this way */
                bufferedChannel.writeBufferStartPosition.set(1024);
                break;
            case WRITEBUFFER_NOTEMPTY:
                bufferedChannel.writeBuffer.writeBytes(new byte[64]);
                break;
            case NULL:
                allocator = spy(UnpooledByteBufAllocator.DEFAULT);
                when(allocator.directBuffer(anyInt())).thenReturn(null);
                break;
        }
    }

    @After
    public void tearDown() throws IOException {
        if (fc != null && fc.isOpen()) {
            if (!fileConstraints.equals(FileStatus.ONLY_READ))
                fc.truncate(0);
            fc.close();
        }
        if (bufferedChannel != null) {
            bufferedChannel.close();
        }
        if (fileConstraints == FileStatus.NO_PERMISSION && originalPermissions != null) {
            Files.setPosixFilePermissions(PATH, originalPermissions);
        }
        if (dest != null) {
            dest.release();
        }
    }
}