package org.apache.bookkeeper.generated.wc;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer(10);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf3);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        java.lang.String str5 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        io.netty.buffer.ByteBuf byteBuf18 = writeCache4.getLastEntry((long) 1);
        writeCache4.deleteLedger(1L);
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.generated.Support.filledBuf((int) (short) 100, (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = writeCache4.put((long) (-1), (long) 35, byteBuf26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer(64);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        boolean boolean8 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.directBuffer((int) ' ');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        long long10 = writeCache4.count();
        writeCache4.clear();
        writeCache4.clear();
        writeCache4.clear();
        long long14 = writeCache4.count();
        long long15 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(false);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache3 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer(64, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator2.ioBuffer();
        boolean boolean4 = unpooledByteBufAllocator2.isDirectBufferPooled();
        boolean boolean5 = unpooledByteBufAllocator2.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.directBuffer((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf9);
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean11 = writeCache4.hasEntry((long) 0, (long) 100);
        writeCache4.clear();
        writeCache4.close();
        io.netty.buffer.ByteBuf byteBuf16 = writeCache4.get((long) 100, (long) (-1));
        long long17 = writeCache4.count();
        boolean boolean18 = writeCache4.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuf16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        boolean boolean11 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.heapBuffer((int) (short) -1);
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
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf8);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        long long6 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer((int) (byte) 0, 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer();
        java.lang.Class<?> wildcardClass14 = byteBuf13.getClass();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) '#', 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf13);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        long long8 = writeCache4.size();
        boolean boolean11 = writeCache4.hasEntry((long) ' ', (long) '#');
        boolean boolean14 = writeCache4.hasEntry((long) (byte) 10, (long) (byte) 10);
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf17 = writeCache4.getLastEntry((long) (short) 100);
        boolean boolean18 = writeCache4.isEmpty();
        long long19 = writeCache4.count();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator23 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator23.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator23.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator23.heapBuffer((int) (byte) 1);
        java.lang.String str28 = unpooledByteBufAllocator23.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric29 = unpooledByteBufAllocator23.metric();
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator23.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator23.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator23.heapBuffer();
        boolean boolean33 = writeCache4.put(100L, (long) '#', byteBuf32);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(byteBuf17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str28, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric29);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) 10, 64, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        short[] shortArray6 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray14 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(shortArray14);
        io.netty.buffer.ByteBuf[] byteBufArray16 = new io.netty.buffer.ByteBuf[] { byteBuf7, byteBuf9, byteBuf15 };
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufArray16);
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
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        long long6 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf8 = writeCache4.getLastEntry(100L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf8);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        boolean boolean17 = writeCache12.hasEntry((long) 52, (long) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 1, 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) 64, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = writeCache13.get((long) (-1), (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(52);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer(1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.directBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator3.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator3.directBuffer(35, 52);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator3.directBuffer((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        writeCache4.deleteLedger((long) (byte) 10);
        boolean boolean11 = writeCache4.isEmpty();
        long long12 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        writeCache4.close();
        boolean boolean11 = writeCache4.hasEntry((long) (short) 1, (long) (short) 10);
        boolean boolean12 = writeCache4.isEmpty();
        boolean boolean15 = writeCache4.hasEntry((long) '#', (long) (byte) 1);
        long long16 = writeCache4.count();
        long long17 = writeCache4.count();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        byte[] byteArray2 = new byte[] {};
        byte[] byteArray3 = new byte[] {};
        byte[] byteArray4 = new byte[] {};
        byte[] byteArray5 = new byte[] {};
        byte[] byteArray6 = new byte[] {};
        byte[][] byteArray7 = new byte[][] { byteArray2, byteArray3, byteArray4, byteArray5, byteArray6 };
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteArray7);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteArray7);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray7);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.nio.ByteBuffer[] byteBufferArray1 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf7);
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
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer(52);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer(0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.buffer((int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', (long) (short) 100);
        writeCache4.deleteLedger((long) 'a');
        writeCache4.deleteLedger((long) (byte) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        java.lang.String str16 = unpooledByteBufAllocator1.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.heapBuffer((-1));
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str16, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry(1L, (long) 100);
        boolean boolean9 = writeCache4.isEmpty();
        boolean boolean12 = writeCache4.hasEntry((long) 1, 0L);
        writeCache4.clear();
        boolean boolean14 = writeCache4.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        long[] longArray0 = new long[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyLong(longArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copyLong(longArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copyLong(longArray0);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyLong(longArray0);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyLong(longArray0);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyLong(longArray0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyLong(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertArrayEquals(longArray0, new long[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray16);
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
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf21);
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
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.clear();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.get((long) '#', (-1L));
        boolean boolean16 = writeCache4.hasEntry(100L, 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer(10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[4]");
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
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyMedium((int) (byte) -1);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, 64, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 65 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 10 });
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.directBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric10 = unpooledByteBufAllocator1.metric();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric10);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric3 = unpooledByteBufAllocator2.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator2.metric();
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric3);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        writeCache4.clear();
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
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 64, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(64, 52)");
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
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer(64);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, 0L);
        boolean boolean5 = writeCache4.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
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
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric3 = unpooledByteBufAllocator2.metric();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.buffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.ioBuffer((int) (short) 0);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 10);
        long long9 = writeCache8.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        writeCache4.close();
        // The following exception was thrown during execution in test generation
        try {
            writeCache4.deleteLedger((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(0);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer((int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
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
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(0, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(52);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric10 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric10);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(97, 35)");
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
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf9);
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
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(false);
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer(52);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.directBuffer(52);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer((int) '#');
        int int18 = unpooledByteBufAllocator1.calculateNewCapacity(1, (int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = unpooledByteBufAllocator1.calculateNewCapacity((int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 52 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        boolean boolean10 = writeCache4.hasEntry((long) (short) 0, (long) '#');
        long long11 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache4.get((long) 35, 4L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator20 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator20.heapBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator20.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator20.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = writeCache4.put((long) (-1), (long) (short) -1, (io.netty.buffer.ByteBuf) compositeByteBuf24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        boolean boolean10 = writeCache4.hasEntry((long) (short) 0, (long) '#');
        boolean boolean13 = writeCache4.hasEntry(1L, 10L);
        long long14 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer(10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufArray15);
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
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
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
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.directBuffer(32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(-1)");
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
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        io.netty.buffer.ByteBuf byteBuf0 = io.netty.buffer.Unpooled.directBuffer();
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        double[] doubleArray3 = new double[] { 1.0d, 'a', '#' };
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copyDouble(doubleArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyDouble(doubleArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyDouble(doubleArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyDouble(doubleArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 97.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.count();
        boolean boolean10 = writeCache4.isEmpty();
        java.lang.Class<?> wildcardClass11 = writeCache4.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) (byte) 100);
        long long8 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get((long) 100, (long) 64);
        boolean boolean14 = writeCache4.hasEntry((long) 100, (long) ' ');
        long long15 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeBuffer();
        boolean boolean6 = unpooledByteBufAllocator3.isDirectBufferPooled();
        boolean boolean7 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.directBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
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
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer(64);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unpooledByteBufAllocator0.calculateNewCapacity(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 64, (int) (byte) -1);
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
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer(32);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf23);
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
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(0);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer(10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
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
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.generated.Support.filledBuf((int) (short) -1, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.directBuffer((int) (byte) 1, 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        boolean boolean8 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.buffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        java.lang.String str19 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.directBuffer();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str19, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 35, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 64, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(64, 32)");
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
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer(64, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0, 64);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator23 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf26 = unpooledByteBufAllocator23.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator23.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf29 = unpooledByteBufAllocator23.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf31 = unpooledByteBufAllocator23.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator23.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf33 = unpooledByteBufAllocator23.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf35 = io.netty.buffer.Unpooled.compositeBuffer((int) (byte) 10);
        short[] shortArray40 = new short[] { (byte) 10, (short) 0, (short) 10, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf41 = io.netty.buffer.Unpooled.copyShort(shortArray40);
        io.netty.buffer.ByteBuf byteBuf42 = io.netty.buffer.Unpooled.copyShort(shortArray40);
        java.nio.ByteBuffer[] byteBufferArray47 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf48 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray47);
        io.netty.buffer.ByteBuf byteBuf49 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray47);
        io.netty.buffer.ByteBuf byteBuf50 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray47);
        io.netty.buffer.ByteBuf byteBuf51 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufferArray47);
        io.netty.buffer.ByteBuf byteBuf52 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray47);
        io.netty.buffer.ByteBuf[] byteBufArray53 = new io.netty.buffer.ByteBuf[] { byteBuf21, byteBuf33, compositeByteBuf35, byteBuf42, byteBuf52 };
        io.netty.buffer.ByteBuf byteBuf54 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray53);
        io.netty.buffer.ByteBuf byteBuf55 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray53);
        io.netty.buffer.ByteBuf byteBuf56 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray53);
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
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(compositeByteBuf35);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] { (short) 10, (short) 0, (short) 10, (short) 10 });
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBufferArray47);
        org.junit.Assert.assertArrayEquals(byteBufferArray47, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf48);
        org.junit.Assert.assertNotNull(byteBuf49);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertNotNull(byteBufArray53);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertNotNull(byteBuf55);
        org.junit.Assert.assertNotNull(byteBuf56);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = writeCache8.get((-1L), (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unpooledByteBufAllocator0.calculateNewCapacity((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 32 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        byte[] byteArray0 = new byte[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray0, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 10L);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
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
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteArray21);
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
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) 52);
        java.lang.String str10 = unpooledByteBufAllocator2.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator2.compositeBuffer();
        boolean boolean12 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator2.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator2.compositeHeapBuffer();
        java.lang.String str15 = unpooledByteBufAllocator2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str15, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf9);
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
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 53 out of bounds for byte[1]");
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
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        boolean boolean30 = writeCache4.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.heapBuffer((int) '#');
        java.lang.String str6 = unpooledByteBufAllocator2.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator2.compositeDirectBuffer((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf8);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer();
        java.lang.Class<?> wildcardClass14 = compositeByteBuf13.getClass();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.buffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.buffer((int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        int int7 = unpooledByteBufAllocator0.calculateNewCapacity(0, (int) (short) 100);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        writeCache4.close();
        boolean boolean11 = writeCache4.hasEntry((long) (short) 1, (long) (short) 10);
        boolean boolean12 = writeCache4.isEmpty();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator16.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator16.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator16.ioBuffer(1);
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator16.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator16.compositeDirectBuffer((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = writeCache4.put((long) (short) 1, (-1L), (io.netty.buffer.ByteBuf) compositeByteBuf26);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        long long6 = writeCache4.size();
        long long7 = writeCache4.count();
        writeCache4.close();
        boolean boolean11 = writeCache4.hasEntry((long) 100, (long) 'a');
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator15 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator15.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric19 = unpooledByteBufAllocator15.metric();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator15.directBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = writeCache4.put((long) (short) 1, (long) 64, byteBuf22);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric19);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray24);
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
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        long long10 = writeCache4.count();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf14 = writeCache4.get((long) (short) 0, 1L);
        long long15 = writeCache4.count();
        boolean boolean16 = writeCache4.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) 1, 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer((int) (byte) 1, 1);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1, (int) '4');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer(35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((double) 1.0f);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer();
        int int16 = unpooledByteBufAllocator1.calculateNewCapacity(32, 52);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator0.metric();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.directBuffer(32);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator0.compositeDirectBuffer((int) ' ');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.ioBuffer(100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (byte) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100, 1);
        writeCache12.clear();
        boolean boolean14 = writeCache12.isEmpty();
        writeCache12.clear();
        writeCache12.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteArray23);
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
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) '#');
        long long7 = writeCache6.size();
        boolean boolean8 = writeCache6.isEmpty();
        long long9 = writeCache6.count();
        boolean boolean12 = writeCache6.hasEntry((long) (byte) 100, 1L);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer(0);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator1.compositeDirectBuffer((int) ' ');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer(35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufArray16);
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
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.nio.ByteBuffer[] byteBufferArray1 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufferArray1);
        org.junit.Assert.assertArrayEquals(byteBufferArray1, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer((int) (byte) 10, (int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) -1, 100);
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
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 32 out of bounds for byte[1]");
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
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer(100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) ' ', (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.ByteBuf byteBuf10 = writeCache7.get((long) (byte) 10, (long) (short) 0);
        io.netty.buffer.ByteBuf byteBuf13 = writeCache7.get((long) (byte) 0, (long) (short) 10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf24);
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
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, (int) (short) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 53 out of bounds for byte[4]");
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
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.heapBuffer((int) '4');
        boolean boolean9 = unpooledByteBufAllocator0.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 0 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) 1, (int) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        long long8 = writeCache4.size();
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) 10, (long) 0);
        boolean boolean15 = writeCache4.hasEntry((long) 'a', 10L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray6);
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
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufferArray5);
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
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, (int) (byte) 100, 0);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf16);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 52);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer((int) (byte) 0, 52);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache19 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 32, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf22 = writeCache19.get(0L, (long) 32);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNull(byteBuf22);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 62 out of bounds for byte[1]");
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
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer(52);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.ioBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
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
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeDirectBuffer();
        java.lang.String str4 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str4, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf5);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf27);
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
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 100);
        long long5 = writeCache4.count();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer(64);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.ioBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator2.compositeHeapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator2.compositeDirectBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator2.directBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator2.directBuffer((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeHeapBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.nio.ByteBuffer[] byteBufferArray0 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf2);
        java.lang.Class<?> wildcardClass4 = byteBuf2.getClass();
        org.junit.Assert.assertNotNull(byteBufferArray0);
        org.junit.Assert.assertArrayEquals(byteBufferArray0, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache15 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 1, (int) 'a');
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
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 164 out of bounds for byte[1]");
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
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0, 64);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(64, (int) 'a');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 35);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) 52);
        java.lang.String str10 = unpooledByteBufAllocator2.toString();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((int) ' ', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf10);
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
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = unpooledByteBufAllocator1.calculateNewCapacity((int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity : -1 (expected: >= 0)");
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
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf23);
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
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) 'a', 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.buffer((int) 'a', 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator2.directBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator2.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.ioBuffer(35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(52, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer(0, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache15 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (-1L), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.count();
        writeCache4.close();
        boolean boolean14 = writeCache4.hasEntry((long) (byte) 100, (long) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric15 = unpooledByteBufAllocator1.metric();
        java.lang.String str16 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str16, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.heapBuffer(35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(4L, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator2.directBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.directBuffer((int) (short) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator2.compositeBuffer(52);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.buffer();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unpooledByteBufAllocator0.calculateNewCapacity((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.buffer((int) (byte) 10, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator2.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator2.ioBuffer((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(52);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 1);
        boolean boolean16 = writeCache13.hasEntry((long) 0, (long) (-1));
        boolean boolean19 = writeCache13.hasEntry((long) '#', (long) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(1, 35);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray17);
        java.lang.Class<?> wildcardClass24 = byteBuf23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0, 64);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyDouble((-1.0d));
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        int int14 = unpooledByteBufAllocator1.calculateNewCapacity(0, 1);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyInt(intArray6);
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
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray23 = new byte[][] { byteArray6, byteArray10, byteArray14, byteArray18, byteArray22 };
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copiedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteArray23);
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
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        java.lang.Class<?> wildcardClass24 = writeCache4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray24 = new byte[][] { byteArray7, byteArray11, byteArray15, byteArray19, byteArray23 };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray24);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray24);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray24);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
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
        org.junit.Assert.assertNotNull(byteBuf33);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, true);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator2.ioBuffer();
        boolean boolean4 = unpooledByteBufAllocator2.isDirectBufferPooled();
        boolean boolean5 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator2.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
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
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray16);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray16);
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
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufArray21);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufArray21);
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
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 0, 1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(32, 97)");
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
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator2.compositeBuffer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '#');
        java.lang.String str5 = unpooledByteBufAllocator1.toString();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: false)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: false)");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        long long8 = writeCache4.size();
        boolean boolean9 = writeCache4.isEmpty();
        long long10 = writeCache4.count();
        writeCache4.close();
        writeCache4.deleteLedger((long) '4');
        long long14 = writeCache4.size();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        writeCache8.deleteLedger((long) ' ');
        writeCache8.close();
        long long12 = writeCache8.count();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 4, cap: 4/4).slice(52, 10)");
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
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(64);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer(0);
        java.lang.Class<?> wildcardClass14 = byteBuf13.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator2.compositeHeapBuffer(52);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache6 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) (byte) 10);
        long long7 = writeCache6.size();
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, false);
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 52, 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator3.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf4);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 0, (int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.heapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        boolean boolean4 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator3.compositeBuffer();
        boolean boolean6 = unpooledByteBufAllocator3.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator3.compositeDirectBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
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
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
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
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer((int) (byte) 0, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.ioBuffer(1);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric6 = unpooledByteBufAllocator2.metric();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.ioBuffer((int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric6);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.buffer((int) (byte) 10, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator2.ioBuffer((int) (short) 1, (int) '4');
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator2.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache20 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, (long) (byte) 0, 64);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer();
        boolean boolean8 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
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
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray50 = new byte[][] { byteArray33, byteArray37, byteArray41, byteArray45, byteArray49 };
        io.netty.buffer.ByteBuf byteBuf51 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray50);
        io.netty.buffer.ByteBuf byteBuf52 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray50);
        io.netty.buffer.ByteBuf byteBuf53 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray50);
        io.netty.buffer.ByteBuf byteBuf54 = io.netty.buffer.Unpooled.copiedBuffer(byteArray50);
        io.netty.buffer.ByteBuf byteBuf55 = io.netty.buffer.Unpooled.copiedBuffer(byteArray50);
        io.netty.buffer.ByteBuf byteBuf56 = io.netty.buffer.Unpooled.copiedBuffer(byteArray50);
        io.netty.buffer.ByteBuf byteBuf57 = io.netty.buffer.Unpooled.copiedBuffer(byteArray50);
        io.netty.buffer.ByteBuf byteBuf58 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray50);
        io.netty.buffer.ByteBuf byteBuf59 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteArray50);
        boolean boolean60 = writeCache4.put((long) (short) 10, (long) (byte) 1, byteBuf59);
        java.lang.Class<?> wildcardClass61 = writeCache4.getClass();
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
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 10, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertNotNull(byteBuf55);
        org.junit.Assert.assertNotNull(byteBuf56);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(byteBuf59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache20 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
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
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
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
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        int[] intArray6 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray6);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray6);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copyShort(intArray6);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copyInt(intArray6);
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
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get((long) (byte) 0, (long) (short) 0);
        java.nio.ByteBuffer[] byteBufferArray16 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray16);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteBufferArray16);
        boolean boolean19 = writeCache4.put((long) (short) 10, (long) (short) 1, byteBuf18);
        writeCache4.clear();
        long long21 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBufferArray16);
        org.junit.Assert.assertArrayEquals(byteBufferArray16, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) ' ');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        // The following exception was thrown during execution in test generation
        try {
            writeCache4.deleteLedger((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 64, 35, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        writeCache4.deleteLedger((long) 52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = writeCache4.hasEntry((long) (-1), (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) -1, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, (int) (byte) 100, 0);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 33 out of bounds for byte[4]");
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
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) (byte) 100);
        long long8 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf11 = writeCache4.get((long) 100, (long) 64);
        boolean boolean14 = writeCache4.hasEntry((long) 100, (long) ' ');
        long long15 = writeCache4.count();
        writeCache4.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        writeCache9.deleteLedger((long) '4');
        writeCache9.close();
        io.netty.buffer.ByteBuf byteBuf15 = writeCache9.get((long) (byte) 10, (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            writeCache9.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNull(byteBuf15);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer(100);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.buffer(0);
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.buffer((int) ' ');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.copyFloat((-1.0f));
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) ' ', 64);
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(1, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean9 = writeCache4.isEmpty();
        boolean boolean12 = writeCache4.hasEntry((long) 35, (long) (byte) 0);
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf16 = writeCache4.get((long) 1, 100L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteBuf16);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        boolean boolean13 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.buffer(10, (int) '#');
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.buffer(100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        writeCache4.close();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf10 = writeCache4.getLastEntry((long) '#');
        boolean boolean13 = writeCache4.hasEntry((long) 'a', 1L);
        long long14 = writeCache4.size();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator18 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf20 = unpooledByteBufAllocator18.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf22 = unpooledByteBufAllocator18.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator18.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator18.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator18.compositeHeapBuffer(52);
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator18.ioBuffer(35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = writeCache4.put(100L, (long) 'a', byteBuf28);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf20);
        org.junit.Assert.assertNotNull(compositeByteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache15 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (-1L), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator2.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator2.directBuffer((int) (short) 0, (int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator2.compositeBuffer();
        java.lang.String str15 = unpooledByteBufAllocator2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str15, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteBufferArray3);
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
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) 1, 32);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(0, 64);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator1.heapBuffer((int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf12);
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
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
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
        io.netty.buffer.ByteBuf byteBuf34 = writeCache4.getLastEntry((long) '4');
        long long35 = writeCache4.size();
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
        org.junit.Assert.assertNull(byteBuf34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) 100, 52, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        java.nio.ByteBuffer[] byteBufferArray2 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) -1, byteBufferArray2);
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
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer(64, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 64 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.getLastEntry((long) 100);
        boolean boolean12 = writeCache4.hasEntry(0L, 0L);
        boolean boolean13 = writeCache4.isEmpty();
        boolean boolean14 = writeCache4.isEmpty();
        writeCache4.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator3.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer(100, 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.heapBuffer(100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(64)");
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
        org.junit.Assert.assertNotNull(compositeByteBuf17);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.heapBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator2.compositeDirectBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator2.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf8);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = unpooledByteBufAllocator1.calculateNewCapacity(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 100 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(52, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray22);
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
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        io.netty.buffer.ByteBuf byteBuf1 = io.netty.buffer.Unpooled.buffer(32);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        short[] shortArray4 = new short[] { (byte) 10, (short) 0, (short) 10, (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(shortArray4);
        java.lang.Class<?> wildcardClass8 = byteBuf7.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 10, (short) 0, (short) 10, (short) 10 });
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(0, 10)");
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
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 200 out of bounds for byte[1]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (-1L), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
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
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache20 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 0L);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf23 = writeCache20.get((-1L), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
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
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        boolean boolean20 = writeCache4.hasEntry((long) ' ', 10L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (short) 10, 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 0);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copyShort(intArray4);
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
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        long long28 = writeCache4.count();
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric13 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache19 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 52, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
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
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
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
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator2.buffer((int) (byte) 10, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator2.directBuffer((int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator2.compositeHeapBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric17 = unpooledByteBufAllocator2.metric();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric17);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 2 out of bounds for byte[1]");
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
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator0.compositeBuffer((int) ' ');
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.directBuffer(32);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
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
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.ioBuffer(1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(0)");
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
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.size();
        writeCache4.clear();
        boolean boolean12 = writeCache4.isEmpty();
        long long13 = writeCache4.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.nio.ByteBuffer[] byteBufferArray5 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteBufferArray5);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteBufferArray5);
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
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator2.directBuffer(0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator2.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator2.directBuffer();
        java.lang.Class<?> wildcardClass12 = byteBuf11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.buffer(64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) '4', (int) 'a');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        long long11 = writeCache10.count();
        long long12 = writeCache10.count();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
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
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) 'a', (long) (short) 1);
        boolean boolean13 = writeCache4.isEmpty();
        boolean boolean16 = writeCache4.hasEntry((long) (byte) 100, (long) (byte) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(100);
        java.lang.String str6 = unpooledByteBufAllocator3.toString();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyShort(intArray4);
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
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        boolean boolean8 = unpooledByteBufAllocator0.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator0.directBuffer((int) (short) 0, (int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator0.heapBuffer(52);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer(10);
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
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray17);
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
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer((int) (byte) 0, 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) (byte) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeBuffer((int) '4');
        boolean boolean11 = unpooledByteBufAllocator0.isDirectBufferPooled();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        java.lang.Class<?> wildcardClass9 = byteBufferArray3.getClass();
        org.junit.Assert.assertNotNull(byteBufferArray3);
        org.junit.Assert.assertArrayEquals(byteBufferArray3, new java.nio.ByteBuffer[] {});
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 1);
        long long12 = writeCache11.size();
        writeCache11.deleteLedger((long) (byte) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeDirectBuffer(32);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        writeCache12.close();
        writeCache12.deleteLedger(0L);
        boolean boolean16 = writeCache12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            writeCache12.close();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0, decrement: 1");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = unpooledByteBufAllocator1.calculateNewCapacity(52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 52 (expected: not greater than maxCapacity(0)");
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
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric17);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        boolean boolean6 = unpooledByteBufAllocator0.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.heapBuffer((int) '#');
        java.lang.String str6 = unpooledByteBufAllocator2.toString();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.ioBuffer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeBuffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, false, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.buffer(100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.heapBuffer((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator3.buffer((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 10 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
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
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray23);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray23);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteArray23);
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
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator8 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator8.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator8.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.unreleasableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf13);
        boolean boolean15 = writeCache4.put((long) (byte) 1, (long) (short) 0, byteBuf14);
        io.netty.buffer.ByteBuf byteBuf18 = writeCache4.get((long) 64, (long) (short) -1);
        long long19 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(byteBuf18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache8 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        long long10 = writeCache4.size();
        writeCache4.clear();
        long long12 = writeCache4.count();
        boolean boolean15 = writeCache4.hasEntry((long) (short) 0, (long) 1);
        writeCache4.deleteLedger((long) 'a');
        boolean boolean20 = writeCache4.hasEntry((long) 10, (long) ' ');
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copiedBuffer(byteArray27, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copiedBuffer(byteArray27, 10, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray27);
        boolean boolean35 = writeCache4.put((long) '4', (long) 'a', byteBuf34);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(4L, (int) (short) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        long long10 = writeCache4.count();
        writeCache4.clear();
        writeCache4.clear();
        writeCache4.clear();
        long long14 = writeCache4.count();
        writeCache4.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric9 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.buffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.ioBuffer(10, 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.heapBuffer((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
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
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.count();
        float[] floatArray14 = new float[] { 0.0f, 10 };
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyFloat(floatArray14);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyFloat(floatArray14);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copyFloat(floatArray14);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf17);
        boolean boolean19 = writeCache4.put((long) (short) 100, 100L, byteBuf17);
        long long20 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 0.0f, 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5, 52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 5, cap: 5/5).slice(52, 32)");
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
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(0L, 32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 1 };
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 1 };
        byte[][] byteArray15 = new byte[][] { byteArray2, byteArray5, byteArray8, byteArray11, byteArray14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf18);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.buffer(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 0 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric8 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        boolean boolean14 = writeCache11.hasEntry((long) ' ', (long) 'a');
        io.netty.buffer.ByteBuf byteBuf16 = writeCache11.getLastEntry((long) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(byteBuf16);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
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
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray20);
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
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 10, (int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator2.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator2.heapBuffer((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.ByteBuf byteBuf12 = writeCache9.get(0L, (-1L));
        long long13 = writeCache9.count();
        writeCache9.close();
        writeCache9.clear();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator3.directBuffer();
        java.lang.String str5 = unpooledByteBufAllocator3.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator3.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.buffer((int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator3.compositeDirectBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[4]");
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
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        long long8 = writeCache4.size();
        boolean boolean9 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.get((long) 10, (long) 0);
        long long13 = writeCache4.size();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator17 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator17.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf21 = unpooledByteBufAllocator17.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator17.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator17.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator17.compositeHeapBuffer(52);
        boolean boolean26 = writeCache4.put((long) '4', (long) (byte) 10, (io.netty.buffer.ByteBuf) compositeByteBuf25);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(compositeByteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufArray21);
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
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.heapBuffer(0);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer((int) (byte) 1, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.directBuffer((int) (short) 1);
        java.lang.String str14 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (short) 10);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str14, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf16);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0, (int) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeBuffer();
        int int14 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 0, (int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.directBuffer((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(-1)");
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
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.clear();
        writeCache4.deleteLedger((long) (byte) 1);
        long long12 = writeCache4.size();
        writeCache4.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator1.directBuffer((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator1.buffer((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator2, 0L);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator2.compositeHeapBuffer(1);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator2.metric();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = unpooledByteBufAllocator2.calculateNewCapacity((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minNewCapacity: 97 (expected: not greater than maxCapacity(32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
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
        java.lang.Class<?> wildcardClass21 = byteBufArray14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
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
        writeCache4.clear();
        writeCache4.deleteLedger((long) 10);
        long long20 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer(35, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.ioBuffer(35, (int) (short) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (short) 10);
        boolean boolean13 = unpooledByteBufAllocator0.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator0.ioBuffer((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 1 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray16);
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
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) -1 };
        byte[][] byteArray9 = new byte[][] { byteArray4, byteArray8 };
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray9);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteArray9);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer(10);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer((int) (byte) 1, 35);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 64, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 99 out of bounds for byte[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 0 });
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.buffer((int) (byte) 10, (int) '4');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer();
        int int12 = unpooledByteBufAllocator1.calculateNewCapacity(10, (int) '#');
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) (byte) 10, (int) '4');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache4.getLastEntry((long) '4');
        boolean boolean15 = writeCache4.hasEntry(100L, (long) 10);
        io.netty.buffer.ByteBuf byteBuf17 = writeCache4.getLastEntry(0L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuf17);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.heapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator0.compositeDirectBuffer(35);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.directBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator0.buffer(10);
        java.lang.String str11 = unpooledByteBufAllocator0.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator0.compositeHeapBuffer();
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
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) -1, byteBufArray17);
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
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.directBuffer(1, 35);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.ioBuffer(0);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator1.directBuffer((int) (short) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.ioBuffer((int) (short) -1, (int) (short) 0);
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
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (byte) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100, 1);
        writeCache12.clear();
        boolean boolean14 = writeCache12.isEmpty();
        int[] intArray24 = new int[] { (short) 0, (byte) 1, (byte) 100, (byte) 100, 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.copyMedium(intArray24);
        long[] longArray28 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.copyLong(longArray28);
        long[] longArray32 = new long[] { 10, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copyLong(longArray32);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator34 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf36 = unpooledByteBufAllocator34.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf[] byteBufArray37 = new io.netty.buffer.ByteBuf[] { byteBuf25, byteBuf29, byteBuf33, compositeByteBuf36 };
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray37);
        io.netty.buffer.ByteBuf byteBuf39 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray37);
        io.netty.buffer.ByteBuf byteBuf40 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray37);
        io.netty.buffer.ByteBuf byteBuf41 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 10, byteBufArray37);
        boolean boolean42 = writeCache12.put((long) 64, (long) (byte) 1, byteBuf41);
        writeCache12.deleteLedger((long) 'a');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0, 1, 100, 100, 0, 100 });
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 10L, 100L });
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator34);
        org.junit.Assert.assertNotNull(compositeByteBuf36);
        org.junit.Assert.assertNotNull(byteBufArray37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeDirectBuffer(1);
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer(0, (int) ' ');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer(100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.clear();
        io.netty.buffer.ByteBuf byteBuf13 = writeCache4.get(1L, 100L);
        long long14 = writeCache4.size();
        boolean boolean17 = writeCache4.hasEntry((long) 0, (long) 35);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(byteBuf13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
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
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) '4');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer(64);
        java.lang.String str12 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str12, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, 100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 164 out of bounds for byte[1]");
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
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeDirectBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer(1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) 1, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer((int) ' ');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.heapBuffer(1);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 10, (int) (short) 10);
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.buffer((int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        writeCache9.close();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache9.getLastEntry(1L);
        boolean boolean15 = writeCache9.hasEntry((long) (byte) 100, 100L);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator21 = new io.netty.buffer.UnpooledByteBufAllocator(true, true, false);
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator21.heapBuffer((int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf24 = unpooledByteBufAllocator21.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator21.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = writeCache9.put((long) (short) 10, (long) (short) 1, byteBuf26);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray21 = new byte[][] { byteArray4, byteArray8, byteArray12, byteArray16, byteArray20 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray21);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray21);
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
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        long long11 = writeCache10.count();
        boolean boolean14 = writeCache10.hasEntry(4L, (long) 64);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeBuffer((int) '4');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.ioBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.directBuffer();
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for byte[4]");
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
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.directBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer(0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray23 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray24 = new byte[][] { byteArray7, byteArray11, byteArray15, byteArray19, byteArray23 };
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray24);
        io.netty.buffer.ByteBuf byteBuf29 = io.netty.buffer.Unpooled.wrappedBuffer((int) '4', byteArray24);
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteArray24);
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteArray24);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray24);
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
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator22 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator22.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf25 = unpooledByteBufAllocator22.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf26 = unpooledByteBufAllocator22.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator22.directBuffer();
        io.netty.buffer.ByteBuf byteBuf28 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf27);
        boolean boolean29 = writeCache4.put((long) 1, (long) 64, byteBuf27);
        long long30 = writeCache4.size();
        writeCache4.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteBuf15);
        org.junit.Assert.assertNull(byteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(compositeByteBuf25);
        org.junit.Assert.assertNotNull(compositeByteBuf26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator1.compositeDirectBuffer((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
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
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 0, 64);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer(35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 35 (expected: not greater than maxCapacity(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(52);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer(100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.directBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf12);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator2.heapBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator2.compositeDirectBuffer(52);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator2.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator2.compositeDirectBuffer((int) '4');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric11 = unpooledByteBufAllocator2.metric();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric12 = unpooledByteBufAllocator2.metric();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric11);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric12);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.heapBuffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) '4');
        int int10 = unpooledByteBufAllocator1.calculateNewCapacity((int) '#', 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache16 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 64, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf13 = writeCache11.getLastEntry((long) 32);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNull(byteBuf13);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        writeCache9.close();
        boolean boolean11 = writeCache9.isEmpty();
        long long12 = writeCache9.size();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.directBuffer(52);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) '4');
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator0.heapBuffer(100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer(1, 64);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator1.buffer(100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
        boolean boolean21 = writeCache4.hasEntry((long) 'a', 0L);
        io.netty.buffer.ByteBuf byteBuf23 = writeCache4.getLastEntry(1L);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(byteBuf23);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        writeCache4.clear();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator27 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf30 = unpooledByteBufAllocator27.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric31 = unpooledByteBufAllocator27.metric();
        io.netty.buffer.ByteBuf byteBuf32 = unpooledByteBufAllocator27.buffer();
        boolean boolean33 = unpooledByteBufAllocator27.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache35 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator27, (long) (short) 100);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator39 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf42 = unpooledByteBufAllocator39.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf44 = unpooledByteBufAllocator39.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf45 = unpooledByteBufAllocator39.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf47 = unpooledByteBufAllocator39.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf49 = unpooledByteBufAllocator39.compositeBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric50 = unpooledByteBufAllocator39.metric();
        io.netty.buffer.CompositeByteBuf compositeByteBuf52 = unpooledByteBufAllocator39.compositeDirectBuffer(10);
        boolean boolean53 = writeCache35.put((long) (byte) 0, (long) 52, (io.netty.buffer.ByteBuf) compositeByteBuf52);
        io.netty.buffer.ByteBuf byteBuf54 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf52);
        boolean boolean55 = writeCache4.put((long) 100, 0L, byteBuf54);
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
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(compositeByteBuf44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertNotNull(compositeByteBuf49);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric50);
        org.junit.Assert.assertNotNull(compositeByteBuf52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
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
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric16 = unpooledByteBufAllocator1.metric();
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric16);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
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
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copiedBuffer(byteArray24);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray24);
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
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        long long5 = writeCache4.count();
        io.netty.buffer.ByteBuf byteBuf7 = writeCache4.getLastEntry((long) (byte) 100);
        writeCache4.deleteLedger((long) (short) 1);
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator13.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator13.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator13.heapBuffer((int) (byte) 1);
        java.lang.String str18 = unpooledByteBufAllocator13.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric19 = unpooledByteBufAllocator13.metric();
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator13.buffer((int) (byte) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache24 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator13, (long) 100, 1);
        boolean[] booleanArray30 = new boolean[] { false, true, true };
        io.netty.buffer.ByteBuf byteBuf31 = io.netty.buffer.Unpooled.copyBoolean(booleanArray30);
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copyBoolean(booleanArray30);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.copyBoolean(booleanArray30);
        boolean boolean34 = writeCache24.put((long) '#', (long) 52, byteBuf33);
        boolean boolean35 = writeCache4.put(0L, (long) 52, byteBuf33);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str18, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric19);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(booleanArray30);
        assertBooleanArrayEquals(booleanArray30, new boolean[] { false, true, true });
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
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
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        writeCache4.deleteLedger((long) (byte) 100);
        writeCache4.close();
        long long9 = writeCache4.count();
        boolean boolean10 = writeCache4.isEmpty();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer((int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copyMedium(intArray4);
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
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        writeCache9.close();
        io.netty.buffer.ByteBuf byteBuf12 = writeCache9.getLastEntry(1L);
        boolean boolean15 = writeCache9.hasEntry((long) (byte) 100, 100L);
        writeCache9.deleteLedger((long) 52);
        boolean boolean18 = writeCache9.isEmpty();
        io.netty.buffer.ByteBuf byteBuf20 = writeCache9.getLastEntry(100L);
        long long21 = writeCache9.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNull(byteBuf12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(byteBuf20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
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
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 10);
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator0.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache7 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator0.compositeHeapBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) (short) 10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator0.directBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator0.ioBuffer((int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) (byte) 100);
        java.lang.String str9 = unpooledByteBufAllocator1.toString();
        boolean boolean10 = unpooledByteBufAllocator1.isDirectBufferPooled();
        int int13 = unpooledByteBufAllocator1.calculateNewCapacity((int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer(52, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 52 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str9, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBuf3);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        java.lang.String str5 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str5, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
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
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator19 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator19.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf24 = unpooledByteBufAllocator19.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator19.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf27 = unpooledByteBufAllocator19.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf28 = unpooledByteBufAllocator19.compositeBuffer();
        java.lang.String str29 = unpooledByteBufAllocator19.toString();
        io.netty.buffer.CompositeByteBuf compositeByteBuf31 = unpooledByteBufAllocator19.compositeHeapBuffer(1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf32 = unpooledByteBufAllocator19.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = writeCache4.put((long) (short) 0, 100L, byteBuf33);
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
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(compositeByteBuf24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(compositeByteBuf28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str29, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(compositeByteBuf31);
        org.junit.Assert.assertNotNull(compositeByteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = writeCache18.hasEntry((long) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Keys and values must be >= 0");
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
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer((int) (short) 10);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, false, true);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator3.heapBuffer((int) (short) 0, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator3.directBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) (short) 1, 1);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache13 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator3, (long) 64, (int) ' ');
        long long14 = writeCache13.count();
        long long15 = writeCache13.size();
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.buffer((int) (short) 1);
        int int10 = unpooledByteBufAllocator0.calculateNewCapacity((int) '4', (int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator0.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator0.directBuffer((int) ' ');
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) '4', (int) (short) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) ' ', (int) ' ');
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer((int) (short) 0);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric5 = unpooledByteBufAllocator1.metric();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (short) 100);
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer(52);
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer(0);
        io.netty.buffer.ByteBuf byteBuf19 = unpooledByteBufAllocator1.directBuffer((int) '4', 100);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) 'a', (long) 10);
        long long10 = writeCache4.count();
        writeCache4.clear();
        writeCache4.clear();
        writeCache4.clear();
        boolean boolean16 = writeCache4.hasEntry((long) ' ', (long) 1);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
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
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 0);
        boolean boolean12 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) '4', (int) '4');
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        int[] intArray4 = new int[] { 'a', 'a', 'a', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyMedium(intArray4);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyInt(intArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf9);
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
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.buffer((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 32 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer(1);
        boolean boolean9 = unpooledByteBufAllocator1.isDirectBufferPooled();
        java.lang.String str10 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer(52);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache15 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 10L, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str10, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 'a', (int) '#', false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.ioBuffer((int) (short) 1);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.buffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteBuf7);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        short[] shortArray5 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(shortArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray13 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copyShort(shortArray13);
        io.netty.buffer.ByteBuf[] byteBufArray15 = new io.netty.buffer.ByteBuf[] { byteBuf6, byteBuf8, byteBuf14 };
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray15);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        int[] intArray5 = new int[] { 100, (short) 1, 0, '#', (short) 10 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copyShort(intArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copyInt(intArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copyMedium(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 100, 1, 0, 35, 10 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry(1L, (long) 100);
        long long9 = writeCache4.count();
        writeCache4.close();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf2 = unpooledByteBufAllocator0.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator0.buffer(100);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator0.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator0.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer((io.netty.buffer.ByteBuf) compositeByteBuf6);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 10);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf12 = unpooledByteBufAllocator1.compositeBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.directBuffer((int) (byte) 10, (int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.heapBuffer();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(compositeByteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) 35, (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.directBuffer((int) '#');
        boolean boolean7 = unpooledByteBufAllocator1.isDirectBufferPooled();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.directBuffer((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache14 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 10L, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Max segment size needs to be in form of 2^n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        writeCache4.deleteLedger((long) 0);
        boolean boolean11 = writeCache4.isEmpty();
        long long12 = writeCache4.size();
        short[] shortArray21 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.copyShort(shortArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.copyShort((int) (short) 1);
        short[] shortArray29 = new short[] { (byte) 10, (byte) 0, (byte) 0, (short) 100 };
        io.netty.buffer.ByteBuf byteBuf30 = io.netty.buffer.Unpooled.copyShort(shortArray29);
        io.netty.buffer.ByteBuf[] byteBufArray31 = new io.netty.buffer.ByteBuf[] { byteBuf22, byteBuf24, byteBuf30 };
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.copiedBuffer(byteBufArray31);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray31);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray31);
        io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.wrappedBuffer(64, byteBufArray31);
        io.netty.buffer.ByteBuf byteBuf36 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray31);
        io.netty.buffer.ByteBuf byteBuf37 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray31);
        io.netty.buffer.ByteBuf byteBuf38 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 10, byteBufArray31);
        boolean boolean39 = writeCache4.put((long) (short) 0, (long) (short) 1, byteBuf38);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] { (short) 10, (short) 0, (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBufArray31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) (byte) 100, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(64)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 135 out of bounds for byte[4]");
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
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(byteBuf2);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer((int) (byte) 10, (int) (byte) 100);
        java.lang.String str8 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer(52);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf12 = unpooledByteBufAllocator1.buffer((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
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
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray14);
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
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache12 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 64, 64);
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf14 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.directBuffer(35);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean6 = writeCache4.isEmpty();
        boolean boolean7 = writeCache4.isEmpty();
        writeCache4.close();
        long long9 = writeCache4.size();
        writeCache4.clear();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator14 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf16 = unpooledByteBufAllocator14.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf17 = unpooledByteBufAllocator14.compositeDirectBuffer();
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator14.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf20 = unpooledByteBufAllocator14.heapBuffer((int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator14.buffer();
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator14.buffer(64);
        int int26 = unpooledByteBufAllocator14.calculateNewCapacity(10, 52);
        io.netty.buffer.ByteBuf byteBuf28 = unpooledByteBufAllocator14.buffer((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = writeCache4.put((long) (short) 0, (long) (byte) 1, byteBuf28);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(compositeByteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, (int) '4', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 84 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 0 };
        byte[][] byteArray22 = new byte[][] { byteArray5, byteArray9, byteArray13, byteArray17, byteArray21 };
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteArray22);
        io.netty.buffer.ByteBuf byteBuf26 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray22);
        io.netty.buffer.ByteBuf byteBuf27 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray22);
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
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        long long6 = writeCache4.size();
        io.netty.buffer.ByteBuf byteBuf9 = writeCache4.get((long) (byte) 1, (-1L));
        writeCache4.close();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator13 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator13.buffer((int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf17 = unpooledByteBufAllocator13.buffer(100);
        io.netty.buffer.ByteBuf byteBuf18 = unpooledByteBufAllocator13.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf19 = unpooledByteBufAllocator13.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf22 = unpooledByteBufAllocator13.directBuffer(35, 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = writeCache4.put(4L, 0L, byteBuf22);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(byteBuf9);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(compositeByteBuf19);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = org.apache.bookkeeper.generated.Support.allocator();
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator0.compositeBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator0.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator0.compositeBuffer();
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator0.heapBuffer((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(10, 35)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.close();
        long long11 = writeCache4.size();
        long long12 = writeCache4.count();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) 100, 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteBuf12);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator2.compositeBuffer((int) (short) 100);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator2.buffer((int) (short) 10);
        java.lang.String str8 = unpooledByteBufAllocator2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str8, "UnpooledByteBufAllocator(directByDefault: true)");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer((int) (byte) 10);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.unmodifiableBuffer((io.netty.buffer.ByteBuf) compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf9 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) (short) 1, (int) '4');
        io.netty.buffer.CompositeByteBuf compositeByteBuf15 = unpooledByteBufAllocator1.compositeHeapBuffer(52);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertNotNull(compositeByteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(compositeByteBuf15);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.copiedBuffer(byteArray5, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 20 out of bounds for byte[5]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer(100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(35)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
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
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.unmodifiableBuffer(byteBufArray15);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedUnmodifiableBuffer(byteBufArray15);
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
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 4, cap: 4/4).slice(-1, 1)");
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
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.heapBuffer(64);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.buffer();
        java.lang.Class<?> wildcardClass12 = unpooledByteBufAllocator1.getClass();
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache4 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, 100L);
        boolean boolean5 = writeCache4.isEmpty();
        boolean boolean8 = writeCache4.hasEntry((long) 'a', 100L);
        long long9 = writeCache4.size();
        writeCache4.close();
        long long11 = writeCache4.size();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer((long) (byte) -1, 64, false);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: sun.misc.Unsafe or java.nio.DirectByteBuffer.<init>(long, int) not available");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.ByteBuf byteBuf4 = unpooledByteBufAllocator1.directBuffer((int) 'a', (int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeBuffer(1);
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) '#');
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf13 = unpooledByteBufAllocator1.compositeHeapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf15 = unpooledByteBufAllocator1.buffer((int) '#');
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(compositeByteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
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
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.directBuffer((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 97 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(1, 1)");
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
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        long long23 = writeCache9.count();
        writeCache9.close();
        boolean boolean25 = writeCache9.isEmpty();
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(52, byteBufferArray3);
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
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator1.compositeBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) 100);
        long long10 = writeCache9.size();
        boolean boolean13 = writeCache9.hasEntry((long) (short) 0, (long) 35);
        io.netty.buffer.ByteBuf byteBuf16 = writeCache9.get(4L, (long) 0);
        writeCache9.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuf16);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.nio.ByteBuffer[] byteBufferArray3 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf4 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf5 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(0, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer(1, byteBufferArray3);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteBufferArray3);
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
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator0 = io.netty.buffer.UnpooledByteBufAllocator.DEFAULT;
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache2 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator0, (long) 0);
        io.netty.buffer.ByteBuf byteBuf3 = unpooledByteBufAllocator0.buffer();
        int int6 = unpooledByteBufAllocator0.calculateNewCapacity((int) ' ', (int) '#');
        io.netty.buffer.ByteBuf byteBuf7 = unpooledByteBufAllocator0.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator0.directBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf10 = unpooledByteBufAllocator0.compositeHeapBuffer((int) (byte) 10);
        org.junit.Assert.assertNotNull(unpooledByteBufAllocator0);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf10);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, (int) (short) 0);
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray4, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 4, cap: 4/4).slice(0, 52)");
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
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
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
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer(32, byteBufArray21);
        io.netty.buffer.ByteBuf byteBuf25 = io.netty.buffer.Unpooled.wrappedBuffer((int) '#', byteBufArray21);
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
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer(100);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.ioBuffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.ioBuffer((int) (short) 1, (int) (short) 100);
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache11 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        writeCache11.close();
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf6 = unpooledByteBufAllocator1.buffer();
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator1.buffer((int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf11 = unpooledByteBufAllocator1.ioBuffer((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator3 = new io.netty.buffer.UnpooledByteBufAllocator(false, true, true);
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator3.ioBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator3.directBuffer(35, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf9 = unpooledByteBufAllocator3.directBuffer();
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
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
        io.netty.buffer.ByteBuf byteBuf32 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray25);
        io.netty.buffer.ByteBuf byteBuf33 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 100, byteArray25);
        io.netty.buffer.ByteBuf byteBuf34 = io.netty.buffer.Unpooled.copiedBuffer(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf35 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 0, byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: 0 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
            io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copiedBuffer(byteArray4, 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 132 out of bounds for byte[4]");
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
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator2 = new io.netty.buffer.UnpooledByteBufAllocator(true, false);
        boolean boolean3 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric4 = unpooledByteBufAllocator2.metric();
        boolean boolean5 = unpooledByteBufAllocator2.isDirectBufferPooled();
        io.netty.buffer.CompositeByteBuf compositeByteBuf7 = unpooledByteBufAllocator2.compositeHeapBuffer((int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(compositeByteBuf7);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf2 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.ByteBuf byteBuf5 = unpooledByteBufAllocator1.heapBuffer((int) (byte) 1);
        java.lang.String str6 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBufAllocatorMetric byteBufAllocatorMetric7 = unpooledByteBufAllocator1.metric();
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache9 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 10);
        writeCache9.deleteLedger((long) '4');
        writeCache9.clear();
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator16 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf18 = unpooledByteBufAllocator16.compositeBuffer((int) 'a');
        io.netty.buffer.ByteBuf byteBuf21 = unpooledByteBufAllocator16.directBuffer((int) '#', (int) '#');
        io.netty.buffer.ByteBuf byteBuf23 = unpooledByteBufAllocator16.ioBuffer(1);
        io.netty.buffer.ByteBuf byteBuf25 = unpooledByteBufAllocator16.heapBuffer((int) (short) 1);
        boolean boolean26 = writeCache9.put((long) '4', 10L, byteBuf25);
        org.junit.Assert.assertNotNull(compositeByteBuf2);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str6, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBufAllocatorMetric7);
        org.junit.Assert.assertNotNull(compositeByteBuf18);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
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
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.copyShort(intArray4);
        io.netty.buffer.ByteBuf byteBuf16 = io.netty.buffer.Unpooled.copyShort(intArray4);
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
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer((int) '#');
        io.netty.buffer.ByteBuf byteBuf8 = unpooledByteBufAllocator1.directBuffer((int) (byte) 1);
        io.netty.buffer.ByteBuf byteBuf10 = unpooledByteBufAllocator1.heapBuffer((int) '#');
        java.lang.String str11 = unpooledByteBufAllocator1.toString();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer((int) '#');
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UnpooledByteBufAllocator(directByDefault: true)" + "'", str11, "UnpooledByteBufAllocator(directByDefault: true)");
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        io.netty.buffer.UnpooledByteBufAllocator unpooledByteBufAllocator1 = new io.netty.buffer.UnpooledByteBufAllocator(true);
        io.netty.buffer.CompositeByteBuf compositeByteBuf3 = unpooledByteBufAllocator1.compositeBuffer((int) 'a');
        io.netty.buffer.CompositeByteBuf compositeByteBuf4 = unpooledByteBufAllocator1.compositeDirectBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf5 = unpooledByteBufAllocator1.compositeBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf6 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.CompositeByteBuf compositeByteBuf8 = unpooledByteBufAllocator1.compositeDirectBuffer((int) '#');
        org.apache.bookkeeper.bookie.storage.ldb.WriteCache writeCache10 = new org.apache.bookkeeper.bookie.storage.ldb.WriteCache((io.netty.buffer.ByteBufAllocator) unpooledByteBufAllocator1, (long) (byte) 100);
        io.netty.buffer.CompositeByteBuf compositeByteBuf11 = unpooledByteBufAllocator1.compositeHeapBuffer();
        io.netty.buffer.ByteBuf byteBuf13 = unpooledByteBufAllocator1.heapBuffer(10);
        io.netty.buffer.ByteBuf byteBuf14 = unpooledByteBufAllocator1.heapBuffer();
        io.netty.buffer.ByteBuf byteBuf16 = unpooledByteBufAllocator1.ioBuffer(35);
        io.netty.buffer.ByteBuf byteBuf17 = io.netty.buffer.Unpooled.unreleasableBuffer(byteBuf16);
        org.junit.Assert.assertNotNull(compositeByteBuf3);
        org.junit.Assert.assertNotNull(compositeByteBuf4);
        org.junit.Assert.assertNotNull(compositeByteBuf5);
        org.junit.Assert.assertNotNull(compositeByteBuf6);
        org.junit.Assert.assertNotNull(compositeByteBuf8);
        org.junit.Assert.assertNotNull(compositeByteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf3 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf6 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, (int) (byte) 0, (int) (byte) 0);
        io.netty.buffer.ByteBuf byteBuf7 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.copiedBuffer(byteArray1, (int) (byte) 100, 0);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray1, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: UnpooledHeapByteBuf(ridx: 0, widx: 1, cap: 1/1).slice(100, 35)");
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
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf2 = io.netty.buffer.Unpooled.buffer((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity: 100 (expected: not greater than maxCapacity(-1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.nio.ByteBuffer[] byteBufferArray7 = new java.nio.ByteBuffer[] {};
        io.netty.buffer.ByteBuf byteBuf8 = io.netty.buffer.Unpooled.wrappedBuffer((int) 'a', byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf9 = io.netty.buffer.Unpooled.wrappedBuffer(byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf10 = io.netty.buffer.Unpooled.wrappedBuffer((int) (short) 1, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf11 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf12 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 0, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf13 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 1, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf14 = io.netty.buffer.Unpooled.wrappedBuffer(10, byteBufferArray7);
        io.netty.buffer.ByteBuf byteBuf15 = io.netty.buffer.Unpooled.wrappedBuffer((int) (byte) 100, byteBufferArray7);
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
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        byte[][] byteArray17 = new byte[][] { byteArray6, byteArray11, byteArray16 };
        io.netty.buffer.ByteBuf byteBuf18 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray17);
        io.netty.buffer.ByteBuf byteBuf19 = io.netty.buffer.Unpooled.copiedBuffer(byteArray17);
        io.netty.buffer.ByteBuf byteBuf20 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray17);
        io.netty.buffer.ByteBuf byteBuf21 = io.netty.buffer.Unpooled.wrappedBuffer(100, byteArray17);
        io.netty.buffer.ByteBuf byteBuf22 = io.netty.buffer.Unpooled.wrappedBuffer(byteArray17);
        io.netty.buffer.ByteBuf byteBuf23 = io.netty.buffer.Unpooled.copiedBuffer(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            io.netty.buffer.ByteBuf byteBuf24 = io.netty.buffer.Unpooled.wrappedBuffer((-1), byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxNumComponents: -1 (expected: >= 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf23);
    }
}

