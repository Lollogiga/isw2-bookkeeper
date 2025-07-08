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
public class WriteCacheGetTest {

    private final String description;
    private final long ledgerIdToGet;
    private final long entryIdToGet;
    private final GetCacheState initialState;
    private final Object expectedOutcome;

    private WriteCache writeCache;
    private static final long MAX_CACHE_SIZE = 1024;
    private static final int MAX_SEGMENT_SIZE = 128;

    private static final long LEDGER_ID = 0;
    private static final long ENTRY_ID = 0;
    private static final ByteBuf DATA   = Unpooled.buffer(64).writeBytes(fillArray((byte) 0x11, 64));
    private static final ByteBuf DATA_1 = Unpooled.buffer(64).writeBytes(fillArray((byte) 0x22, 64));
    private static final ByteBuf DATA_2 = Unpooled.buffer(64).writeBytes(fillArray((byte) 0x33, 64));



    private enum GetCacheState {
        EMPTY,
        SINGLE_ENTRY,
        MULTI_SEGMENT_ENTRY,
        CLEARED_AFTER_PUT,
        DELETE_LEDGER_AFTER_PUT
    }

    private static byte[] fillArray(byte value, int size) {
        byte[] array = new byte[size];
        Arrays.fill(array, value);
        return array;
    }

    public WriteCacheGetTest(String description, long ledgerIdToGet, long entryIdToGet,
                                       GetCacheState initialState, Object expectedOutcome) {
        this.description = description;
        this.ledgerIdToGet = ledgerIdToGet;
        this.entryIdToGet = entryIdToGet;
        this.initialState = initialState;
        this.expectedOutcome = expectedOutcome;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // --- DESCRIZIONE, LEDGER_ID_TO_GET, ENTRY_ID_TO_GET, INITIAL_STATE, EXPECTED_OUTCOME ---
                {"Get invalid ledgerID", -1, 1, GetCacheState.EMPTY, IllegalArgumentException.class},
                /*Il test non passa e torna semplicemente un valore null, dato che la put non permette l'inserimento di entryId Negativi sarebbe da ritornare anch qui eccezione */
                //{"Get invalid entryID", 1, -1, GetCacheState.EMPTY,IllegalArgumentException.class},
                {"Get cache vuota", 1, 1, GetCacheState.EMPTY, null},
                {"Get di (ledgerId, entryId) esistente", LEDGER_ID, ENTRY_ID, GetCacheState.SINGLE_ENTRY, DATA},
                {"Get di ledgerId esistente e entryId non esistente", LEDGER_ID, ENTRY_ID+1, GetCacheState.SINGLE_ENTRY, null},
                {"Get di ledgerId non esistente", LEDGER_ID+1, ENTRY_ID, GetCacheState.SINGLE_ENTRY, null},
                {"Get di entry con offset locale traslato", LEDGER_ID, ENTRY_ID+1, GetCacheState.MULTI_SEGMENT_ENTRY, DATA_1},
                {"Get di entry in un segmento diverso dal primo", LEDGER_ID, ENTRY_ID+2, GetCacheState.MULTI_SEGMENT_ENTRY, DATA_2},

                {"Get dopo clear(): nessun dato deve restare", LEDGER_ID, ENTRY_ID, GetCacheState.CLEARED_AFTER_PUT, null},
                //DeleteLedger() ha effetto solo sul metodo forEach()
                /*{"Get dopo deleteLedger(): ledger specifico rimosso ", LEDGER_ID, ENTRY_ID, GetCacheState.DELETE_LEDGER_AFTER_PUT, null},*/
        });
    }

    @Before
    public void setUp() {
        writeCache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
        switch (initialState) {
            case EMPTY: break;
            case SINGLE_ENTRY:
                writeCache.put(LEDGER_ID, ENTRY_ID, DATA);
                break;
            case MULTI_SEGMENT_ENTRY:
                writeCache.put(LEDGER_ID, ENTRY_ID, DATA);
                writeCache.put(LEDGER_ID, ENTRY_ID+1, DATA_1);
                writeCache.put(LEDGER_ID, ENTRY_ID+2, DATA_2); //Secondo segmento
                break;
            case CLEARED_AFTER_PUT:
                writeCache.put(LEDGER_ID, ENTRY_ID, DATA);
                writeCache.clear(); // Tutto deve sparire
                break;
            case DELETE_LEDGER_AFTER_PUT:
                writeCache.put(LEDGER_ID, ENTRY_ID, DATA);
                writeCache.deleteLedger(LEDGER_ID); // Solo uno sparisce
                break;
        }
    }

    @After
    public void tearDown() {
        if (writeCache != null) {
            writeCache.close();
        }
    }


    @Test
    public void testGet() {
        ByteBuf result = null;
        try {
            result = writeCache.get(ledgerIdToGet, entryIdToGet);

            // CASO 1: Ci aspettiamo un'eccezione
            if (expectedOutcome instanceof Class && Exception.class.isAssignableFrom((Class<?>) expectedOutcome)) {
                Assert.fail("Test '" + description + "' si aspettava un'eccezione "
                        + ((Class<?>) expectedOutcome).getName() + ", ma non è stata lanciata.");
            }

            // CASO 2: Ci aspettiamo un risultato nullo
            else if (expectedOutcome == null) {
                Assert.assertNull("Il risultato per '" + description + "' doveva essere null.", result);
            }

            // CASO 3: Ci aspettiamo un ByteBuf specifico
            else if (expectedOutcome instanceof ByteBuf) {
                Assert.assertNotNull("Il risultato per '" + description + "' non doveva essere null.", result);
                Assert.assertEquals("Contenuto del buffer errato per '" + description + "'",
                        ((ByteBuf) expectedOutcome).slice(), result.slice());
            }

            // CASO 4: Abbiamo passato un tipo non gestito
            else {
                Assert.fail("Tipo di 'expectedOutcome' non valido nel setup del test: " + expectedOutcome.getClass().getName());
            }

        } catch (Exception e) {
            // Se non ci aspettavamo un'eccezione, il test fallisce.
            if (!(expectedOutcome instanceof Class && Exception.class.isAssignableFrom((Class<?>) expectedOutcome))) {
                Assert.fail("Test '" + description + "' ha lanciato un'eccezione inattesa: " + e);
            }

            // Altrimenti, verifichiamo che sia del tipo corretto.
            Class<?> expectedExceptionClass = (Class<?>) expectedOutcome;
            Assert.assertTrue("Tipo di eccezione errato per '" + description + "'. Atteso: "
                            + expectedExceptionClass.getName() + ", Trovato: " + e.getClass().getName(),
                    expectedExceptionClass.isAssignableFrom(e.getClass()));
        } finally {
            if (result != null) {
                result.release();
            }
        }
    }
}