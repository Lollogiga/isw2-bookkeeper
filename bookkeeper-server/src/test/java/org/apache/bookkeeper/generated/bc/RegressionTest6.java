package org.apache.bookkeeper.generated.bc;

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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.directBuffer((int) (short) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator0.directBuffer((int) '4', 52);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator0.ioBuffer(10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric20 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator0.buffer((int) ' ');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric20);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        io.netty.buffer.ByteBuf[] byteBufArray1 = new io.netty.buffer.ByteBuf[] {};
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufArray1);
        org.junit.Assert.assertNotNull(byteBufArray1);
        org.junit.Assert.assertArrayEquals(byteBufArray1, new io.netty.buffer.ByteBuf[] {});
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flush();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = io.netty.buffer.Unpooled.compositeBuffer((int) ' ');
        int int14 = bufferedChannel9.read((io.netty.buffer.ByteBuf) compositeByteBuf12, (long) 32);
        long long16 = bufferedChannel9.forceWrite(false);
        long long17 = bufferedChannel9.size();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer(10);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean11 = unpooledByteBufAllocator10.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel12 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel12, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel12, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator20.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator20.ioBuffer();
        int int26 = unpooledByteBufAllocator20.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf27 = unpooledByteBufAllocator20.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator20.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator20.heapBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator20.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator35 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator36 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator36.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf39 = unpooledByteBufAllocator36.ioBuffer();
        int int42 = unpooledByteBufAllocator36.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf43 = unpooledByteBufAllocator36.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf44 = unpooledByteBufAllocator36.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf46 = unpooledByteBufAllocator36.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel47 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel50 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator36, fileChannel47, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator35, fileChannel47, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel57 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator20, fileChannel47, (int) (byte) 1, 0L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator61 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean62 = unpooledByteBufAllocator61.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel63 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel66 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator61, fileChannel63, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel68 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator20, fileChannel63, (int) (short) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel72 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel63, 1, (int) (byte) 100, 4L);
        bufferedChannel72.close();
        bufferedChannel72.close();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(fileChannel12);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf27);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator36);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf43);
        org.junit.Assert.assertNotNull(compositeByteBuf44);
        org.junit.Assert.assertNotNull(compositeByteBuf46);
        org.junit.Assert.assertNotNull(fileChannel47);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(fileChannel63);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeDirectBuffer((int) ' ');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric14 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator16.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator16.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator16.directBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator16.heapBuffer();
        java.lang.String str22 = unpooledByteBufAllocator16.toString();
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator16, fileChannel37, (int) (byte) 0, (long) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf48 = unpooledByteBufAllocator16.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator49 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str50 = unpooledByteBufAllocator49.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf51 = unpooledByteBufAllocator49.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf53 = unpooledByteBufAllocator49.directBuffer(64);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator56 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator57 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf59 = unpooledByteBufAllocator57.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf60 = unpooledByteBufAllocator57.ioBuffer();
        int int63 = unpooledByteBufAllocator57.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf64 = unpooledByteBufAllocator57.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf65 = unpooledByteBufAllocator57.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf67 = unpooledByteBufAllocator57.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel68 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel71 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator57, fileChannel68, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel75 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator56, fileChannel68, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel79 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator49, fileChannel68, (int) (byte) 0, 32, (long) 64);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel82 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator16, fileChannel68, 52, (long) (byte) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel84 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel68, 10);
        long long86 = bufferedChannel84.forceWrite(false);
        long long88 = bufferedChannel84.forceWrite(true);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str22, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(fileChannel37);
        org.junit.Assert.assertNotNull(compositeByteBuf48);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str50, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf51);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator57);
        org.junit.Assert.assertNotNull(byteBuf59);
        org.junit.Assert.assertNotNull(byteBuf60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf64);
        org.junit.Assert.assertNotNull(compositeByteBuf65);
        org.junit.Assert.assertNotNull(compositeByteBuf67);
        org.junit.Assert.assertNotNull(fileChannel68);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 0L + "'", long86 == 0L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.directBuffer();
        java.lang.Class<?> wildcardClass9 = unpooledByteBufAllocator0.getClass();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteArray10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
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
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator5 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator5.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator5.ioBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator9.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator9.ioBuffer();
        int int15 = unpooledByteBufAllocator9.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator9.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator9.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator9.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel20 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel20, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator5, fileChannel20, (int) (byte) 1, 10, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel20, (int) (short) 1);
        long long30 = bufferedChannel29.getFileChannelPosition();
        long long31 = bufferedChannel29.size();
        int int32 = bufferedChannel29.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator6.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator6.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator10.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel15 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel15, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel15, (int) (byte) 0, (int) '#', (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator27.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.ioBuffer();
        int int33 = unpooledByteBufAllocator27.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator27.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator27.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator27.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel38 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel38, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel38, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel38, (int) (short) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, fileChannel38, 1, 1, (long) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf52 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf53 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf54 = unpooledByteBufAllocator1.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf57 = unpooledByteBufAllocator1.directBuffer((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(fileChannel38);
        org.junit.Assert.assertNotNull(compositeByteBuf52);
        org.junit.Assert.assertNotNull(compositeByteBuf53);
        org.junit.Assert.assertNotNull(byteBuf54);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        int[] intArray6 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray9 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf8 };
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray9);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufArray9);
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyInt((int) ' ');
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flush();
        long long19 = bufferedChannel9.position();
        bufferedChannel9.clear();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator2.ioBuffer();
        java.lang.String str4 = unpooledByteBufAllocator2.toString();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.directBuffer(10, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.heapBuffer((int) 'a');
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str4, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        bufferedChannel14.flushAndForceWriteIfRegularFlush(true);
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
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.heapBuffer((int) (short) 1, (int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric17 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator0.heapBuffer(4);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator20.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator20.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator20.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator20.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator20.ioBuffer(1, (int) (short) 100);
        java.lang.String str29 = unpooledByteBufAllocator20.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf30 = unpooledByteBufAllocator20.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator34 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean35 = unpooledByteBufAllocator34.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel36 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator34, fileChannel36, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator20, fileChannel36, (int) (byte) 0, (long) (byte) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel36, (int) 'a', (long) 52);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str29, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(fileChannel36);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyInt(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
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
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator36 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator36.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf39 = unpooledByteBufAllocator36.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf40 = unpooledByteBufAllocator36.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf41 = unpooledByteBufAllocator36.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf44 = unpooledByteBufAllocator36.ioBuffer(1, (int) (short) 100);
        java.lang.String str45 = unpooledByteBufAllocator36.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf46 = unpooledByteBufAllocator36.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator50 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean51 = unpooledByteBufAllocator50.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel52 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel55 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator50, fileChannel52, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator36, fileChannel52, (int) (byte) 0, (long) (byte) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel52, (int) (byte) 1, (long) (short) -1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf63 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf66 = unpooledByteBufAllocator0.heapBuffer((int) (short) 1, (int) (short) 10);
        java.lang.String str67 = unpooledByteBufAllocator0.toString();
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
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator36);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(compositeByteBuf41);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str45, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(fileChannel52);
        org.junit.Assert.assertNotNull(compositeByteBuf63);
        org.junit.Assert.assertNotNull(byteBuf66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str67, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        long long18 = bufferedChannel14.size();
        bufferedChannel14.clear();
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
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray7 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf6 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray7);
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
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator1.directBuffer(1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.directBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        java.lang.String str6 = unpooledByteBufAllocator0.toString();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray8);
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray7 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf6 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray7);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufArray7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
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
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.directBuffer(100);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator0.compositeDirectBuffer((-1));
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
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(0, (byte) -1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
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
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) (byte) 0, (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 84 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str3 = unpooledByteBufAllocator2.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator2.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.buffer(0, 4);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator11 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator11.compositeHeapBuffer((int) (short) 1);
        java.lang.String str14 = unpooledByteBufAllocator11.toString();
        int int17 = unpooledByteBufAllocator11.calculateNewCapacity((int) (short) 0, (int) ' ');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator18.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator18.ioBuffer();
        int int24 = unpooledByteBufAllocator18.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator18.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator18.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator18.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric29 = unpooledByteBufAllocator18.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf30 = unpooledByteBufAllocator18.compositeDirectBuffer();
        int int33 = unpooledByteBufAllocator18.calculateNewCapacity((int) (byte) 100, (int) (byte) 100);
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel69 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator18, fileChannel55, 1, (-1L));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel72 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator11, fileChannel55, (int) '4', (long) (short) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel76 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, fileChannel55, 10, 10, (long) 32);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel80 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, fileChannel55, 1, (int) (byte) 0, (long) 64);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str3, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str14, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric29);
        org.junit.Assert.assertNotNull(compositeByteBuf30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
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
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator13.buffer((int) '4');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator16.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator16.ioBuffer();
        int int22 = unpooledByteBufAllocator16.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator16.buffer();
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator16.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator16.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator16.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator16.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator16.buffer();
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel65 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator16, fileChannel51, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel69 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator13, fileChannel51, (int) '#', 100, (long) 64);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel71 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel51, 32);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric72 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf75 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf77 = unpooledByteBufAllocator0.heapBuffer(32);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
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
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric72);
        org.junit.Assert.assertNotNull(byteBuf75);
        org.junit.Assert.assertNotNull(byteBuf77);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator8 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator8.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator8.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator8.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator8.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator8.buffer();
        boolean boolean15 = unpooledByteBufAllocator8.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator8.buffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator8.directBuffer((int) '#', 64);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator8.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator8.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator8.compositeDirectBuffer(64);
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator8.directBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator8.directBuffer((int) (short) 1, (int) 'a');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator30 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator30.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator30.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf34 = unpooledByteBufAllocator30.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator30.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator30.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf39 = unpooledByteBufAllocator30.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator40 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator40.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf44 = unpooledByteBufAllocator40.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel45 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator40, fileChannel45, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel52 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator30, fileChannel45, (int) 'a', (long) (-1));
        io.netty.buffer.ByteBuf byteBuf54 = unpooledByteBufAllocator30.directBuffer((int) (byte) 10);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator56 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf58 = unpooledByteBufAllocator56.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf59 = unpooledByteBufAllocator56.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator60 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf62 = unpooledByteBufAllocator60.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf64 = unpooledByteBufAllocator60.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel65 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel69 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator60, fileChannel65, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel73 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator56, fileChannel65, (int) (byte) 0, (int) '#', (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel77 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator30, fileChannel65, (int) (short) 100, 52, (long) 52);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel81 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator8, fileChannel65, 52, (int) (short) 1, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel84 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel65, (int) (short) 1, (long) (byte) 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator30);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(compositeByteBuf39);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator40);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(fileChannel45);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertNotNull(compositeByteBuf58);
        org.junit.Assert.assertNotNull(byteBuf59);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator60);
        org.junit.Assert.assertNotNull(byteBuf62);
        org.junit.Assert.assertNotNull(byteBuf64);
        org.junit.Assert.assertNotNull(fileChannel65);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf13);
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
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        java.lang.String str4 = unpooledByteBufAllocator1.toString();
        int int7 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer(0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str11 = unpooledByteBufAllocator10.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator10.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator10.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric14 = unpooledByteBufAllocator10.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator15 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator15.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator15.ioBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator19 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator19.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator19.ioBuffer();
        int int25 = unpooledByteBufAllocator19.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator19.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf27 = unpooledByteBufAllocator19.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator19.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel30 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator19, fileChannel30, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator15, fileChannel30, (int) (byte) 1, 10, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel30, (int) (short) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, fileChannel30, (int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf43 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf44 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf43);
        io.netty.buffer.ByteBuf byteBuf45 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf43);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str4, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator19);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(compositeByteBuf27);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertNotNull(fileChannel30);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = io.netty.buffer.Unpooled.compositeBuffer(52);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf1);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator0.compositeDirectBuffer();
        java.lang.String str24 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator25 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator25.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator25.ioBuffer();
        int int31 = unpooledByteBufAllocator25.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator25.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator25.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator25.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel36 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator25, fileChannel36, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel36, (int) (byte) 100, (long) 32);
        io.netty.buffer.ByteBuf byteBuf43 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf45 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf48 = unpooledByteBufAllocator0.heapBuffer((int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(1)");
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
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str24, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator25);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(fileChannel36);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(compositeByteBuf45);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flush();
        bufferedChannel9.clear();
        bufferedChannel9.flush();
        int int13 = bufferedChannel9.getNumOfBytesInWriteBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator14.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator14.ioBuffer();
        int int20 = unpooledByteBufAllocator14.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator14.buffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator14.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator14.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator14.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator14.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf26);
        bufferedChannel9.write((io.netty.buffer.ByteBuf) compositeByteBuf26);
        bufferedChannel9.clear();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray7 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf6 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufArray7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, false };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyBoolean(booleanArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyBoolean(booleanArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyBoolean(booleanArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyBoolean(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        assertBooleanArrayEquals(booleanArray5, new boolean[] { true, true, true, true, false });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        io.netty.buffer.ByteBuf[] byteBufArray2 = new io.netty.buffer.ByteBuf[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray2);
        org.junit.Assert.assertNotNull(byteBufArray2);
        org.junit.Assert.assertArrayEquals(byteBufArray2, new io.netty.buffer.ByteBuf[] {});
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
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteArray10);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
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
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        java.lang.String str4 = unpooledByteBufAllocator1.toString();
        int int7 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 0, (int) ' ');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator11 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator11.metric();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator11.heapBuffer((int) (short) 1);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator15 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator15.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator15.ioBuffer();
        int int21 = unpooledByteBufAllocator15.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator15.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator15.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator15.compositeBuffer(100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric26 = unpooledByteBufAllocator15.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric27 = unpooledByteBufAllocator15.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator28 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator28.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator28.ioBuffer();
        int int34 = unpooledByteBufAllocator28.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator28.buffer();
        io.netty.buffer.ByteBuf byteBuf37 = unpooledByteBufAllocator28.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf38 = unpooledByteBufAllocator28.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf39 = unpooledByteBufAllocator28.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf40 = unpooledByteBufAllocator28.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf41 = unpooledByteBufAllocator28.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator42 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf44 = unpooledByteBufAllocator42.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf45 = unpooledByteBufAllocator42.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf46 = unpooledByteBufAllocator42.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf47 = unpooledByteBufAllocator42.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf48 = unpooledByteBufAllocator42.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator51 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator52 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf54 = unpooledByteBufAllocator52.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf55 = unpooledByteBufAllocator52.ioBuffer();
        int int58 = unpooledByteBufAllocator52.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf59 = unpooledByteBufAllocator52.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf60 = unpooledByteBufAllocator52.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf62 = unpooledByteBufAllocator52.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel63 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel66 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator52, fileChannel63, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel70 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator51, fileChannel63, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel74 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator42, fileChannel63, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel77 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator28, fileChannel63, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel79 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator15, fileChannel63, (int) (short) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel82 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator11, fileChannel63, 100, (long) (short) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel85 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, fileChannel63, (int) (short) 1, (long) (short) 0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric86 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf87 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str4, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric26);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric27);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator28);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(compositeByteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(compositeByteBuf40);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator42);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(compositeByteBuf47);
        org.junit.Assert.assertNotNull(byteBuf48);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator52);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertNotNull(byteBuf55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf59);
        org.junit.Assert.assertNotNull(compositeByteBuf60);
        org.junit.Assert.assertNotNull(compositeByteBuf62);
        org.junit.Assert.assertNotNull(fileChannel63);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric86);
        org.junit.Assert.assertNotNull(byteBuf87);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator3.metric();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer(100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator14.heapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator19 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric20 = unpooledByteBufAllocator19.metric();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator19.heapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator19.ioBuffer((int) (byte) 1, 64);
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator19.buffer(64);
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel83 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator19, fileChannel65, (int) 'a', (int) (short) 0, (long) '#');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel87 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator14, fileChannel65, (int) (short) 1, (int) '#', 2L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel89 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel65, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf90 = unpooledByteBufAllocator0.buffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf27);
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
        org.junit.Assert.assertNotNull(byteBuf90);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.heapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator3.metric();
        boolean boolean10 = unpooledByteBufAllocator3.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator3.buffer(64, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (byte) -1, 0);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray10);
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
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str14 = unpooledByteBufAllocator13.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator13.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator13.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator17.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator17.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator17.directBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator17.heapBuffer();
        java.lang.String str23 = unpooledByteBufAllocator17.toString();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator27.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.ioBuffer();
        int int33 = unpooledByteBufAllocator27.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator27.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator27.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator27.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel38 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel38, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel38, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator17, fileChannel38, (int) (byte) 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator13, fileChannel38, (int) (byte) 10, (long) 64);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel55 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel38, 64, (int) (byte) 1, (long) 32);
        io.netty.buffer.ByteBuf byteBuf57 = io.netty.buffer.Unpooled.copyFloat((float) (-1));
        bufferedChannel55.write(byteBuf57);
        int int59 = bufferedChannel55.getNumOfBytesInWriteBuffer();
        bufferedChannel55.flushAndForceWriteIfRegularFlush(false);
        long long63 = bufferedChannel55.forceWrite(true);
        bufferedChannel55.clear();
        long long65 = bufferedChannel55.position();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str14, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str23, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(fileChannel38);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 4L + "'", long63 == 4L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 4L + "'", long65 == 4L);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.buffer(64);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = unpooledByteBufAllocator0.calculateNewCapacity(32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 32 (expected: not greater than maxCapacity(0)");
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
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 10, 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, 1, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteArray10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
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
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.ioBuffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeDirectBuffer(32);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        int[] intArray48 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf49 = io.netty.buffer.Unpooled.copyMedium(intArray48);
        int int51 = bufferedChannel32.read(byteBuf49, (long) 100);
        int[] intArray58 = new int[] { (byte) 10, (-1), (short) -1, (short) 1, (-1), 0 };
        io.netty.buffer.ByteBuf byteBuf59 = io.netty.buffer.Unpooled.copyShort(intArray58);
        io.netty.buffer.ByteBuf byteBuf60 = io.netty.buffer.Unpooled.copyMedium(intArray58);
        io.netty.buffer.ByteBuf byteBuf61 = io.netty.buffer.Unpooled.copyInt(intArray58);
        io.netty.buffer.ByteBuf byteBuf62 = io.netty.buffer.Unpooled.copyInt(intArray58);
        int int64 = bufferedChannel32.read(byteBuf62, 4L);
        long long65 = bufferedChannel32.getFileChannelPosition();
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
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 10, (-1), (-1), 1, (-1), 0 });
        org.junit.Assert.assertNotNull(byteBuf59);
        org.junit.Assert.assertNotNull(byteBuf60);
        org.junit.Assert.assertNotNull(byteBuf61);
        org.junit.Assert.assertNotNull(byteBuf62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (byte) 1);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator7 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator7.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator7.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator7.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator7.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator7.ioBuffer(1, (int) (short) 100);
        java.lang.String str16 = unpooledByteBufAllocator7.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator7.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator21 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean22 = unpooledByteBufAllocator21.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel23 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator21, fileChannel23, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator7, fileChannel23, (int) (byte) 0, (long) (byte) -1);
        int int32 = unpooledByteBufAllocator7.calculateNewCapacity((int) (short) 100, 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator34 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator34.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf37 = unpooledByteBufAllocator34.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator38 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf40 = unpooledByteBufAllocator38.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator38.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel43 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator38, fileChannel43, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator34, fileChannel43, (int) (byte) 0, (int) '#', (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator7, fileChannel43, (int) (byte) 1, (long) (byte) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel57 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel43, 0, (long) 4);
        io.netty.buffer.ByteBuf byteBuf60 = unpooledByteBufAllocator3.heapBuffer(4, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str16, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(fileChannel23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator38);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(fileChannel43);
        org.junit.Assert.assertNotNull(byteBuf60);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufferArray3);
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
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        int int23 = bufferedChannel22.getNumOfBytesInWriteBuffer();
        bufferedChannel22.close();
        int int25 = bufferedChannel22.getNumOfBytesInWriteBuffer();
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copyInt((int) (short) -1);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf27);
        int int30 = bufferedChannel22.read(byteBuf27, 2L);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = bufferedChannel22.size();
            org.junit.Assert.fail("Expected exception of type org.apache.bookkeeper.bookie.BufferedChannelBase.BufferedChannelClosedException; message: Attempting to access a file channel that has already been closed");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray7 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf6 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufArray7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int[] intArray6 = new int[] { (byte) 10, (-1), (short) -1, (short) 1, (-1), 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, (-1), (-1), 1, (-1), 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator14.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator14.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator14.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator14.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator14.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator14.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel29 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator24, fileChannel29, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator14, fileChannel29, (int) 'a', (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel29, (int) (short) 0, (int) (short) 0, (long) 'a');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator41 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf43 = unpooledByteBufAllocator41.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf44 = unpooledByteBufAllocator41.ioBuffer();
        int int47 = unpooledByteBufAllocator41.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf48 = unpooledByteBufAllocator41.buffer();
        io.netty.buffer.ByteBuf byteBuf50 = unpooledByteBufAllocator41.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf51 = unpooledByteBufAllocator41.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator54 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator55 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf57 = unpooledByteBufAllocator55.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf58 = unpooledByteBufAllocator55.ioBuffer();
        int int61 = unpooledByteBufAllocator55.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf62 = unpooledByteBufAllocator55.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf63 = unpooledByteBufAllocator55.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf65 = unpooledByteBufAllocator55.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel66 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel69 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator55, fileChannel66, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel73 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator54, fileChannel66, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel76 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator41, fileChannel66, (int) ' ', 1L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel78 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel66, 1);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric79 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf82 = unpooledByteBufAllocator0.directBuffer((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(fileChannel29);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator41);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(byteBuf48);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertNotNull(compositeByteBuf51);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator55);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf62);
        org.junit.Assert.assertNotNull(compositeByteBuf63);
        org.junit.Assert.assertNotNull(compositeByteBuf65);
        org.junit.Assert.assertNotNull(fileChannel66);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric79);
        org.junit.Assert.assertNotNull(byteBuf82);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeBuffer(4);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator10.ioBuffer();
        int int16 = unpooledByteBufAllocator10.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator10.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator10.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator10.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator10.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator10.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator24.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator24.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator24.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator34 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator34.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator34.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel39 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel43 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator34, fileChannel39, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator24, fileChannel39, (int) 'a', (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel50 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel39, (int) (short) 0, (int) (short) 0, (long) 'a');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator51 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf53 = unpooledByteBufAllocator51.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf54 = unpooledByteBufAllocator51.ioBuffer();
        int int57 = unpooledByteBufAllocator51.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf58 = unpooledByteBufAllocator51.buffer();
        io.netty.buffer.ByteBuf byteBuf60 = unpooledByteBufAllocator51.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf61 = unpooledByteBufAllocator51.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator64 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator65 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf67 = unpooledByteBufAllocator65.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf68 = unpooledByteBufAllocator65.ioBuffer();
        int int71 = unpooledByteBufAllocator65.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf72 = unpooledByteBufAllocator65.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf73 = unpooledByteBufAllocator65.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf75 = unpooledByteBufAllocator65.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel76 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel79 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator65, fileChannel76, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel83 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator64, fileChannel76, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel86 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator51, fileChannel76, (int) ' ', 1L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel88 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel76, 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel92 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel76, (int) (short) 0, 0, (long) 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator34);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(fileChannel39);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator51);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(byteBuf60);
        org.junit.Assert.assertNotNull(compositeByteBuf61);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator65);
        org.junit.Assert.assertNotNull(byteBuf67);
        org.junit.Assert.assertNotNull(byteBuf68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf72);
        org.junit.Assert.assertNotNull(compositeByteBuf73);
        org.junit.Assert.assertNotNull(compositeByteBuf75);
        org.junit.Assert.assertNotNull(fileChannel76);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        io.netty.buffer.ByteBuf[] byteBufArray5 = new io.netty.buffer.ByteBuf[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray5);
        org.junit.Assert.assertNotNull(byteBufArray5);
        org.junit.Assert.assertArrayEquals(byteBufArray5, new io.netty.buffer.ByteBuf[] {});
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
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flush();
        bufferedChannel9.flush();
        bufferedChannel9.flushAndForceWrite(false);
        long long15 = bufferedChannel9.forceWrite(true);
        long long16 = bufferedChannel9.position();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
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
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeBuffer(1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator0.heapBuffer();
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
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        io.netty.buffer.ByteBuf[] byteBufArray2 = new io.netty.buffer.ByteBuf[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray2);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray2);
        org.junit.Assert.assertNotNull(byteBufArray2);
        org.junit.Assert.assertArrayEquals(byteBufArray2, new io.netty.buffer.ByteBuf[] {});
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        bufferedChannel21.clear();
        long long23 = bufferedChannel21.getFileChannelPosition();
        bufferedChannel21.flushAndForceWrite(false);
        int[] intArray30 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copyMedium(intArray30);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray33 = new io.netty.buffer.ByteBuf[] { byteBuf31, byteBuf32 };
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray33);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray33);
        int int37 = bufferedChannel21.read(byteBuf35, 10L);
        short[] shortArray43 = new short[] { (short) 0, (short) 100, (byte) 1, (short) -1, (short) 1 };
        io.netty.buffer.ByteBuf byteBuf44 = io.netty.buffer.Unpooled.copyShort(shortArray43);
        io.netty.buffer.ByteBuf byteBuf45 = io.netty.buffer.Unpooled.copyShort(shortArray43);
        io.netty.buffer.ByteBuf byteBuf46 = io.netty.buffer.Unpooled.copyShort(shortArray43);
        io.netty.buffer.ByteBuf byteBuf47 = io.netty.buffer.Unpooled.copyShort(shortArray43);
        io.netty.buffer.ByteBuf byteBuf48 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf47);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = bufferedChannel21.read(byteBuf48, 5L, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=52)");
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBufArray33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 0, (short) 100, (short) 1, (short) -1, (short) 1 });
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertNotNull(byteBuf48);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer(1);
        java.lang.String str10 = unpooledByteBufAllocator0.toString();
        boolean boolean11 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.directBuffer(1);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (-1), (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 11 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf1 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.heapBuffer(4, 64);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer((int) '#', 64);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        byte[][] byteArray12 = new byte[][] { byteArray5, byteArray11 };
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray12);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, 52, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) (byte) 10, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 14 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        bufferedChannel22.close();
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = io.netty.buffer.Unpooled.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf24);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf25);
        bufferedChannel22.write(byteBuf26);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf26);
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
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        short[] shortArray6 = new short[] { (byte) 10, (short) 10, (byte) 10, (byte) 0, (short) 1, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 10, (short) 10, (short) 10, (short) 0, (short) 1, (short) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.ioBuffer(10, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator17.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator17.ioBuffer();
        int int23 = unpooledByteBufAllocator17.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator17.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator17.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator17.heapBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator17.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator32 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator33 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator33.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator33.ioBuffer();
        int int39 = unpooledByteBufAllocator33.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf40 = unpooledByteBufAllocator33.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf41 = unpooledByteBufAllocator33.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf43 = unpooledByteBufAllocator33.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel44 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator33, fileChannel44, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator32, fileChannel44, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator17, fileChannel44, (int) (byte) 1, 0L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator58 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean59 = unpooledByteBufAllocator58.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel60 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel63 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator58, fileChannel60, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel65 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator17, fileChannel60, (int) (short) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel68 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel60, (int) (byte) 1, (long) '#');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator33);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf40);
        org.junit.Assert.assertNotNull(compositeByteBuf41);
        org.junit.Assert.assertNotNull(compositeByteBuf43);
        org.junit.Assert.assertNotNull(fileChannel44);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(fileChannel60);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyLong(0L);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator6.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator6.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator10.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel15 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel15, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel15, (int) (byte) 0, (int) '#', (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator27.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.ioBuffer();
        int int33 = unpooledByteBufAllocator27.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator27.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator27.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator27.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel38 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel38, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel38, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel38, (int) (short) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, fileChannel38, 1, 1, (long) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf54 = unpooledByteBufAllocator1.ioBuffer(10, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf57 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10, 100);
        io.netty.buffer.ByteBuf byteBuf59 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(fileChannel38);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertNotNull(byteBuf59);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        bufferedChannel9.flushAndForceWrite(true);
        long long37 = bufferedChannel9.getFileChannelPosition();
        long long39 = bufferedChannel9.forceWrite(true);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator40 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator40.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf43 = unpooledByteBufAllocator40.ioBuffer();
        int int46 = unpooledByteBufAllocator40.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf47 = unpooledByteBufAllocator40.buffer();
        io.netty.buffer.ByteBuf byteBuf49 = unpooledByteBufAllocator40.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf50 = unpooledByteBufAllocator40.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf51 = unpooledByteBufAllocator40.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf52 = unpooledByteBufAllocator40.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf53 = unpooledByteBufAllocator40.buffer();
        io.netty.buffer.ByteBuf byteBuf56 = unpooledByteBufAllocator40.heapBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf59 = unpooledByteBufAllocator40.heapBuffer((int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int61 = bufferedChannel9.read(byteBuf59, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minWritableBytes : -10 (expected: >= 0)");
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
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator40);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertNotNull(byteBuf49);
        org.junit.Assert.assertNotNull(compositeByteBuf50);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(compositeByteBuf52);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertNotNull(byteBuf56);
        org.junit.Assert.assertNotNull(byteBuf59);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        bufferedChannel21.clear();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator26.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator26.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator26.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf31 = unpooledByteBufAllocator26.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf34 = unpooledByteBufAllocator26.ioBuffer(1, (int) (short) 100);
        java.lang.String str35 = unpooledByteBufAllocator26.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator26.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator40 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean41 = unpooledByteBufAllocator40.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel42 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator40, fileChannel42, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel42, (int) (byte) 0, (long) (byte) -1);
        boolean boolean49 = unpooledByteBufAllocator26.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf50 = unpooledByteBufAllocator26.compositeBuffer();
        int int52 = bufferedChannel21.read((io.netty.buffer.ByteBuf) compositeByteBuf50, (long) 0);
        int[] intArray57 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf58 = io.netty.buffer.Unpooled.copyMedium(intArray57);
        io.netty.buffer.ByteBuf byteBuf59 = io.netty.buffer.Unpooled.copyInt(intArray57);
        io.netty.buffer.ByteBuf byteBuf60 = io.netty.buffer.Unpooled.copyShort(intArray57);
        io.netty.buffer.ByteBuf byteBuf61 = io.netty.buffer.Unpooled.copyMedium(intArray57);
        io.netty.buffer.ByteBuf byteBuf62 = io.netty.buffer.Unpooled.copyInt(intArray57);
        io.netty.buffer.ByteBuf byteBuf63 = io.netty.buffer.Unpooled.copyShort(intArray57);
        int int65 = bufferedChannel21.read(byteBuf63, (long) (short) 1);
        bufferedChannel21.close();
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
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(compositeByteBuf31);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str35, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(fileChannel42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(byteBuf59);
        org.junit.Assert.assertNotNull(byteBuf60);
        org.junit.Assert.assertNotNull(byteBuf61);
        org.junit.Assert.assertNotNull(byteBuf62);
        org.junit.Assert.assertNotNull(byteBuf63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator3.compositeDirectBuffer();
        boolean boolean9 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric10 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.buffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf12);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer(100);
        boolean boolean9 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeBuffer(100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator14.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator14.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator14.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator14.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator14.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator14.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator24.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel29 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator24, fileChannel29, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator14, fileChannel29, (int) 'a', (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel29, (int) (short) 0, (int) (short) 0, (long) 'a');
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator0.directBuffer((int) (short) 100);
        java.lang.String str43 = unpooledByteBufAllocator0.toString();
        java.lang.String str44 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBuf byteBuf45 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf46 = unpooledByteBufAllocator0.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(fileChannel29);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str43, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str44, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(compositeByteBuf46);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) 'a', 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteArray10);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
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
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.nio.ByteBuffer[] byteBufferArray6 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray6);
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
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) 10, 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
        int int25 = unpooledByteBufAllocator0.calculateNewCapacity((int) (short) 100, 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator27.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator31 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator31.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator31.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel36 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator31, fileChannel36, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel36, (int) (byte) 0, (int) '#', (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel36, (int) (byte) 1, (long) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf48 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf51 = unpooledByteBufAllocator0.buffer((int) ' ', 100);
        io.netty.buffer.ByteBuf byteBuf53 = unpooledByteBufAllocator0.directBuffer(1);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator31);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(fileChannel36);
        org.junit.Assert.assertNotNull(compositeByteBuf48);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf53);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 0, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        double[] doubleArray6 = new double[] { 100.0d, (-1L), 1.0f, 100.0d, 32, 100L };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyDouble(doubleArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyDouble(doubleArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyDouble(doubleArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyDouble(doubleArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyDouble(doubleArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyDouble(doubleArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyDouble(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), 1.0d, 100.0d, 32.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(4, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 4 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer(1);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.directBuffer(10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator3.heapBuffer(100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(4)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator3.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator17.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator17.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator17.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator17.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator17.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator27.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.ioBuffer();
        int int33 = unpooledByteBufAllocator27.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator27.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator27.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator27.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel38 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel38, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel38, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator17, fileChannel38, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel52 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel38, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel38, (int) '#', 100, (long) 64);
        int int57 = bufferedChannel56.getNumOfBytesInWriteBuffer();
        long long58 = bufferedChannel56.getFileChannelPosition();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(fileChannel38);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator0.compositeDirectBuffer();
        java.lang.String str24 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator25 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator25.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator25.ioBuffer();
        int int31 = unpooledByteBufAllocator25.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator25.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator25.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator25.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel36 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator25, fileChannel36, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel36, (int) (byte) 100, (long) 32);
        int int45 = unpooledByteBufAllocator0.calculateNewCapacity((int) (short) 10, (int) (byte) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric46 = unpooledByteBufAllocator0.metric();
        java.lang.String str47 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf49 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (short) 1);
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
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str24, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator25);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(fileChannel36);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str47, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf49);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        int[] intArray24 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copyMedium(intArray24);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copyInt(intArray24);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copyMedium(intArray24);
        bufferedChannel14.write(byteBuf27);
        int int29 = bufferedChannel14.getNumOfBytesInWriteBuffer();
        bufferedChannel14.close();
        int int31 = bufferedChannel14.getNumOfBytesInWriteBuffer();
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        int int39 = unpooledByteBufAllocator0.calculateNewCapacity((int) (short) 0, 0);
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator0.buffer((int) ' ', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf43 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf44 = unpooledByteBufAllocator0.directBuffer();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf44);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        long long42 = bufferedChannel9.getFileChannelPosition();
        long long43 = bufferedChannel9.size();
        long long44 = bufferedChannel9.position();
        int int45 = bufferedChannel9.getNumOfBytesInWriteBuffer();
        float[] floatArray48 = new float[] { 100, 0.0f };
        io.netty.buffer.ByteBuf byteBuf49 = io.netty.buffer.Unpooled.copyFloat(floatArray48);
        io.netty.buffer.ByteBuf byteBuf50 = io.netty.buffer.Unpooled.copyFloat(floatArray48);
        io.netty.buffer.ByteBuf byteBuf51 = io.netty.buffer.Unpooled.copyFloat(floatArray48);
        io.netty.buffer.ByteBuf byteBuf52 = io.netty.buffer.Unpooled.copyFloat(floatArray48);
        io.netty.buffer.ByteBuf byteBuf53 = io.netty.buffer.Unpooled.copyFloat(floatArray48);
        int int55 = bufferedChannel9.read(byteBuf53, (long) (byte) 10);
        int int56 = bufferedChannel9.getNumOfBytesInWriteBuffer();
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertArrayEquals(floatArray48, new float[] { 100.0f, 0.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf49);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((float) 4);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteArray10);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf21);
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
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 1);
        java.lang.String str7 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer();
        int int11 = unpooledByteBufAllocator3.calculateNewCapacity((int) (byte) 0, 52);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator3.heapBuffer(1, 4);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: false)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: false)");
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyInt(52);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.ioBuffer();
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
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
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
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.ioBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator8 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator8.buffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator8.directBuffer(52);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator12 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator12.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator12.ioBuffer();
        int int18 = unpooledByteBufAllocator12.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator12.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator12.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator12.compositeBuffer(100);
        boolean boolean23 = unpooledByteBufAllocator12.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator12.buffer((int) ' ');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator26.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator26.ioBuffer();
        int int32 = unpooledByteBufAllocator26.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator26.buffer();
        io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator26.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator26.compositeBuffer();
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel51, (int) ' ', 1L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel65 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator12, fileChannel51, (int) (byte) 10, 32, 1L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel68 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator8, fileChannel51, (int) (short) 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel70 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel51, 32);
        java.nio.ByteBuffer[] byteBufferArray73 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf74 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray73);
        io.netty.buffer.ByteBuf byteBuf75 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufferArray73);
        io.netty.buffer.ByteBuf byteBuf76 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf75);
        io.netty.buffer.ByteBuf byteBuf77 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf75);
        int int79 = bufferedChannel70.read(byteBuf77, (long) (short) 100);
        long long80 = bufferedChannel70.size();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator40);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf47);
        org.junit.Assert.assertNotNull(compositeByteBuf48);
        org.junit.Assert.assertNotNull(compositeByteBuf50);
        org.junit.Assert.assertNotNull(fileChannel51);
        org.junit.Assert.assertNotNull(byteBufferArray73);
        org.junit.Assert.assertArrayEquals(byteBufferArray73, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf74);
        org.junit.Assert.assertNotNull(byteBuf75);
        org.junit.Assert.assertNotNull(byteBuf76);
        org.junit.Assert.assertNotNull(byteBuf77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeDirectBuffer((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.ioBuffer(4);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.directBuffer((int) ' ');
        boolean boolean12 = unpooledByteBufAllocator3.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = unpooledByteBufAllocator3.calculateNewCapacity((int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator2.ioBuffer();
        boolean boolean4 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator6.compositeHeapBuffer((int) (short) 1);
        java.lang.String str9 = unpooledByteBufAllocator6.toString();
        int int12 = unpooledByteBufAllocator6.calculateNewCapacity((int) (short) 0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator6.ioBuffer(0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator15 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str16 = unpooledByteBufAllocator15.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator15.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator15.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric19 = unpooledByteBufAllocator15.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator20.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator20.ioBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        int int30 = unpooledByteBufAllocator24.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf31 = unpooledByteBufAllocator24.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator24.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator24.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel35 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator24, fileChannel35, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator20, fileChannel35, (int) (byte) 1, 10, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator15, fileChannel35, (int) (short) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel35, (int) (byte) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, fileChannel35, (int) (byte) 100);
        long long50 = bufferedChannel48.forceWrite(true);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str16, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric19);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(fileChannel35);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        java.nio.ByteBuffer[] byteBufferArray1 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufferArray1);
        org.junit.Assert.assertArrayEquals(byteBufferArray1, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.ioBuffer(10, (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.buffer((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator0.buffer((int) (short) -1, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer(1);
        java.lang.String str10 = unpooledByteBufAllocator0.toString();
        boolean boolean11 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeDirectBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.directBuffer((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.buffer(10, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.directBuffer();
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf(10, (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        // The following exception was thrown during execution in test generation
        try {
            int int32 = unpooledByteBufAllocator3.calculateNewCapacity(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(35)");
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
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int[] intArray3 = new int[] { (short) 1, 'a', 'a' };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyInt(intArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(intArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyInt(intArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyInt(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 1, 97, 97 });
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
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
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
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator36 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator36.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf39 = unpooledByteBufAllocator36.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf40 = unpooledByteBufAllocator36.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf41 = unpooledByteBufAllocator36.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf44 = unpooledByteBufAllocator36.ioBuffer(1, (int) (short) 100);
        java.lang.String str45 = unpooledByteBufAllocator36.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf46 = unpooledByteBufAllocator36.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator50 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean51 = unpooledByteBufAllocator50.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel52 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel55 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator50, fileChannel52, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator36, fileChannel52, (int) (byte) 0, (long) (byte) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel52, (int) (byte) 1, (long) (short) -1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf63 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf65 = unpooledByteBufAllocator0.heapBuffer(0);
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
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator36);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(compositeByteBuf41);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str45, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(fileChannel52);
        org.junit.Assert.assertNotNull(compositeByteBuf63);
        org.junit.Assert.assertNotNull(byteBuf65);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator3.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator17.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator17.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator17.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator17.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator17.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator27.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.ioBuffer();
        int int33 = unpooledByteBufAllocator27.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator27.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator27.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator27.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel38 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel38, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel38, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator17, fileChannel38, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel52 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel38, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel38, (int) '#', 100, (long) 64);
        io.netty.buffer.ByteBuf byteBuf57 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf59 = unpooledByteBufAllocator0.compositeHeapBuffer(32);
        io.netty.buffer.ByteBuf byteBuf62 = unpooledByteBufAllocator0.directBuffer((int) (short) 0, (int) '#');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator64 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf66 = unpooledByteBufAllocator64.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf67 = unpooledByteBufAllocator64.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator68 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf70 = unpooledByteBufAllocator68.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf72 = unpooledByteBufAllocator68.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel73 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel77 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator68, fileChannel73, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel81 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator64, fileChannel73, (int) (byte) 0, (int) '#', (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel84 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel73, 10, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf86 = unpooledByteBufAllocator0.compositeBuffer((int) '4');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(fileChannel38);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertNotNull(compositeByteBuf59);
        org.junit.Assert.assertNotNull(byteBuf62);
        org.junit.Assert.assertNotNull(compositeByteBuf66);
        org.junit.Assert.assertNotNull(byteBuf67);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator68);
        org.junit.Assert.assertNotNull(byteBuf70);
        org.junit.Assert.assertNotNull(byteBuf72);
        org.junit.Assert.assertNotNull(fileChannel73);
        org.junit.Assert.assertNotNull(compositeByteBuf86);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        byte[][] byteArray31 = new byte[][] { byteArray5, byteArray10, byteArray15, byteArray20, byteArray25, byteArray30 };
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copiedBuffer(byteArray31);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copiedBuffer(byteArray31);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteArray31);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer((int) '#', 64);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer();
        int int16 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 0, (int) (byte) 0);
        java.lang.String str17 = unpooledByteBufAllocator0.toString();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str17, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf40 = unpooledByteBufAllocator0.compositeHeapBuffer(52);
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
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(compositeByteBuf40);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (byte) -1, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
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
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(false);
        java.lang.String str2 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer(64, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UnpooledByteBufAllocator(directByDefault: false)" + "'", str2, "UnpooledByteBufAllocator(directByDefault: false)");
        org.junit.Assert.assertNotNull(compositeByteBuf3);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        boolean[] booleanArray6 = new boolean[] { false, false, false, false, true, false };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyBoolean(booleanArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyBoolean(booleanArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyBoolean(booleanArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyBoolean(booleanArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyBoolean(booleanArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyBoolean(booleanArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyBoolean(booleanArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyBoolean(booleanArray6);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyBoolean(booleanArray6);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf15);
        org.junit.Assert.assertNotNull(booleanArray6);
        assertBooleanArrayEquals(booleanArray6, new boolean[] { false, false, false, false, true, false });
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
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf1 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer((int) '4');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer(1);
        java.lang.String str10 = unpooledByteBufAllocator0.toString();
        boolean boolean11 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 1);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric14 = unpooledByteBufAllocator0.metric();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric14);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str10 = unpooledByteBufAllocator9.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator9.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator9.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator9.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator9.directBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator9.buffer((int) 'a');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator19 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator19.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator19.ioBuffer();
        int int25 = unpooledByteBufAllocator19.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator19.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf27 = unpooledByteBufAllocator19.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator19.heapBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf31 = unpooledByteBufAllocator19.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator34 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator35 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf37 = unpooledByteBufAllocator35.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator35.ioBuffer();
        int int41 = unpooledByteBufAllocator35.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf42 = unpooledByteBufAllocator35.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf43 = unpooledByteBufAllocator35.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf45 = unpooledByteBufAllocator35.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel46 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator35, fileChannel46, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel53 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator34, fileChannel46, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator19, fileChannel46, (int) (byte) 1, 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel59 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel46, (int) (short) 0, 2L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel46, (int) (short) 0, (long) 100);
        bufferedChannel62.flush();
        bufferedChannel62.clear();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator19);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(compositeByteBuf27);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(compositeByteBuf31);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator35);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf42);
        org.junit.Assert.assertNotNull(compositeByteBuf43);
        org.junit.Assert.assertNotNull(compositeByteBuf45);
        org.junit.Assert.assertNotNull(fileChannel46);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator3.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator17.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator17.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator17.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator17.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator17.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator27.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.ioBuffer();
        int int33 = unpooledByteBufAllocator27.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator27.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator27.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator27.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel38 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel38, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel38, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator17, fileChannel38, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel52 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel38, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel38, (int) '#', 100, (long) 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf57 = unpooledByteBufAllocator0.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf60 = unpooledByteBufAllocator0.heapBuffer((int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(fileChannel38);
        org.junit.Assert.assertNotNull(compositeByteBuf57);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray11 = new byte[][] { byteArray10 };
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray11);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray11);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray11);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray11);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray11);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray11);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteArray11);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteArray11);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteArray11);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
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
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        io.netty.buffer.ByteBuf[] byteBufArray1 = new io.netty.buffer.ByteBuf[] {};
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteBufArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray1);
        org.junit.Assert.assertNotNull(byteBufArray1);
        org.junit.Assert.assertArrayEquals(byteBufArray1, new io.netty.buffer.ByteBuf[] {});
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        boolean boolean5 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
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
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator15 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator16.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator16.ioBuffer();
        int int22 = unpooledByteBufAllocator16.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator16.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator16.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator16.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel27 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator16, fileChannel27, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator15, fileChannel27, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel27, (int) (byte) 1, 0L);
        long long38 = bufferedChannel37.getFileChannelPosition();
        long long39 = bufferedChannel37.getFileChannelPosition();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(fileChannel27);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        boolean[] booleanArray1 = new boolean[] { true };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copyBoolean(booleanArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyBoolean(booleanArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyBoolean(booleanArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyBoolean(booleanArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyBoolean(booleanArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyBoolean(booleanArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf8);
        org.junit.Assert.assertNotNull(booleanArray1);
        assertBooleanArrayEquals(booleanArray1, new boolean[] { true });
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
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel5, 0, (long) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator3.compositeBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator3.compositeHeapBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator3.directBuffer();
        java.lang.String str16 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator3.buffer((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnpooledByteBufAllocator(directByDefault: false)" + "'", str16, "UnpooledByteBufAllocator(directByDefault: false)");
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        long long10 = bufferedChannel9.size();
        bufferedChannel9.clear();
        long long12 = bufferedChannel9.position();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator13.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator13.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel18 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator13, fileChannel18, (int) (short) 1, (int) 'a', 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator13.compositeDirectBuffer();
        bufferedChannel9.write((io.netty.buffer.ByteBuf) compositeByteBuf23);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(fileChannel18);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray3);
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        int int25 = unpooledByteBufAllocator0.calculateNewCapacity((int) (short) 100, 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator27.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator31 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator31.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator31.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel36 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator31, fileChannel36, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel36, (int) (byte) 0, (int) '#', (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel36, (int) (byte) 1, (long) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf48 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf50 = unpooledByteBufAllocator0.compositeHeapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf52 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (byte) 10);
        java.lang.String str53 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf55 = unpooledByteBufAllocator0.compositeBuffer(64);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator31);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(fileChannel36);
        org.junit.Assert.assertNotNull(compositeByteBuf48);
        org.junit.Assert.assertNotNull(compositeByteBuf50);
        org.junit.Assert.assertNotNull(compositeByteBuf52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str53, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf55);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer((int) (short) 100, 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf11);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
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
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.directBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf11);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator9.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator9.ioBuffer();
        int int15 = unpooledByteBufAllocator9.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator9.buffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator9.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator9.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator9.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator9.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator9.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator23 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator23.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator23.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator23.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator23.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator23.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator32 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator33 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator33.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator33.ioBuffer();
        int int39 = unpooledByteBufAllocator33.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf40 = unpooledByteBufAllocator33.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf41 = unpooledByteBufAllocator33.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf43 = unpooledByteBufAllocator33.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel44 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator33, fileChannel44, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator32, fileChannel44, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel55 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator23, fileChannel44, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel44, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel44, 100, (long) 1);
        long long62 = bufferedChannel61.position();
        long long63 = bufferedChannel61.size();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator33);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf40);
        org.junit.Assert.assertNotNull(compositeByteBuf41);
        org.junit.Assert.assertNotNull(compositeByteBuf43);
        org.junit.Assert.assertNotNull(fileChannel44);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) '4', 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(100, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray9 = new byte[][] { byteArray8 };
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteArray9);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray9);
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
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        java.lang.String str17 = unpooledByteBufAllocator0.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str17, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
        java.lang.String str71 = unpooledByteBufAllocator3.toString();
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "UnpooledByteBufAllocator(directByDefault: false)" + "'", str71, "UnpooledByteBufAllocator(directByDefault: false)");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufferArray2);
        org.junit.Assert.assertNotNull(byteBufferArray2);
        org.junit.Assert.assertArrayEquals(byteBufferArray2, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
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
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int[] intArray6 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray9 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf8 };
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray9);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray9);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteBufArray9);
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
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(1, (int) 'a');
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray10 = new byte[][] { byteArray9 };
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray10);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray10);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteArray10);
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
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        java.lang.String str4 = unpooledByteBufAllocator1.toString();
        int int7 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer(0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str4, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray8);
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
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf9);
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
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel5, 0, (long) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.ioBuffer((int) (short) 1, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator3.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator3.compositeDirectBuffer((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf1 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator5 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator5.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator5.ioBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator9 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator9.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator9.ioBuffer();
        int int15 = unpooledByteBufAllocator9.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator9.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator9.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator9.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel20 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator9, fileChannel20, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator5, fileChannel20, (int) (byte) 1, 10, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel20, (int) (short) 1);
        long long31 = bufferedChannel29.forceWrite(false);
        bufferedChannel29.flush();
        bufferedChannel29.close();
        int int34 = bufferedChannel29.getNumOfBytesInWriteBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(fileChannel20);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray7 = new io.netty.buffer.ByteBuf[] { byteBuf5, byteBuf6 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray7);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray7);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufArray7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.heapBuffer(32);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator18.ioBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator18.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator18.ioBuffer((int) (byte) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric24 = unpooledByteBufAllocator18.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator28 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean29 = unpooledByteBufAllocator28.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel30 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator28, fileChannel30, 0, (long) '4');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator34 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator34.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf37 = unpooledByteBufAllocator34.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator34.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf39 = unpooledByteBufAllocator34.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator34.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf43 = unpooledByteBufAllocator34.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator44 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf46 = unpooledByteBufAllocator44.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf48 = unpooledByteBufAllocator44.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel49 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel53 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator44, fileChannel49, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator34, fileChannel49, (int) 'a', (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel59 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator28, fileChannel49, 1, 1L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator18, fileChannel49, 52);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel63 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel49, (int) (byte) 1);
        long long64 = bufferedChannel63.size();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(fileChannel30);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator34);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(compositeByteBuf39);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(compositeByteBuf43);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator44);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(byteBuf48);
        org.junit.Assert.assertNotNull(fileChannel49);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator3.metric();
        boolean boolean10 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator3.directBuffer((int) (short) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric17 = unpooledByteBufAllocator16.metric();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator16.heapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator16.heapBuffer();
        boolean boolean21 = unpooledByteBufAllocator16.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator16.ioBuffer(52, 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator16.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator26.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator26.ioBuffer();
        int int32 = unpooledByteBufAllocator26.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf33 = unpooledByteBufAllocator26.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator26.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf37 = unpooledByteBufAllocator26.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator26.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf40 = unpooledByteBufAllocator26.compositeDirectBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf41 = unpooledByteBufAllocator26.compositeHeapBuffer();
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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator56 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf58 = unpooledByteBufAllocator56.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf59 = unpooledByteBufAllocator56.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf60 = unpooledByteBufAllocator56.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf61 = unpooledByteBufAllocator56.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf62 = unpooledByteBufAllocator56.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator65 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator66 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf68 = unpooledByteBufAllocator66.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf69 = unpooledByteBufAllocator66.ioBuffer();
        int int72 = unpooledByteBufAllocator66.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf73 = unpooledByteBufAllocator66.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf74 = unpooledByteBufAllocator66.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf76 = unpooledByteBufAllocator66.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel77 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel80 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator66, fileChannel77, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel84 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator65, fileChannel77, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel88 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator56, fileChannel77, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel91 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator42, fileChannel77, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel93 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel77, (int) ' ');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel96 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator16, fileChannel77, (int) (byte) 1, (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel98 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel77, 52);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf33);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(compositeByteBuf40);
        org.junit.Assert.assertNotNull(compositeByteBuf41);
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
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator56);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(byteBuf59);
        org.junit.Assert.assertNotNull(byteBuf60);
        org.junit.Assert.assertNotNull(compositeByteBuf61);
        org.junit.Assert.assertNotNull(byteBuf62);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator66);
        org.junit.Assert.assertNotNull(byteBuf68);
        org.junit.Assert.assertNotNull(byteBuf69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf73);
        org.junit.Assert.assertNotNull(compositeByteBuf74);
        org.junit.Assert.assertNotNull(compositeByteBuf76);
        org.junit.Assert.assertNotNull(fileChannel77);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.heapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer(1, (int) '4');
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf11);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        boolean boolean7 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer((int) '#', 64);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer();
        int int16 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str18 = unpooledByteBufAllocator17.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator17.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator17.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric21 = unpooledByteBufAllocator17.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator25 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator25.directBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator25.heapBuffer(10);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator32 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean33 = unpooledByteBufAllocator32.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel34 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator32, fileChannel34, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator25, fileChannel34, (int) ' ');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator17, fileChannel34, (int) (byte) 10, (long) (short) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel34, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf45 = unpooledByteBufAllocator0.buffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str18, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric21);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(fileChannel34);
        org.junit.Assert.assertNotNull(byteBuf45);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.ioBuffer(10, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf40 = unpooledByteBufAllocator0.ioBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
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
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf42);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        long long10 = bufferedChannel9.size();
        long long11 = bufferedChannel9.position();
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        long long23 = bufferedChannel22.size();
        bufferedChannel22.flushAndForceWrite(false);
        bufferedChannel22.close();
        long long27 = bufferedChannel22.getFileChannelPosition();
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copyFloat((float) 0L);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf29);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf30);
        int int33 = bufferedChannel22.read(byteBuf31, 22L);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 52, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator0.compositeDirectBuffer((int) ' ');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator19 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator19.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator19.ioBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator22 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator22.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator22.ioBuffer();
        int int28 = unpooledByteBufAllocator22.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator22.buffer();
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator22.ioBuffer((int) '#');
        boolean boolean32 = unpooledByteBufAllocator22.isDirectBufferPooled();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator36 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean37 = unpooledByteBufAllocator36.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel38 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator36, fileChannel38, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator22, fileChannel38, (int) '4', (long) ' ');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator19, fileChannel38, (int) '4', (int) (byte) 1, (long) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel50 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel38, (int) ' ');
        bufferedChannel50.clear();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator22);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(fileChannel38);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
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
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray11 = new byte[][] { byteArray10 };
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray11);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray11);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray11);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray11);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteArray11);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteArray11);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteArray11);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteArray11);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer(64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
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
        bufferedChannel80.flushAndForceWriteIfRegularFlush(true);
        long long84 = bufferedChannel80.forceWrite(true);
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
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        int[] intArray5 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.EMPTY_BUFFER;
        io.netty.buffer.ByteBuf[] byteBufArray8 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf7 };
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray8);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf15);
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
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int[] intArray6 = new int[] { (byte) 10, (-1), (short) -1, (short) 1, (-1), 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        java.lang.Class<?> wildcardClass12 = byteBuf11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, (-1), (-1), 1, (-1), 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        int int25 = unpooledByteBufAllocator0.calculateNewCapacity((int) (short) 100, 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf29 = unpooledByteBufAllocator27.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator31 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator31.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator31.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel36 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator31, fileChannel36, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel36, (int) (byte) 0, (int) '#', (long) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel36, (int) (byte) 1, (long) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf48 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf50 = unpooledByteBufAllocator0.buffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf51 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf52 = unpooledByteBufAllocator0.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int55 = unpooledByteBufAllocator0.calculateNewCapacity((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 0 (expected: not greater than maxCapacity(-1)");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(compositeByteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator31);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(fileChannel36);
        org.junit.Assert.assertNotNull(compositeByteBuf48);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertNotNull(compositeByteBuf51);
        org.junit.Assert.assertNotNull(byteBuf52);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeBuffer();
        boolean boolean14 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator0.compositeDirectBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator4 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator4.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator4.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator4.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator4.heapBuffer();
        java.lang.String str10 = unpooledByteBufAllocator4.toString();
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator4, fileChannel25, (int) (byte) 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel25, (int) (byte) 10, (long) 64);
        io.netty.buffer.ByteBuf byteBuf40 = unpooledByteBufAllocator0.buffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(fileChannel25);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf42);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        double[] doubleArray0 = new double[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble(doubleArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copyDouble(doubleArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyDouble(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator36 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator36.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf39 = unpooledByteBufAllocator36.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf40 = unpooledByteBufAllocator36.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf41 = unpooledByteBufAllocator36.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf44 = unpooledByteBufAllocator36.ioBuffer(1, (int) (short) 100);
        java.lang.String str45 = unpooledByteBufAllocator36.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf46 = unpooledByteBufAllocator36.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator50 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean51 = unpooledByteBufAllocator50.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel52 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel55 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator50, fileChannel52, 0, (long) '4');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator36, fileChannel52, (int) (byte) 0, (long) (byte) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel52, (int) '#', (long) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric62 = unpooledByteBufAllocator0.metric();
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
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator36);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(compositeByteBuf41);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str45, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(fileChannel52);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric62);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) ' ', (int) ' ');
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        org.junit.Assert.assertNotNull(byteBufferArray2);
        org.junit.Assert.assertArrayEquals(byteBufferArray2, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel11 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel11, 1, (long) (byte) 0);
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray18);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray18);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteArray18);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray18);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteArray18);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray18);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copiedBuffer(byteArray18);
        bufferedChannel14.write(byteBuf25);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator27.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator27.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator27.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator27.ioBuffer(1, (int) (short) 100);
        java.lang.String str36 = unpooledByteBufAllocator27.toString();
        io.netty.buffer.ByteBuf byteBuf38 = unpooledByteBufAllocator27.buffer((int) (short) 0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric39 = unpooledByteBufAllocator27.metric();
        io.netty.buffer.ByteBuf byteBuf41 = unpooledByteBufAllocator27.buffer(64);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = bufferedChannel14.read(byteBuf41, (-1L), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=100)");
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
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str36, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric39);
        org.junit.Assert.assertNotNull(byteBuf41);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.directBuffer((int) (short) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.buffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, 1, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        java.lang.String str1 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer(100);
        boolean boolean9 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, false);
        boolean boolean14 = unpooledByteBufAllocator13.isDirectBufferPooled();
        java.nio.channels.FileChannel fileChannel15 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator13, fileChannel15, 0, (long) '4');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator19 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator19.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator19.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator19.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator19.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator19.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator19.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator29 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator29.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator29.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel34 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator29, fileChannel34, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator19, fileChannel34, (int) 'a', (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator13, fileChannel34, 1, 1L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel34, 4, (int) (short) 0, (long) 0);
        long long49 = bufferedChannel48.size();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str1, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator19);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator29);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(fileChannel34);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.flushAndForceWriteIfRegularFlush(true);
        bufferedChannel9.close();
        bufferedChannel9.close();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator6 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator6.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator6.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator10.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator10.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel15 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel15, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel15, (int) (byte) 0, (int) '#', (long) 0);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator27.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.ioBuffer();
        int int33 = unpooledByteBufAllocator27.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator27.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator27.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator27.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel38 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel38, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel38, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator6, fileChannel38, (int) (short) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, fileChannel38, 1, 1, (long) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf52 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf53 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf55 = unpooledByteBufAllocator1.directBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf56 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf57 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(fileChannel15);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(fileChannel38);
        org.junit.Assert.assertNotNull(compositeByteBuf52);
        org.junit.Assert.assertNotNull(compositeByteBuf53);
        org.junit.Assert.assertNotNull(byteBuf55);
        org.junit.Assert.assertNotNull(byteBuf56);
        org.junit.Assert.assertNotNull(byteBuf57);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.directBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer(64);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.heapBuffer(10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer((int) (short) 0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.buffer((int) (short) 1, 64);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator18.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator20.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator20.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator20.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator20.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator20.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator29 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator30 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator30.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator30.ioBuffer();
        int int36 = unpooledByteBufAllocator30.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator30.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf38 = unpooledByteBufAllocator30.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf40 = unpooledByteBufAllocator30.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel41 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator30, fileChannel41, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator29, fileChannel41, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel52 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator20, fileChannel41, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator18, fileChannel41, (int) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel41, 32);
        io.netty.buffer.ByteBuf byteBuf58 = unpooledByteBufAllocator0.ioBuffer(100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator30);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(compositeByteBuf38);
        org.junit.Assert.assertNotNull(compositeByteBuf40);
        org.junit.Assert.assertNotNull(fileChannel41);
        org.junit.Assert.assertNotNull(byteBuf58);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray4);
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
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator1.directBuffer(1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(0, (int) (byte) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel11 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel11, 1, (long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator0.compositeDirectBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric20 = unpooledByteBufAllocator0.metric();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(fileChannel11);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric20);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        boolean boolean23 = unpooledByteBufAllocator0.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator0.heapBuffer(4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 4 (expected: not greater than maxCapacity(-1)");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer(1, (int) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.buffer((int) (short) 0);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.buffer((int) (short) 1, 64);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator18.compositeBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator20.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator20.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator20.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator20.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator20.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator29 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator30 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator30.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator30.ioBuffer();
        int int36 = unpooledByteBufAllocator30.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator30.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf38 = unpooledByteBufAllocator30.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf40 = unpooledByteBufAllocator30.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel41 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator30, fileChannel41, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator29, fileChannel41, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel52 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator20, fileChannel41, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator18, fileChannel41, (int) (byte) 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel41, 32);
        io.netty.buffer.CompositeByteBuf compositeByteBuf58 = unpooledByteBufAllocator0.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf59 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf61 = unpooledByteBufAllocator0.ioBuffer(10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator30);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(compositeByteBuf38);
        org.junit.Assert.assertNotNull(compositeByteBuf40);
        org.junit.Assert.assertNotNull(fileChannel41);
        org.junit.Assert.assertNotNull(compositeByteBuf58);
        org.junit.Assert.assertNotNull(byteBuf59);
        org.junit.Assert.assertNotNull(byteBuf61);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 3, cap: 3/3).slice(0, 100)");
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
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        bufferedChannel22.clear();
        long long24 = bufferedChannel22.getFileChannelPosition();
        bufferedChannel22.clear();
        int int26 = bufferedChannel22.getNumOfBytesInWriteBuffer();
        bufferedChannel22.flush();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator14.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator14.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator14.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator14.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator14.buffer();
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
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator14, fileChannel35, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel35, 64, (long) (short) -1);
        bufferedChannel49.clear();
        bufferedChannel49.clear();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator52 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf54 = unpooledByteBufAllocator52.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf55 = unpooledByteBufAllocator52.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf57 = unpooledByteBufAllocator52.heapBuffer((int) (byte) 10);
        int int60 = bufferedChannel49.read(byteBuf57, (long) 10, (int) (short) 0);
        int[] intArray64 = new int[] { (short) 1, 'a', 'a' };
        io.netty.buffer.ByteBuf byteBuf65 = io.netty.buffer.Unpooled.copyInt(intArray64);
        io.netty.buffer.ByteBuf byteBuf66 = io.netty.buffer.Unpooled.copyShort(intArray64);
        io.netty.buffer.ByteBuf byteBuf67 = io.netty.buffer.Unpooled.copyMedium(intArray64);
        io.netty.buffer.ByteBuf byteBuf68 = io.netty.buffer.Unpooled.copyMedium(intArray64);
        io.netty.buffer.ByteBuf byteBuf69 = io.netty.buffer.Unpooled.copyInt(intArray64);
        io.netty.buffer.ByteBuf byteBuf70 = io.netty.buffer.Unpooled.copyMedium(intArray64);
        io.netty.buffer.ByteBuf byteBuf71 = io.netty.buffer.Unpooled.copyMedium(intArray64);
        io.netty.buffer.ByteBuf byteBuf72 = io.netty.buffer.Unpooled.copyShort(intArray64);
        // The following exception was thrown during execution in test generation
        try {
            int int75 = bufferedChannel49.read(byteBuf72, (long) 0, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: dest buffer remaining capacity is not enough(must be at least as \"length\"=64)");
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
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(fileChannel35);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator52);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertNotNull(byteBuf55);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 1, 97, 97 });
        org.junit.Assert.assertNotNull(byteBuf65);
        org.junit.Assert.assertNotNull(byteBuf66);
        org.junit.Assert.assertNotNull(byteBuf67);
        org.junit.Assert.assertNotNull(byteBuf68);
        org.junit.Assert.assertNotNull(byteBuf69);
        org.junit.Assert.assertNotNull(byteBuf70);
        org.junit.Assert.assertNotNull(byteBuf71);
        org.junit.Assert.assertNotNull(byteBuf72);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeBuffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator10 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator10.heapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator12 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator12.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator12.ioBuffer();
        int int18 = unpooledByteBufAllocator12.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator12.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric20 = unpooledByteBufAllocator12.metric();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator12.ioBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator12.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator24 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator24.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator24.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator24.buffer((int) (byte) 1, (int) '4');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric31 = unpooledByteBufAllocator24.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator32 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf34 = unpooledByteBufAllocator32.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf35 = unpooledByteBufAllocator32.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf36 = unpooledByteBufAllocator32.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator32.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf40 = unpooledByteBufAllocator32.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf41 = unpooledByteBufAllocator32.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator42 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf44 = unpooledByteBufAllocator42.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf46 = unpooledByteBufAllocator42.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel47 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator42, fileChannel47, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel54 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator32, fileChannel47, (int) 'a', (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel57 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator24, fileChannel47, (int) (short) 100, (long) (short) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel59 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator12, fileChannel47, 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator10, fileChannel47, 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel64 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel47, 52, (long) (byte) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric31);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator32);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(compositeByteBuf41);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator42);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(fileChannel47);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
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
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray5);
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
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 };
        byte[][] byteArray9 = new byte[][] { byteArray8 };
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray9);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray9);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
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
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 };
        byte[][] byteArray35 = new byte[][] { byteArray6, byteArray13, byteArray20, byteArray27, byteArray34 };
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.copiedBuffer(byteArray35);
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray35);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.copiedBuffer(byteArray35);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flushAndForceWrite(false);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWrite(true);
        bufferedChannel9.flushAndForceWrite(true);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator18.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator18.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator18.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf23 = unpooledByteBufAllocator18.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator18.ioBuffer(1, (int) (short) 100);
        java.lang.String str27 = unpooledByteBufAllocator18.toString();
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator18.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator18.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator18.ioBuffer();
        bufferedChannel9.write(byteBuf30);
        long long33 = bufferedChannel9.forceWrite(true);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf23);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str27, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3, (int) (byte) -1, 0);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray3, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 101 out of bounds for byte[3]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.nio.ByteBuffer[] byteBufferArray4 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufferArray4);
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
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer((int) (byte) 1, (int) '4');
        java.lang.String str7 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator0.metric();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator3.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator17.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator17.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator17.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator17.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator17.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator27.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.ioBuffer();
        int int33 = unpooledByteBufAllocator27.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator27.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator27.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator27.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel38 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel38, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel38, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator17, fileChannel38, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel52 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel38, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel38, (int) '#', 100, (long) 64);
        int int57 = bufferedChannel56.getNumOfBytesInWriteBuffer();
        long long59 = bufferedChannel56.forceWrite(false);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(fileChannel38);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        int[] intArray4 = new int[] { 0, (-1), 100, (short) -1 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, (-1), 100, (-1) });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator3.metric();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.buffer((int) (short) 10);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel5 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel5, (int) (short) 1, (int) 'a', 0L);
        bufferedChannel9.flush();
        bufferedChannel9.clear();
        bufferedChannel9.flush();
        int int13 = bufferedChannel9.getNumOfBytesInWriteBuffer();
        bufferedChannel9.flush();
        bufferedChannel9.flushAndForceWriteIfRegularFlush(false);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(fileChannel5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        java.lang.String str6 = unpooledByteBufAllocator0.toString();
        java.lang.String str7 = unpooledByteBufAllocator0.toString();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str7, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.ioBuffer();
        int int9 = unpooledByteBufAllocator3.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator3.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator3.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator17.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator17.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator17.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator17.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator17.buffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator26 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator27.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.ioBuffer();
        int int33 = unpooledByteBufAllocator27.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf34 = unpooledByteBufAllocator27.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = unpooledByteBufAllocator27.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf37 = unpooledByteBufAllocator27.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel38 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, fileChannel38, 1, (long) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator26, fileChannel38, 100, (int) (short) 0, (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator17, fileChannel38, (int) (byte) 10, 100, (long) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel52 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, fileChannel38, 64, (long) (short) -1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel38, (int) '#', 100, (long) 64);
        io.netty.buffer.ByteBuf byteBuf58 = unpooledByteBufAllocator0.buffer(64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf60 = unpooledByteBufAllocator0.compositeDirectBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf62 = unpooledByteBufAllocator0.compositeDirectBuffer(52);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(compositeByteBuf37);
        org.junit.Assert.assertNotNull(fileChannel38);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(compositeByteBuf60);
        org.junit.Assert.assertNotNull(compositeByteBuf62);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.directBuffer(100);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10, (int) 'a');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator18.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator18.ioBuffer();
        int int24 = unpooledByteBufAllocator18.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator18.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator18.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator18.compositeBuffer(100);
        java.nio.channels.FileChannel fileChannel29 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator18, fileChannel29, 1, (long) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf34 = unpooledByteBufAllocator18.ioBuffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator18.compositeHeapBuffer((int) (byte) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator37 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf39 = unpooledByteBufAllocator37.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf40 = unpooledByteBufAllocator37.ioBuffer();
        int int43 = unpooledByteBufAllocator37.calculateNewCapacity(0, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf44 = unpooledByteBufAllocator37.buffer();
        io.netty.buffer.ByteBuf byteBuf46 = unpooledByteBufAllocator37.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf47 = unpooledByteBufAllocator37.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf48 = unpooledByteBufAllocator37.buffer();
        io.netty.buffer.ByteBuf byteBuf50 = unpooledByteBufAllocator37.ioBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf51 = unpooledByteBufAllocator37.compositeDirectBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator52 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf54 = unpooledByteBufAllocator52.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf55 = unpooledByteBufAllocator52.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf58 = unpooledByteBufAllocator52.buffer((int) (byte) 1, (int) '4');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric59 = unpooledByteBufAllocator52.metric();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator60 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf62 = unpooledByteBufAllocator60.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf63 = unpooledByteBufAllocator60.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf64 = unpooledByteBufAllocator60.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf65 = unpooledByteBufAllocator60.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf68 = unpooledByteBufAllocator60.ioBuffer(1, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf69 = unpooledByteBufAllocator60.compositeHeapBuffer();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator70 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf72 = unpooledByteBufAllocator70.buffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf74 = unpooledByteBufAllocator70.ioBuffer(10);
        java.nio.channels.FileChannel fileChannel75 = org.apache.bookkeeper.generated.Support.rwTempChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel79 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator70, fileChannel75, (int) (short) 1, (int) 'a', 0L);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel82 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator60, fileChannel75, (int) 'a', (long) (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel85 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator52, fileChannel75, (int) (short) 100, (long) (short) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel87 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator37, fileChannel75, 64);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel90 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator18, fileChannel75, (int) (byte) 0, (long) 52);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel94 = new org.apache.bookkeeper.bookie.BufferedChannel((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, fileChannel75, 64, (int) (short) 10, (long) (byte) 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(fileChannel29);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator37);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(compositeByteBuf47);
        org.junit.Assert.assertNotNull(byteBuf48);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertNotNull(compositeByteBuf51);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator52);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertNotNull(byteBuf55);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric59);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator60);
        org.junit.Assert.assertNotNull(byteBuf62);
        org.junit.Assert.assertNotNull(byteBuf63);
        org.junit.Assert.assertNotNull(byteBuf64);
        org.junit.Assert.assertNotNull(compositeByteBuf65);
        org.junit.Assert.assertNotNull(byteBuf68);
        org.junit.Assert.assertNotNull(compositeByteBuf69);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator70);
        org.junit.Assert.assertNotNull(byteBuf72);
        org.junit.Assert.assertNotNull(byteBuf74);
        org.junit.Assert.assertNotNull(fileChannel75);
    }
}

