import eu.hillel.hw10.primenumbers.runnable.PrimeRunnable;
import eu.hillel.hw10.primenumbers.storage.PrimeStorage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeNumberRunnerTest {
    PrimeNumberRunner primeNumberRunner;
    PrimeStorage primeStorage;

    @BeforeEach
    void setUp() {
        int minValue = 1;
        int maxValue = 100;
        int countThreads = 10;
        primeStorage = new PrimeStorage();
        primeNumberRunner = new PrimeNumberRunner(minValue, maxValue, countThreads, primeStorage);
        primeNumberRunner.startThreads();
        try {
            primeNumberRunner.waitThread();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void countThreadsTest() {
        int result = primeNumberRunner.getPrimeRunnables().length;
        Assertions.assertEquals(10, result);
    }

    @Test
    void intervalArrayTest() {
        boolean isCorrect = true;
        for (PrimeRunnable primeRunnable : primeNumberRunner.getPrimeRunnables()) {
            if (primeRunnable.getFirstPrimeLocal() < primeRunnable.getMin() || primeRunnable.getLastPrimeLocal() > primeRunnable.getMax()) {
                isCorrect = false;
            }
        }
        Assertions.assertTrue(isCorrect);
    }

    @Test
    void subsequenceStorageTest() {
        int[] storage = primeStorage.getPrimes();
        boolean isSubsequence = true;
        for (PrimeRunnable primeRunnable : primeNumberRunner.getPrimeRunnables()) {
            int[] localPrimes = primeRunnable.getPrimeLocal();
            int firstPrime = localPrimes[0];
            for (int i = 0; i < storage.length; i++) {
                if (firstPrime == storage[i]) {
                    int k = i + 1;
                    int count = 0;
                    for (int j = 1; j < localPrimes.length; j++) {
                        if (storage[k] == localPrimes[j]) {
                            k++;
                            count++;
                        }
                    }
                    if (count != localPrimes.length - 1) {
                        isSubsequence = false;
                        break;
                    }
                }
            }
        }
        Assertions.assertTrue(isSubsequence);
    }

}

