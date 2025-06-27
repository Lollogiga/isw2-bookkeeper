package org.apache.bookkeeper.bookie.storage.ldb;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class WriteCachePutTest {

    private final String description;
    private final long ledgerId;
    private final long entryId;
    private final ByteBuf entry;
    private final Object expectedOutcome;
    private final long expectedCacheSize;
    private final long expectedCacheCount;
    private final CacheState initialState;


    private Class<? extends Exception> expectedException;
    private boolean expectedResult;

    // Stato del test
    private WriteCache writeCache;
    private static final long MAX_CACHE_SIZE = 2048;

    private static final int MAX_SEGMENT_SIZE = 256;
    private static final int LEDGER_ID_TEST = 0;
    private static final int ENTRY_ID_TEST = 5;

    /**
     * Enum per definire lo stato iniziale della cache prima del test.
     */
    private enum CacheState {
        EMPTY,
        ALMOST_FULL, // Cache quasi piena, il prossimo 'put' potrebbe fallire
        KNOW_ENTRY,
        SEGMENT_ALMOST_FULL,
        OUT_OF_ORDER // Contiene già una entry più recente per lo stesso ledger
    }

    public WriteCachePutTest(String description, long ledgerId, long entryId, ByteBuf entry,
                             CacheState initialState, Object expectedOutcome,
                             long expectedCacheSize, long expectedCacheCount) {
        this.description = description;
        this.ledgerId = ledgerId;
        this.entryId = entryId;
        this.entry = entry;
        this.initialState = initialState;
        this.expectedOutcome = expectedOutcome;
        this.expectedCacheSize = expectedCacheSize;
        this.expectedCacheCount = expectedCacheCount;

        // Imposta i campi di aspettativa in base al tipo di 'expectedOutcome'
        if (expectedOutcome instanceof Class && Exception.class.isAssignableFrom((Class<?>) expectedOutcome)) {
            this.expectedException = (Class<? extends Exception>) expectedOutcome;
        } else if (expectedOutcome instanceof Boolean) {
            this.expectedResult = (boolean) expectedOutcome;
        }
    }

    private static ByteBuf createReleasedBuffer() {
        ByteBuf buffer = Unpooled.buffer(128).writeBytes(new byte[128]);
        buffer.release();
        return buffer;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // --- DESCRIZIONE, LEDGER_ID, ENTRY_ID, ENTRY, INITIAL_STATE, EXPECTED_OUTCOME, EXPECTED_SIZE, EXPECTED_COUNT ---

                {"Put con Invalid ledgerId", -1, 1, Unpooled.buffer(128).writeBytes(new byte[128]), CacheState.EMPTY, IllegalArgumentException.class, 0, 0},
                {"Put con Invalid entryId", 1, -1, Unpooled.buffer(128).writeBytes(new byte[128]), CacheState.EMPTY, IllegalArgumentException.class, 0, 0},
                {"Put con Null entry", 1, 1, null, CacheState.EMPTY, NullPointerException.class, 0, 0},
                //Genera un'eccezione IndexOutOfException
                //{"Put con Invalid instance of entry: entry già rilasciata", 1, 1, createReleasedBuffer(), CacheState.EMPTY, IllegalArgumentException.class, 0, 0},
                {"Put con entry vuota", 1, 1, Unpooled.buffer(0), CacheState.EMPTY, true, 0, 1},
                {"Put con entry non vuota, cache vuota", 1, 1, Unpooled.buffer(128).writeBytes(new byte[128]),CacheState.EMPTY, true, 128, 1},
                {"Put esattamente piena", 1, 1, Unpooled.buffer(MAX_SEGMENT_SIZE).writeBytes(new byte[MAX_SEGMENT_SIZE]),CacheState.ALMOST_FULL, true, MAX_CACHE_SIZE, MAX_CACHE_SIZE/MAX_SEGMENT_SIZE},
                {"Put cache piena", 1, 1, Unpooled.buffer(MAX_SEGMENT_SIZE+1).writeBytes(new byte[MAX_SEGMENT_SIZE+1]), CacheState.ALMOST_FULL, false, MAX_CACHE_SIZE, MAX_CACHE_SIZE/MAX_SEGMENT_SIZE},
                {"Put con segmento quasi pieno", 1, 1, Unpooled.buffer(64 + 1).writeBytes(new byte[64+1]), CacheState.SEGMENT_ALMOST_FULL, true, MAX_SEGMENT_SIZE + 1, 2},
                {"Put con aggiornamento di LastEntry", LEDGER_ID_TEST , ENTRY_ID_TEST+1, Unpooled.buffer(MAX_SEGMENT_SIZE).writeBytes(new byte[MAX_SEGMENT_SIZE]), CacheState.OUT_OF_ORDER, true, MAX_SEGMENT_SIZE*2, 2},
                {"Put senza aggiornamento di LastEntry", LEDGER_ID_TEST, ENTRY_ID_TEST-1, Unpooled.buffer(MAX_SEGMENT_SIZE).writeBytes(new byte[MAX_SEGMENT_SIZE]), CacheState.OUT_OF_ORDER, true, MAX_SEGMENT_SIZE*2, 2},
                {"Put con coppia (ledgerID, entryId) già esistente", LEDGER_ID_TEST, ENTRY_ID_TEST, Unpooled.buffer(MAX_SEGMENT_SIZE).writeBytes(new byte[MAX_SEGMENT_SIZE]), CacheState.KNOW_ENTRY, true, MAX_SEGMENT_SIZE*2, 2}
        });
    }

    @Before
    public void setUp() {
        writeCache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);

        switch (initialState) {
            case EMPTY:
                break;
            case ALMOST_FULL:
                //Lascio solo l'ultimo segmento vuoto
                int num_put = (int) MAX_CACHE_SIZE/MAX_SEGMENT_SIZE;
                for (int i = 0; i < num_put-1; i++) {
                    writeCache.put(LEDGER_ID_TEST, i, Unpooled.buffer(MAX_SEGMENT_SIZE).writeBytes(new byte[MAX_SEGMENT_SIZE]));
                }
                break;
            case KNOW_ENTRY:
            case OUT_OF_ORDER:
                writeCache.put(LEDGER_ID_TEST, ENTRY_ID_TEST, Unpooled.buffer(MAX_SEGMENT_SIZE).writeBytes(new byte[MAX_SEGMENT_SIZE]));
                break;
            case SEGMENT_ALMOST_FULL:
                writeCache.put(LEDGER_ID_TEST, ENTRY_ID_TEST, Unpooled.buffer(MAX_SEGMENT_SIZE-64).writeBytes(new byte[MAX_SEGMENT_SIZE-64]));
                break;
        }
    }


    @After
    public void tearDown() {
        if (writeCache != null) {
            writeCache.close();
        }
        if (entry != null && entry.refCnt() > 0) {
            entry.release();
        }
    }

    @Test
    public void testPut() {
        long sizeBeforeAction = writeCache.size();
        long countBeforeAction = writeCache.count();

        try {
            boolean result = writeCache.put(ledgerId, entryId, entry);

            if (expectedException != null) {
                Assert.fail("Test '" + description + "' expected an exception but none was thrown.");
            }

            Assert.assertEquals("Risultato di put() per '" + description + "'", expectedResult, result);

            if (result) { // Verifica lo stato solo se l'operazione ha avuto successo
                Assert.assertEquals("Cache size per '" + description + "'", expectedCacheSize, writeCache.size());
                Assert.assertEquals("Cache count per '" + description + "'", expectedCacheCount, writeCache.count());

                ByteBuf retrievedEntry = writeCache.get(ledgerId, entryId);
                Assert.assertNotNull("Entry non trovata per '" + description + "'", retrievedEntry);
                Assert.assertEquals("Contenuto entry per '" + description + "'", entry.slice(), retrievedEntry.slice());
                retrievedEntry.release();
            } else { // Se il put è fallito (restituendo false)
                //Ci aspettiamo che dopo la failure lo stato della cache non sia cambiato
                Assert.assertEquals("Cache size non doveva cambiare per '" + description + "'", sizeBeforeAction, writeCache.size());
                Assert.assertEquals("Cache count non doveva cambiare per '" + description + "'", countBeforeAction, writeCache.count());
            }

            // Test specifico per la logica di lastEntryMap
            if (initialState == CacheState.OUT_OF_ORDER || initialState == CacheState.KNOW_ENTRY) {
                ByteBuf lastEntry = writeCache.getLastEntry(LEDGER_ID_TEST);
                Assert.assertNotNull(lastEntry);
                long expectedLastEntryId = Math.max(ENTRY_ID_TEST, entryId);
                ByteBuf expectedLastEntryData = writeCache.get(LEDGER_ID_TEST, expectedLastEntryId);
                Assert.assertEquals("LastEntry non corretta per '" + description + "'", expectedLastEntryData.slice(), lastEntry.slice());
                lastEntry.release();
                expectedLastEntryData.release();
            }
            // --- Verifica (se ci si aspettava un'eccezione) ---
        } catch (Exception e) {
            if (expectedException == null) {
                Assert.fail("Test '" + description + "' threw an unexpected exception: " + e.getClass().getName());
            }
            Assert.assertTrue("Tipo eccezione errato per '" + description + "'. Atteso: " + expectedException.getName() + ", Trovato: " + e.getClass().getName(),
                    expectedException.isAssignableFrom(e.getClass()));
        }
    }
}
