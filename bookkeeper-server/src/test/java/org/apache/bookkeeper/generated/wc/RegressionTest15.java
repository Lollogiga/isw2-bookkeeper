package org.apache.bookkeeper.generated.wc;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

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
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufArray17);
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
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry(1L, (long) 100);
        boolean boolean11 = writeCache4.hasEntry((long) 10, (long) (short) 10);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator15 = new io.netty.buffer.UnpooledByteBufAllocator(false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator15.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator15.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator15.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator15.buffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator15.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator15.compositeDirectBuffer((int) (byte) 1);
        boolean boolean23 = writeCache4.put((long) 35, (long) ' ', (io.netty.buffer.ByteBuf) compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, (int) (short) -1, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.directBuffer(32);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.directBuffer(100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache17 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        writeCache17.close();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer(100, 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer((int) '#');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
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
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) '4', 0);
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
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (short) 100);
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer(0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) ' ', (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(35, 35);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer(1);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer(35);
        boolean boolean18 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) '#', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
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
        io.netty.buffer.ByteBuf byteBuf21 = writeCache7.get((long) 1, 10L);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(byteBuf21);
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 32, 32);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
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
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray17);
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
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf10);
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
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(intArray4);
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
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) 1, 0);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf15);
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
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) (byte) 100);
        long long8 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get((long) 100, (long) 64);
        boolean boolean14 = writeCache4.hasEntry((long) 1, 1L);
        writeCache4.deleteLedger((long) (byte) 10);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator20.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator20.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator20.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator20.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator20.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator20.directBuffer((int) (short) 1, 32);
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator20.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf33);
        boolean boolean35 = writeCache4.put(18L, (long) 52, byteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer(35, (int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache17 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 0);
        writeCache17.deleteLedger(18L);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray38 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray47 = new byte[][] { byteArray30, byteArray34, byteArray38, byteArray42, byteArray46 };
        io.netty.buffer.ByteBuf byteBuf48 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray47);
        io.netty.buffer.ByteBuf byteBuf49 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray47);
        io.netty.buffer.ByteBuf byteBuf50 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray47);
        io.netty.buffer.ByteBuf byteBuf51 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray47);
        io.netty.buffer.ByteBuf byteBuf52 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray47);
        io.netty.buffer.ByteBuf byteBuf53 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray47);
        io.netty.buffer.ByteBuf byteBuf54 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray47);
        io.netty.buffer.ByteBuf byteBuf55 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray47);
        io.netty.buffer.ByteBuf byteBuf56 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteArray47);
        io.netty.buffer.ByteBuf byteBuf57 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray47);
        io.netty.buffer.ByteBuf byteBuf58 = io.netty.buffer.Unpooled.copiedBuffer(byteArray47);
        io.netty.buffer.ByteBuf byteBuf59 = io.netty.buffer.Unpooled.copiedBuffer(byteArray47);
        io.netty.buffer.ByteBuf byteBuf60 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf59);
        io.netty.buffer.ByteBuf byteBuf61 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf60);
        io.netty.buffer.ByteBuf byteBuf62 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf61);
        boolean boolean63 = writeCache17.put((long) 'a', (long) (short) 10, byteBuf62);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertNotNull(byteBuf48);
        org.junit.Assert.assertNotNull(byteBuf49);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertNotNull(byteBuf55);
        org.junit.Assert.assertNotNull(byteBuf56);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(byteBuf59);
        org.junit.Assert.assertNotNull(byteBuf60);
        org.junit.Assert.assertNotNull(byteBuf61);
        org.junit.Assert.assertNotNull(byteBuf62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteArray21);
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
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        writeCache9.deleteLedger((long) '4');
        int[] intArray20 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copyMedium(intArray20);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copyShort(intArray20);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copyInt(intArray20);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyShort(intArray20);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copyShort(intArray20);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copyMedium(intArray20);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copyInt(intArray20);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copyInt(intArray20);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copyShort(intArray20);
        boolean boolean30 = writeCache9.put((long) '4', (long) (-1), byteBuf29);
        long long31 = writeCache9.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.directBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        long long5 = writeCache4.count();
        writeCache4.close();
        long long7 = writeCache4.count();
        // The following exception was thrown during execution in test generation
        try {
            writeCache4.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 1, 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.directBuffer((int) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = writeCache10.get(36L, (long) 35);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        java.lang.String str5 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.buffer(52);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.directBuffer(0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer(64);
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer((int) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache18 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 5L);
        writeCache18.deleteLedger((long) '#');
        writeCache18.clear();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(100);
        boolean boolean6 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 1L);
        io.netty.buffer.ByteBuf byteBuf16 = writeCache14.getLastEntry((long) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNull(byteBuf16);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
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
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
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
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        writeCache4.close();
        long long9 = writeCache4.size();
        long long10 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.get((long) (byte) 1, 100L);
        boolean boolean16 = writeCache4.hasEntry(1L, (long) 52);
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.directBuffer(32);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.directBuffer((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) 'a');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(35, 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer((int) (short) 1, 32);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer(10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) (short) 0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer(10, 52);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        int[] intArray5 = new int[] { 100, (short) 1, 0, '#', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 1, 0, 35, 10 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
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
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        int[] intArray5 = new int[] { 100, (short) 1, 0, '#', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 1, 0, 35, 10 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
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
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.directBuffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeBuffer();
        java.lang.String str10 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator3.compositeBuffer();
        java.lang.String str12 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0, 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.ByteBuf byteBuf13 = writeCache10.get((long) 32, (long) '4');
        writeCache10.close();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer((int) 'a');
        java.lang.Class<?> wildcardClass6 = compositeByteBuf5.getClass();
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 10L);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
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
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyMedium(intArray6);
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
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity((int) ' ', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer((int) '#', (int) 'a');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        int int14 = unpooledByteBufAllocator1.calculateNewCapacity(0, 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache21 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 5L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
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
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unpooledByteBufAllocator2.calculateNewCapacity((int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#');
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) ' ', 64);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) (short) 1, 1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        long long10 = writeCache4.count();
        writeCache4.clear();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.get((long) 10, (long) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator0.metric();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, 15L, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
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
            io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
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
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        byte[] byteArray0 = new byte[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity((int) ' ', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeHeapBuffer((int) ' ');
        int int14 = unpooledByteBufAllocator0.calculateNewCapacity((int) '#', 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator0.buffer((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10, 35);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer(52);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        double[] doubleArray4 = new double[] { (byte) 0, 100.0f, 5L, 10L };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyDouble(doubleArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyDouble(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 100.0d, 5.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.buffer((int) (byte) 0, 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer(1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, 64);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
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
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
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
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric14 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer(10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        short[] shortArray15 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyShort(shortArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray23 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyShort(shortArray23);
        io.netty.buffer.ByteBuf[] byteBufArray25 = new io.netty.buffer.ByteBuf[] { byteBuf16, byteBuf18, byteBuf24 };
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray25);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray25);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf27);
        boolean boolean29 = writeCache8.put((long) ' ', (long) 'a', byteBuf28);
        io.netty.buffer.ByteBuf byteBuf31 = writeCache8.getLastEntry((long) (short) 10);
        writeCache8.clear();
        io.netty.buffer.ByteBuf byteBuf35 = writeCache8.get((long) (short) 10, (long) (byte) -1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBufArray25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(byteBuf31);
        org.junit.Assert.assertNull(byteBuf35);
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unpooledByteBufAllocator0.calculateNewCapacity(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 1 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteArray22);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf30);
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
        org.junit.Assert.assertNotNull(byteBuf31);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufferArray4);
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
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
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
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
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
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray19);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray19);
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
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, 64);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '4');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
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
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) (short) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
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
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteBufArray21);
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
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
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
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
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
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.copiedBuffer(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
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
        org.junit.Assert.assertNotNull(byteBuf36);
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeDirectBuffer(35);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.directBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.buffer(10);
        java.lang.String str11 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache5 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 1);
        boolean boolean8 = writeCache5.hasEntry((long) 35, (long) (-1));
        io.netty.buffer.ByteBuf byteBuf10 = writeCache5.getLastEntry((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = writeCache5.getLastEntry((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf10);
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.ioBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer(10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
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
        boolean boolean15 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 42 out of bounds for byte[4]");
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
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        java.nio.ByteBuffer[] byteBufferArray1 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        org.junit.Assert.assertNotNull(byteBufferArray1);
        org.junit.Assert.assertArrayEquals(byteBufferArray1, new java.nio.ByteBuffer[] {});
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
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.ioBuffer(52, (int) '4');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.directBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        writeCache10.close();
        long long12 = writeCache10.size();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator2.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator2.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator2.metric();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 0);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) '4', (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (short) 0, 1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteBufferArray4);
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
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray4);
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
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(35, 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (short) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
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
        java.lang.String str17 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str17, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray24 = new byte[][] { byteArray7, byteArray11, byteArray15, byteArray19, byteArray23 };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray24);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray24);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteArray24);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray24);
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
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeBuffer(52);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.buffer(64, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(64, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer((-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(10, 35);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        java.lang.String str10 = unpooledByteBufAllocator2.toString();
        boolean boolean11 = unpooledByteBufAllocator2.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator2.ioBuffer(10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        java.lang.String str16 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str16, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
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
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteArray22);
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
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
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
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray21);
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
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(0, 32);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
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
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1, 64);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.buffer(0, 10);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
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
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get((long) (byte) 0, (long) (short) 0);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.directBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf14);
        boolean boolean16 = writeCache4.put((long) (byte) 10, (long) (short) 0, byteBuf15);
        io.netty.buffer.ByteBuf byteBuf19 = writeCache4.get((long) (short) 1, (long) 35);
        io.netty.buffer.ByteBuf byteBuf21 = writeCache4.getLastEntry((long) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(byteBuf19);
        org.junit.Assert.assertNull(byteBuf21);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.directBuffer((int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.ioBuffer(52, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeHeapBuffer(64);
        int int11 = unpooledByteBufAllocator3.calculateNewCapacity(52, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.directBuffer(0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        float[] floatArray4 = new float[] { (byte) 0, 1, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyFloat(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 0.0f, 1.0f, 10.0f, 0.0f }, (float) 1.0E-15);
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
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        boolean boolean10 = writeCache4.isEmpty();
        long long11 = writeCache4.size();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = writeCache4.getLastEntry((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) 0, (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.clear();
        writeCache4.close();
        boolean boolean14 = writeCache4.hasEntry((long) (short) 10, (long) 10);
        long long15 = writeCache4.count();
        boolean boolean16 = writeCache4.isEmpty();
        boolean boolean19 = writeCache4.hasEntry((long) (short) 0, (long) 35);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeDirectBuffer(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (-1L), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray7);
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
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
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
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer((int) ' ');
        boolean boolean6 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) '4');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) '#', 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, 100);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache18 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.directBuffer(64, (int) 'a');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer(1, 64);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 0);
        writeCache14.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        long long8 = writeCache4.size();
        boolean boolean9 = writeCache4.isEmpty();
        writeCache4.clear();
        boolean boolean11 = writeCache4.isEmpty();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray36 = new byte[][] { byteArray19, byteArray23, byteArray27, byteArray31, byteArray35 };
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray36);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray36);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray36);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray36);
        io.netty.buffer.ByteBuf byteBuf41 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray36);
        io.netty.buffer.ByteBuf byteBuf42 = io.netty.buffer.Unpooled.copiedBuffer(byteArray36);
        io.netty.buffer.ByteBuf byteBuf43 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray36);
        boolean boolean44 = writeCache4.put((long) (short) 0, (long) (short) 1, byteBuf43);
        writeCache4.deleteLedger(0L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#');
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator1.metric();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray6);
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
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufferArray2);
        org.junit.Assert.assertNotNull(byteBufferArray2);
        org.junit.Assert.assertArrayEquals(byteBufferArray2, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        int[] intArray12 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyMedium(intArray12);
        int[] intArray20 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copyMedium(intArray20);
        io.netty.buffer.ByteBuf[] byteBufArray22 = new io.netty.buffer.ByteBuf[] { compositeByteBuf5, byteBuf13, byteBuf21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray22);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray22);
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
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray16);
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
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
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
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.getLastEntry((long) 100);
        boolean boolean12 = writeCache4.hasEntry(0L, 0L);
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.get((long) (short) 10, (long) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
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
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
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
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[1]");
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
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 1L);
        boolean boolean15 = writeCache14.isEmpty();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer(64, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
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
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        writeCache12.deleteLedger((long) (byte) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf1 = unpooledByteBufAllocator0.directBuffer();
        boolean boolean2 = unpooledByteBufAllocator0.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer(35);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = unpooledByteBufAllocator1.calculateNewCapacity((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 35 (expected: not greater than maxCapacity(-1)");
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
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(18L, (int) (short) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
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
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyInt(intArray4);
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
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
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
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray22);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf30);
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
        org.junit.Assert.assertNotNull(byteBuf31);
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        double[] doubleArray4 = new double[] { 1L, 10L, (short) 100, '#' };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyDouble(doubleArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyDouble(doubleArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyDouble(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 10.0d, 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer((int) (byte) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        java.lang.String str5 = unpooledByteBufAllocator0.toString();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeHeapBuffer(52);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer(10);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray4);
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
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
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
        int[] intArray29 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copyMedium(intArray29);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copyMedium(intArray29);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf31);
        boolean boolean33 = writeCache4.put((long) 52, (long) (short) 1, byteBuf31);
        writeCache4.clear();
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
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
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
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
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
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
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
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteArray21);
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
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        java.lang.String str8 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer((int) (short) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
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
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 'a');
        writeCache11.clear();
        byte[] byteArray16 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteArray16);
        boolean boolean21 = writeCache11.put((long) 10, (long) 'a', byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
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
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray21);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufArray21);
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
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        java.lang.String str6 = unpooledByteBufAllocator2.toString();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, 2L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) (short) 1, (int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
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
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
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
        boolean boolean18 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.directBuffer(10, 35);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric3 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.heapBuffer(32);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf8);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.getLastEntry((long) 100);
        boolean boolean12 = writeCache4.hasEntry(0L, 0L);
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.get((long) (short) 10, (long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf18 = writeCache4.get((long) '#', (long) 1);
        io.netty.buffer.ByteBuf byteBuf20 = writeCache4.getLastEntry((long) (short) 10);
        long long21 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf24 = writeCache4.get((long) 10, (long) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertNull(byteBuf18);
        org.junit.Assert.assertNull(byteBuf20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(byteBuf24);
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[1]");
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
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (short) 0, 0);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(-1, 1)");
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
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer(10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer(35);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf10);
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
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufferArray6);
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
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        boolean boolean14 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer(1);
        int int20 = unpooledByteBufAllocator1.calculateNewCapacity(52, 52);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
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
            io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
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
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        boolean boolean17 = writeCache14.hasEntry((long) (short) 0, (long) 64);
        boolean boolean20 = writeCache14.hasEntry(100L, 4L);
        long long21 = writeCache14.count();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.Class<?> wildcardClass9 = unpooledByteBufAllocator1.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric18 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric18);
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
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
        org.junit.Assert.assertNotNull(byteBuf30);
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        org.junit.Assert.assertNotNull(byteBufferArray4);
        org.junit.Assert.assertArrayEquals(byteBufferArray4, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.heapBuffer(35);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf4);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        long long7 = writeCache6.count();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator11 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator11.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator11.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator11.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator11.buffer(0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache20 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator11, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator11.compositeDirectBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator11.compositeHeapBuffer((int) (short) 1);
        boolean boolean25 = writeCache6.put(1L, (long) 1, (io.netty.buffer.ByteBuf) compositeByteBuf24);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf28 = writeCache6.get((long) (-1), (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer(0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, 10L, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = writeCache9.getLastEntry(10L);
        boolean boolean12 = writeCache9.isEmpty();
        double[] doubleArray21 = new double[] { '#', 10L, 10L, 1, (-1L), (short) 0 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copyDouble(doubleArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copyDouble(doubleArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyDouble(doubleArray21);
        boolean boolean25 = writeCache9.put((long) (byte) 100, 4L, byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 35.0d, 10.0d, 10.0d, 1.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
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
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = unpooledByteBufAllocator1.calculateNewCapacity(100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
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
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
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
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray22);
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
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) (short) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.getLastEntry((long) 100);
        boolean boolean12 = writeCache4.hasEntry(0L, 0L);
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.get((long) (short) 10, (long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf18 = writeCache4.get((long) '#', (long) 1);
        io.netty.buffer.ByteBuf byteBuf20 = writeCache4.getLastEntry((long) (short) 10);
        boolean boolean21 = writeCache4.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertNull(byteBuf18);
        org.junit.Assert.assertNull(byteBuf20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
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
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteArray22);
        java.lang.Class<?> wildcardClass29 = byteBuf28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 1, 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str13 = unpooledByteBufAllocator1.toString();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) ' ', (int) (short) 1);
        writeCache16.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (short) -1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(-1, 64)");
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
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 1, 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.directBuffer(52, 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer(32);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        boolean boolean15 = writeCache14.isEmpty();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (byte) 10, (int) '#');
        java.lang.String str14 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str14, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.deleteLedger((long) 0);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyFloat((float) (-1));
        boolean boolean15 = writeCache4.put((long) 100, (long) 100, byteBuf14);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.generated.Support.emptyWritable((int) '4');
        boolean boolean20 = writeCache4.put((long) '4', (long) 10, byteBuf19);
        writeCache4.clear();
        writeCache4.deleteLedger((long) 52);
        io.netty.buffer.ByteBuf byteBuf26 = writeCache4.get((long) 1, (long) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(byteBuf26);
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer(1, 64);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 0);
        writeCache14.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
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
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray23);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
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
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.deleteLedger((long) 0);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyFloat((float) (-1));
        boolean boolean15 = writeCache4.put((long) 100, (long) 100, byteBuf14);
        boolean boolean16 = writeCache4.isEmpty();
        boolean boolean17 = writeCache4.isEmpty();
        long long18 = writeCache4.size();
        long long19 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf22 = writeCache4.get((long) 64, (long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            writeCache4.deleteLedger((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 4L + "'", long18 == 4L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertNull(byteBuf22);
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
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
        java.lang.Class<?> wildcardClass20 = writeCache4.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf16);
        org.junit.Assert.assertNull(byteBuf19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufArray17);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf25);
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
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.count();
        writeCache4.close();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        writeCache9.close();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache9.getLastEntry(1L);
        boolean boolean15 = writeCache9.hasEntry((long) (short) 10, (long) 52);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        boolean boolean10 = writeCache4.isEmpty();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer((int) (short) 0, 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric15 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeHeapBuffer((int) ' ');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
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
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.deleteLedger((long) 'a');
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        int int12 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 10, (int) 'a');
        java.lang.String str13 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer(64);
        java.lang.String str16 = unpooledByteBufAllocator1.toString();
        java.lang.String str17 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str16, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str17, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer(0, (int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) (short) 1, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
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
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric20 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric20);
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        long[] longArray2 = new long[] { ' ', 4L };
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyLong(longArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyLong(longArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyLong(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 32L, 4L });
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(0);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 15L, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.directBuffer((int) '4', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.heapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.buffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator3.heapBuffer(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(97)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf15);
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
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(1, 1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) '4');
        boolean boolean14 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer(64);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (short) 100);
        boolean boolean19 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyMedium(intArray4);
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
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.ioBuffer((int) (short) 100);
        boolean boolean11 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator3.directBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
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
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyMedium((int) 'a');
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 64, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
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
        boolean boolean27 = writeCache4.isEmpty();
        boolean boolean30 = writeCache4.hasEntry((long) 0, (long) (short) 1);
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf33 = writeCache4.getLastEntry((long) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(byteBuf33);
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
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
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
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
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        boolean boolean10 = writeCache4.isEmpty();
        writeCache4.clear();
        long long12 = writeCache4.size();
        long long13 = writeCache4.count();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        long long9 = writeCache8.count();
        long long10 = writeCache8.count();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
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
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
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
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray23);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
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
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        writeCache4.close();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf10 = writeCache4.getLastEntry((long) '#');
        boolean boolean13 = writeCache4.hasEntry((long) 'a', 1L);
        boolean boolean14 = writeCache4.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
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
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray23);
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
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
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
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer(52);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufArray16);
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
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray2, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 2, cap: 2/2).slice(0, 100)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray20 = new byte[][] { byteArray3, byteArray7, byteArray11, byteArray15, byteArray19 };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray20);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray20);
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
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer(10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric17 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator1.compositeDirectBuffer((int) 'a');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric17);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, false);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeHeapBuffer();
        java.lang.String str6 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.heapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
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
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray20);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray20);
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
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
        java.nio.ByteBuffer[] byteBufferArray1 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        org.junit.Assert.assertNotNull(byteBufferArray1);
        org.junit.Assert.assertArrayEquals(byteBufferArray1, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
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
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray23);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf35);
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
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        boolean boolean8 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.directBuffer((int) (short) 0, (int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        boolean boolean13 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric16 = unpooledByteBufAllocator0.metric();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric16);
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
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
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
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
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(intArray6);
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
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
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
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf17);
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
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer((int) ' ');
        boolean boolean6 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteBufArray18);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray18);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
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
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator1.directBuffer(0, (int) 'a');
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
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(intArray6);
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
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((-1L), (int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10, (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.ioBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
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
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        boolean boolean10 = writeCache4.isEmpty();
        boolean boolean11 = writeCache4.isEmpty();
        boolean boolean12 = writeCache4.isEmpty();
        writeCache4.close();
        boolean boolean16 = writeCache4.hasEntry(100L, (long) 1);
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf20 = writeCache4.get((long) 35, (long) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(byteBuf20);
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric3 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(15L, (int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        java.lang.String str8 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        org.junit.Assert.assertNotNull(byteBufferArray4);
        org.junit.Assert.assertArrayEquals(byteBufferArray4, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (short) 0, 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf27 = unpooledByteBufAllocator26.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator26.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator26.heapBuffer((int) (byte) 1);
        java.lang.String str31 = unpooledByteBufAllocator26.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator26.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf34 = unpooledByteBufAllocator26.directBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator26.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf37 = unpooledByteBufAllocator26.ioBuffer((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = writeCache4.put((long) (short) -1, (long) '4', byteBuf37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(compositeByteBuf27);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str31, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(byteBuf37);
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator46 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache48 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator46, (long) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf49 = unpooledByteBufAllocator46.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf51 = unpooledByteBufAllocator46.compositeHeapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf53 = unpooledByteBufAllocator46.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf54 = unpooledByteBufAllocator46.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf57 = unpooledByteBufAllocator46.directBuffer((int) (byte) 100, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf58 = unpooledByteBufAllocator46.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf60 = unpooledByteBufAllocator46.compositeDirectBuffer((int) (byte) 10);
        boolean boolean61 = writeCache9.put(100L, (long) (short) 0, (io.netty.buffer.ByteBuf) compositeByteBuf60);
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
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator46);
        org.junit.Assert.assertNotNull(compositeByteBuf49);
        org.junit.Assert.assertNotNull(compositeByteBuf51);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertNotNull(compositeByteBuf58);
        org.junit.Assert.assertNotNull(compositeByteBuf60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer();
        boolean boolean14 = unpooledByteBufAllocator1.isDirectBufferPooled();
        boolean boolean15 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = new byte[] {};
        byte[][] byteArray9 = new byte[][] { byteArray4, byteArray5, byteArray6, byteArray7, byteArray8 };
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteArray9);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteArray9);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteArray9);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(35, byteArray9);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 100, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (-1), (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer(52);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) (short) 0, (int) 'a');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
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
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
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
        writeCache9.close();
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
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) 52);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric10 = unpooledByteBufAllocator2.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator2.metric();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf13);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer();
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        int int14 = unpooledByteBufAllocator1.calculateNewCapacity(35, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer(0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
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
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer(52);
        boolean boolean16 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.directBuffer(0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        boolean boolean10 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.get((long) (short) 1, (long) 32);
        boolean[] booleanArray20 = new boolean[] { true, false, true, false };
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copyBoolean(booleanArray20);
        boolean boolean22 = writeCache4.put(15L, (long) '4', byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertNotNull(booleanArray20);
        assertBooleanArrayEquals(booleanArray20, new boolean[] { true, false, true, false });
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer(35);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer(52);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeHeapBuffer(10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer((int) ' ');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator0.metric();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.ioBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator2.buffer((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        short[] shortArray15 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyShort(shortArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray23 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyShort(shortArray23);
        io.netty.buffer.ByteBuf[] byteBufArray25 = new io.netty.buffer.ByteBuf[] { byteBuf16, byteBuf18, byteBuf24 };
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray25);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray25);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf27);
        boolean boolean29 = writeCache8.put((long) ' ', (long) 'a', byteBuf28);
        writeCache8.close();
        io.netty.buffer.ByteBuf byteBuf32 = writeCache8.getLastEntry((long) 'a');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBufArray25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(byteBuf32);
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeHeapBuffer(35);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 100, 100);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator1.heapBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator1.heapBuffer();
        boolean boolean24 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry(1L, (long) 100);
        long long9 = writeCache4.count();
        writeCache4.close();
        long long11 = writeCache4.count();
        long long12 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 101 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
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
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) 52);
        boolean boolean10 = writeCache9.isEmpty();
        long long11 = writeCache9.size();
        writeCache9.close();
        long long13 = writeCache9.size();
        boolean boolean14 = writeCache9.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        long long8 = writeCache4.size();
        boolean boolean9 = writeCache4.isEmpty();
        writeCache4.clear();
        writeCache4.clear();
        boolean boolean12 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.get((long) 35, 1L);
        boolean boolean16 = writeCache4.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity((int) ' ', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) (byte) 0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 10, (int) (short) 1);
        writeCache12.clear();
        io.netty.buffer.ByteBuf byteBuf16 = writeCache12.get((long) (byte) 10, (long) (byte) 0);
        boolean boolean17 = writeCache12.isEmpty();
        long long18 = writeCache12.size();
        writeCache12.clear();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeDirectBuffer();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
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
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
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
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.deleteLedger((long) 0);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyFloat((float) (-1));
        boolean boolean15 = writeCache4.put((long) 100, (long) 100, byteBuf14);
        boolean boolean16 = writeCache4.isEmpty();
        writeCache4.clear();
        writeCache4.clear();
        writeCache4.clear();
        long long20 = writeCache4.size();
        long long21 = writeCache4.count();
        java.nio.ByteBuffer[] byteBufferArray26 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray26);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray26);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray26);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray26);
        boolean boolean31 = writeCache4.put((long) (byte) 0, 100L, byteBuf30);
        io.netty.buffer.ByteBuf byteBuf33 = writeCache4.getLastEntry(15L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(byteBufferArray26);
        org.junit.Assert.assertArrayEquals(byteBufferArray26, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(byteBuf33);
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
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
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
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
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf3);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator2.compositeHeapBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
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
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator1.compositeBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric14 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache19 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 4L, 1);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 1 };
        byte[][] byteArray16 = new byte[][] { byteArray3, byteArray6, byteArray9, byteArray12, byteArray15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) 'a');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(intArray4);
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
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray24 = new byte[][] { byteArray7, byteArray11, byteArray15, byteArray19, byteArray23 };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteArray24);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray24);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray24);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteArray24);
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
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer(100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer(1, (int) 'a');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufArray16);
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
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
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
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 32);
        writeCache16.deleteLedger((long) '4');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer(52);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.buffer((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
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
        io.netty.buffer.ByteBuf byteBuf19 = writeCache4.getLastEntry((long) 32);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(byteBuf19);
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.getLastEntry((long) '4');
        boolean boolean15 = writeCache4.hasEntry(100L, (long) 10);
        io.netty.buffer.ByteBuf byteBuf18 = writeCache4.get((long) 10, (long) 0);
        writeCache4.deleteLedger((long) 35);
        writeCache4.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuf18);
    }

    @Test
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, (int) (short) 100, 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(52);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 1);
        boolean boolean16 = writeCache13.hasEntry((long) 0, (long) (-1));
        long long17 = writeCache13.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = writeCache13.hasEntry((-1L), (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
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
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
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
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer(100);
        java.lang.String str13 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer(52);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) '4');
        java.lang.String str8 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.buffer(100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.heapBuffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeDirectBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator3.directBuffer((int) '4');
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer(35);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (short) 10, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(10, 64)");
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
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
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
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer(35);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        java.lang.String str3 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer(0, 64);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str3, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) '4', 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 52, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 64, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 164 out of bounds for byte[1]");
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
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeBuffer(10);
        java.lang.String str10 = unpooledByteBufAllocator0.toString();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator0.metric();
        boolean boolean12 = unpooledByteBufAllocator0.isDirectBufferPooled();
        java.lang.String str13 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(0);
        java.lang.Class<?> wildcardClass9 = unpooledByteBufAllocator1.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.directBuffer((int) '4', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeDirectBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 1, 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer(64);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer(52);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.ioBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
        java.nio.ByteBuffer[] byteBufferArray0 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray0);
        org.junit.Assert.assertNotNull(byteBufferArray0);
        org.junit.Assert.assertArrayEquals(byteBufferArray0, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
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
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf12);
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
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '4');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache21 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100, (int) ' ');
        writeCache21.clear();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 100);
        java.lang.String str13 = unpooledByteBufAllocator1.toString();
        java.lang.String str14 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str13, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str14, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer((int) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 100, 100);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator1.directBuffer();
        boolean boolean24 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity((int) ' ', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) (byte) 0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 10, (int) (short) 1);
        writeCache12.clear();
        io.netty.buffer.ByteBuf byteBuf16 = writeCache12.get((long) (byte) 10, (long) (byte) 0);
        writeCache12.close();
        io.netty.buffer.ByteBuf byteBuf20 = writeCache12.get((long) '4', (long) 1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf16);
        org.junit.Assert.assertNull(byteBuf20);
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer(52);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer(0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric14 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.directBuffer(1, (int) '4');
        boolean boolean18 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer((int) 'a');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric3 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.directBuffer((int) (short) 0);
        java.lang.String str6 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        java.lang.String str8 = unpooledByteBufAllocator0.toString();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
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
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteArray23);
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
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf16);
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
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache15 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 1);
        boolean boolean16 = writeCache15.isEmpty();
        writeCache15.clear();
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copyFloat((float) 64);
        boolean boolean22 = writeCache15.put((long) (short) 10, (long) 64, byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        boolean boolean10 = writeCache4.isEmpty();
        long long11 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache4.get((long) 0, 4L);
        io.netty.buffer.ByteBuf byteBuf16 = writeCache4.getLastEntry((long) (short) 100);
        long long17 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 10L);
        long long17 = writeCache16.size();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer(0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer(64, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeHeapBuffer(100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
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
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) '#', 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
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
        writeCache4.deleteLedger((long) (short) 0);
        writeCache4.deleteLedger((long) 0);
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
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(10L, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        int int13 = unpooledByteBufAllocator1.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
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
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
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
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer(64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache19 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 5L);
        writeCache19.close();
        boolean boolean23 = writeCache19.hasEntry(12L, (long) 35);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        long long10 = writeCache4.count();
        boolean boolean11 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache4.get((long) (byte) 1, 2L);
        long long15 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer(100, 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeDirectBuffer();
        boolean boolean12 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.buffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache18 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 35, (int) (short) 1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyMedium(intArray4);
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
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(64);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
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
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric17 = unpooledByteBufAllocator1.metric();
        boolean boolean18 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.ioBuffer(10);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.ioBuffer();
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
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray6);
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
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
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
        io.netty.buffer.ByteBuf byteBuf19 = writeCache12.get((long) ' ', 36L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(byteBuf19);
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) 'a');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
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
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteArray24);
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
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer(35);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer(10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeHeapBuffer(64);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 10, (int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
    }

    @Test
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
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
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) '4');
        java.lang.String str8 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeHeapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.ioBuffer((int) '#');
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeBuffer(52);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.buffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer(52);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) '4');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer(32);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        java.lang.String str8 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0, 64);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(64, (int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 35);
        boolean boolean15 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator1.ioBuffer(1);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric23 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric23);
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
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
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray4);
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
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
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
        int[] intArray26 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copyMedium(intArray26);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copyShort(intArray26);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copyMedium(intArray26);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copyShort(intArray26);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copyMedium(intArray26);
        boolean boolean32 = writeCache4.put((long) (short) 1, (long) (short) 10, byteBuf31);
        boolean boolean35 = writeCache4.hasEntry((long) ' ', (long) 32);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 97, 97, 97, 10 });
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        boolean boolean7 = writeCache6.isEmpty();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator11 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator11.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator11.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator11.heapBuffer((int) (byte) 1);
        java.lang.String str16 = unpooledByteBufAllocator11.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric17 = unpooledByteBufAllocator11.metric();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator11.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator11.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator11.heapBuffer(0);
        boolean boolean22 = writeCache6.put((long) (byte) 100, 15L, byteBuf21);
        boolean boolean25 = writeCache6.hasEntry(4L, (long) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str16, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
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
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str8 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        java.lang.Class<?> wildcardClass10 = compositeByteBuf9.getClass();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
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
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 35);
        boolean boolean14 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
    }

    @Test
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.ioBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        java.lang.String str5 = unpooledByteBufAllocator3.toString();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
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
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) 100, 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.directBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator1.heapBuffer(10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
        int[] intArray5 = new int[] { 100, (short) 1, 0, '#', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 1, 0, 35, 10 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
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
        int int18 = unpooledByteBufAllocator1.calculateNewCapacity(0, 64);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator1.compositeBuffer(1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str15, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
    }

    @Test
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        java.lang.String str6 = unpooledByteBufAllocator2.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.heapBuffer((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (short) -1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(-1, 64)");
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
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
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
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf1 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
    }

    @Test
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 'a', (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf1 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) '4');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
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
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
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
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(0, 64);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 15L);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
        int[] intArray3 = new int[] { (byte) 0, 35, 'a' };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyMedium(intArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 0, 35, 97 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.ByteBuf byteBuf6 = writeCache4.getLastEntry((long) ' ');
        boolean boolean9 = writeCache4.hasEntry((long) (short) 100, (long) '4');
        boolean boolean12 = writeCache4.hasEntry(4L, (long) 64);
        writeCache4.clear();
        boolean boolean14 = writeCache4.isEmpty();
        long long15 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray6);
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
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
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
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
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
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
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
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray15);
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
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.ByteBuf byteBuf6 = writeCache4.getLastEntry((long) ' ');
        writeCache4.clear();
        long long8 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get((long) 100, (long) (short) 0);
        long long12 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7928");
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
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.buffer(64);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator1.ioBuffer();
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
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test7929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7929");
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
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator2.buffer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test7930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7930");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        boolean boolean10 = writeCache4.isEmpty();
        boolean boolean11 = writeCache4.isEmpty();
        boolean boolean12 = writeCache4.isEmpty();
        writeCache4.close();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7931");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7932");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        int int14 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test7933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7933");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        boolean boolean9 = writeCache8.isEmpty();
        writeCache8.clear();
        long long11 = writeCache8.count();
        java.nio.ByteBuffer[] byteBufferArray20 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray20);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray20);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray20);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray20);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray20);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray20);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufferArray20);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray20);
        boolean boolean29 = writeCache8.put(0L, (long) 52, byteBuf28);
        io.netty.buffer.ByteBuf byteBuf32 = writeCache8.get(10L, (long) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(byteBufferArray20);
        org.junit.Assert.assertArrayEquals(byteBufferArray20, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(byteBuf32);
    }

    @Test
    public void test7934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7934");
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
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache17 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 36L);
        boolean boolean20 = writeCache17.hasEntry(2L, (long) ' ');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7935");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer(100, 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.heapBuffer((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.heapBuffer((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test7936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7936");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7937");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        writeCache11.close();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache11.getLastEntry((long) (byte) 10);
        long long15 = writeCache11.size();
        long long16 = writeCache11.count();
        short[] shortArray23 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyShort(shortArray23);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray31 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copyShort(shortArray31);
        io.netty.buffer.ByteBuf[] byteBufArray33 = new io.netty.buffer.ByteBuf[] { byteBuf24, byteBuf26, byteBuf32 };
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf41 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf42 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf43 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf44 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf43);
        boolean boolean45 = writeCache11.put(100L, (long) (byte) 100, byteBuf44);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBufArray33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test7938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7938");
        int[] intArray5 = new int[] { 10, (short) 0, (byte) 0, (short) 100, 52 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 0, 0, 100, 52 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7939");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 64, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7940");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer(64);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7941");
        short[] shortArray2 = new short[] { (byte) -1, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) -1, (short) -1 });
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
    }

    @Test
    public void test7942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7942");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7943");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(64, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7944");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) ' ', 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(32, 35)");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test7945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7945");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer(1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test7946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7946");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) '#', 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test7947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7947");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyShort(intArray4);
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
    public void test7948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7948");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 2L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test7949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7949");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray4);
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
    public void test7950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7950");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.size();
        boolean boolean13 = writeCache4.hasEntry((long) (byte) 10, 10L);
        writeCache4.deleteLedger((long) 100);
        io.netty.buffer.ByteBuf byteBuf17 = writeCache4.getLastEntry((long) ' ');
        writeCache4.close();
        long long19 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test7951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7951");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        int int12 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 10, (int) 'a');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7952");
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
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.getLastEntry(5L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test7953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7953");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        org.junit.Assert.assertNotNull(byteBufferArray4);
        org.junit.Assert.assertArrayEquals(byteBufferArray4, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test7954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7954");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.directBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator2.ioBuffer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7955");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer(64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer(1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test7956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7956");
        long[] longArray5 = new long[] { (byte) 0, (byte) 10, (-1L), '4', 35 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyLong(longArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyLong(longArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyLong(longArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyLong(longArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyLong(longArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyLong(longArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyLong(longArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyLong(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 0L, 10L, (-1L), 52L, 35L });
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
    public void test7957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7957");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test7958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7958");
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
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
    public void test7959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7959");
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
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str15, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7960");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        boolean boolean3 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf5);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test7961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7961");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity((int) ' ', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) (byte) 0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 10, (int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.ioBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7962");
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf16);
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
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test7963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7963");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7964");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.getLastEntry((long) 100);
        boolean boolean12 = writeCache4.hasEntry(0L, 0L);
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.get((long) (short) 10, (long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf18 = writeCache4.get((long) '#', (long) 1);
        long long19 = writeCache4.count();
        writeCache4.close();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertNull(byteBuf18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test7965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7965");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer(35);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7966");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer(100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7967");
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
    public void test7968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7968");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.ioBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) '4');
        java.lang.String str12 = unpooledByteBufAllocator2.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator2.compositeBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test7969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7969");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer(35);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test7970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7970");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator8 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator8.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator8.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf13);
        boolean boolean15 = writeCache4.put((long) (byte) 1, (long) (short) 0, byteBuf14);
        long long16 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf19 = writeCache4.get(4L, (long) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator23 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator23.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator23.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator23.heapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator23.buffer();
        boolean boolean29 = writeCache4.put((long) (short) 10, (long) 64, byteBuf28);
        writeCache4.close();
        writeCache4.deleteLedger((long) 35);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(byteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test7971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7971");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7972");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.directBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeDirectBuffer(32);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator3.compositeDirectBuffer(64);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test7973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7973");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1, (int) (byte) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric15 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7974");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        java.lang.String str7 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer(0, (int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test7975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7975");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer(1, 52);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test7976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7976");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 10, 32);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test7977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7977");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
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
    public void test7978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7978");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 1, 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
    }

    @Test
    public void test7979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7979");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test7980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7980");
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
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf31);
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
    public void test7981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7981");
        long[] longArray3 = new long[] { 35, (byte) 0, 32 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyLong(longArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf5);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] { 35L, 0L, 32L });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test7982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7982");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test7983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7983");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteArray22);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
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
    public void test7984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7984");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        boolean boolean6 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.ioBuffer(35, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.buffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test7985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7985");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer(1, 64);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 0);
        boolean boolean15 = writeCache14.isEmpty();
        boolean boolean18 = writeCache14.hasEntry((long) '4', (long) (byte) -1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7986");
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
        boolean boolean27 = writeCache4.isEmpty();
        writeCache4.deleteLedger(100L);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test7987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7987");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.buffer();
        java.lang.String str8 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.directBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test7988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7988");
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
        io.netty.buffer.ByteBuf byteBuf15 = writeCache4.getLastEntry((long) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test7989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7989");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf13);
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
    public void test7990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7990");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
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
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test7991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7991");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
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
    public void test7992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7992");
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
}

