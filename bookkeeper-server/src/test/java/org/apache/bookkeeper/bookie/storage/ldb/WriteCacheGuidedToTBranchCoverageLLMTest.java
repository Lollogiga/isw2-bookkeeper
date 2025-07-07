package org.apache.bookkeeper.bookie.storage.ldb;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.apache.bookkeeper.util.collections.ConcurrentLongLongHashMap;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Suite di test completa per la classe WriteCache, progettata per massimizzare la branch coverage.
 * Ogni metodo di test è mirato a coprire specifiche condizioni logiche (if, while, etc.)
 * identificate nell'analisi del codice sorgente.
 *
 * NOTA: Per semplicità e per focalizzarsi sulla logica di business,
 * questa classe non usa test parametrizzati ma metodi di test individuali e descrittivi.
 */
public class WriteCacheGuidedToTBranchCoverageLLMTest {

    private WriteCache cache;
    private final UnpooledByteBufAllocator allocator = UnpooledByteBufAllocator.DEFAULT;

    private static final long MAX_CACHE_SIZE = 1024;
    private static final int MAX_SEGMENT_SIZE = 256; // Deve essere una potenza di 2

    @After
    public void tearDown() {
        if (cache != null) {
            cache.close();
        }
    }

    // --- PASSO 2: Analisi e Test del Costruttore ---

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithInvalidSegmentSize() {
        // Testa: checkArgument(maxSegmentSize > 0) -> false
        new WriteCache(allocator, MAX_CACHE_SIZE, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithNonPowerOfTwoSegmentSize() {
        // Testa: checkArgument(maxSegmentSize == alignedMaxSegmentSize) -> false
        new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE - 1);
    }

    @Test
    public void testConstructorWithValidArguments() {
        // Testa i percorsi di successo del costruttore
        cache = new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
        Assert.assertNotNull(cache);
        Assert.assertTrue(cache.isEmpty());
        Assert.assertEquals(0, cache.size());
        Assert.assertEquals(0, cache.count());
    }

    @Test
    public void testTwoArgsConstructor() {
        // Testa il costruttore con due argomenti
        cache = new WriteCache(allocator, MAX_CACHE_SIZE);
        Assert.assertNotNull(cache);
    }


    // --- PASSO 2: Analisi e Test del Metodo put ---

    @Test
    public void testPutCacheFull() {
        // Testa: if ((offset + size) > maxCacheSize) -> true
        cache = new WriteCache(allocator, 128, 64);
        ByteBuf entry = Unpooled.buffer(64).writeBytes(new byte[64]);

        Assert.assertTrue("Il primo put deve avere successo", cache.put(1L, 1L, entry.retainedDuplicate()));
        Assert.assertTrue("Il secondo put deve avere successo", cache.put(1L, 2L, entry.retainedDuplicate()));

        // Questo put dovrebbe fallire perché la cache è piena
        Assert.assertFalse("Il terzo put deve fallire", cache.put(1L, 3L, entry.retainedDuplicate()));
        entry.release();
    }

    @Test
    public void testPutCausesSegmentRollover() {
        // Testa: else if (maxSegmentSize - localOffset < size) -> true
        cache = new WriteCache(allocator, MAX_SEGMENT_SIZE * 2, MAX_SEGMENT_SIZE);
        ByteBuf largeEntry = Unpooled.buffer(MAX_SEGMENT_SIZE - 64).writeBytes(new byte[MAX_SEGMENT_SIZE - 64]);
        ByteBuf smallEntry = Unpooled.buffer(128).writeBytes(new byte[128]);

        // 1. Riempi il primo segmento quasi completamente
        Assert.assertTrue(cache.put(1L, 1L, largeEntry.retainedDuplicate()));
        Assert.assertEquals(MAX_SEGMENT_SIZE - 64, cache.size());

        // 2. Questo put non entrerà nello spazio rimanente e dovrà passare al segmento successivo
        Assert.assertTrue(cache.put(2L, 1L, smallEntry.retainedDuplicate()));

        // Verifica che la cache contenga entrambe le entry
        Assert.assertEquals(2, cache.count());
        Assert.assertEquals((MAX_SEGMENT_SIZE - 64) + 128, cache.size());

        largeEntry.release();
        smallEntry.release();
    }

    @Test
    public void testPutWithOutOfOrderEntryId() {
        // Testa: if (currentLastEntryId > entryId) -> true
        cache = new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
        ByteBuf entry1 = Unpooled.buffer(64).writeBytes(new byte[64]);
        ByteBuf entry2 = Unpooled.buffer(64).writeBytes(new byte[64]);

        // Inserisci una entry più "nuova"
        Assert.assertTrue(cache.put(1L, 10L, entry1.retainedDuplicate()));
        // Inserisci una entry più "vecchia" per lo stesso ledger
        Assert.assertTrue(cache.put(1L, 5L, entry2.retainedDuplicate()));

        // L'ultima entry deve essere ancora quella con ID 10
        ByteBuf lastEntry = cache.getLastEntry(1L);
        Assert.assertNotNull(lastEntry);

        ByteBuf expected = cache.get(1L, 10L);
        Assert.assertEquals(expected.slice(), lastEntry.slice());

        lastEntry.release();
        expected.release();
        entry1.release();
        entry2.release();
    }

    @Test
    public void testPutWithTransientCasFailure() throws Exception {
        // Testa: if (lastEntryMap.compareAndSet(...)) -> false (simulato)
        cache = new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);

        // 1. Crea un mock della mappa interna
        ConcurrentLongLongHashMap mockMap = mock(ConcurrentLongLongHashMap.class);
        when(mockMap.get(anyLong())).thenReturn(-1L); // Simula che non ci sia nessuna entry precedente
        // Configura il comportamento del CAS: fallisce la prima volta, riesce la seconda
        when(mockMap.compareAndSet(anyLong(), anyLong(), anyLong()))
                .thenReturn(false) // 1° tentativo fallisce
                .thenReturn(true);  // 2° tentativo ha successo

        // 2. Inietta il mock nella cache usando la reflection
        Field field = WriteCache.class.getDeclaredField("lastEntryMap");
        field.setAccessible(true);
        field.set(cache, mockMap);

        // 3. Esegui il put
        ByteBuf entry = Unpooled.buffer(64).writeBytes(new byte[64]);
        boolean result = cache.put(100L, 100L, entry.retainedDuplicate());

        // 4. Verifica
        Assert.assertTrue("Il put deve avere successo anche dopo un fallimento transitorio del CAS", result);
        Assert.assertEquals(1, cache.count());
        Assert.assertEquals(64, cache.size());
        Mockito.verify(mockMap, Mockito.times(2)).compareAndSet(100L, -1L, 100L);

        entry.release();
    }

    // --- PASSO 2: Analisi e Test del Metodo get ---

    @Test
    public void testGetNonExistentEntry() {
        // Testa: if (result == null) -> true
        cache = new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
        Assert.assertNull("Get di una entry non esistente deve restituire null", cache.get(1L, 1L));
    }

    @Test
    public void testGetExistingEntry() {
        // Testa: if (result == null) -> false
        cache = new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
        ByteBuf entry = Unpooled.buffer(64).writeBytes(new byte[64]);
        cache.put(1L, 1L, entry.retainedDuplicate());

        ByteBuf result = cache.get(1L, 1L);
        Assert.assertNotNull("Get di una entry esistente non deve restituire null", result);
        Assert.assertEquals(entry.slice(), result.slice());

        entry.release();
        result.release();
    }

    // --- PASSO 2: Analisi e Test del Metodo getLastEntry ---

    @Test
    public void testGetLastEntryForUnknownLedger() {
        // Testa: if (lastEntryId == -1) -> true
        cache = new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
        Assert.assertNull("GetLastEntry per un ledger sconosciuto deve restituire null", cache.getLastEntry(99L));
    }

    // --- PASSO 2: Analisi e Test del Metodo forEach ---

    @Test
    public void testForEachIgnoresDeletedLedger() throws IOException {
        // Testa: if (deletedLedgers.contains(ledgerId)) -> true
        cache = new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
        ByteBuf entry1 = Unpooled.buffer(64).writeBytes(new byte[64]);
        ByteBuf entry2 = Unpooled.buffer(64).writeBytes(new byte[64]);

        cache.put(1L, 1L, entry1.retainedDuplicate()); // Da mantenere
        cache.put(2L, 1L, entry2.retainedDuplicate()); // Da cancellare

        // Cancella il ledger 2
        cache.deleteLedger(2L);

        final List<Long> foundLedgers = new ArrayList<>();
        cache.forEach((ledgerId, entryId, entry) -> foundLedgers.add(ledgerId));

        Assert.assertEquals("La lista deve contenere un solo ledger", 1, foundLedgers.size());
        Assert.assertEquals("Deve essere il ledger non cancellato", (Long) 1L, foundLedgers.get(0));

        entry1.release();
        entry2.release();
    }

    @Test
    public void testForEachWithNoDeletedLedgers() throws IOException {
        // Testa: if (deletedLedgers.contains(ledgerId)) -> false
        cache = new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
        cache.put(1L, 1L, Unpooled.buffer(10).writerIndex(10));
        cache.put(2L, 1L, Unpooled.buffer(10).writerIndex(10));

        final List<Long> foundLedgers = new ArrayList<>();
        cache.forEach((ledgerId, entryId, entry) -> foundLedgers.add(ledgerId));

        Assert.assertEquals("Devono essere trovati due ledger", 2, foundLedgers.size());
    }

    @Test
    public void testForEachWithEmptyCache() throws IOException {
        // Testa il comportamento di forEach su una cache vuota
        cache = new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
        final AtomicBoolean consumerCalled = new AtomicBoolean(false);

        cache.forEach((ledgerId, entryId, entry) -> consumerCalled.set(true));

        Assert.assertFalse("Il consumer non deve essere chiamato per una cache vuota", consumerCalled.get());
    }

    @Test(expected = IOException.class)
    public void testForEachPropagatesException() throws IOException {
        // Testa che un'eccezione lanciata dal consumer venga propagata
        cache = new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
        cache.put(1L, 1L, Unpooled.buffer(10).writerIndex(10));

        cache.forEach((ledgerId, entryId, entry) -> {
            throw new IOException("Test Exception");
        });
    }

    // --- Test aggiuntivi per completezza ---

    @Test
    public void testClear() {
        cache = new WriteCache(allocator, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
        cache.put(1L, 1L, Unpooled.buffer(64).writerIndex(64));
        cache.deleteLedger(1L);

        Assert.assertFalse(cache.isEmpty());
        Assert.assertEquals(1, cache.count());

        cache.clear();

        Assert.assertTrue(cache.isEmpty());
        Assert.assertEquals(0, cache.size());
        Assert.assertEquals(0, cache.count());
        Assert.assertNull(cache.get(1L, 1L));
        Assert.assertNull(cache.getLastEntry(1L));
    }
}