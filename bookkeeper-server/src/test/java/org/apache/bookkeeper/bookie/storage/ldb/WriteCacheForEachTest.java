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

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RunWith(Parameterized.class)
public class WriteCacheForEachTest {

    private final String description;
    private final ForEachCacheState initialState;
    private final Object expectedOutcome;
    final List<String> entryContents = new ArrayList<>();

    private WriteCache writeCache;
    private static final long MAX_CACHE_SIZE = 1024;
    private static final int MAX_SEGMENT_SIZE = 256;

    private static final ByteBuf DATA   = Unpooled.buffer(64).writeBytes(fillArray((byte) 0x11, 64));
    private static final ByteBuf DATA_1 = Unpooled.buffer(64).writeBytes(fillArray((byte) 0x22, 64));
    private static final long LEDGER_ID = 0;
    private static final long ENTER_ID = 0;

    /**
     * Enum per definire lo stato iniziale della cache prima di un test 'forEach'.
     */
    private enum ForEachCacheState {
        EMPTY,
        SINGLE_ENTRY,
        UNORDERED_ENTRIES,          // Entry inserite in disordine per testare l'ordinamento
        WITH_DELETED_LEDGER,        // Contiene entry di un ledger che verrà ignorato
        DUPLICATE_ENTRY,
        CONSUMER_THROWS_IOEXCEPTION, // Stato per testare il caso in cui il consumer lanci un'eccezione (Ad esempio prova a scrivere su file senza permessi)
    }

    private static byte[] fillArray(byte value, int size) {
        byte[] array = new byte[size];
        Arrays.fill(array, value);
        return array;
    }

    public WriteCacheForEachTest(String description, ForEachCacheState initialState, Object expectedOutcome) {
        this.description = description;
        this.initialState = initialState;
        this.expectedOutcome = expectedOutcome;
    }

    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // --- DESCRIZIONE, INITIAL_STATE, EXPECTED_OUTCOME (lista ordinata di coppie {ledgerId, entryId}) ---

                {"forEach su cache vuota", ForEachCacheState.EMPTY, Collections.emptyList()},
                {"forEach con una singola entry", ForEachCacheState.SINGLE_ENTRY, Collections.singletonList(new long[]{LEDGER_ID, ENTER_ID})},

                //Verifichiamo il corretto ordinamento
                {"forEach con più entry", ForEachCacheState.UNORDERED_ENTRIES, Arrays.asList(new long[]{LEDGER_ID, ENTER_ID}, new long[]{LEDGER_ID, ENTER_ID+1}, new long[]{LEDGER_ID+1, ENTER_ID})},

                {"forEach entry cancellata", ForEachCacheState.WITH_DELETED_LEDGER, Collections.singletonList(new long[]{LEDGER_ID, ENTER_ID})},
                {"forEach propaga l'IOException dal consumer", ForEachCacheState.CONSUMER_THROWS_IOEXCEPTION, IOException.class},
                {"forEach entry duplicata", ForEachCacheState.DUPLICATE_ENTRY, Collections.singletonList(new long[]{LEDGER_ID, ENTER_ID})},


        });
    }

    @Before
    public void setUp() {
        writeCache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);

        switch (initialState) {
            case EMPTY:
                break;
            case SINGLE_ENTRY:
            case CONSUMER_THROWS_IOEXCEPTION:
                writeCache.put(LEDGER_ID, ENTER_ID, DATA);
                break;
            case UNORDERED_ENTRIES:
                // Inseriamo le entry in disordine
                writeCache.put(LEDGER_ID+1, ENTER_ID, DATA);
                writeCache.put(LEDGER_ID, ENTER_ID, DATA);
                writeCache.put(LEDGER_ID, ENTER_ID+1, DATA);
                break;
            case WITH_DELETED_LEDGER:
                writeCache.put(LEDGER_ID+1, ENTER_ID, DATA);
                writeCache.put(LEDGER_ID, ENTER_ID, DATA);
                writeCache.put(LEDGER_ID+1, ENTER_ID+1, DATA);
                writeCache.deleteLedger(LEDGER_ID+1); // Cancella tutte le entry del ledger 1
                break;
            case DUPLICATE_ENTRY:
                writeCache.put(LEDGER_ID, ENTER_ID, DATA);
                writeCache.put(LEDGER_ID, ENTER_ID, DATA_1);
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
    public void testForEach() {
        final List<long[]> actualEntries = new ArrayList<>();

        try {
            WriteCache.EntryConsumer consumer = (ledgerId, entryId, entry) -> {
                // Per il test dell'eccezione
                if (initialState == ForEachCacheState.CONSUMER_THROWS_IOEXCEPTION) {
                    throw new IOException("Test exception from consumer");
                }
                actualEntries.add(new long[]{ledgerId, entryId});

                if (initialState == ForEachCacheState.DUPLICATE_ENTRY) {
                    ByteBuf copied = entry.retainedDuplicate();
                    byte[] bytes = new byte[copied.readableBytes()];
                    copied.readBytes(bytes);
                    String content = new String(bytes, StandardCharsets.UTF_8);
                    entryContents.add(content);
                    copied.release();
                }
            };

            writeCache.forEach(consumer);

            // Se ci aspettavamo un'eccezione, ma siamo arrivati qui, il test è fallito
            if (expectedOutcome instanceof Class) {
                Assert.fail("Test '" + description + "' si aspettava un'eccezione ma non è stata lanciata.");
            }

            // Altrimenti, confrontiamo la lista di entry raccolte con quella attesa
            @SuppressWarnings("unchecked")
            List<long[]> expectedEntries = (List<long[]>) expectedOutcome;

            Assert.assertEquals("Numero di entry errato per '" + description + "'",
                    expectedEntries.size(), actualEntries.size());

            for (int i = 0; i < expectedEntries.size(); i++) {
                Assert.assertArrayEquals("Entry alla posizione " + i + " non corrisponde per '" + description + "'",
                        expectedEntries.get(i), actualEntries.get(i));
            }

            //Confrontiamo i byte attesi con quelli di attuali
            if (initialState == ForEachCacheState.DUPLICATE_ENTRY) {
                // Costruisci il contenuto atteso a partire da DATA_1
                byte[] expectedBytes = new byte[DATA_1.readableBytes()];
                DATA_1.getBytes(DATA_1.readerIndex(), expectedBytes);
                String expectedContent = new String(expectedBytes, StandardCharsets.UTF_8);

                Assert.assertEquals("Contenuto della entry duplicata non corrisponde",
                        Collections.singletonList(expectedContent), entryContents);
            }

        } catch (IOException e) {
            // Se non ci aspettavamo un'eccezione, il test fallisce
            if (!(expectedOutcome instanceof Class)) {
                Assert.fail("Test '" + description + "' ha lanciato un'eccezione inattesa: " + e);
            }

            // Altrimenti, verifichiamo che sia del tipo corretto
            Class<?> expectedExceptionClass = (Class<?>) expectedOutcome;
            Assert.assertTrue("Tipo di eccezione errato per '" + description + "'. Atteso: "
                            + expectedExceptionClass.getName() + ", Trovato: " + e.getClass().getName(),
                    expectedExceptionClass.isAssignableFrom(e.getClass()));
        }
    }
}