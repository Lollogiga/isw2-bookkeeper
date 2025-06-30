package org.apache.bookkeeper.bookie.storage.ldb;


import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.*;
import java.io.IOException;

public class WriteCacheCoverageTest {

    private WriteCache cache;
    private static final long MAX_CACHE = 512;
    private static final int SEGMENT = 128;
    private static final long LEDGER_ID = 0;
    private static final long ENTRY_ID = 0;


    @Before
    public void setup() {
        cache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, MAX_CACHE, SEGMENT);
    }

    @After
    public void teardown() throws IOException {
        cache.close();
    }


    /*HasEntry and test*/
    @Test
    //Eseguito in white-box: Dato che chiama il get, non testiamo i casi al limite già testati
    public void HasEntryTrue(){
        cache.put(LEDGER_ID, ENTRY_ID, Unpooled.buffer(SEGMENT).writeBytes(new byte[SEGMENT]));
        Assert.assertTrue("HasEntry test: entry esistente", cache.hasEntry(LEDGER_ID, ENTRY_ID));

    }

    @Test
    public void HasEntryFalse(){
        Assert.assertFalse(cache.hasEntry(LEDGER_ID, ENTRY_ID));
    }

    @Test
    public void isEmpty(){
        Assert.assertTrue(cache.isEmpty());
        cache.put(LEDGER_ID, ENTRY_ID, Unpooled.buffer(SEGMENT).writeBytes(new byte[SEGMENT]));
        Assert.assertFalse(cache.isEmpty());
    }

    @Test
    public void getLastEntry(){
        Assert.assertNull("getLastEntry test: ledgerId empty", cache.getLastEntry(LEDGER_ID));
    }

}
