package org.apache.bookkeeper.bookie.storage.ldb;

import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Classe di test parametrizzata per i costruttori della classe WriteCache.
 * Segue una struttura classica con @Before per il setup e @After per la pulizia.
 * Utilizza un flag per decidere dinamicamente quale costruttore testare.
 */
@RunWith(Parameterized.class)
public class WriteCacheConstructorsTest {

    private static final ByteBufAllocator allocator = UnpooledByteBufAllocator.DEFAULT;


    private enum ConstructorType {
        TWO_ARGS,
        THREE_ARGS
    }

    private final String description;
    private final ConstructorType constructorToTest;
    private final long maxCacheSize;
    private final int maxSegmentSize;
    private final Class<? extends Throwable> expectedException;


    private WriteCache writeCache = null;


    public WriteCacheConstructorsTest(String description, ConstructorType constructorToTest, long maxCacheSize, int maxSegmentSize, Class<? extends Throwable> expectedException) {
        this.description = description;
        this.constructorToTest = constructorToTest;
        this.maxCacheSize = maxCacheSize;
        this.maxSegmentSize = maxSegmentSize;
        this.expectedException = expectedException;
    }


    @Parameterized.Parameters(name = "{index}: {0}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{

                // Test per il costruttore a 3 argomenti
                {"Constructor Test: invalid maxSegmentSize <= 0", ConstructorType.THREE_ARGS, 1, 0, IllegalArgumentException.class},
                {"Constructor Test: invalid maxCacheSize ", ConstructorType.THREE_ARGS, -1, 2, IllegalArgumentException.class},
                {"Constructor Test: maxCacheSize < maxSegmentSize", ConstructorType.THREE_ARGS, 1, 2, null},
                {"Constructor Test: invalid maxSegmentSize != 2^n", ConstructorType.THREE_ARGS, 10, 10, IllegalArgumentException.class},

                // Test per il costruttore a 2 argomenti
                {"Constructor Test: 2-args valid", ConstructorType.TWO_ARGS, 1024, 0, null},

        });
    }

    @After
    public void tearDown() {
        if (this.writeCache != null) {
            this.writeCache.close();
        }
    }
    @Test
    public void testConstructor() {
        try {
            switch (constructorToTest) {
                case TWO_ARGS:
                    this.writeCache = new WriteCache(allocator, maxCacheSize);
                    break;
                case THREE_ARGS:
                    this.writeCache = new WriteCache(allocator, maxCacheSize, maxSegmentSize);
                    break;
                default:
                    Assert.fail("Tipo di costruttore non gestito nel test: " + constructorToTest);
            }

            // Se arriviamo qui, l'operazione ha avuto successo.
            // Se ci aspettavamo un'eccezione, il test deve fallire.
            if (expectedException != null) {
                Assert.fail("Test '" + description + "' doveva lanciare " + expectedException.getName() + " ma non l'ha fatto.");
            }

            // Verifichiamo che l'oggetto sia stato creato.
            Assert.assertNotNull("L'istanza di WriteCache non doveva essere null per il caso: " + description, this.writeCache);

        } catch (Throwable e) {
            // Un'eccezione è stata lanciata, verifichiamo se era quella attesa.
            if (expectedException == null) {
                Assert.fail("Test '" + description + "' ha lanciato un'eccezione inattesa: " + e);
            } else {
                Assert.assertTrue("Tipo di eccezione errato per '" + description + "'. Atteso: "
                                + expectedException.getName() + ", Trovato: " + e.getClass().getName(),
                        expectedException.isAssignableFrom(e.getClass()));
            }
        }
    }
}