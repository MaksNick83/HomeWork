import eu.hillel.hw10.primenumbers.runnable.PrimeRunnable;
import eu.hillel.hw10.primenumbers.storage.PrimeStorage;

public class PrimeNumberRunner {
    private int min;
    private int max;
    private int count;
    private PrimeRunnable[] primeRunnables;
    private Thread[] threads;
    private PrimeStorage primeStorage;

    public PrimeNumberRunner(int min, int max, int count, PrimeStorage primeStorage) {
        this.min = min;
        this.max = max;
        this.count = count;
        this.primeStorage = primeStorage;
        this.primeRunnables = new PrimeRunnable[count];
        this.threads = new Thread[count];
        generateThread();
    }

    public void startThreads() {
        for (int i = 0; i < primeRunnables.length; i++) {
            threads[i] = new Thread(primeRunnables[i]);
            threads[i].start();
        }

    }

    public void waitThread() throws InterruptedException {
        for (Thread thread : threads) {
            thread.join();
        }
    }

    private void generateThread() {
        int countDigits = (min == 0) ? (max / count) : ((max - min) / count) + 1;
        int i = 0;
        int startInterval = min;
        do {
            i++;
            if (count == 1) {
                primeRunnables[count - 1] = new PrimeRunnable(startInterval, max, primeStorage);
                break;
            }
            if (i == countDigits) {
                primeRunnables[count - 1] = new PrimeRunnable(startInterval, min, primeStorage);
                count--;
                startInterval = min + 1;
                i = 0;
            }
            min++;
        } while (true);
    }

    public PrimeRunnable[] getPrimeRunnables() {
        return primeRunnables;
    }
}