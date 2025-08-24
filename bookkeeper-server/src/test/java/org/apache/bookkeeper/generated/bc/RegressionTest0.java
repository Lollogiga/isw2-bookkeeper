package org.apache.bookkeeper.generated.bc;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        org.junit.Assert.assertNotNull(byteBuf0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.directBuffer((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) 1, (int) '#');
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.nio.ByteOrder byteOrder0 = io.netty.buffer.Unpooled.LITTLE_ENDIAN;
        org.junit.Assert.assertNotNull(byteOrder0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.buffer((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray7 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf6 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf8);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufArray7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unpooledByteBufAllocator0.calculateNewCapacity((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 52 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf5);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) ' ', (byte) -1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 36 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer(100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer((int) ' ');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer((int) (byte) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        java.lang.Class<?> wildcardClass3 = unpooledByteBufAllocator0.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.buffer((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((-1L), (int) (short) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf1 = unpooledByteBufAllocator0.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyBoolean(false);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.directBuffer((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.directBuffer(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        java.lang.Class<?> wildcardClass12 = byteBuf11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufArray8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer((int) 'a');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble(10.0d);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(-1, 10)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) 1, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort((int) '#');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer((int) '#', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(1, 32)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        java.lang.Class<?> wildcardClass11 = compositeByteBuf10.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int[] intArray6 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray9 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf8 };
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray9);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufArray9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.heapBuffer((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer((int) 'a', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeDirectBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray7 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf6 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufArray7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unpooledByteBufAllocator0.calculateNewCapacity((int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 32 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyLong((long) (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        boolean boolean5 = unpooledByteBufAllocator0.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.heapBuffer((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyInt(100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 110 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unpooledByteBufAllocator0.calculateNewCapacity((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.heapBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyLong(10L);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unpooledByteBufAllocator0.calculateNewCapacity((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 52 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.ioBuffer((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 0 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(-1, 10)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.buffer();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.ioBuffer((int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) 100, 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(10, (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyLong(1L);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 0, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 0, 1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        bufferedChannel9.flushAndForceWrite(true);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.directBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int37 = bufferedChannel9.read(byteBuf35, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteBuf35);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray9 = new byte[][] { byteArray8 };
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray9);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf11);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable(10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        boolean boolean5 = unpooledByteBufAllocator0.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator1.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer(1, (int) (short) 100);
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer((int) (short) 0);
        int[] intArray17 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copyMedium(intArray17);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf18);
        io.netty.buffer.ByteBuf[] byteBufArray20 = new io.netty.buffer.ByteBuf[] { byteBuf12, byteBuf18 };
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBufArray20);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer(1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeHeapBuffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.ioBuffer((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer((int) '4');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer();
        java.lang.Class<?> wildcardClass10 = unpooledByteBufAllocator0.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort(1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf11);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        java.nio.channels.FileChannel fileChannel13 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(fileChannel13);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyMedium((int) ' ');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        double[] doubleArray3 = new double[] { 1.0d, 'a', '#' };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyDouble(doubleArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyDouble(doubleArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 97.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer(64, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.buffer((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer((int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer(64);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) 64);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        boolean boolean11 = unpooledByteBufAllocator0.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) 100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort((int) (short) -1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel11 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel11, 1, (long) (byte) 0);
        bufferedChannel14.flushAndForceWrite(true);
        long long17 = bufferedChannel14.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copyInt((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = bufferedChannel14.read(byteBuf19, (long) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyLong((long) (short) 100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyMedium(10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        java.lang.String str6 = unpooledByteBufAllocator0.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) (short) 0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long32 = bufferedChannel9.position();
        long long33 = bufferedChannel9.size();
        bufferedChannel9.clear();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (short) 0, (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(100, 10)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer(10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator0.compositeBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) 100L);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) 10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator10.ioBuffer();
        int int16 = unpooledByteBufAllocator10.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator10.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator10.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator10.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel21 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel21, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel21, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel21, (int) (byte) 10, 100, (long) 1);
        bufferedChannel32.clear();
        bufferedChannel32.close();
        int[] intArray39 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.copyMedium(intArray39);
        io.netty.buffer.ByteBuf byteBuf41 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray42 = new io.netty.buffer.ByteBuf[] { byteBuf40, byteBuf41 };
        io.netty.buffer.ByteBuf byteBuf43 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray42);
        io.netty.buffer.ByteBuf byteBuf44 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray42);
        io.netty.buffer.ByteBuf byteBuf45 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray42);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel32.write(byteBuf45);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBufArray42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator13.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator13.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel18 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator13, fileChannel18, (int) (short) 1, (int) 'a', 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel18, (int) (short) -1, (int) (byte) 1, (long) 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(fileChannel18);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) ' ', (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) 1, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.heapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        short[] shortArray3 = new short[] { (byte) 1, (byte) 100, (byte) 100 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyShort(shortArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf4);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] { (short) 1, (short) 100, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (byte) 100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(100, 64)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(0, 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator5 = new io.netty.buffer.UnpooledByteBufAllocator(false);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator5.heapBuffer(100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator8 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator8.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator8.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator8.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator8.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator8.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator18.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator18.ioBuffer();
        int int24 = unpooledByteBufAllocator18.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator18.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator18.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator18.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel29 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator18, fileChannel29, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator17, fileChannel29, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator8, fileChannel29, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel43 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator5, fileChannel29, 64, (long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel29, (int) (byte) -1, (int) (short) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(fileChannel29);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.ioBuffer((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(10, 100)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf5);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.close();
        long long11 = bufferedChannel9.getFileChannelPosition();
        bufferedChannel9.close();
        int[] intArray17 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copyMedium(intArray17);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copyInt(intArray17);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copyShort(intArray17);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copyShort(intArray17);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel9.write(byteBuf21);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyLong((long) 10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWrite(true);
        long long36 = bufferedChannel9.getFileChannelPosition();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator39 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf40 = unpooledByteBufAllocator39.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int43 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf40, (long) 64, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf40);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyMedium(100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (byte) 10, (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) ' ');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyMedium((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyInt((int) (short) 100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((-1), (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 1, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator3.ioBuffer(64, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = unpooledByteBufAllocator0.calculateNewCapacity(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 10 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyLong((-1L));
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(100, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer();
        java.lang.String str12 = unpooledByteBufAllocator0.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.directBuffer((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.ioBuffer((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.ioBuffer((int) (short) 0, (int) (byte) 10);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator8 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator8.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator8.ioBuffer();
        int int14 = unpooledByteBufAllocator8.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator8.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator8.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator8.heapBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator8.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator23 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        int int30 = unpooledByteBufAllocator24.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf31 = unpooledByteBufAllocator24.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator24.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator24.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel35 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator24, fileChannel35, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator23, fileChannel35, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator8, fileChannel35, (int) (byte) 1, 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel35, (-1), (int) (byte) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(fileChannel35);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 5, cap: 5/5).slice(0, 97)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        int int15 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator0.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort(0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer((int) (short) 0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        int int15 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator16.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator16.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator16.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator16.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator16.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator25 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator26.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator26.ioBuffer();
        int int32 = unpooledByteBufAllocator26.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator26.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator26.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator26.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel37 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel37, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator25, fileChannel37, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator16, fileChannel37, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel37, 1, (-1L));
        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray61 = new byte[][] { byteArray60 };
        io.netty.buffer.ByteBuf byteBuf62 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray61);
        io.netty.buffer.ByteBuf byteBuf63 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray61);
        io.netty.buffer.ByteBuf byteBuf64 = io.netty.buffer.Unpooled.copiedBuffer(byteArray61);
        io.netty.buffer.ByteBuf byteBuf65 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray61);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = bufferedChannel51.read(byteBuf65, (long) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(fileChannel37);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertNotNull(byteBuf62);
        org.junit.Assert.assertNotNull(byteBuf63);
        org.junit.Assert.assertNotNull(byteBuf64);
        org.junit.Assert.assertNotNull(byteBuf65);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWrite(true);
        int[] intArray40 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf41 = io.netty.buffer.Unpooled.copyMedium(intArray40);
        io.netty.buffer.ByteBuf byteBuf42 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray43 = new io.netty.buffer.ByteBuf[] { byteBuf41, byteBuf42 };
        io.netty.buffer.ByteBuf byteBuf44 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray43);
        io.netty.buffer.ByteBuf byteBuf45 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray43);
        io.netty.buffer.ByteBuf byteBuf46 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray43);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = bufferedChannel9.read(byteBuf46, (long) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBufArray43);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf46);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel9.close();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = bufferedChannel9.size();
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.bookie.BufferedChannelBase.BufferedChannelClosedException; message: Attempting to access a file channel that has already been closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyInt((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = byteBuf1.getClass();
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(1, (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator0.metric();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.buffer((int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        int[] intArray3 = new int[] { (short) 1, 'a', 'a' };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyInt(intArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray3);
        java.lang.Class<?> wildcardClass6 = byteBuf5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 97 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer((int) '#', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf15);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufArray8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.buffer(10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.directBuffer((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel5, 0, (long) '4');
        bufferedChannel8.flush();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(fileChannel5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable((int) ' ');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        int int15 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.ioBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufArray8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) '#');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(64, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) (-1L));
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        int int15 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator16.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator16.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator16.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator16.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator16.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator25 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator26.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator26.ioBuffer();
        int int32 = unpooledByteBufAllocator26.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator26.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator26.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator26.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel37 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel37, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator25, fileChannel37, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator16, fileChannel37, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel37, 1, (-1L));
        bufferedChannel51.flushAndForceWrite(false);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(fileChannel37);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort((int) (short) 0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator10.ioBuffer();
        int int16 = unpooledByteBufAllocator10.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator10.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator10.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator10.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel21 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel21, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel21, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel21, (int) (byte) 10, 100, (long) 1);
        java.nio.ByteBuffer[] byteBufferArray36 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray36);
        bufferedChannel32.write(byteBuf40);
        bufferedChannel32.close();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator43 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf45 = unpooledByteBufAllocator43.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf46 = unpooledByteBufAllocator43.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf47 = unpooledByteBufAllocator43.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf48 = unpooledByteBufAllocator43.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf51 = unpooledByteBufAllocator43.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf52 = unpooledByteBufAllocator43.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf54 = unpooledByteBufAllocator43.compositeHeapBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int57 = bufferedChannel32.read((io.netty.buffer.ByteBuf) compositeByteBuf54, (long) (short) 100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=64)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNotNull(byteBufferArray36);
        org.junit.Assert.assertArrayEquals(byteBufferArray36, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator43);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertNotNull(compositeByteBuf48);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertNotNull(compositeByteBuf54);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel14 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel14, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, fileChannel14, 100, (int) (short) 0, (long) (-1));
        int int22 = bufferedChannel21.getNumOfBytesInWriteBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator23 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator23.buffer();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = bufferedChannel21.read(byteBuf24, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -10 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator23);
        org.junit.Assert.assertNotNull(byteBuf24);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        java.lang.Class<?> wildcardClass3 = compositeByteBuf2.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) 0, 64, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer(100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel14 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel14, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, fileChannel14, 100, (int) (short) 0, (long) (-1));
        long[] longArray22 = new long[] {};
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copyLong(longArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyLong(longArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf24);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = bufferedChannel21.read(byteBuf24, (long) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] {});
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable(100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) 10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unpooledByteBufAllocator3.calculateNewCapacity((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator7 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator7.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator7.ioBuffer();
        int int13 = unpooledByteBufAllocator7.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator7.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator7.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator7.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel18 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator7, fileChannel18, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel18, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel18, (int) (byte) 100, (int) (short) 10, 0L);
        java.lang.Class<?> wildcardClass30 = fileChannel18.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyInt((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) 10, 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flush();
        bufferedChannel9.clear();
        bufferedChannel9.flush();
        long long13 = bufferedChannel9.position();
        long long14 = bufferedChannel9.getFileChannelPosition();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable((int) (short) 0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteArray10);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer(1);
        java.lang.Class<?> wildcardClass2 = compositeByteBuf1.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, 64, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 116 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.close();
        java.lang.Class<?> wildcardClass11 = bufferedChannel9.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        long long13 = bufferedChannel9.forceWrite(true);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator14.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator14.ioBuffer();
        int int20 = unpooledByteBufAllocator14.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator14.buffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator14.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator14.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator14.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = bufferedChannel9.read(byteBuf25, (long) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator1.directBuffer(1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = unpooledByteBufAllocator1.getClass();
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(-1, 10)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        io.netty.buffer.ByteBuf[] byteBufArray1 = new io.netty.buffer.ByteBuf[] {};
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufArray1);
        org.junit.Assert.assertNotNull(byteBufArray1);
        org.junit.Assert.assertArrayEquals(byteBufArray1, new io.netty.buffer.ByteBuf[] {});
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) 100, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        org.junit.Assert.assertNotNull(byteBufferArray4);
        org.junit.Assert.assertArrayEquals(byteBufferArray4, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer(100);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unpooledByteBufAllocator0.calculateNewCapacity(100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.close();
        long long11 = bufferedChannel9.getFileChannelPosition();
        int[] intArray15 = new int[] { (short) 1, 'a', 'a' };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyInt(intArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copyShort(intArray15);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel9.write(byteBuf17);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 1, 97, 97 });
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf1 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer((int) '#');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean15 = unpooledByteBufAllocator14.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel16 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator14, fileChannel16, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel16, (int) (byte) 0, (long) (byte) -1);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator23 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator23.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator23.ioBuffer();
        int int29 = unpooledByteBufAllocator23.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf30 = unpooledByteBufAllocator23.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf31 = unpooledByteBufAllocator23.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator23.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric34 = unpooledByteBufAllocator23.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator23.compositeDirectBuffer();
        int int38 = unpooledByteBufAllocator23.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator39 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf41 = unpooledByteBufAllocator39.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator39.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf43 = unpooledByteBufAllocator39.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf44 = unpooledByteBufAllocator39.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf45 = unpooledByteBufAllocator39.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator48 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator49 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf51 = unpooledByteBufAllocator49.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf52 = unpooledByteBufAllocator49.ioBuffer();
        int int55 = unpooledByteBufAllocator49.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf56 = unpooledByteBufAllocator49.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf57 = unpooledByteBufAllocator49.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf59 = unpooledByteBufAllocator49.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel60 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel63 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator49, fileChannel60, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel67 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator48, fileChannel60, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel71 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator39, fileChannel60, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel74 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator23, fileChannel60, 1, (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel78 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel60, (int) (byte) -1, (int) '4', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf30);
        org.junit.Assert.assertNotNull(compositeByteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator39);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(compositeByteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator49);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf56);
        org.junit.Assert.assertNotNull(compositeByteBuf57);
        org.junit.Assert.assertNotNull(compositeByteBuf59);
        org.junit.Assert.assertNotNull(fileChannel60);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer(64);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.heapBuffer();
        int int10 = unpooledByteBufAllocator3.calculateNewCapacity((int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator3.directBuffer((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer(64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable((int) '#');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) ' ', (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(100, 97)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        java.lang.String str6 = unpooledByteBufAllocator0.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeDirectBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (byte) 0, 32);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long32 = bufferedChannel9.position();
        double[] doubleArray36 = new double[] { 1.0d, 'a', '#' };
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.copyDouble(doubleArray36);
        int int39 = bufferedChannel9.read(byteBuf37, (long) ' ');
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel9.clear();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 1.0d, 97.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator7 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator7.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator7.ioBuffer();
        int int13 = unpooledByteBufAllocator7.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator7.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator7.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator7.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel18 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator7, fileChannel18, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel18, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel18, (int) (byte) 100, (int) (short) 10, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf31 = unpooledByteBufAllocator3.compositeHeapBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf31);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertNotNull(compositeByteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 132 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeHeapBuffer(1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 110 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long32 = bufferedChannel9.position();
        java.nio.ByteBuffer[] byteBufferArray35 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray35);
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufferArray35);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf37);
        int int41 = bufferedChannel9.read(byteBuf37, (long) 0, (int) (byte) 0);
        long long42 = bufferedChannel9.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf44 = org.apache.bookkeeper.generated.Support.emptyWritable((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = bufferedChannel9.read(byteBuf44, 0L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteBufferArray35);
        org.junit.Assert.assertArrayEquals(byteBufferArray35, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(byteBuf44);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel9.clear();
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.copyShort(100);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf38);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = bufferedChannel9.read(byteBuf39, (long) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        int int10 = bufferedChannel9.getNumOfBytesInWriteBuffer();
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        short[] shortArray4 = new short[] { (short) 0, (byte) 0, (short) 1, (byte) 100 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf5);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 0, (short) 0, (short) 1, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyMedium((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.nio.ByteBuffer[] byteBufferArray0 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray0);
        org.junit.Assert.assertNotNull(byteBufferArray0);
        org.junit.Assert.assertArrayEquals(byteBufferArray0, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.heapBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.directBuffer((int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (byte) -1, (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel14 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel14, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, fileChannel14, 100, (int) (short) 0, (long) (-1));
        int int22 = bufferedChannel21.getNumOfBytesInWriteBuffer();
        long long24 = bufferedChannel21.forceWrite(true);
        long long25 = bufferedChannel21.getFileChannelPosition();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, (int) (short) 100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 5, cap: 5/5).slice(100, 64)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel14 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel14, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, fileChannel14, 100, (int) (short) 0, (long) (-1));
        int int22 = bufferedChannel21.getNumOfBytesInWriteBuffer();
        long long24 = bufferedChannel21.forceWrite(true);
        long long26 = bufferedChannel21.forceWrite(false);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long33 = bufferedChannel9.forceWrite(false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator37 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator37.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = bufferedChannel9.read(byteBuf38, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteBuf38);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator3.metric();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.directBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator23 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        int int30 = unpooledByteBufAllocator24.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf31 = unpooledByteBufAllocator24.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator24.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator24.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel35 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator24, fileChannel35, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator23, fileChannel35, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator20, fileChannel35, (int) (byte) 100, (int) (short) 10, 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(fileChannel35);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        bufferedChannel9.flushAndForceWrite(false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str27 = unpooledByteBufAllocator26.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator26.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator26.buffer((int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf31 = unpooledByteBufAllocator26.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int34 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf31, (long) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=97)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str27, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(compositeByteBuf31);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(100, (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort(32);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) 0, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.heapBuffer(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeHeapBuffer((int) '#');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel11 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel11, 1, (long) (byte) 0);
        bufferedChannel14.flushAndForceWrite(true);
        long long17 = bufferedChannel14.getFileChannelPosition();
        long long18 = bufferedChannel14.position();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) 100, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable((int) 'a');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator10.ioBuffer();
        int int16 = unpooledByteBufAllocator10.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator10.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator10.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator10.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel21 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel21, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel21, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel21, (int) (byte) 10, 100, (long) 1);
        java.nio.ByteBuffer[] byteBufferArray36 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray36);
        bufferedChannel32.write(byteBuf40);
        bufferedChannel32.close();
        bufferedChannel32.clear();
        io.netty.buffer.ByteBuf byteBuf45 = io.netty.buffer.Unpooled.copyShort((int) (byte) -1);
        int int47 = bufferedChannel32.read(byteBuf45, (long) 10);
        io.netty.buffer.ByteBuf byteBuf48 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf45);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNotNull(byteBufferArray36);
        org.junit.Assert.assertArrayEquals(byteBufferArray36, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(byteBuf48);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer(0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.buffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf14);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        int[] intArray28 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copyMedium(intArray28);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf29);
        int int32 = bufferedChannel9.read(byteBuf30, (long) (byte) -1);
        long long33 = bufferedChannel9.getFileChannelPosition();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flush();
        bufferedChannel9.clear();
        java.nio.ByteBuffer[] byteBufferArray14 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray14);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray14);
        int int18 = bufferedChannel9.read(byteBuf16, (long) (-1));
        bufferedChannel9.close();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteBufferArray14);
        org.junit.Assert.assertArrayEquals(byteBufferArray14, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        int int15 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator0.buffer(32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long32 = bufferedChannel9.position();
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.copyShort((int) 'a');
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf36);
        bufferedChannel9.write(byteBuf37);
        long long39 = bufferedChannel9.size();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 2L + "'", long39 == 2L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel14 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel14, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, fileChannel14, 100, (int) (short) 0, (long) (-1));
        int int22 = bufferedChannel21.getNumOfBytesInWriteBuffer();
        long long24 = bufferedChannel21.forceWrite(false);
        java.lang.Class<?> wildcardClass25 = bufferedChannel21.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (-1), 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) -1, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long32 = bufferedChannel9.position();
        long long34 = bufferedChannel9.forceWrite(false);
        long long35 = bufferedChannel9.getFileChannelPosition();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) 'a');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) 10, 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) 0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyLong((long) 1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel11 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel11, 1, (long) (byte) 0);
        bufferedChannel14.flushAndForceWrite(true);
        long long17 = bufferedChannel14.getFileChannelPosition();
        long long18 = bufferedChannel14.getFileChannelPosition();
        long long19 = bufferedChannel14.position();
        long long21 = bufferedChannel14.forceWrite(true);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator22 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator22.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator22.ioBuffer();
        int int28 = unpooledByteBufAllocator22.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator22.buffer();
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator22.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator22.directBuffer((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = bufferedChannel14.read(byteBuf33, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator22);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf33);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator14.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator14.ioBuffer();
        int int20 = unpooledByteBufAllocator14.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator14.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator14.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator14.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel25 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator14, fileChannel25, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator13, fileChannel25, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel25, (int) ' ', 1L);
        java.lang.String str36 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator0.heapBuffer(1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf41 = unpooledByteBufAllocator0.buffer(10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(fileChannel25);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str36, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf38);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.heapBuffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator0.compositeDirectBuffer((int) 'a');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        boolean boolean11 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer((int) (short) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (byte) -1, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf1 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unpooledByteBufAllocator0.calculateNewCapacity((int) (short) -1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator7 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator7.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator7.ioBuffer();
        int int13 = unpooledByteBufAllocator7.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator7.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator7.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator7.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel18 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator7, fileChannel18, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel18, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel18, (int) (byte) 100, (int) (short) 10, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf31 = unpooledByteBufAllocator3.compositeHeapBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator3.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator3.ioBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertNotNull(compositeByteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator6.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator6.ioBuffer(10);
        boolean boolean11 = unpooledByteBufAllocator6.isDirectBufferPooled();
        boolean boolean12 = unpooledByteBufAllocator6.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator6.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator14.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator14.ioBuffer();
        int int20 = unpooledByteBufAllocator14.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator14.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator14.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator14.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric25 = unpooledByteBufAllocator14.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator14.compositeDirectBuffer();
        int int29 = unpooledByteBufAllocator14.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator30 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator30.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator30.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf34 = unpooledByteBufAllocator30.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator30.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator30.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator39 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator40 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator40.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf43 = unpooledByteBufAllocator40.ioBuffer();
        int int46 = unpooledByteBufAllocator40.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf47 = unpooledByteBufAllocator40.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf48 = unpooledByteBufAllocator40.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf50 = unpooledByteBufAllocator40.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel51 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator40, fileChannel51, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator39, fileChannel51, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator30, fileChannel51, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel65 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator14, fileChannel51, 1, (-1L));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel67 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel51, 32);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel70 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel51, 64, 0L);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf72 = unpooledByteBufAllocator3.compositeDirectBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric25);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator30);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator40);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf47);
        org.junit.Assert.assertNotNull(compositeByteBuf48);
        org.junit.Assert.assertNotNull(compositeByteBuf50);
        org.junit.Assert.assertNotNull(fileChannel51);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(false);
        java.lang.String str2 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnpooledByteBufAllocator(directByDefault: false)" + "'", str2, "UnpooledByteBufAllocator(directByDefault: false)");
        org.junit.Assert.assertNotNull(compositeByteBuf3);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 98 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufArray8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) 100, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.heapBuffer((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        int int15 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator16.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator16.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator16.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator16.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator16.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator25 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator26.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator26.ioBuffer();
        int int32 = unpooledByteBufAllocator26.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator26.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator26.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator26.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel37 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel37, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator25, fileChannel37, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator16, fileChannel37, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel37, 1, (-1L));
        io.netty.buffer.ByteBuf byteBuf53 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf55 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf57 = unpooledByteBufAllocator0.compositeDirectBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(fileChannel37);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertNotNull(compositeByteBuf55);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        java.lang.Class<?> wildcardClass8 = byteBuf7.getClass();
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 5, cap: 5/5).slice(100, 32)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator10.ioBuffer();
        int int16 = unpooledByteBufAllocator10.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator10.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator10.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator10.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel21 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel21, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel21, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel21, (int) (byte) 10, 100, (long) 1);
        boolean boolean33 = unpooledByteBufAllocator0.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 200 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0);
        java.lang.Class<?> wildcardClass6 = byteBuf5.getClass();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufArray8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer((int) 'a');
        org.junit.Assert.assertNotNull(compositeByteBuf1);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.heapBuffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator0.compositeBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator14.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator14.ioBuffer();
        int int20 = unpooledByteBufAllocator14.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator14.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator14.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator14.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel25 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator14, fileChannel25, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator13, fileChannel25, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel25, (int) ' ', 1L);
        java.lang.String str36 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator0.heapBuffer(1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf41 = unpooledByteBufAllocator0.directBuffer((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(fileChannel25);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str36, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf38);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer(100);
        boolean boolean9 = unpooledByteBufAllocator0.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.buffer((int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        boolean boolean5 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator6.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator6.ioBuffer();
        int int12 = unpooledByteBufAllocator6.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator6.buffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator6.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator6.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator19 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator20.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator20.ioBuffer();
        int int26 = unpooledByteBufAllocator20.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf27 = unpooledByteBufAllocator20.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator20.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf30 = unpooledByteBufAllocator20.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel31 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator20, fileChannel31, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator19, fileChannel31, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel31, (int) ' ', 1L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator42 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf44 = unpooledByteBufAllocator42.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf45 = unpooledByteBufAllocator42.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf46 = unpooledByteBufAllocator42.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf47 = unpooledByteBufAllocator42.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf50 = unpooledByteBufAllocator42.ioBuffer(1, (int) (short) 100);
        java.lang.String str51 = unpooledByteBufAllocator42.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf52 = unpooledByteBufAllocator42.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator56 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean57 = unpooledByteBufAllocator56.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel58 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator56, fileChannel58, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel64 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator42, fileChannel58, (int) (byte) 0, (long) (byte) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel67 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel58, (int) (byte) 1, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel71 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel58, (int) (short) 1, (int) (byte) -1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf27);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf30);
        org.junit.Assert.assertNotNull(fileChannel31);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator42);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(compositeByteBuf47);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str51, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(fileChannel58);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) 100.0f);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long32 = bufferedChannel9.position();
        long long34 = bufferedChannel9.forceWrite(false);
        long long36 = bufferedChannel9.forceWrite(true);
        bufferedChannel9.close();
        bufferedChannel9.flushAndForceWriteIfRegularFlush(false);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel9.flushAndForceWrite(true);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyInt((int) (short) 10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        io.netty.buffer.ByteBuf[] byteBufArray0 = new io.netty.buffer.ByteBuf[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray0);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray0);
        org.junit.Assert.assertNotNull(byteBufArray0);
        org.junit.Assert.assertArrayEquals(byteBufArray0, new io.netty.buffer.ByteBuf[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.flush();
        int int13 = bufferedChannel9.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer((int) 'a');
        java.lang.Class<?> wildcardClass5 = byteBuf4.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unpooledByteBufAllocator0.calculateNewCapacity((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 32 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.ioBuffer((int) (short) 0, (int) (byte) 10);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator15 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator15.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator15.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator15.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator15.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator15.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator15.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator25 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator25.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator25.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel30 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator25, fileChannel30, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator15, fileChannel30, (int) 'a', (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel30, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator25);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(fileChannel30);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyInt(64);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.directBuffer(32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf6);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyInt((int) (short) 0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unpooledByteBufAllocator0.calculateNewCapacity((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 52 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator13.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator13.ioBuffer();
        int int19 = unpooledByteBufAllocator13.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator13.buffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator13.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator13.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator13.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator13.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator13.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator27.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator27.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator27.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator27.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator36 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator37 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf39 = unpooledByteBufAllocator37.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf40 = unpooledByteBufAllocator37.ioBuffer();
        int int43 = unpooledByteBufAllocator37.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf44 = unpooledByteBufAllocator37.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf45 = unpooledByteBufAllocator37.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf47 = unpooledByteBufAllocator37.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel48 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator37, fileChannel48, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel55 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator36, fileChannel48, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel59 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel48, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator13, fileChannel48, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel64 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel48, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf67 = unpooledByteBufAllocator0.directBuffer((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator37);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf44);
        org.junit.Assert.assertNotNull(compositeByteBuf45);
        org.junit.Assert.assertNotNull(compositeByteBuf47);
        org.junit.Assert.assertNotNull(fileChannel48);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) -1, 32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer((int) (byte) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(1, (byte) -1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.buffer();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unpooledByteBufAllocator3.calculateNewCapacity(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 1 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unpooledByteBufAllocator3.calculateNewCapacity((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 97 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel9.close();
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray23 = new byte[][] { byteArray22 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf27);
        int int30 = bufferedChannel9.read(byteBuf28, 100L);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bufferedChannel9.size();
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.bookie.BufferedChannelBase.BufferedChannelClosedException; message: Attempting to access a file channel that has already been closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        java.lang.String str6 = unpooledByteBufAllocator0.toString();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        int int10 = unpooledByteBufAllocator0.calculateNewCapacity(32, (int) 'a');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyLong((long) (-1));
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator10.ioBuffer();
        int int16 = unpooledByteBufAllocator10.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator10.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator10.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator10.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel21 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel21, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel21, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel21, (int) (byte) 10, 100, (long) 1);
        java.nio.ByteBuffer[] byteBufferArray36 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray36);
        bufferedChannel32.write(byteBuf40);
        bufferedChannel32.close();
        bufferedChannel32.clear();
        io.netty.buffer.ByteBuf byteBuf45 = io.netty.buffer.Unpooled.copyShort((int) (byte) -1);
        int int47 = bufferedChannel32.read(byteBuf45, (long) 10);
        long long48 = bufferedChannel32.getFileChannelPosition();
        int[] intArray55 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf56 = io.netty.buffer.Unpooled.copyMedium(intArray55);
        io.netty.buffer.ByteBuf byteBuf57 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray58 = new io.netty.buffer.ByteBuf[] { byteBuf56, byteBuf57 };
        io.netty.buffer.ByteBuf byteBuf59 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray58);
        io.netty.buffer.ByteBuf byteBuf60 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray58);
        io.netty.buffer.ByteBuf byteBuf61 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufArray58);
        io.netty.buffer.ByteBuf byteBuf62 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray58);
        io.netty.buffer.ByteBuf byteBuf63 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufArray58);
        io.netty.buffer.ByteBuf byteBuf64 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray58);
        io.netty.buffer.ByteBuf byteBuf65 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray58);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = bufferedChannel32.read(byteBuf65, (long) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNotNull(byteBufferArray36);
        org.junit.Assert.assertArrayEquals(byteBufferArray36, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf56);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertNotNull(byteBufArray58);
        org.junit.Assert.assertNotNull(byteBuf59);
        org.junit.Assert.assertNotNull(byteBuf60);
        org.junit.Assert.assertNotNull(byteBuf61);
        org.junit.Assert.assertNotNull(byteBuf62);
        org.junit.Assert.assertNotNull(byteBuf63);
        org.junit.Assert.assertNotNull(byteBuf64);
        org.junit.Assert.assertNotNull(byteBuf65);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 98 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf14);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((-1.0d));
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) '4', 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 116 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator2.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        boolean boolean5 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer(32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        java.lang.String str6 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator10.ioBuffer();
        int int16 = unpooledByteBufAllocator10.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator10.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator10.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator10.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel21 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel21, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel21, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel21, (int) (byte) 0, (long) '4');
        long long32 = bufferedChannel31.getFileChannelPosition();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.nio.ByteBuffer[] byteBufferArray1 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray1);
        java.lang.Class<?> wildcardClass3 = byteBufferArray1.getClass();
        org.junit.Assert.assertNotNull(byteBufferArray1);
        org.junit.Assert.assertArrayEquals(byteBufferArray1, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) (short) 100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.ioBuffer(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = byteBuf13.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.buffer(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(1, 10)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel11 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel11, 1, (long) (byte) 0);
        bufferedChannel14.flushAndForceWrite(true);
        long long17 = bufferedChannel14.getFileChannelPosition();
        long long18 = bufferedChannel14.getFileChannelPosition();
        long long19 = bufferedChannel14.position();
        bufferedChannel14.flushAndForceWrite(false);
        long long22 = bufferedChannel14.size();
        bufferedChannel14.flush();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray24 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[][] byteArray30 = new byte[][] { byteArray4, byteArray9, byteArray14, byteArray19, byteArray24, byteArray29 };
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copiedBuffer(byteArray30);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf31);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf32);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) 32);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer(32);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer(32);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.directBuffer((int) (short) 10);
        java.lang.Class<?> wildcardClass12 = unpooledByteBufAllocator0.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator0.ioBuffer((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf12);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufArray8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteArray10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (short) -1, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel11 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel11, 1, (long) (byte) 0);
        bufferedChannel14.flushAndForceWrite(true);
        long long17 = bufferedChannel14.getFileChannelPosition();
        long long18 = bufferedChannel14.getFileChannelPosition();
        long long19 = bufferedChannel14.position();
        bufferedChannel14.flushAndForceWrite(false);
        bufferedChannel14.clear();
        long long23 = bufferedChannel14.position();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble(0.0d);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator6.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator6.ioBuffer(10);
        boolean boolean11 = unpooledByteBufAllocator6.isDirectBufferPooled();
        boolean boolean12 = unpooledByteBufAllocator6.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator6.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator14.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator14.ioBuffer();
        int int20 = unpooledByteBufAllocator14.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator14.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator14.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator14.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric25 = unpooledByteBufAllocator14.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator14.compositeDirectBuffer();
        int int29 = unpooledByteBufAllocator14.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator30 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator30.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator30.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf34 = unpooledByteBufAllocator30.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator30.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator30.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator39 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator40 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator40.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf43 = unpooledByteBufAllocator40.ioBuffer();
        int int46 = unpooledByteBufAllocator40.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf47 = unpooledByteBufAllocator40.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf48 = unpooledByteBufAllocator40.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf50 = unpooledByteBufAllocator40.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel51 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator40, fileChannel51, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator39, fileChannel51, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator30, fileChannel51, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel65 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator14, fileChannel51, 1, (-1L));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel67 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel51, 32);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel70 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel51, 64, 0L);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf72 = unpooledByteBufAllocator3.compositeBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric25);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator30);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator40);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf47);
        org.junit.Assert.assertNotNull(compositeByteBuf48);
        org.junit.Assert.assertNotNull(compositeByteBuf50);
        org.junit.Assert.assertNotNull(fileChannel51);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator12 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator12.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator12.ioBuffer();
        int int18 = unpooledByteBufAllocator12.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator12.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator12.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator12.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric23 = unpooledByteBufAllocator12.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric24 = unpooledByteBufAllocator12.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator25 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator25.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator25.ioBuffer();
        int int31 = unpooledByteBufAllocator25.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator25.buffer();
        io.netty.buffer.ByteBuf byteBuf34 = unpooledByteBufAllocator25.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator25.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator25.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator25.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator25.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator39 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf41 = unpooledByteBufAllocator39.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator39.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf43 = unpooledByteBufAllocator39.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf44 = unpooledByteBufAllocator39.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf45 = unpooledByteBufAllocator39.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator48 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator49 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf51 = unpooledByteBufAllocator49.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf52 = unpooledByteBufAllocator49.ioBuffer();
        int int55 = unpooledByteBufAllocator49.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf56 = unpooledByteBufAllocator49.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf57 = unpooledByteBufAllocator49.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf59 = unpooledByteBufAllocator49.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel60 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel63 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator49, fileChannel60, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel67 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator48, fileChannel60, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel71 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator39, fileChannel60, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel74 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator25, fileChannel60, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel76 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator12, fileChannel60, (int) (short) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel80 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel60, (int) (short) 1, 10, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf83 = unpooledByteBufAllocator0.ioBuffer((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric23);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric24);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator25);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator39);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(compositeByteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator49);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf56);
        org.junit.Assert.assertNotNull(compositeByteBuf57);
        org.junit.Assert.assertNotNull(compositeByteBuf59);
        org.junit.Assert.assertNotNull(fileChannel60);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 100, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer((int) '#');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) '4', (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyInt((-1));
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(32, 100)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeDirectBuffer(10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf13);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (byte) 100, (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.heapBuffer((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 0 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf15);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufArray8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        io.netty.buffer.ByteBuf[] byteBufArray3 = new io.netty.buffer.ByteBuf[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufArray3);
        org.junit.Assert.assertNotNull(byteBufArray3);
        org.junit.Assert.assertArrayEquals(byteBufArray3, new io.netty.buffer.ByteBuf[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator10.ioBuffer();
        int int16 = unpooledByteBufAllocator10.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator10.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator10.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator10.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel21 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel21, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel21, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel21, (int) (byte) 10, 100, (long) 1);
        java.nio.ByteBuffer[] byteBufferArray36 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray36);
        bufferedChannel32.write(byteBuf40);
        bufferedChannel32.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel32.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNotNull(byteBufferArray36);
        org.junit.Assert.assertArrayEquals(byteBufferArray36, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, 64, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 65 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator4 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator4.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator4.ioBuffer();
        int int10 = unpooledByteBufAllocator4.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator4.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator4.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator4.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel15 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator4, fileChannel15, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel15, (int) (byte) 1, 10, (long) 0);
        boolean boolean23 = unpooledByteBufAllocator0.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        java.lang.String str6 = unpooledByteBufAllocator0.toString();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = unpooledByteBufAllocator0.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long32 = bufferedChannel9.position();
        long long33 = bufferedChannel9.size();
        bufferedChannel9.close();
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.copyDouble(1.0d);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = bufferedChannel9.read(byteBuf36, 0L, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=64)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(byteBuf36);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        boolean boolean11 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator0.compositeBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        byte[] byteArray0 = new byte[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray0, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        long long10 = bufferedChannel9.size();
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.flushAndForceWrite(true);
        long long16 = bufferedChannel9.forceWrite(false);
        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray27 = new byte[][] { byteArray26 };
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray27);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray27);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copiedBuffer(byteArray27);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copiedBuffer(byteArray27);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteArray27);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copiedBuffer(byteArray27);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray27);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.copiedBuffer(byteArray27);
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.copiedBuffer(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = bufferedChannel9.read(byteBuf36, (long) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.buffer(10, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.heapBuffer((int) (short) 10);
        java.lang.String str10 = unpooledByteBufAllocator3.toString();
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: false)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: false)");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        long long10 = bufferedChannel9.size();
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.flushAndForceWrite(true);
        long long16 = bufferedChannel9.forceWrite(false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator17.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator17.ioBuffer();
        int int23 = unpooledByteBufAllocator17.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator17.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator17.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf27 = unpooledByteBufAllocator17.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric28 = unpooledByteBufAllocator17.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator17.compositeDirectBuffer();
        int int32 = unpooledByteBufAllocator17.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator17.compositeBuffer();
        int int35 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf33, (long) 64);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(compositeByteBuf27);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf12);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel9.clear();
        long long39 = bufferedChannel9.size();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator40 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str41 = unpooledByteBufAllocator40.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf42 = unpooledByteBufAllocator40.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf43 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf42);
        io.netty.buffer.ByteBuf byteBuf44 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf42);
        int int46 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf42, 0L);
        bufferedChannel9.close();
        int int48 = bufferedChannel9.getNumOfBytesInWriteBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator49 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf51 = unpooledByteBufAllocator49.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf52 = unpooledByteBufAllocator49.ioBuffer();
        int int55 = unpooledByteBufAllocator49.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf56 = unpooledByteBufAllocator49.buffer();
        io.netty.buffer.ByteBuf byteBuf58 = unpooledByteBufAllocator49.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf60 = unpooledByteBufAllocator49.compositeBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf62 = unpooledByteBufAllocator49.compositeHeapBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf64 = unpooledByteBufAllocator49.ioBuffer(32);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = bufferedChannel9.read(byteBuf64, (long) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Read past EOF");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str41, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator49);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertNotNull(byteBuf56);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(compositeByteBuf60);
        org.junit.Assert.assertNotNull(compositeByteBuf62);
        org.junit.Assert.assertNotNull(byteBuf64);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) 1, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) 'a', (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer(10);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(32, (int) ' ');
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.directBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 32, (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf15);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufArray8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray9 = new byte[][] { byteArray8 };
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteArray9);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf13);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 10);
        int[] intArray7 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray10 = new io.netty.buffer.ByteBuf[] { byteBuf8, byteBuf9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf12);
        double[] doubleArray19 = new double[] { (short) -1, (short) -1, (short) -1, (byte) 10, 0.0f };
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copyDouble(doubleArray19);
        int[] intArray24 = new int[] { (short) 1, 'a', 'a' };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copyInt(intArray24);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copyShort(intArray24);
        io.netty.buffer.ByteBuf[] byteBufArray27 = new io.netty.buffer.ByteBuf[] { byteBuf2, byteBuf12, byteBuf20, byteBuf26 };
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray27);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray27);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray27);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBufArray10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), (-1.0d), (-1.0d), 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 1, 97, 97 });
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBufArray27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf13);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufferArray2);
        org.junit.Assert.assertArrayEquals(byteBufferArray2, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator6.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator6.ioBuffer(10);
        boolean boolean11 = unpooledByteBufAllocator6.isDirectBufferPooled();
        boolean boolean12 = unpooledByteBufAllocator6.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator6.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator14.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator14.ioBuffer();
        int int20 = unpooledByteBufAllocator14.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator14.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator14.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator14.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric25 = unpooledByteBufAllocator14.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator14.compositeDirectBuffer();
        int int29 = unpooledByteBufAllocator14.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator30 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator30.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator30.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf34 = unpooledByteBufAllocator30.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator30.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator30.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator39 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator40 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator40.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf43 = unpooledByteBufAllocator40.ioBuffer();
        int int46 = unpooledByteBufAllocator40.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf47 = unpooledByteBufAllocator40.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf48 = unpooledByteBufAllocator40.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf50 = unpooledByteBufAllocator40.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel51 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator40, fileChannel51, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator39, fileChannel51, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator30, fileChannel51, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel65 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator14, fileChannel51, 1, (-1L));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel67 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel51, 32);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel70 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel51, 64, 0L);
        long[] longArray71 = new long[] {};
        io.netty.buffer.ByteBuf byteBuf72 = io.netty.buffer.Unpooled.copyLong(longArray71);
        io.netty.buffer.ByteBuf byteBuf73 = io.netty.buffer.Unpooled.copyLong(longArray71);
        io.netty.buffer.ByteBuf byteBuf74 = io.netty.buffer.Unpooled.copyLong(longArray71);
        io.netty.buffer.ByteBuf byteBuf75 = io.netty.buffer.Unpooled.copyLong(longArray71);
        io.netty.buffer.ByteBuf byteBuf76 = io.netty.buffer.Unpooled.copyLong(longArray71);
        int int78 = bufferedChannel70.read(byteBuf76, 0L);
        long long79 = bufferedChannel70.position();
        int[] intArray84 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf85 = io.netty.buffer.Unpooled.copyMedium(intArray84);
        io.netty.buffer.ByteBuf byteBuf86 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray87 = new io.netty.buffer.ByteBuf[] { byteBuf85, byteBuf86 };
        io.netty.buffer.ByteBuf byteBuf88 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray87);
        io.netty.buffer.ByteBuf byteBuf89 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray87);
        io.netty.buffer.ByteBuf byteBuf90 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray87);
        int int92 = bufferedChannel70.read(byteBuf90, (long) '4');
        int int93 = bufferedChannel70.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric25);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator30);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator40);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf47);
        org.junit.Assert.assertNotNull(compositeByteBuf48);
        org.junit.Assert.assertNotNull(compositeByteBuf50);
        org.junit.Assert.assertNotNull(fileChannel51);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertArrayEquals(longArray71, new long[] {});
        org.junit.Assert.assertNotNull(byteBuf72);
        org.junit.Assert.assertNotNull(byteBuf73);
        org.junit.Assert.assertNotNull(byteBuf74);
        org.junit.Assert.assertNotNull(byteBuf75);
        org.junit.Assert.assertNotNull(byteBuf76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf85);
        org.junit.Assert.assertNotNull(byteBuf86);
        org.junit.Assert.assertNotNull(byteBufArray87);
        org.junit.Assert.assertNotNull(byteBuf88);
        org.junit.Assert.assertNotNull(byteBuf89);
        org.junit.Assert.assertNotNull(byteBuf90);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer(10);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean11 = unpooledByteBufAllocator10.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel12 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel12, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel12, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator3.directBuffer(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fileChannel12);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator10.ioBuffer();
        int int16 = unpooledByteBufAllocator10.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator10.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator10.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator10.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel21 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel21, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel21, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel21, (int) (byte) 10, 100, (long) 1);
        java.nio.ByteBuffer[] byteBufferArray36 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray36);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray36);
        bufferedChannel32.write(byteBuf40);
        bufferedChannel32.close();
        bufferedChannel32.clear();
        io.netty.buffer.ByteBuf byteBuf45 = io.netty.buffer.Unpooled.copyShort((int) (byte) -1);
        int int47 = bufferedChannel32.read(byteBuf45, (long) 10);
        long long48 = bufferedChannel32.getFileChannelPosition();
        bufferedChannel32.clear();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(fileChannel21);
        org.junit.Assert.assertNotNull(byteBufferArray36);
        org.junit.Assert.assertArrayEquals(byteBufferArray36, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.buffer((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeHeapBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.heapBuffer(0, 0);
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator0.buffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator0.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator0.heapBuffer((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.heapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long32 = bufferedChannel9.position();
        long long34 = bufferedChannel9.forceWrite(false);
        long long36 = bufferedChannel9.forceWrite(true);
        bufferedChannel9.close();
        int int38 = bufferedChannel9.getNumOfBytesInWriteBuffer();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel9.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(1, 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator7 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator7.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator7.ioBuffer();
        int int13 = unpooledByteBufAllocator7.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator7.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator7.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator7.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric18 = unpooledByteBufAllocator7.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric19 = unpooledByteBufAllocator7.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator20.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator20.ioBuffer();
        int int26 = unpooledByteBufAllocator20.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator20.buffer();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator20.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf30 = unpooledByteBufAllocator20.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator20.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator20.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator20.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator34 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator34.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf37 = unpooledByteBufAllocator34.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator34.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf39 = unpooledByteBufAllocator34.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf40 = unpooledByteBufAllocator34.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator43 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator44 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf46 = unpooledByteBufAllocator44.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf47 = unpooledByteBufAllocator44.ioBuffer();
        int int50 = unpooledByteBufAllocator44.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf51 = unpooledByteBufAllocator44.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf52 = unpooledByteBufAllocator44.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf54 = unpooledByteBufAllocator44.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel55 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator44, fileChannel55, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator43, fileChannel55, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel66 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator34, fileChannel55, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel69 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator20, fileChannel55, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel71 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator7, fileChannel55, (int) (short) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel74 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel55, (int) (short) 1, (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf77 = unpooledByteBufAllocator0.directBuffer((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric18);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric19);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(compositeByteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator34);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(compositeByteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator44);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf51);
        org.junit.Assert.assertNotNull(compositeByteBuf52);
        org.junit.Assert.assertNotNull(compositeByteBuf54);
        org.junit.Assert.assertNotNull(fileChannel55);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (byte) 1, (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (byte) 1, (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel9.clear();
        long long39 = bufferedChannel9.size();
        bufferedChannel9.close();
        long long41 = bufferedChannel9.position();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator42 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf44 = unpooledByteBufAllocator42.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf45 = unpooledByteBufAllocator42.ioBuffer();
        int int48 = unpooledByteBufAllocator42.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf49 = unpooledByteBufAllocator42.buffer();
        io.netty.buffer.ByteBuf byteBuf51 = unpooledByteBufAllocator42.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf52 = unpooledByteBufAllocator42.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf53 = unpooledByteBufAllocator42.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf54 = unpooledByteBufAllocator42.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf55 = unpooledByteBufAllocator42.buffer();
        // The following exception was thrown during execution in test generation
        try {
            int int58 = bufferedChannel9.read(byteBuf55, 100L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -100 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator42);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(byteBuf49);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(compositeByteBuf52);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertNotNull(compositeByteBuf54);
        org.junit.Assert.assertNotNull(byteBuf55);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray7 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf6 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf9);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufArray7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        boolean boolean11 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.ioBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 1, 64);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.buffer(64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator3.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int[] intArray3 = new int[] { (short) 1, 'a', 'a' };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyInt(intArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(intArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 97 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) (byte) -1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteArray10);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer((int) (short) 0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator0.metric();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.heapBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf1);
        java.lang.Class<?> wildcardClass3 = byteBuf2.getClass();
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyMedium(64);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeDirectBuffer(10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf13);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) (byte) -1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        java.lang.Class<?> wildcardClass11 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) ' ', 32);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel14 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel14, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, fileChannel14, 100, (int) (short) 0, (long) (-1));
        int int22 = bufferedChannel21.getNumOfBytesInWriteBuffer();
        long long24 = bufferedChannel21.forceWrite(false);
        long long25 = bufferedChannel21.position();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(fileChannel14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel11 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel11, 1, (long) (byte) 0);
        bufferedChannel14.flushAndForceWrite(true);
        long long17 = bufferedChannel14.size();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator18.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator18.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator18.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator18.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator18.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator28 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator28.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator28.ioBuffer();
        int int34 = unpooledByteBufAllocator28.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator28.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator28.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf38 = unpooledByteBufAllocator28.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel39 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator28, fileChannel39, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel39, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel50 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator18, fileChannel39, (int) (byte) 10, 100, (long) 1);
        java.nio.ByteBuffer[] byteBufferArray54 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf55 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray54);
        io.netty.buffer.ByteBuf byteBuf56 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray54);
        io.netty.buffer.ByteBuf byteBuf57 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray54);
        io.netty.buffer.ByteBuf byteBuf58 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray54);
        bufferedChannel50.write(byteBuf58);
        bufferedChannel50.close();
        bufferedChannel50.clear();
        io.netty.buffer.ByteBuf byteBuf63 = io.netty.buffer.Unpooled.copyShort((int) (byte) -1);
        int int65 = bufferedChannel50.read(byteBuf63, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = bufferedChannel14.read(byteBuf63, 0L, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=64)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator28);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(compositeByteBuf38);
        org.junit.Assert.assertNotNull(fileChannel39);
        org.junit.Assert.assertNotNull(byteBufferArray54);
        org.junit.Assert.assertArrayEquals(byteBufferArray54, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf55);
        org.junit.Assert.assertNotNull(byteBuf56);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(byteBuf63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(0, 10)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.generated.Support.emptyWritable(52);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        long long10 = bufferedChannel9.size();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator11 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator11.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator11.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel16 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator11, fileChannel16, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel20.flushAndForceWrite(false);
        bufferedChannel20.flushAndForceWriteIfRegularFlush(true);
        int[] intArray30 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copyMedium(intArray30);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray33 = new io.netty.buffer.ByteBuf[] { byteBuf31, byteBuf32 };
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray33);
        int int37 = bufferedChannel20.read(byteBuf35, (long) '4');
        int int39 = bufferedChannel9.read(byteBuf35, 0L);
        bufferedChannel9.flushAndForceWrite(false);
        long long42 = bufferedChannel9.getFileChannelPosition();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(fileChannel16);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBufArray33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer(52);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel9.clear();
        long long39 = bufferedChannel9.position();
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        long long42 = bufferedChannel9.size();
        int int43 = bufferedChannel9.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.buffer((int) (short) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeHeapBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        java.lang.String str6 = unpooledByteBufAllocator0.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 5, cap: 5/5).slice(100, 10)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        short[] shortArray0 = new short[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort(shortArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copyShort(shortArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyShort(shortArray0);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf3);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        int[] intArray28 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copyMedium(intArray28);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf29);
        int int32 = bufferedChannel9.read(byteBuf30, (long) (byte) -1);
        int int33 = bufferedChannel9.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf6);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator3.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf4);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int[] intArray6 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray9 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf8 };
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray9);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufArray9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.heapBuffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel11 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel11, 1, (long) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.buffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer();
        java.lang.String str10 = unpooledByteBufAllocator0.toString();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer(64);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long32 = bufferedChannel9.position();
        long long34 = bufferedChannel9.forceWrite(false);
        long long36 = bufferedChannel9.forceWrite(true);
        io.netty.buffer.ByteBuf byteBuf39 = org.apache.bookkeeper.generated.Support.filledBuf((int) (byte) 100, (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = bufferedChannel9.read(byteBuf39, (long) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=100)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteBuf39);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        int int15 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator0.heapBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator0.buffer(10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteArray10);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf17);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.ioBuffer((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, 32, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 33 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) 100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) (short) 100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer();
        java.lang.String str12 = unpooledByteBufAllocator0.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.directBuffer(52, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.buffer((int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf4);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator10.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel15 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel15, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel15, (int) 'a', (long) (-1));
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator0.directBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf24);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long32 = bufferedChannel9.position();
        double[] doubleArray36 = new double[] { 1.0d, 'a', '#' };
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.copyDouble(doubleArray36);
        int int39 = bufferedChannel9.read(byteBuf37, (long) ' ');
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        long long42 = bufferedChannel9.position();
        long long43 = bufferedChannel9.size();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator44 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf46 = unpooledByteBufAllocator44.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf47 = unpooledByteBufAllocator44.ioBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator48 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf50 = unpooledByteBufAllocator48.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf51 = unpooledByteBufAllocator48.ioBuffer();
        int int54 = unpooledByteBufAllocator48.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf55 = unpooledByteBufAllocator48.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf56 = unpooledByteBufAllocator48.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf58 = unpooledByteBufAllocator48.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel59 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator48, fileChannel59, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel66 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator44, fileChannel59, (int) (byte) 1, 10, (long) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf67 = unpooledByteBufAllocator44.compositeDirectBuffer();
        int int70 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf67, (long) '#', (int) (short) -1);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator71 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str72 = unpooledByteBufAllocator71.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf73 = unpooledByteBufAllocator71.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf74 = unpooledByteBufAllocator71.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf76 = unpooledByteBufAllocator71.ioBuffer(64);
        // The following exception was thrown during execution in test generation
        try {
            int int79 = bufferedChannel9.read(byteBuf76, (long) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -100 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 1.0d, 97.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator44);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator48);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf55);
        org.junit.Assert.assertNotNull(compositeByteBuf56);
        org.junit.Assert.assertNotNull(compositeByteBuf58);
        org.junit.Assert.assertNotNull(fileChannel59);
        org.junit.Assert.assertNotNull(compositeByteBuf67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str72, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf73);
        org.junit.Assert.assertNotNull(byteBuf74);
        org.junit.Assert.assertNotNull(byteBuf76);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.close();
        long long11 = bufferedChannel9.getFileChannelPosition();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = bufferedChannel9.size();
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.bookie.BufferedChannelBase.BufferedChannelClosedException; message: Attempting to access a file channel that has already been closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) 1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int[] intArray4 = new int[] { 32, (short) 0, (short) 1, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 32, 0, 1, 100 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.buffer();
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf0);
        org.junit.Assert.assertNotNull(byteBuf0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray20);
        int int23 = bufferedChannel9.read(byteBuf21, (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        int int31 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf29, (long) (short) 1);
        long long32 = bufferedChannel9.position();
        long long34 = bufferedChannel9.forceWrite(false);
        long long36 = bufferedChannel9.forceWrite(true);
        bufferedChannel9.close();
        java.nio.ByteBuffer[] byteBufferArray42 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf43 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray42);
        io.netty.buffer.ByteBuf byteBuf44 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray42);
        io.netty.buffer.ByteBuf byteBuf45 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray42);
        io.netty.buffer.ByteBuf byteBuf46 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray42);
        io.netty.buffer.ByteBuf byteBuf47 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufferArray42);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = bufferedChannel9.read(byteBuf47, (long) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(byteBufferArray42);
        org.junit.Assert.assertArrayEquals(byteBufferArray42, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(byteBuf47);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(0, (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator6.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator6.ioBuffer(10);
        boolean boolean11 = unpooledByteBufAllocator6.isDirectBufferPooled();
        boolean boolean12 = unpooledByteBufAllocator6.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator6.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator14.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator14.ioBuffer();
        int int20 = unpooledByteBufAllocator14.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator14.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator14.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator14.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric25 = unpooledByteBufAllocator14.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator14.compositeDirectBuffer();
        int int29 = unpooledByteBufAllocator14.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator30 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator30.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator30.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf34 = unpooledByteBufAllocator30.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator30.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator30.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator39 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator40 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator40.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf43 = unpooledByteBufAllocator40.ioBuffer();
        int int46 = unpooledByteBufAllocator40.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf47 = unpooledByteBufAllocator40.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf48 = unpooledByteBufAllocator40.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf50 = unpooledByteBufAllocator40.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel51 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator40, fileChannel51, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator39, fileChannel51, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator30, fileChannel51, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel65 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator14, fileChannel51, 1, (-1L));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel67 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel51, 32);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel70 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel51, 64, 0L);
        long[] longArray71 = new long[] {};
        io.netty.buffer.ByteBuf byteBuf72 = io.netty.buffer.Unpooled.copyLong(longArray71);
        io.netty.buffer.ByteBuf byteBuf73 = io.netty.buffer.Unpooled.copyLong(longArray71);
        io.netty.buffer.ByteBuf byteBuf74 = io.netty.buffer.Unpooled.copyLong(longArray71);
        io.netty.buffer.ByteBuf byteBuf75 = io.netty.buffer.Unpooled.copyLong(longArray71);
        io.netty.buffer.ByteBuf byteBuf76 = io.netty.buffer.Unpooled.copyLong(longArray71);
        int int78 = bufferedChannel70.read(byteBuf76, 0L);
        long long79 = bufferedChannel70.position();
        int[] intArray84 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf85 = io.netty.buffer.Unpooled.copyMedium(intArray84);
        io.netty.buffer.ByteBuf byteBuf86 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray87 = new io.netty.buffer.ByteBuf[] { byteBuf85, byteBuf86 };
        io.netty.buffer.ByteBuf byteBuf88 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray87);
        io.netty.buffer.ByteBuf byteBuf89 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray87);
        io.netty.buffer.ByteBuf byteBuf90 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray87);
        int int92 = bufferedChannel70.read(byteBuf90, (long) '4');
        java.lang.Class<?> wildcardClass93 = bufferedChannel70.getClass();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric25);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator30);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator40);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf47);
        org.junit.Assert.assertNotNull(compositeByteBuf48);
        org.junit.Assert.assertNotNull(compositeByteBuf50);
        org.junit.Assert.assertNotNull(fileChannel51);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertArrayEquals(longArray71, new long[] {});
        org.junit.Assert.assertNotNull(byteBuf72);
        org.junit.Assert.assertNotNull(byteBuf73);
        org.junit.Assert.assertNotNull(byteBuf74);
        org.junit.Assert.assertNotNull(byteBuf75);
        org.junit.Assert.assertNotNull(byteBuf76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 0L + "'", long79 == 0L);
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf85);
        org.junit.Assert.assertNotNull(byteBuf86);
        org.junit.Assert.assertNotNull(byteBufArray87);
        org.junit.Assert.assertNotNull(byteBuf88);
        org.junit.Assert.assertNotNull(byteBuf89);
        org.junit.Assert.assertNotNull(byteBuf90);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = unpooledByteBufAllocator0.calculateNewCapacity((int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 52 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 5, cap: 5/5).slice(32, 1)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf15);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufArray8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray9 = new byte[][] { byteArray8 };
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteArray9);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        int int15 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator16.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator16.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator16.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator16.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator16.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator25 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator26.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator26.ioBuffer();
        int int32 = unpooledByteBufAllocator26.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator26.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator26.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator26.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel37 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel37, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator25, fileChannel37, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator16, fileChannel37, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel37, 1, (-1L));
        io.netty.buffer.ByteBuf byteBuf52 = unpooledByteBufAllocator0.heapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(fileChannel37);
        org.junit.Assert.assertNotNull(byteBuf52);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator17.buffer(0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator20.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator20.ioBuffer(10);
        boolean boolean25 = unpooledByteBufAllocator20.isDirectBufferPooled();
        boolean boolean26 = unpooledByteBufAllocator20.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf27 = unpooledByteBufAllocator20.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator28 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator28.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator28.ioBuffer();
        int int34 = unpooledByteBufAllocator28.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator28.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator28.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf38 = unpooledByteBufAllocator28.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric39 = unpooledByteBufAllocator28.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf40 = unpooledByteBufAllocator28.compositeDirectBuffer();
        int int43 = unpooledByteBufAllocator28.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator44 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf46 = unpooledByteBufAllocator44.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf47 = unpooledByteBufAllocator44.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf48 = unpooledByteBufAllocator44.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf49 = unpooledByteBufAllocator44.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf50 = unpooledByteBufAllocator44.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator53 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator54 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf56 = unpooledByteBufAllocator54.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf57 = unpooledByteBufAllocator54.ioBuffer();
        int int60 = unpooledByteBufAllocator54.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf61 = unpooledByteBufAllocator54.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf62 = unpooledByteBufAllocator54.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf64 = unpooledByteBufAllocator54.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel65 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel68 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator54, fileChannel65, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel72 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator53, fileChannel65, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel76 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator44, fileChannel65, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel79 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator28, fileChannel65, 1, (-1L));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel81 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator20, fileChannel65, 32);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel84 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator17, fileChannel65, 64, 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel86 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel65, 52);
        io.netty.buffer.ByteBuf byteBuf89 = unpooledByteBufAllocator0.buffer((int) '4', (int) (byte) 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf27);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator28);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(compositeByteBuf38);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric39);
        org.junit.Assert.assertNotNull(compositeByteBuf40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator44);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertNotNull(byteBuf48);
        org.junit.Assert.assertNotNull(compositeByteBuf49);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator54);
        org.junit.Assert.assertNotNull(byteBuf56);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf61);
        org.junit.Assert.assertNotNull(compositeByteBuf62);
        org.junit.Assert.assertNotNull(compositeByteBuf64);
        org.junit.Assert.assertNotNull(fileChannel65);
        org.junit.Assert.assertNotNull(byteBuf89);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.buffer(1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (short) 1, (byte) -1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufArray8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(32, 52);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.clear();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.heapBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.directBuffer(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        int int15 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf17);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator0.metric();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer(32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) 0.0f);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator2.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }
}

