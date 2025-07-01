package org.apache.bookkeeper.bookie.storage.ldb;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;


public class WriteCacheMutationTest {
    private static final ByteBufAllocator allocator = UnpooledByteBufAllocator.DEFAULT;

    private WriteCache writeCache;
    private final long maxCacheSize = 1024;
    private final int maxSegmentSize = 64;


    @After
    public void tearDown() {
        if (writeCache != null) {
            writeCache.close();
        }
    }

    //Usiamo la reflession per accedere al campo cacheSegment

    private ByteBuf[] getCacheSegments(WriteCache writeCacheInstance) throws Exception {
        Field field = WriteCache.class.getDeclaredField("cacheSegments");
        field.setAccessible(true);
        return (ByteBuf[]) field.get(writeCacheInstance);
    }

    //Riga 109 e 114
    @Test
    public void writeCacheConstructorSegmentTest() throws Exception {
        writeCache = new WriteCache(allocator, maxCacheSize+1, maxSegmentSize);
        ByteBuf[] segments = getCacheSegments(writeCache);

        Assert.assertEquals(maxCacheSize/maxSegmentSize + 1, segments.length);

        //Verify the size of last segment:
        ByteBuf lastSegment = segments[segments.length - 1];
        int expectedSegments = (int) ((maxCacheSize+1) % maxSegmentSize);

        Assert.assertEquals(expectedSegments, lastSegment.capacity());
    }

    //Riga 119, 120, 122
    @Test
    public void clearTest() throws Exception {
        // GIVEN: entry scritta prima della clear
        writeCache = new WriteCache(allocator, maxCacheSize, maxSegmentSize);
        long ledgerId = 99L;
        long entryId = 123L;
        byte[] data = "test-data".getBytes();
        writeCache.put(ledgerId, entryId, Unpooled.wrappedBuffer(data));

        Assert.assertTrue(writeCache.count() > 0);
        Assert.assertTrue(writeCache.size() > 0);

        // WHEN: clear chiamato
        writeCache.clear();

        // THEN: la entry non deve più essere presente
        Assert.assertEquals(0, writeCache.count());
        Assert.assertEquals(0, writeCache.size());
        Assert.assertNull("La entry dovrebbe essere null dopo clear()",
                writeCache.get(ledgerId, entryId));
    }

    //Riga 208
    @Test
    public void getLastEntryLedgerIdNotInCacheTest() throws Exception {
        writeCache = new WriteCache(allocator, maxCacheSize, maxSegmentSize);

        long nonExistingLedgerId = 1;

        //chiamiamo getLastEntry con un ledger non presente
        ByteBuf result = writeCache.getLastEntry(nonExistingLedgerId);

        //il risultato deve essere null
        Assert.assertNull("getLastEntry deve restituire null per ledgerId sconosciuto", result);
    }



}
