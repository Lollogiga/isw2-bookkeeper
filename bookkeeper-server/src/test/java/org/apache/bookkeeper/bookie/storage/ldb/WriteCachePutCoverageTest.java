package org.apache.bookkeeper.bookie.storage.ldb;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.apache.bookkeeper.util.collections.ConcurrentLongLongHashMap;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// NOTA: Questa classe NON ha l'annotazione @RunWith(Parameterized.class)
public class WriteCachePutCoverageTest {

    private WriteCache writeCache;
    private static final long MAX_CACHE_SIZE = 1024;
    private static final int MAX_SEGMENT_SIZE = 256;

    @Before
    public void setUp() {
        // Setup base per ogni test in questa classe
        writeCache = new WriteCache(UnpooledByteBufAllocator.DEFAULT, MAX_CACHE_SIZE, MAX_SEGMENT_SIZE);
    }

    @After
    public void tearDown() {
        if (writeCache != null) {
            writeCache.close();
        }
    }

    /**
     * Testa la robustezza del loop `while` nel metodo `put` in uno scenario di race condition simulata.
     * L'obiettivo è forzare il metodo `compareAndSet` (CAS) a fallire al primo tentativo per verificare
     * che il loop venga eseguito una seconda volta, coprendo così una branch di codice altrimenti
     * irraggiungibile in un test single-thread.
     * Utilizza Mockito per creare un "sosia" (mock) e la Riflessione per "iniettarlo" nella classe.
     */
    @Test
    public void testPutWithTransientCasFailure() throws Exception {
        System.out.println("Esecuzione test: Put con fallimento transitorio di compareAndSet");

        // FASE 1: CREAZIONE DEL "SOSIA" (MOCK) E DEFINIZIONE DEL SUO COMPORTAMENTO
        ConcurrentLongLongHashMap mockMap = mock(ConcurrentLongLongHashMap.class);
        when(mockMap.get(anyLong())).thenReturn(-1L);
        when(mockMap.compareAndSet(anyLong(), anyLong(), anyLong()))
                .thenReturn(false) // Fallisce la prima volta
                .thenReturn(true); // Riesce la seconda volta

        // FASE 2: INIEZIONE DEL MOCK TRAMITE RIFLESSIONE
        Field field = WriteCache.class.getDeclaredField("lastEntryMap");
        field.setAccessible(true);
        field.set(writeCache, mockMap);

        // FASE 3: ESECUZIONE DELL'AZIONE
        ByteBuf entry = Unpooled.buffer(64).writeBytes(new byte[64]);
        boolean result = writeCache.put(100L, 100L, entry);

        // FASE 4: VERIFICA DEI RISULTATI
        Assert.assertTrue("Il put deve avere successo dopo il fallimento transitorio", result);
        Assert.assertEquals("La dimensione della cache deve essere aggiornata", 64, writeCache.size());
        Assert.assertEquals("Il conteggio della cache deve essere aggiornato", 1, writeCache.count());

        entry.release();
    }
}