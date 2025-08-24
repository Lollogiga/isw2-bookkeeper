package org.apache.bookkeeper.generated.wc;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer((int) 'a', 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(64)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray20);
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
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.directBuffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        boolean boolean6 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0, 64);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(64, (int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 35);
        boolean boolean15 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf9);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator13.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator13.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator13.heapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator13.buffer((int) (byte) 0, 100);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator13.ioBuffer();
        boolean boolean22 = writeCache9.put((long) (byte) 100, (long) (byte) 100, byteBuf21);
        io.netty.buffer.ByteBuf byteBuf25 = writeCache9.get((long) 35, (long) (short) 10);
        boolean boolean26 = writeCache9.isEmpty();
        writeCache9.clear();
        long long28 = writeCache9.count();
        writeCache9.deleteLedger((long) 'a');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(byteBuf25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
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
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        long long8 = writeCache7.size();
        writeCache7.clear();
        long long10 = writeCache7.size();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyInt(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
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
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.directBuffer(10);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer(1, 35);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[4]");
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
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray4);
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
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray15);
        java.lang.Class<?> wildcardClass21 = byteBuf20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufferArray4);
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
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray5);
        org.junit.Assert.assertNotNull(byteBufferArray5);
        org.junit.Assert.assertArrayEquals(byteBufferArray5, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf3);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyInt(intArray4);
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
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf9);
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
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeHeapBuffer();
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        int[] intArray5 = new int[] { 100, (short) 1, 0, '#', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 1, 0, 35, 10 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(52);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer(35);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer(35, (int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) ' ');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0, (int) '4');
        boolean boolean20 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer(0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, 10L, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = writeCache9.getLastEntry(10L);
        long long12 = writeCache9.size();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache9.get((long) 10, (long) (short) -1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        long long8 = writeCache4.size();
        boolean boolean9 = writeCache4.isEmpty();
        long long10 = writeCache4.count();
        long long11 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufArray15);
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
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        short[] shortArray2 = new short[] { (short) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 0, (short) 0 });
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.ioBuffer((int) ' ');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 0);
        writeCache11.deleteLedger(0L);
        writeCache11.deleteLedger((long) 100);
        boolean boolean18 = writeCache11.hasEntry(2L, (long) (byte) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf8);
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
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        boolean boolean31 = writeCache4.hasEntry(4L, (long) ' ');
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 1 };
        byte[][] byteArray50 = new byte[][] { byteArray37, byteArray40, byteArray43, byteArray46, byteArray49 };
        io.netty.buffer.ByteBuf byteBuf51 = io.netty.buffer.Unpooled.copiedBuffer(byteArray50);
        io.netty.buffer.ByteBuf byteBuf52 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteArray50);
        io.netty.buffer.ByteBuf byteBuf53 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray50);
        io.netty.buffer.ByteBuf byteBuf54 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray50);
        boolean boolean55 = writeCache4.put((long) '4', (long) (byte) 0, byteBuf54);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
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
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.directBuffer((int) '4', (int) 'a');
        java.lang.Class<?> wildcardClass7 = byteBuf6.getClass();
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer(52);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, 64);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf6);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 100, (int) ' ', true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.directBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator2.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator2.compositeDirectBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) (short) 100);
        boolean boolean16 = unpooledByteBufAllocator1.isDirectBufferPooled();
        boolean boolean17 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 1, 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer(64);
        java.lang.Class<?> wildcardClass10 = byteBuf9.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 4, cap: 4/4).slice(97, 100)");
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
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
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
        long long23 = writeCache4.size();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator27.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator27.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator27.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator27.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf39 = unpooledByteBufAllocator27.ioBuffer(52, (int) 'a');
        boolean boolean40 = writeCache4.put((long) 32, (long) (short) 0, byteBuf39);
        writeCache4.deleteLedger((long) (short) 0);
        long long43 = writeCache4.count();
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
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1L + "'", long43 == 1L);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeDirectBuffer(10);
        java.lang.Class<?> wildcardClass15 = compositeByteBuf14.getClass();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, false);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeHeapBuffer((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        boolean boolean11 = writeCache4.hasEntry((long) (byte) 0, (long) (byte) 10);
        boolean boolean12 = writeCache4.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer(35, 52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeDirectBuffer(64);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity((int) ' ', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf21);
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
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeDirectBuffer((-1));
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
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.directBuffer(10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
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
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) -1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[1]");
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
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 52, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(0, 52)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.ioBuffer(52, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteArray21);
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
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.heapBuffer();
        boolean boolean5 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator0.metric();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer(1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, true);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) 0);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray7);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertArrayEquals(byteBufferArray7, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
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
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
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
        boolean boolean21 = writeCache4.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf16);
        org.junit.Assert.assertNull(byteBuf19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer(10);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache15 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer(0, (int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer();
        boolean boolean16 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache18 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.buffer(64);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
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
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        short[] shortArray16 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copyShort(shortArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray24 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copyShort(shortArray24);
        io.netty.buffer.ByteBuf[] byteBufArray26 = new io.netty.buffer.ByteBuf[] { byteBuf17, byteBuf19, byteBuf25 };
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray26);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray26);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray26);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray26);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray26);
        boolean boolean32 = writeCache4.put(15L, 100L, byteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBufArray26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
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
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray23);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf32);
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
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        long[] longArray1 = new long[] { 10L };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copyLong(longArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyLong(longArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyLong(longArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyLong(longArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyLong(longArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyLong(longArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyLong(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 10L });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
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
        io.netty.buffer.ByteBuf byteBuf17 = writeCache12.getLastEntry((long) 35);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertNull(byteBuf17);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeBuffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0, 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        boolean boolean9 = writeCache8.isEmpty();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator13.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator13.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator13.compositeBuffer();
        boolean boolean18 = writeCache8.put((long) (short) 0, 100L, (io.netty.buffer.ByteBuf) compositeByteBuf17);
        io.netty.buffer.ByteBuf byteBuf21 = writeCache8.get((long) (short) 100, (long) 52);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(byteBuf21);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray20);
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
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
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
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric18 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.heapBuffer();
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
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric18);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer((-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry(1L, (long) 100);
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get(0L, 0L);
        long long13 = writeCache4.size();
        writeCache4.close();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator18.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator18.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator18.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator18.buffer(52);
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator18.buffer((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = writeCache4.put((long) (short) 100, (long) (short) 10, byteBuf26);
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
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, true };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyBoolean(booleanArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyBoolean(booleanArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, true });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric17 = unpooledByteBufAllocator1.metric();
        java.lang.String str18 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str18, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        long long23 = writeCache4.count();
        long long24 = writeCache4.count();
        java.lang.Class<?> wildcardClass25 = writeCache4.getClass();
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
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
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        writeCache4.close();
        long long9 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) (byte) 0, (long) 'a');
        io.netty.buffer.ByteBuf byteBuf14 = writeCache4.getLastEntry((long) '#');
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertNull(byteBuf14);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.buffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer(10, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer(35);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator0.compositeDirectBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 52, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(100, (byte) 0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer(35);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10, 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric14 = unpooledByteBufAllocator1.metric();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.deleteLedger((long) 'a');
        long long11 = writeCache4.count();
        writeCache4.clear();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator16.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator16.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator16.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator16.compositeBuffer((int) (byte) 10);
        boolean boolean26 = writeCache4.put((long) (byte) 10, 0L, (io.netty.buffer.ByteBuf) compositeByteBuf25);
        io.netty.buffer.ByteBuf byteBuf28 = writeCache4.getLastEntry(0L);
        writeCache4.close();
        long long30 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer(0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer(35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.directBuffer();
        int int8 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 10, (int) 'a');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0, 64);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer(32, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        java.lang.String str8 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer(64, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
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
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str15, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer(52);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator2.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.buffer((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer(1, 64);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        long long8 = writeCache4.size();
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.getLastEntry((long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf14 = writeCache4.get((long) (byte) 100, 1L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertNull(byteBuf14);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, false);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeDirectBuffer(10);
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity((int) (short) 10, (int) (short) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric10 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator3.directBuffer(1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric10);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufferArray4);
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
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
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
        long long18 = writeCache4.count();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator23 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache25 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator23, 0L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache27 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator23, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator23.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf28);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = writeCache4.put((long) (byte) -1, (long) ' ', byteBuf29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteArray24);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteArray24);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
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
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 5, cap: 5/5).slice(52, 10)");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(52);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer(100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, 0L);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache10.getLastEntry((long) (short) 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNull(byteBuf12);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeDirectBuffer((int) '#');
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 10, 64);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyFloat((float) 0);
        boolean boolean14 = writeCache9.put((long) 100, (long) '#', byteBuf13);
        short[] shortArray24 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copyShort(shortArray24);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray32 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copyShort(shortArray32);
        io.netty.buffer.ByteBuf[] byteBufArray34 = new io.netty.buffer.ByteBuf[] { byteBuf25, byteBuf27, byteBuf33 };
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray34);
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray34);
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray34);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray34);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufArray34);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray34);
        io.netty.buffer.ByteBuf byteBuf41 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray34);
        io.netty.buffer.ByteBuf byteBuf42 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray34);
        boolean boolean43 = writeCache9.put((long) 100, 100L, byteBuf42);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf45 = writeCache9.getLastEntry((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBufArray34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, true };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyBoolean(booleanArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyBoolean(booleanArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyBoolean(booleanArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyBoolean(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, true });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.buffer((int) (byte) 10, 52);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.buffer((int) (byte) 10, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator2.directBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator2.compositeBuffer(10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache21 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) 0, (int) (short) 1);
        writeCache21.clear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
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
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer((int) (byte) 0, 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 1, 1);
        writeCache10.close();
        boolean boolean14 = writeCache10.hasEntry((long) '#', (long) '#');
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
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
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (short) 10, 52);
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
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
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.heapBuffer((int) ' ');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str15, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
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
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.buffer((int) 'a', 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator2.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.heapBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator2.compositeHeapBuffer(52);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry(1L, (long) 100);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache4.getLastEntry((long) (byte) 100);
        long long11 = writeCache4.size();
        long long12 = writeCache4.size();
        long long13 = writeCache4.size();
        long long14 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer();
        java.lang.String str16 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str16, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        long[] longArray3 = new long[] { 10L, (byte) 10, 100L };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf8);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] { 10L, 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (short) 1, 1);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        boolean boolean10 = writeCache4.isEmpty();
        long long11 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache4.get((long) 0, 4L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator18.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator18.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator18.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator18.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator18.heapBuffer(64);
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator18.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf27);
        boolean boolean29 = writeCache4.put((long) 10, (long) (short) 100, byteBuf27);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyMedium(intArray6);
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
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator2.directBuffer((int) '4');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) (short) 10, 1);
        long long8 = writeCache7.size();
        boolean boolean9 = writeCache7.isEmpty();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 1, 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, 100L);
        long long9 = writeCache8.size();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        int int17 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
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
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
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
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeHeapBuffer(64);
        boolean boolean19 = unpooledByteBufAllocator1.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator1.ioBuffer((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufArray16);
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
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator27.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache30 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator27.directBuffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator27.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator27.buffer((int) '#', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = writeCache4.put((long) ' ', (long) (byte) -1, byteBuf36);
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
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(byteBuf36);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) 1, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf26);
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
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 32, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator2.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator2.compositeBuffer((int) '#');
        int[] intArray13 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyMedium(intArray13);
        int[] intArray21 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copyMedium(intArray21);
        io.netty.buffer.ByteBuf[] byteBufArray23 = new io.netty.buffer.ByteBuf[] { compositeByteBuf6, byteBuf14, byteBuf22 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray23);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray23);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray23);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray23);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray23);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufArray23);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBufArray23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        int[] intArray5 = new int[] { 10, (short) 0, (byte) 0, (short) 100, 52 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 0, 0, 100, 52 });
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
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
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
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 100, 0);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        java.lang.Class<?> wildcardClass12 = byteBuf11.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        float[] floatArray4 = new float[] { (-1L), (short) 100, 0.0f, (short) 0 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { (-1.0f), 100.0f, 0.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        int[] intArray0 = new int[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort(intArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copyInt(intArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyShort(intArray0);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyInt(intArray0);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyInt(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
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
        writeCache4.clear();
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
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer(52);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) '4');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 10, 52);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 52, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 42 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray16);
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
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
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
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry(1L, (long) 100);
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.getLastEntry((long) (short) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric10 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric10);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        boolean boolean10 = writeCache4.isEmpty();
        writeCache4.clear();
        boolean boolean14 = writeCache4.hasEntry(0L, (long) 35);
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyMedium(intArray4);
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
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
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
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf28);
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
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.close();
        long long11 = writeCache4.size();
        boolean boolean14 = writeCache4.hasEntry(5L, 5L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        java.lang.Class<?> wildcardClass8 = byteBuf7.getClass();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) 2L);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry(1L, (long) 100);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache4.getLastEntry((long) (byte) 100);
        long long11 = writeCache4.size();
        long long12 = writeCache4.size();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        long long5 = writeCache4.count();
        long long6 = writeCache4.size();
        writeCache4.clear();
        boolean boolean10 = writeCache4.hasEntry((long) '4', (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = writeCache4.getLastEntry((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer(35);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer(35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteArray21);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf28);
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
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
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
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
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
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        java.lang.Class<?> wildcardClass11 = byteBuf10.getClass();
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
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
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(100);
        boolean boolean6 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
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
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
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
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) ' ', (int) '#');
        boolean boolean17 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.buffer((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric3 = unpooledByteBufAllocator0.metric();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric3);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        boolean boolean10 = writeCache4.isEmpty();
        long long11 = writeCache4.count();
        long long12 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache4.getLastEntry((long) 52);
        boolean boolean15 = writeCache4.isEmpty();
        long long16 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
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
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray19);
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
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, 64);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache17 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) -1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.directBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator3.directBuffer(10);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator0.compositeDirectBuffer();
        java.lang.String str5 = unpooledByteBufAllocator0.toString();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer(64);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf1);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        long long8 = writeCache4.size();
        long long9 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) (short) 100);
        boolean boolean16 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.buffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer(35);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf11);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf11);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyInt(intArray4);
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
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer(64);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer((int) (short) 0, (int) '4');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer(10, 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer(35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) 100);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.heapBuffer((int) ' ', 32);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean11 = writeCache4.hasEntry((long) 0, (long) 100);
        writeCache4.clear();
        long long13 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.getLastEntry(10L);
        writeCache4.deleteLedger((long) 100);
        boolean boolean20 = writeCache4.hasEntry(4L, (long) (-1));
        long long21 = writeCache4.count();
        long long22 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(32, 35);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteArray22);
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
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray3);
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
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        writeCache10.clear();
        boolean boolean12 = writeCache10.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 1, 100);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray7);
        org.junit.Assert.assertNotNull(byteBufferArray7);
        org.junit.Assert.assertArrayEquals(byteBufferArray7, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (short) 1, 52);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
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
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufArray17);
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
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        int int6 = unpooledByteBufAllocator3.calculateNewCapacity((int) 'a', (int) (short) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator3.metric();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer(64);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.heapBuffer((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (short) 10, (int) ' ');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 1, 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.directBuffer(52, 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer(32);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.ioBuffer((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator2.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator2.compositeBuffer((int) '#');
        int[] intArray13 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyMedium(intArray13);
        int[] intArray21 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copyMedium(intArray21);
        io.netty.buffer.ByteBuf[] byteBufArray23 = new io.netty.buffer.ByteBuf[] { compositeByteBuf6, byteBuf14, byteBuf22 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray23);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray23);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufArray23);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBufArray23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeDirectBuffer();
        int int6 = unpooledByteBufAllocator1.calculateNewCapacity((int) ' ', (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer(1);
        boolean boolean16 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric18 = unpooledByteBufAllocator1.metric();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.directBuffer(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric18);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer(0, (int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.heapBuffer((int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.directBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator2.compositeDirectBuffer((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer();
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) 18L);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray25 = new byte[][] { byteArray8, byteArray12, byteArray16, byteArray20, byteArray24 };
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray25);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray25);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copiedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteArray25);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray25);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteArray25);
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
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray3);
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer(0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) ' ', (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer(32);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        java.lang.String str3 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str3, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer(1);
        boolean boolean16 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric18 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric18);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer(1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) '#');
        long long15 = writeCache14.count();
        long long16 = writeCache14.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf24);
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
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.ioBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator2.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator2.heapBuffer((int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator2.compositeBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(64)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        java.nio.ByteBuffer[] byteBufferArray0 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray0);
        org.junit.Assert.assertNotNull(byteBufferArray0);
        org.junit.Assert.assertArrayEquals(byteBufferArray0, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        java.lang.Class<?> wildcardClass3 = unpooledByteBufAllocator0.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer(32);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray16);
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
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
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
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 0);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer(32, (int) ' ');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
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
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
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
        org.junit.Assert.assertNotNull(byteBuf37);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
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
        long long23 = writeCache4.size();
        writeCache4.deleteLedger(0L);
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
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.close();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = writeCache4.getLastEntry((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
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
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer(35);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) 100);
        int int9 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteBufferArray3);
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer(0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        int int14 = unpooledByteBufAllocator1.calculateNewCapacity(0, 1);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
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
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.buffer((int) (byte) 0, 52);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.ioBuffer((int) ' ');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf11);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer(0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.directBuffer((int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
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
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
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
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.ioBuffer(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
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
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric18 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.buffer();
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
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric18);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 0, (int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer(10);
        java.lang.String str8 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.ioBuffer((int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.ByteBuf byteBuf6 = writeCache4.getLastEntry((long) ' ');
        long long7 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.getLastEntry((long) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer((int) ' ');
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray20);
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
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeDirectBuffer();
        java.lang.String str4 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer(64);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str4, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
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
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
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
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer();
        boolean boolean14 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
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
        boolean boolean24 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf26 = writeCache4.getLastEntry((long) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(byteBuf26);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[1]");
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
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) '#', (int) (short) 0);
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
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(18L, 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        writeCache7.clear();
        writeCache7.close();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(64);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        int[] intArray0 = new int[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyShort(intArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copyInt(intArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyShort(intArray0);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyShort(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer(0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) ' ', (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache17 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 32);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        writeCache4.close();
        long long9 = writeCache4.size();
        writeCache4.clear();
        long long11 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (byte) 1, (int) ' ');
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator2.compositeHeapBuffer(52);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) (byte) 0, (int) ' ');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator2.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, 36L);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.directBuffer(1);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        int int14 = unpooledByteBufAllocator1.calculateNewCapacity(0, 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) (short) 1);
        java.lang.String str14 = unpooledByteBufAllocator1.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str14, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(false);
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyMedium(intArray4);
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
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
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
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, 32, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 5, cap: 5/5).slice(32, 35)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer(1, 35);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer((int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 35, 32);
        writeCache16.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        writeCache4.close();
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray32 = new byte[][] { byteArray15, byteArray19, byteArray23, byteArray27, byteArray31 };
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray32);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.copiedBuffer(byteArray32);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.copiedBuffer(byteArray32);
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray32);
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray32);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteArray32);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray32);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = writeCache4.put(5L, (long) '4', byteBuf40);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) '#', (byte) -1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        java.nio.ByteBuffer[] byteBufferArray0 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf5);
        org.junit.Assert.assertNotNull(byteBufferArray0);
        org.junit.Assert.assertArrayEquals(byteBufferArray0, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
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
        boolean boolean36 = writeCache4.hasEntry((long) ' ', (long) ' ');
        boolean boolean37 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) '4');
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
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
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
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
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) -1, (int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        int int6 = unpooledByteBufAllocator3.calculateNewCapacity((int) 'a', (int) (short) 100);
        java.lang.String str7 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.buffer((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: false)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: false)");
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        long[] longArray2 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyLong(longArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf3);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        writeCache4.deleteLedger((long) (byte) 10);
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (byte) 10, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(1, 10)");
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
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
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
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        writeCache4.close();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.getLastEntry((long) '#');
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) (byte) 1, (long) 100);
        long long13 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        int int14 = unpooledByteBufAllocator1.calculateNewCapacity(0, 1);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer(64, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeHeapBuffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator3.compositeBuffer(32);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufferArray5);
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
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 4, cap: 4/4).slice(32, 10)");
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
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.ByteBuf byteBuf6 = writeCache4.getLastEntry((long) ' ');
        long long7 = writeCache4.count();
        long long8 = writeCache4.size();
        long long9 = writeCache4.count();
        long long10 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.get((long) (short) 0, (-1L));
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        java.lang.Class<?> wildcardClass10 = unpooledByteBufAllocator1.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 0 };
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 0 };
        byte[][] byteArray13 = new byte[][] { byteArray3, byteArray6, byteArray9, byteArray12 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer((int) '#', (int) '4');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 0, (int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf15);
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
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.directBuffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
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
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeDirectBuffer();
        boolean boolean17 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str15, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) (byte) 100);
        long long8 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get((long) 100, (long) 64);
        long long12 = writeCache4.size();
        writeCache4.close();
        long long14 = writeCache4.size();
        long long15 = writeCache4.size();
        long long16 = writeCache4.size();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        long long8 = writeCache7.size();
        writeCache7.clear();
        int[] intArray16 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copyMedium(intArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copyShort(intArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copyMedium(intArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copyInt(intArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copyShort(intArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copyMedium(intArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf22);
        boolean boolean24 = writeCache7.put((long) (short) 10, (long) 35, byteBuf23);
        long long25 = writeCache7.size();
        io.netty.buffer.ByteBuf byteBuf27 = writeCache7.getLastEntry(36L);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 12L + "'", long25 == 12L);
        org.junit.Assert.assertNull(byteBuf27);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric10 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 1L, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
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
        long long23 = writeCache4.size();
        long long24 = writeCache4.count();
        long long25 = writeCache4.count();
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 10, 35);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(intArray6);
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
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#');
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) ' ', 64);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache15 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator2.directBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer();
        boolean boolean7 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
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
        boolean boolean32 = writeCache4.hasEntry(100L, (long) 52);
        boolean boolean35 = writeCache4.hasEntry((long) 52, (long) (short) 10);
        boolean boolean36 = writeCache4.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        java.lang.String str15 = unpooledByteBufAllocator1.toString();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache17 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache22 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 52, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
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
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str15, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray4);
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
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeDirectBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.heapBuffer((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyInt(intArray6);
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
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
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
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer(0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache17 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 64, (int) ' ');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer(35);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.directBuffer((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(-1)");
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
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100);
        boolean boolean16 = unpooledByteBufAllocator1.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache19 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 36L, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 100, 0);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 52);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf11);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer(35, 52);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) '#');
        long long7 = writeCache6.size();
        boolean boolean8 = writeCache6.isEmpty();
        boolean boolean9 = writeCache6.isEmpty();
        int[] intArray16 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copyMedium(intArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copyShort(intArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copyMedium(intArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copyInt(intArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copyShort(intArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copyMedium(intArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copyShort(intArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyInt(intArray16);
        boolean boolean25 = writeCache6.put((long) (byte) 100, (long) (byte) 100, byteBuf24);
        io.netty.buffer.ByteBuf byteBuf27 = writeCache6.getLastEntry((long) 32);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(byteBuf27);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0, 64);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(64, (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeDirectBuffer(64);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteArray22);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
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
        org.junit.Assert.assertNotNull(byteBuf30);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer(1, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator2.directBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator2.compositeBuffer(35);
        boolean boolean8 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator2.ioBuffer((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) 52);
        long long10 = writeCache9.count();
        boolean boolean11 = writeCache9.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (-1), (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        java.lang.String str5 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unpooledByteBufAllocator3.calculateNewCapacity((int) (short) 100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(64)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf6);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 10, 64);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyFloat((float) 0);
        boolean boolean14 = writeCache9.put((long) 100, (long) '#', byteBuf13);
        writeCache9.close();
        long long16 = writeCache9.size();
        boolean boolean19 = writeCache9.hasEntry((long) 64, (long) ' ');
        io.netty.buffer.ByteBuf byteBuf22 = writeCache9.get(0L, 100L);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 4L + "'", long16 == 4L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(byteBuf22);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) 100, (int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) ' ', (int) '#');
        boolean boolean17 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.directBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf19);
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
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 52);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 64, (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf19 = writeCache16.get((long) 100, (-1L));
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNull(byteBuf19);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
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
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyInt(intArray4);
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
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer();
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf12);
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
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer(0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) ' ', (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.directBuffer((int) ' ');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        boolean boolean11 = writeCache4.hasEntry((long) (byte) 0, (long) (byte) 10);
        writeCache4.clear();
        long long13 = writeCache4.size();
        long long14 = writeCache4.count();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator18.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator18.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator18.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator18.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean27 = unpooledByteBufAllocator18.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator18.ioBuffer();
        boolean boolean29 = writeCache4.put((long) '4', 4L, byteBuf28);
        io.netty.buffer.ByteBuf byteBuf32 = writeCache4.get((long) (byte) 100, (long) (short) 100);
        boolean boolean35 = writeCache4.hasEntry((long) (short) 100, (long) 64);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(byteBuf32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.size();
        boolean boolean13 = writeCache4.hasEntry((long) (byte) 10, 10L);
        writeCache4.deleteLedger((long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf18 = writeCache4.get(2L, 36L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuf18);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray19);
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
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str13 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) (short) 10);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.getLastEntry((long) 100);
        writeCache4.clear();
        boolean boolean11 = writeCache4.isEmpty();
        long long12 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
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
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator0.metric();
        java.lang.String str10 = unpooledByteBufAllocator0.toString();
        boolean boolean11 = unpooledByteBufAllocator0.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 10);
        writeCache8.clear();
        long long10 = writeCache8.count();
        writeCache8.close();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufArray16);
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
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) ' ', 64);
        long long11 = writeCache10.size();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
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
        writeCache18.deleteLedger((long) 1);
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
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyInt(intArray4);
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
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(10, (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 10, (int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer(1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer(35, (int) 'a');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer(100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.heapBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator2.compositeDirectBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator2.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator2.compositeDirectBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache15 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, 0L, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer(0, (int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) (short) 1, (int) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache17 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) 0, 52);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(52);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) '#');
        java.lang.String str14 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str14, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
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
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray21);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer((int) (short) 1, 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyInt(intArray6);
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
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (byte) 100);
        boolean boolean10 = writeCache9.isEmpty();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
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
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        long long6 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) (byte) 1, (-1L));
        long long10 = writeCache4.count();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator14.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator14.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator14.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator14.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator14.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator14.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator14.ioBuffer();
        boolean boolean28 = writeCache4.put((long) 1, 4L, byteBuf27);
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyMedium(intArray4);
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
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        boolean boolean11 = writeCache4.hasEntry((long) (byte) 0, (long) (byte) 10);
        writeCache4.clear();
        long long13 = writeCache4.count();
        writeCache4.clear();
        long long15 = writeCache4.size();
        writeCache4.deleteLedger((long) (short) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        writeCache10.clear();
        writeCache10.clear();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache10.get((long) '4', 100L);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get(18L, 10L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf11);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray4);
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
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.deleteLedger((long) 0);
        boolean boolean11 = writeCache4.isEmpty();
        long long12 = writeCache4.count();
        writeCache4.deleteLedger((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = writeCache4.getLastEntry((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator1.metric();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.directBuffer((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) 'a', (long) (short) 1);
        long long13 = writeCache4.size();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer(0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        java.lang.String str8 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer((int) '4');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) '#', 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str13 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) -1, 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 110 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyMedium(intArray4);
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
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer();
        int int16 = unpooledByteBufAllocator1.calculateNewCapacity(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer(64);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 10);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.heapBuffer(10);
        java.lang.String str13 = unpooledByteBufAllocator10.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric14 = unpooledByteBufAllocator10.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator10.compositeBuffer();
        boolean boolean16 = writeCache7.put((long) ' ', (long) 64, (io.netty.buffer.ByteBuf) compositeByteBuf15);
        writeCache7.deleteLedger((long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf21 = writeCache7.get((long) 1, (long) '4');
        writeCache7.clear();
        io.netty.buffer.ByteBuf byteBuf25 = writeCache7.get((long) (byte) 1, (long) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(byteBuf21);
        org.junit.Assert.assertNull(byteBuf25);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.heapBuffer((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator2.metric();
        boolean boolean5 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator2.compositeDirectBuffer();
        boolean boolean7 = unpooledByteBufAllocator2.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator2.heapBuffer((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
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
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, 32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer((int) (short) 0, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 10);
        java.lang.String str14 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str14, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (short) 0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 110 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.heapBuffer((int) (byte) -1, (int) 'a');
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
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf15);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
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
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        int[] intArray5 = new int[] { 10, (short) 0, (byte) 0, (short) 100, 52 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 0, 0, 100, 52 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
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
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.buffer((int) (byte) 10, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator2.ioBuffer((int) (short) 1, (int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator2.directBuffer();
        int int20 = unpooledByteBufAllocator2.calculateNewCapacity(10, 35);
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator2.directBuffer((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        writeCache2.deleteLedger((long) '4');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator7 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator7.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf9);
        boolean boolean11 = writeCache2.put(1L, 10L, (io.netty.buffer.ByteBuf) compositeByteBuf9);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) '4', (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache15 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
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
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
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
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufArray17);
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
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (short) 0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 0, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 64 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(10, 10)");
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
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        writeCache9.deleteLedger((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            writeCache9.deleteLedger((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
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
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 5, cap: 5/5).slice(100, 97)");
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
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(32, (int) 'a');
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(5L, 64, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
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
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        org.junit.Assert.assertNotNull(byteBufferArray2);
        org.junit.Assert.assertArrayEquals(byteBufferArray2, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer(1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
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
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        writeCache4.deleteLedger((long) 'a');
        boolean boolean11 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.getLastEntry((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = writeCache4.getLastEntry((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (short) 0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, 100, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
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
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1, 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer(0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer(0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (byte) -1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer(64);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(0, 52)");
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
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
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
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
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
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.getLastEntry((long) 100);
        boolean boolean12 = writeCache4.hasEntry(0L, 0L);
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.get((long) (short) 1, 1L);
        io.netty.buffer.ByteBuf byteBuf17 = writeCache4.getLastEntry((long) (byte) 10);
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertNull(byteBuf17);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.get(1L, 100L);
        long long14 = writeCache4.size();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator20.directBuffer((int) '4', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator20.heapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator20.buffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator20.buffer(1);
        boolean boolean30 = unpooledByteBufAllocator20.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator20.compositeBuffer(35);
        boolean boolean33 = writeCache4.put((long) 100, (long) '4', (io.netty.buffer.ByteBuf) compositeByteBuf32);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray4);
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
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
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
        boolean boolean29 = writeCache4.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer((int) (short) 0, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = compositeByteBuf13.getClass();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        writeCache4.clear();
        boolean boolean10 = writeCache4.isEmpty();
        writeCache4.close();
        boolean boolean14 = writeCache4.hasEntry((long) (byte) 1, (long) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        short[] shortArray8 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(shortArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray16 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copyShort(shortArray16);
        io.netty.buffer.ByteBuf[] byteBufArray18 = new io.netty.buffer.ByteBuf[] { byteBuf9, byteBuf11, byteBuf17 };
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray18);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBufArray18);
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
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        writeCache4.deleteLedger((long) 'a');
        writeCache4.deleteLedger(10L);
        long long13 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.getLastEntry(36L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric10 = unpooledByteBufAllocator1.metric();
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

