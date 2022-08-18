import eu.hillel.hw10.primenumbers.runnable.PrimeRunnable;
import eu.hillel.hw10.primenumbers.storage.PrimeStorage;

public class Main {
    public static void main(String[] args) {
        int minValue = 1;
        int maxValue = 100;
        int countFlow = 10;
        PrimeStorage primeStorage = new PrimeStorage();
        PrimeNumberRunner primeNumberRunner = new PrimeNumberRunner(minValue, maxValue, countFlow, primeStorage);
        primeNumberRunner.startThreads();
        try {
            primeNumberRunner.waitThread();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(primeStorage);
        for (PrimeRunnable primeRunnable : primeNumberRunner.getPrimeRunnables()) {
            System.out.println(primeRunnable);
        }
    }
}