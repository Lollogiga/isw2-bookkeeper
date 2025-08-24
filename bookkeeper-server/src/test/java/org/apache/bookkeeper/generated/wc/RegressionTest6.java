package org.apache.bookkeeper.generated.wc;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(0, 100)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufferArray2);
        org.junit.Assert.assertNotNull(byteBufferArray2);
        org.junit.Assert.assertArrayEquals(byteBufferArray2, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 64, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 99 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get((long) (byte) 0, (long) (short) 0);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.directBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf14);
        boolean boolean16 = writeCache4.put((long) (byte) 10, (long) (short) 0, byteBuf15);
        writeCache4.deleteLedger((long) (byte) 100);
        long long19 = writeCache4.size();
        boolean boolean20 = writeCache4.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.buffer((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean11 = writeCache4.hasEntry((long) 0, (long) 100);
        writeCache4.clear();
        writeCache4.close();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator17.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator17.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator17.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator17.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator17.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator17.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator17.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator17.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator17.ioBuffer((int) (byte) 100, 100);
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator17.directBuffer();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator17.heapBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf39 = unpooledByteBufAllocator17.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = writeCache4.put(0L, (-1L), byteBuf39);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf14);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator2.heapBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.buffer();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = unpooledByteBufAllocator2.calculateNewCapacity((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 97 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer(0);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray25 = new byte[][] { byteArray8, byteArray12, byteArray16, byteArray20, byteArray24 };
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray25);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray25);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray25);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray25);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copiedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteArray25);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.copiedBuffer(byteArray25);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer(52);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 0, 35);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray12 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(shortArray12);
        io.netty.buffer.ByteBuf[] byteBufArray14 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf7, byteBuf13 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufArray14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray23 = new byte[][] { byteArray6, byteArray10, byteArray14, byteArray18, byteArray22 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray23);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteArray23);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf31);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) ' ', 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer((int) ' ');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.directBuffer((int) (byte) 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufArray16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.count();
        boolean boolean13 = writeCache4.hasEntry((long) (short) 0, (long) 'a');
        writeCache4.deleteLedger(10L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyInt(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric10 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric10);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(52, 35)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) '#');
        long long7 = writeCache6.size();
        writeCache6.close();
        long long9 = writeCache6.count();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.getLastEntry((long) 52);
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.get((long) 0, (-1L));
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeHeapBuffer();
        java.lang.Class<?> wildcardClass10 = unpooledByteBufAllocator3.getClass();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray23 = new byte[][] { byteArray6, byteArray10, byteArray14, byteArray18, byteArray22 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteArray23);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteArray23);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 98 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get((long) (byte) 0, (long) (short) 0);
        writeCache4.deleteLedger(4L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = writeCache4.hasEntry((long) (-1), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) (byte) 100);
        long long8 = writeCache4.count();
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteArray15, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray15);
        boolean boolean21 = writeCache4.put((long) (byte) 100, (long) 100, byteBuf20);
        io.netty.buffer.ByteBuf byteBuf24 = writeCache4.get(1L, (long) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(byteBuf24);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        boolean boolean8 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.directBuffer((int) (short) 0, (int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeHeapBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.heapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        writeCache4.clear();
        long long11 = writeCache4.size();
        writeCache4.deleteLedger((long) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 'a', (int) ' ');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric14 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator0.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator0.directBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        int[] intArray7 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray7);
        long[] longArray11 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyLong(longArray11);
        long[] longArray15 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyLong(longArray15);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator17.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf[] byteBufArray20 = new io.netty.buffer.ByteBuf[] { byteBuf8, byteBuf12, byteBuf16, compositeByteBuf19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray20);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(byteBufArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.buffer((int) 'a', 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean11 = writeCache4.hasEntry((long) 0, (long) 100);
        writeCache4.deleteLedger((long) 0);
        long long14 = writeCache4.size();
        writeCache4.clear();
        java.lang.Class<?> wildcardClass16 = writeCache4.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteArray22);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator1.ioBuffer(10, (int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf24);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) ' ', (int) '#');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.directBuffer(52, 52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator2.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator2.directBuffer((int) (short) 0, (int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator2.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray24 = new byte[][] { byteArray7, byteArray11, byteArray15, byteArray19, byteArray23 };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray24);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray24);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray24);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.size();
        writeCache4.clear();
        boolean boolean12 = writeCache4.isEmpty();
        boolean boolean15 = writeCache4.hasEntry((long) (byte) 1, (long) 'a');
        java.nio.ByteBuffer[] byteBufferArray19 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray19);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteBufferArray19);
        boolean boolean22 = writeCache4.put((long) '#', (long) '#', byteBuf21);
        writeCache4.close();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf25 = writeCache4.getLastEntry((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBufferArray19);
        org.junit.Assert.assertArrayEquals(byteBufferArray19, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray3);
        java.lang.Class<?> wildcardClass14 = byteBuf13.getClass();
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer(64);
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        boolean boolean9 = writeCache8.isEmpty();
        writeCache8.clear();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache8.getLastEntry((long) 10);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(1);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10, (int) '4');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer(100);
        int int17 = unpooledByteBufAllocator1.calculateNewCapacity(0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray12 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(shortArray12);
        io.netty.buffer.ByteBuf[] byteBufArray14 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf7, byteBuf13 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf20);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufArray14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertArrayEquals(byteBufferArray5, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        int[] intArray8 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray8);
        long[] longArray12 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyLong(longArray12);
        long[] longArray16 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copyLong(longArray16);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator18.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf[] byteBufArray21 = new io.netty.buffer.ByteBuf[] { byteBuf9, byteBuf13, byteBuf17, compositeByteBuf20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray21);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator18);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(byteBufArray21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        java.lang.String str5 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        long long5 = writeCache4.count();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache4.getLastEntry((long) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.nio.ByteBuffer[] byteBufferArray1 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        org.junit.Assert.assertNotNull(byteBufferArray1);
        org.junit.Assert.assertArrayEquals(byteBufferArray1, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer(10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.heapBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        boolean boolean3 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.buffer(64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer((-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer(100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer();
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) 10, 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 52, 64);
        int[] intArray21 = new int[] { 100, (short) 1, 0, '#', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copyShort(intArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copyShort(intArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyMedium(intArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copyMedium(intArray21);
        boolean boolean26 = writeCache13.put((long) (byte) 10, (long) 1, byteBuf25);
        writeCache13.clear();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 100, 1, 0, 35, 10 });
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer(64);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer(52, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(52, (byte) -1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) 'a', (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator2.ioBuffer();
        int int7 = unpooledByteBufAllocator2.calculateNewCapacity((int) (short) 100, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.heapBuffer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.ByteBuf byteBuf7 = writeCache4.get(4L, 4L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNull(byteBuf7);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(-1, 52)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(1, 100)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufArray15);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufArray15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean11 = writeCache4.hasEntry((long) 0, (long) 100);
        writeCache4.clear();
        long long13 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.getLastEntry(10L);
        boolean boolean16 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf19 = writeCache4.get((long) (byte) 0, (long) (byte) 1);
        boolean boolean20 = writeCache4.isEmpty();
        long long21 = writeCache4.count();
        writeCache4.clear();
        writeCache4.deleteLedger(10L);
        boolean boolean27 = writeCache4.hasEntry(4L, (long) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(byteBuf19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache8.get((long) 1, 1L);
        writeCache8.clear();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 'a', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf16 = writeCache13.get((long) 1, 0L);
        io.netty.buffer.ByteBuf byteBuf18 = writeCache13.getLastEntry((long) 64);
        boolean boolean21 = writeCache13.hasEntry((long) 52, (long) 10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNull(byteBuf16);
        org.junit.Assert.assertNull(byteBuf18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(0, 1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 52, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 107 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer(52);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray12 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(shortArray12);
        io.netty.buffer.ByteBuf[] byteBufArray14 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf7, byteBuf13 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf19);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufArray14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) -1, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        java.lang.Class<?> wildcardClass13 = byteBuf12.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (short) 0, (byte) 1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer(1, 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer(64);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer(52);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(52, 52);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufArray15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        boolean boolean9 = writeCache8.isEmpty();
        writeCache8.clear();
        writeCache8.clear();
        boolean boolean14 = writeCache8.hasEntry(10L, (long) 64);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator18.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator18.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator18.ioBuffer(1);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf25);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf25);
        boolean boolean28 = writeCache8.put((long) '4', (long) '4', byteBuf25);
        writeCache8.deleteLedger((long) 35);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 4, cap: 4/4).slice(100, 10)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        java.lang.String str13 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0, 64);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer();
        boolean boolean16 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.buffer(10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        int[] intArray7 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray7);
        long[] longArray11 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyLong(longArray11);
        long[] longArray15 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyLong(longArray15);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator17.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf[] byteBufArray20 = new io.netty.buffer.ByteBuf[] { byteBuf8, byteBuf12, byteBuf16, compositeByteBuf19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray20);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(byteBufArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 1, 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer(35);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer(1, (int) (short) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeBuffer();
        int int12 = unpooledByteBufAllocator1.calculateNewCapacity((int) ' ', 64);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        long long13 = writeCache12.size();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache12.getLastEntry(0L);
        long long16 = writeCache12.count();
        int[] intArray25 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copyMedium(intArray25);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copyShort(intArray25);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copyInt(intArray25);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copyShort(intArray25);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copyShort(intArray25);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copyShort(intArray25);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copyShort(intArray25);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copyInt(intArray25);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.copyInt(intArray25);
        boolean boolean35 = writeCache12.put((long) 100, (long) ' ', byteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.getLastEntry((long) 100);
        boolean boolean12 = writeCache4.hasEntry(0L, 0L);
        int[] intArray21 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copyMedium(intArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copyMedium(intArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyShort(intArray21);
        boolean boolean25 = writeCache4.put((long) '#', (long) (short) 10, byteBuf24);
        io.netty.buffer.ByteBuf byteBuf27 = writeCache4.getLastEntry((long) 10);
        boolean[] booleanArray33 = new boolean[] { false, false, true };
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.copyBoolean(booleanArray33);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.copyBoolean(booleanArray33);
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.copyBoolean(booleanArray33);
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.copyBoolean(booleanArray33);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.copyBoolean(booleanArray33);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf38);
        boolean boolean40 = writeCache4.put(1L, 100L, byteBuf39);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(byteBuf27);
        org.junit.Assert.assertNotNull(booleanArray33);
        assertBooleanArrayEquals(booleanArray33, new boolean[] { false, false, true });
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        int[] intArray0 = new int[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort(intArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copyInt(intArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyMedium(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.ioBuffer(100);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.buffer(52);
        int int23 = unpooledByteBufAllocator1.calculateNewCapacity(1, (int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer();
        boolean boolean16 = unpooledByteBufAllocator1.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.heapBuffer((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.ioBuffer(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.directBuffer(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (byte) 1, 52);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 98 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        writeCache12.close();
        long long14 = writeCache12.count();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator17.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator17.ioBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = writeCache12.put(10L, (long) (byte) 0, byteBuf21);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer(10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        double[] doubleArray3 = new double[] { 1.0d, 'a', '#' };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyDouble(doubleArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyDouble(doubleArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyDouble(doubleArray3);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 97.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray23 = new byte[][] { byteArray6, byteArray10, byteArray14, byteArray18, byteArray22 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray23);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer(10, (int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf8);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 0, 1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 101 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.directBuffer((int) '4', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeDirectBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.heapBuffer((int) (short) -1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort(32);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray26 = new byte[][] { byteArray9, byteArray13, byteArray17, byteArray21, byteArray25 };
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray26);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray26);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray26);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray26);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray26);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray26);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray26);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray26);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf35);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray24 = new byte[][] { byteArray7, byteArray11, byteArray15, byteArray19, byteArray23 };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray24);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray24);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray24);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray24);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
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
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.size();
        writeCache4.clear();
        boolean boolean12 = writeCache4.isEmpty();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        writeCache4.close();
        writeCache4.clear();
        writeCache4.deleteLedger((long) 0);
        writeCache4.deleteLedger((long) (byte) 100);
        writeCache4.clear();
        // The following exception was thrown during execution in test generation
        try {
            writeCache4.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeBuffer((int) (short) 1);
        boolean boolean9 = unpooledByteBufAllocator3.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer(35);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) 'a', (long) (short) 1);
        long long13 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf16 = writeCache4.get((long) ' ', (long) 100);
        io.netty.buffer.ByteBuf byteBuf19 = writeCache4.get((long) 64, (long) 10);
        io.netty.buffer.ByteBuf byteBuf22 = writeCache4.get((long) (byte) 10, (long) 100);
        io.netty.buffer.ByteBuf byteBuf24 = writeCache4.getLastEntry((long) (byte) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf16);
        org.junit.Assert.assertNull(byteBuf19);
        org.junit.Assert.assertNull(byteBuf22);
        org.junit.Assert.assertNull(byteBuf24);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 52);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer((int) (byte) 0, 52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.heapBuffer(1, (int) 'a');
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufArray16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer(10, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer(100);
        java.lang.String str15 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache18 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) '4');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache20 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str15, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(1, 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.size();
        long long11 = writeCache4.size();
        writeCache4.close();
        long long13 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.directBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator3.directBuffer(35, 52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator3.compositeDirectBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator3.directBuffer((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 0 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf6);
        java.lang.Class<?> wildcardClass8 = byteBuf7.getClass();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (short) 1, 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        short[] shortArray7 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(shortArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray15 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyShort(shortArray15);
        io.netty.buffer.ByteBuf[] byteBufArray17 = new io.netty.buffer.ByteBuf[] { byteBuf8, byteBuf10, byteBuf16 };
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBufArray17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer(10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 10L);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '4');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unpooledByteBufAllocator1.calculateNewCapacity((-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray23 = new byte[][] { byteArray6, byteArray10, byteArray14, byteArray18, byteArray22 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        double[] doubleArray6 = new double[] { 1, 100, 100, (byte) -1, (-1.0d), 10L };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyDouble(doubleArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyDouble(doubleArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyDouble(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, 100.0d, (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 10, 64);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyFloat((float) 0);
        boolean boolean14 = writeCache9.put((long) 100, (long) '#', byteBuf13);
        long long15 = writeCache9.count();
        boolean boolean18 = writeCache9.hasEntry(10L, (long) 0);
        io.netty.buffer.ByteBuf byteBuf20 = writeCache9.getLastEntry((long) (byte) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(byteBuf20);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        boolean boolean10 = writeCache4.isEmpty();
        boolean boolean11 = writeCache4.isEmpty();
        boolean boolean12 = writeCache4.isEmpty();
        long long13 = writeCache4.count();
        long long14 = writeCache4.count();
        writeCache4.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray4);
        org.junit.Assert.assertNotNull(byteBufferArray4);
        org.junit.Assert.assertArrayEquals(byteBufferArray4, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        java.lang.String str15 = unpooledByteBufAllocator1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str15, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        long[] longArray3 = new long[] { 64, (-1L), 100L };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] { 64L, (-1L), 100L });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyLong(36L);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer(32);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.deleteLedger((long) 0);
        boolean boolean11 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache4.get((long) (short) 10, 1L);
        writeCache4.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(byteBuf14);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer((int) (byte) 0, 1);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) (byte) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache15 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) 36L);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        short[] shortArray7 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(shortArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray15 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyShort(shortArray15);
        io.netty.buffer.ByteBuf[] byteBufArray17 = new io.netty.buffer.ByteBuf[] { byteBuf8, byteBuf10, byteBuf16 };
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray17);
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBufArray17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer(10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray23 = new byte[][] { byteArray6, byteArray10, byteArray14, byteArray18, byteArray22 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteArray23);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.directBuffer((int) '4', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeHeapBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) -1, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.size();
        boolean boolean13 = writeCache4.hasEntry((long) (byte) 10, 10L);
        writeCache4.deleteLedger((long) 100);
        io.netty.buffer.ByteBuf byteBuf17 = writeCache4.getLastEntry((long) 0);
        long long18 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf20 = writeCache4.getLastEntry((long) 100);
        io.netty.buffer.ByteBuf byteBuf22 = writeCache4.getLastEntry(0L);
        long long23 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(byteBuf20);
        org.junit.Assert.assertNull(byteBuf22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeHeapBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator3.ioBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 10, 0);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf11);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        boolean boolean7 = writeCache6.isEmpty();
        long long8 = writeCache6.size();
        long long9 = writeCache6.size();
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyDouble((double) 64);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = writeCache6.put((long) (byte) 1, (-1L), byteBuf13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (-1), 35, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 10, 64);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyFloat((float) 0);
        boolean boolean14 = writeCache9.put((long) 100, (long) '#', byteBuf13);
        writeCache9.close();
        boolean boolean18 = writeCache9.hasEntry(100L, 10L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator22 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator22.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf27 = unpooledByteBufAllocator22.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator22.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator22.ioBuffer((int) '#');
        boolean boolean31 = unpooledByteBufAllocator22.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator22.compositeDirectBuffer(35);
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator22.compositeBuffer();
        boolean boolean35 = writeCache9.put((long) (short) 0, (long) 35, (io.netty.buffer.ByteBuf) compositeByteBuf34);
        boolean boolean38 = writeCache9.hasEntry(100L, (long) (byte) -1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(compositeByteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (short) 0, 1);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer(35);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray24 = new byte[][] { byteArray7, byteArray11, byteArray15, byteArray19, byteArray23 };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray24);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray24);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteArray24);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray24);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.ioBuffer();
        int int7 = unpooledByteBufAllocator1.calculateNewCapacity(35, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(100, 100)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        boolean boolean10 = writeCache4.isEmpty();
        boolean boolean11 = writeCache4.isEmpty();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator15 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator15.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator15.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator15.heapBuffer((int) (byte) 1);
        java.lang.String str20 = unpooledByteBufAllocator15.toString();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator15.buffer(0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator15.directBuffer((int) (short) 100);
        boolean boolean26 = writeCache4.put((long) (byte) 0, (long) (short) 10, byteBuf25);
        boolean boolean29 = writeCache4.hasEntry(36L, (long) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str20, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(35, 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer(1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteBufferArray5);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertArrayEquals(byteBufferArray5, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        writeCache4.close();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf10 = writeCache4.getLastEntry((long) '#');
        long long11 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.getLastEntry((long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.getLastEntry((long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf17 = writeCache4.getLastEntry((long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf20 = writeCache4.get((long) 35, (long) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertNull(byteBuf17);
        org.junit.Assert.assertNull(byteBuf20);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(100);
        boolean boolean6 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.buffer((int) (short) 1, (int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer((int) (short) 10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        boolean boolean8 = unpooledByteBufAllocator0.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.get((long) (short) 1, (long) (short) 0);
        writeCache4.close();
        // The following exception was thrown during execution in test generation
        try {
            writeCache4.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric14 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer(52);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufArray15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufArray15);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufArray15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((-1L), (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        int[] intArray7 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray7);
        long[] longArray11 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyLong(longArray11);
        long[] longArray15 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyLong(longArray15);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator17.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf[] byteBufArray20 = new io.netty.buffer.ByteBuf[] { byteBuf8, byteBuf12, byteBuf16, compositeByteBuf19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf24);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(byteBufArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 0 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 4, cap: 4/4).slice(-1, 10)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer(52);
        int int18 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 10, 52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer(1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer(0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        boolean boolean10 = writeCache4.isEmpty();
        boolean boolean11 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) 0);
        boolean boolean14 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf17 = writeCache4.get((long) (short) 1, (long) 52);
        boolean boolean20 = writeCache4.hasEntry((long) (short) 100, (long) 0);
        io.netty.buffer.ByteBuf byteBuf23 = writeCache4.get((long) (byte) 10, (long) 1);
        writeCache4.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(byteBuf23);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeDirectBuffer();
        boolean boolean8 = unpooledByteBufAllocator3.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity(1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        writeCache4.close();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf10 = writeCache4.getLastEntry(10L);
        long long11 = writeCache4.size();
        boolean boolean14 = writeCache4.hasEntry((long) 10, (long) (short) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        long long5 = writeCache4.count();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator9.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator9.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator9.heapBuffer(1);
        boolean boolean15 = writeCache4.put((long) '4', (long) (short) 100, byteBuf14);
        writeCache4.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
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
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf12);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache9.get(0L, (-1L));
        long long13 = writeCache9.count();
        writeCache9.deleteLedger((long) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        int int12 = unpooledByteBufAllocator1.calculateNewCapacity(64, (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(1);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10, (int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '4');
        java.lang.String str13 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get((long) (byte) 0, (long) (short) 0);
        writeCache4.deleteLedger(4L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator17.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator17.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator17.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator17.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator17.buffer();
        boolean boolean25 = writeCache4.put(100L, (long) 0, byteBuf24);
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0, 10);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyShort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
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
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufferArray5);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertArrayEquals(byteBufferArray5, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufArray15);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufArray15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        long long11 = writeCache10.count();
        writeCache10.close();
        boolean boolean13 = writeCache10.isEmpty();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.directBuffer((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) ' ', 64);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(52);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer(35);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer(35, (int) '4');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 'a');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufArray16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer(64);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        short[] shortArray7 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(shortArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray15 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyShort(shortArray15);
        io.netty.buffer.ByteBuf[] byteBufArray17 = new io.netty.buffer.ByteBuf[] { byteBuf8, byteBuf10, byteBuf16 };
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBufArray17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 45 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) '#', 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) 'a');
        java.lang.String str16 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str16, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator1.metric();
        java.lang.Class<?> wildcardClass13 = byteBufAllocatorMetric12.getClass();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache7.get((long) (byte) 10, (long) (short) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator14.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator14.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator14.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator14.buffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator14.buffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator14.directBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator14.ioBuffer(0);
        boolean boolean25 = writeCache7.put((long) 1, 36L, byteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (byte) 1);
        writeCache7.close();
        writeCache7.clear();
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        writeCache2.deleteLedger((long) '4');
        long long5 = writeCache2.count();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = writeCache2.hasEntry((long) (short) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer(64);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        int int14 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.directBuffer((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 35, (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        java.nio.ByteBuffer[] byteBufferArray1 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufferArray1);
        org.junit.Assert.assertNotNull(byteBufferArray1);
        org.junit.Assert.assertArrayEquals(byteBufferArray1, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer(35, 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer(1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufArray15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer();
        java.lang.Class<?> wildcardClass13 = byteBuf12.getClass();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.clear();
        writeCache4.deleteLedger((long) (byte) 1);
        long long12 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache4.getLastEntry((long) 64);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(byteBuf14);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray3, byteArray7, byteArray11, byteArray15, byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf27);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean11 = writeCache4.hasEntry((long) 0, (long) 100);
        writeCache4.deleteLedger((long) 0);
        long long14 = writeCache4.size();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf18 = writeCache4.get(36L, (long) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteBuf18);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry(1L, (long) 100);
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get(0L, 0L);
        long long13 = writeCache4.size();
        writeCache4.close();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.get(1L, 100L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator17.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator17.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator17.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator17.compositeBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf26);
        boolean boolean28 = writeCache4.put(100L, (long) ' ', byteBuf27);
        io.netty.buffer.ByteBuf byteBuf30 = writeCache4.getLastEntry((long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf33 = writeCache4.get((long) 0, (long) 35);
        boolean boolean34 = writeCache4.isEmpty();
        long long35 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(byteBuf30);
        org.junit.Assert.assertNull(byteBuf33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, 0L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) (short) 10);
        long long7 = writeCache6.count();
        long long8 = writeCache6.size();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer(100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        long[] longArray10 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyLong(longArray10);
        long[] longArray14 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyLong(longArray14);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator16.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf[] byteBufArray19 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf11, byteBuf15, compositeByteBuf18 };
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray19);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator16);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(byteBufArray19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer(52);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(1);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10, (int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        java.lang.String str5 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.buffer((int) ' ');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) 35, 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeHeapBuffer(35);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, false);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeDirectBuffer(10);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        short[] shortArray2 = new short[] { (byte) -1, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf6);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) -1 });
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 52, (int) (byte) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (short) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass12 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufArray16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        long[] longArray3 = new long[] { 10L, (byte) 10, 100L };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf5);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] { 10L, 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        writeCache4.deleteLedger((long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.get(10L, (long) (-1));
        writeCache4.deleteLedger((long) '#');
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray40 = new byte[][] { byteArray23, byteArray27, byteArray31, byteArray35, byteArray39 };
        io.netty.buffer.ByteBuf byteBuf41 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray40);
        io.netty.buffer.ByteBuf byteBuf42 = io.netty.buffer.Unpooled.copiedBuffer(byteArray40);
        io.netty.buffer.ByteBuf byteBuf43 = io.netty.buffer.Unpooled.copiedBuffer(byteArray40);
        io.netty.buffer.ByteBuf byteBuf44 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray40);
        io.netty.buffer.ByteBuf byteBuf45 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray40);
        io.netty.buffer.ByteBuf byteBuf46 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteArray40);
        io.netty.buffer.ByteBuf byteBuf47 = io.netty.buffer.Unpooled.copiedBuffer(byteArray40);
        io.netty.buffer.ByteBuf byteBuf48 = io.netty.buffer.Unpooled.copiedBuffer(byteArray40);
        io.netty.buffer.ByteBuf byteBuf49 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = writeCache4.put((long) (-1), 36L, byteBuf49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertNotNull(byteBuf48);
        org.junit.Assert.assertNotNull(byteBuf49);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        writeCache4.deleteLedger((long) 'a');
        writeCache4.deleteLedger(10L);
        writeCache4.close();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator16.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator16.heapBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = writeCache4.put((long) (byte) -1, (long) (short) 10, byteBuf20);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        int[] intArray12 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyMedium(intArray12);
        int[] intArray20 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copyMedium(intArray20);
        io.netty.buffer.ByteBuf[] byteBufArray22 = new io.netty.buffer.ByteBuf[] { compositeByteBuf5, byteBuf13, byteBuf21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf26);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBufArray22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) ' ', 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.ioBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray3, byteArray7, byteArray11, byteArray15, byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf25);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 100, 0);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.ByteBuf byteBuf6 = writeCache4.getLastEntry((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = byteBuf6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNull(byteBuf6);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) 'a', (long) (short) 1);
        long long13 = writeCache4.size();
        writeCache4.close();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf18 = writeCache4.get(1L, (long) (byte) 10);
        boolean boolean19 = writeCache4.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray25 = new byte[][] { byteArray8, byteArray12, byteArray16, byteArray20, byteArray24 };
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray25);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray25);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray25);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copiedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteArray25);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray25);
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.copiedBuffer(byteArray25);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
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
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        writeCache4.close();
        writeCache4.clear();
        writeCache4.deleteLedger((long) 0);
        long long11 = writeCache4.count();
        long long12 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer(52, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf10);
        org.junit.Assert.assertNotNull(byteBufferArray2);
        org.junit.Assert.assertArrayEquals(byteBufferArray2, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        writeCache4.close();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf10 = writeCache4.getLastEntry(10L);
        long long11 = writeCache4.count();
        writeCache4.deleteLedger((long) (byte) 10);
        writeCache4.clear();
        long long15 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(35, (byte) -1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        java.lang.String str13 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric14 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.directBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer((int) (byte) 10, (int) '4');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric10 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric18 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric18);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        long long5 = writeCache4.count();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator9.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator9.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator9.heapBuffer(1);
        boolean boolean15 = writeCache4.put((long) '4', (long) (short) 100, byteBuf14);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.directBuffer((int) (short) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = writeCache4.put((long) '#', (long) (short) -1, byteBuf20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) -1, (int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        int[] intArray3 = new int[] { (byte) 0, 35, 'a' };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyMedium(intArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyInt(intArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 35, 97 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.heapBuffer(64);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.deleteLedger((long) 0);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.getLastEntry(4L);
        long long13 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(4L, (int) (byte) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        boolean boolean3 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.heapBuffer((int) 'a');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(100L, (int) (byte) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer(64);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(100);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer(35);
        java.lang.Class<?> wildcardClass16 = unpooledByteBufAllocator1.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(64, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.clear();
        writeCache4.close();
        long long12 = writeCache4.size();
        writeCache4.deleteLedger((long) (byte) 1);
        boolean boolean17 = writeCache4.hasEntry((long) (short) 10, (-1L));
        short[] shortArray26 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copyShort(shortArray26);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray34 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.copyShort(shortArray34);
        io.netty.buffer.ByteBuf[] byteBufArray36 = new io.netty.buffer.ByteBuf[] { byteBuf27, byteBuf29, byteBuf35 };
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray36);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray36);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray36);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray36);
        io.netty.buffer.ByteBuf byteBuf41 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufArray36);
        io.netty.buffer.ByteBuf byteBuf42 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray36);
        io.netty.buffer.ByteBuf byteBuf43 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray36);
        io.netty.buffer.ByteBuf byteBuf44 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray36);
        io.netty.buffer.ByteBuf byteBuf45 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray36);
        io.netty.buffer.ByteBuf byteBuf46 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray36);
        io.netty.buffer.ByteBuf byteBuf47 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray36);
        io.netty.buffer.ByteBuf byteBuf48 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray36);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = writeCache4.put((long) ' ', (long) 'a', byteBuf48);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBufArray36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertNotNull(byteBuf48);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer();
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer(64);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(0L, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.buffer((int) (byte) 10, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator2.heapBuffer();
        int int16 = unpooledByteBufAllocator2.calculateNewCapacity(0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator2.buffer((int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0);
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        int int12 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 10, (int) 'a');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) (short) 100, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = unpooledByteBufAllocator1.calculateNewCapacity(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0, 10);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache17 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) (byte) 100);
        long long8 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get((long) 100, (long) 64);
        boolean boolean14 = writeCache4.hasEntry((long) 1, 1L);
        java.nio.ByteBuffer[] byteBufferArray18 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray18);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray18);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray18);
        boolean boolean22 = writeCache4.put(100L, (long) ' ', byteBuf21);
        boolean boolean23 = writeCache4.isEmpty();
        writeCache4.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBufferArray18);
        org.junit.Assert.assertArrayEquals(byteBufferArray18, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        writeCache4.close();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf10 = writeCache4.getLastEntry((long) '#');
        long long11 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.buffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = writeCache4.put((long) 1, (long) (byte) 1, byteBuf14);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer((int) '4');
        java.lang.String str11 = unpooledByteBufAllocator0.toString();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, false);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        java.lang.String str5 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.heapBuffer((int) '#', (int) '#');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 1, 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator3.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (short) 10, (byte) -1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.getLastEntry((long) '4');
        boolean boolean15 = writeCache4.hasEntry(100L, (long) 10);
        writeCache4.close();
        boolean boolean19 = writeCache4.hasEntry((long) (short) 10, (long) 100);
        writeCache4.clear();
        long long21 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) (byte) 100);
        long long8 = writeCache4.count();
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteArray15, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray15);
        boolean boolean21 = writeCache4.put((long) (byte) 100, (long) 100, byteBuf20);
        long long22 = writeCache4.count();
        // The following exception was thrown during execution in test generation
        try {
            writeCache4.deleteLedger((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        org.junit.Assert.assertNotNull(byteBufferArray4);
        org.junit.Assert.assertArrayEquals(byteBufferArray4, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 'a');
        writeCache11.clear();
        writeCache11.clear();
        boolean boolean14 = writeCache11.isEmpty();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean11 = writeCache4.hasEntry((long) 0, (long) 100);
        writeCache4.deleteLedger((long) 0);
        long long14 = writeCache4.count();
        // The following exception was thrown during execution in test generation
        try {
            writeCache4.deleteLedger((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 10, (int) ' ', false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer(0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        writeCache14.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.heapBuffer((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator2.heapBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator2.directBuffer(64, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.directBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.ioBuffer((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer(64);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 1);
        writeCache14.close();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        long long8 = writeCache4.size();
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.getLastEntry((long) (byte) 0);
        boolean boolean12 = writeCache4.isEmpty();
        long long13 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        int int16 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 0, 52);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeHeapBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.Class<?> wildcardClass7 = unpooledByteBufAllocator1.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) 10, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.directBuffer((int) (short) 0, (int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache19 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 35);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.deleteLedger((long) 'a');
        long long11 = writeCache4.count();
        writeCache4.clear();
        writeCache4.deleteLedger(36L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.clear();
        writeCache4.close();
        boolean boolean14 = writeCache4.hasEntry((long) (short) 10, (long) 10);
        boolean boolean15 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator21 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator21.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric25 = unpooledByteBufAllocator21.metric();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator21.buffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator21.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator21.buffer((int) (byte) 1, (int) (short) 100);
        java.lang.String str32 = unpooledByteBufAllocator21.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator21.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = writeCache4.put((long) 52, (long) 100, (io.netty.buffer.ByteBuf) compositeByteBuf33);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str32, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf33);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.size();
        writeCache4.clear();
        boolean boolean12 = writeCache4.isEmpty();
        boolean boolean15 = writeCache4.hasEntry((long) (byte) 1, (long) 'a');
        io.netty.buffer.ByteBuf byteBuf17 = writeCache4.getLastEntry((long) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuf17);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) '#', 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 52, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        boolean boolean14 = unpooledByteBufAllocator1.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.directBuffer(52, (int) (byte) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, 100L);
        boolean boolean9 = writeCache8.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer(52);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeHeapBuffer(64);
        java.lang.String str10 = unpooledByteBufAllocator0.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.heapBuffer(64, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.directBuffer(52, (int) (byte) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, 100L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator2.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator2.buffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator2.directBuffer(10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf15 = writeCache12.get((long) 1, (long) 10);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator19 = new io.netty.buffer.UnpooledByteBufAllocator(false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator19.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator19.compositeHeapBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf22);
        boolean boolean24 = writeCache12.put((long) 52, (long) 1, (io.netty.buffer.ByteBuf) compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, 52);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufArray16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufArray15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray23 = new byte[][] { byteArray6, byteArray10, byteArray14, byteArray18, byteArray22 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteArray23);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        short[] shortArray7 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(shortArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray15 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyShort(shortArray15);
        io.netty.buffer.ByteBuf[] byteBufArray17 = new io.netty.buffer.ByteBuf[] { byteBuf8, byteBuf10, byteBuf16 };
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBufArray17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufArray16);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufArray16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(1, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        int int14 = unpooledByteBufAllocator1.calculateNewCapacity(0, 1);
        java.lang.String str15 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str15, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufArray15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        short[] shortArray5 = new short[] { (short) 1, (byte) 100, (byte) -1, (byte) 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf6);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 1, (short) 100, (short) -1, (short) 10, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) '4', (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 100 };
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 100 });
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric3 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (byte) 10, 52);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '4');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '#');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.getLastEntry((long) '4');
        boolean boolean15 = writeCache4.hasEntry(100L, (long) 10);
        writeCache4.close();
        io.netty.buffer.ByteBuf byteBuf18 = writeCache4.getLastEntry((long) (short) 0);
        long long19 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuf18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) 'a', (long) (short) 1);
        long long13 = writeCache4.size();
        writeCache4.close();
        boolean boolean17 = writeCache4.hasEntry((long) 52, (long) 10);
        boolean boolean18 = writeCache4.isEmpty();
        short[] shortArray23 = new short[] { (short) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyShort(shortArray23);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = writeCache4.put((long) '4', 100L, byteBuf24);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 52, 64);
        int[] intArray21 = new int[] { 100, (short) 1, 0, '#', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copyShort(intArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copyShort(intArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyMedium(intArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copyMedium(intArray21);
        boolean boolean26 = writeCache13.put((long) (byte) 10, (long) 1, byteBuf25);
        boolean boolean27 = writeCache13.isEmpty();
        io.netty.buffer.ByteBuf byteBuf29 = writeCache13.getLastEntry((long) (byte) 0);
        writeCache13.clear();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 100, 1, 0, 35, 10 });
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(byteBuf29);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        org.junit.Assert.assertNotNull(byteBufferArray2);
        org.junit.Assert.assertArrayEquals(byteBufferArray2, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 1, (int) (short) 10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer(100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray12 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(shortArray12);
        io.netty.buffer.ByteBuf[] byteBufArray14 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf7, byteBuf13 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufArray14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry(1L, (long) 100);
        long long9 = writeCache4.count();
        writeCache4.close();
        writeCache4.clear();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unpooledByteBufAllocator1.calculateNewCapacity(52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 52 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray12 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(shortArray12);
        io.netty.buffer.ByteBuf[] byteBufArray14 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf7, byteBuf13 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufArray14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 52, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) '#', (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufArray16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer(10, 64);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 32, 32);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer(64);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(100);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer(10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) 'a', (long) (short) 1);
        long long13 = writeCache4.size();
        writeCache4.close();
        writeCache4.clear();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf18 = writeCache4.get((long) (-1), (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        java.lang.Class<?> wildcardClass10 = unpooledByteBufAllocator1.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.get(1L, 100L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator17.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator17.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator17.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator17.compositeBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf26);
        boolean boolean28 = writeCache4.put(100L, (long) ' ', byteBuf27);
        io.netty.buffer.ByteBuf byteBuf30 = writeCache4.getLastEntry((long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf33 = writeCache4.get((long) 0, (long) 35);
        long long34 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(byteBuf30);
        org.junit.Assert.assertNull(byteBuf33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1, (int) (byte) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric15 = unpooledByteBufAllocator1.metric();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache18 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric15);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator2.directBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator2.compositeBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.directBuffer(0);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer(64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer(1);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 5, cap: 5/5).slice(35, 10)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (byte) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100, 1);
        writeCache12.clear();
        long long14 = writeCache12.count();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator20.directBuffer((int) '4', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator20.heapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator20.buffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator20.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator20.directBuffer();
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf30);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = writeCache12.put((long) '#', (long) (-1), byteBuf31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 0, 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 'a');
        writeCache11.clear();
        long long13 = writeCache11.count();
        writeCache11.clear();
        boolean boolean15 = writeCache11.isEmpty();
        writeCache11.deleteLedger((long) 0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        int int12 = unpooledByteBufAllocator1.calculateNewCapacity((int) '#', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray12 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(shortArray12);
        io.netty.buffer.ByteBuf[] byteBufArray14 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf7, byteBuf13 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufArray14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeHeapBuffer(64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeDirectBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) 'a', (long) (short) 1);
        long long13 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf16 = writeCache4.get((long) ' ', (long) 100);
        io.netty.buffer.ByteBuf byteBuf19 = writeCache4.get((long) 64, (long) 10);
        writeCache4.close();
        short[] shortArray28 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copyShort(shortArray28);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray36 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.copyShort(shortArray36);
        io.netty.buffer.ByteBuf[] byteBufArray38 = new io.netty.buffer.ByteBuf[] { byteBuf29, byteBuf31, byteBuf37 };
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray38);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray38);
        io.netty.buffer.ByteBuf byteBuf41 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray38);
        io.netty.buffer.ByteBuf byteBuf42 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray38);
        io.netty.buffer.ByteBuf byteBuf43 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf42);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = writeCache4.put(36L, (long) 100, byteBuf43);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf16);
        org.junit.Assert.assertNull(byteBuf19);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBufArray38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        boolean boolean15 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 1, 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, 0L);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator3.directBuffer((int) ' ');
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray4);
        org.junit.Assert.assertNotNull(byteBufferArray4);
        org.junit.Assert.assertArrayEquals(byteBufferArray4, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator2.directBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator2.compositeBuffer(35);
        boolean boolean8 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator2.heapBuffer(35, 35);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 5, cap: 5/5).slice(10, 32)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator13.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator13.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator13.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator13.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator13.compositeBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric24 = unpooledByteBufAllocator13.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator13.compositeDirectBuffer(10);
        boolean boolean27 = writeCache9.put((long) (byte) 0, (long) 52, (io.netty.buffer.ByteBuf) compositeByteBuf26);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf26);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf26);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric24);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 100, 0);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        java.lang.String str5 = unpooledByteBufAllocator0.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer();
        boolean boolean16 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.getLastEntry((long) 100);
        writeCache4.clear();
        boolean boolean11 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.getLastEntry((long) (byte) 100);
        boolean boolean16 = writeCache4.hasEntry((long) (short) 100, (long) 35);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf5);
        org.junit.Assert.assertNotNull(byteBufferArray2);
        org.junit.Assert.assertArrayEquals(byteBufferArray2, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer(35);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer(32);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        int int15 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 10, 52);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        boolean boolean10 = writeCache4.isEmpty();
        boolean boolean11 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) 0);
        boolean boolean14 = writeCache4.isEmpty();
        writeCache4.deleteLedger(4L);
        writeCache4.clear();
        boolean boolean18 = writeCache4.isEmpty();
        long long19 = writeCache4.size();
        long long20 = writeCache4.count();
        long long21 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 4, cap: 4/4).slice(0, 100)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache9.getLastEntry((long) (short) 0);
        writeCache9.close();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = writeCache9.hasEntry((-1L), (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(35, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeBuffer(32);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.buffer(0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer(52);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) '4');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.heapBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.heapBuffer((int) (short) 0, (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(35, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer(0, 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.ioBuffer(10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache19 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (byte) 1, 64);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        byte[][] byteArray16 = new byte[][] { byteArray5, byteArray10, byteArray15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteArray16);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.buffer((int) (byte) 10, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator2.directBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator2.compositeDirectBuffer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufArray15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        long long5 = writeCache4.count();
        long long6 = writeCache4.size();
        writeCache4.clear();
        writeCache4.close();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = writeCache4.getLastEntry((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.buffer(10, (int) '#');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.directBuffer((int) '4');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer((int) (short) 1, 52);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        java.nio.ByteBuffer[] byteBufferArray0 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf2);
        org.junit.Assert.assertNotNull(byteBufferArray0);
        org.junit.Assert.assertArrayEquals(byteBufferArray0, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.count();
        boolean boolean12 = writeCache4.hasEntry((long) (short) 100, (long) 'a');
        writeCache4.clear();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache9.getLastEntry((long) (short) 0);
        writeCache9.close();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache9.get((long) '4', 4L);
        long long16 = writeCache9.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.get(1L, 100L);
        long long14 = writeCache4.size();
        writeCache4.deleteLedger((long) '#');
        long long17 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray12 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(shortArray12);
        io.netty.buffer.ByteBuf[] byteBufArray14 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf7, byteBuf13 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        java.lang.Class<?> wildcardClass22 = byteBuf21.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufArray14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer((int) (byte) 10, (int) '4');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        org.junit.Assert.assertNotNull(byteBufferArray6);
        org.junit.Assert.assertArrayEquals(byteBufferArray6, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
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
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer(10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (short) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) ' ', (int) '#');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.size();
        boolean boolean13 = writeCache4.hasEntry((long) (byte) 10, 10L);
        writeCache4.deleteLedger((long) 100);
        writeCache4.deleteLedger((long) 64);
        writeCache4.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(52, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 64, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufArray16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer(52, 52);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(0, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        boolean boolean9 = writeCache8.isEmpty();
        writeCache8.clear();
        writeCache8.clear();
        boolean boolean12 = writeCache8.isEmpty();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache8.getLastEntry((long) 32);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(byteBuf14);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        boolean boolean10 = writeCache4.isEmpty();
        boolean boolean11 = writeCache4.isEmpty();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator15 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator15.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator15.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator15.heapBuffer((int) (byte) 1);
        java.lang.String str20 = unpooledByteBufAllocator15.toString();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator15.buffer(0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator15.directBuffer((int) (short) 100);
        boolean boolean26 = writeCache4.put((long) (byte) 0, (long) (short) 10, byteBuf25);
        boolean boolean29 = writeCache4.hasEntry((long) (byte) 0, (long) (byte) 0);
        writeCache4.deleteLedger((long) '#');
        writeCache4.close();
        long long33 = writeCache4.size();
        writeCache4.deleteLedger((long) 52);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str20, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
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
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache15 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 1 };
        byte[][] byteArray16 = new byte[][] { byteArray3, byteArray6, byteArray9, byteArray12, byteArray15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray16);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(0, 32)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) 'a', (long) (short) 1);
        long long13 = writeCache4.size();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator16.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator16.heapBuffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator16.compositeDirectBuffer(1);
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator16.heapBuffer((int) (short) 1);
        boolean boolean25 = writeCache4.put((long) (byte) 10, (long) (short) 10, byteBuf24);
        boolean boolean26 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) (short) 100);
        boolean boolean31 = writeCache4.hasEntry((long) (short) 1, (long) 32);
        boolean boolean34 = writeCache4.hasEntry((long) '#', (long) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '4');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer(52);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        java.lang.String str3 = unpooledByteBufAllocator0.toString();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(10, 64);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer(10, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (-1L), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str3, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 10);
        long long8 = writeCache7.size();
        writeCache7.clear();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer(64);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer(1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        java.lang.Class<?> wildcardClass16 = byteBuf15.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(32, (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer((int) (short) 10, 64);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unpooledByteBufAllocator1.calculateNewCapacity((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 97 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        java.lang.Class<?> wildcardClass28 = byteBuf27.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufArray16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }
}

