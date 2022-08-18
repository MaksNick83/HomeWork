package eu.hillel.hw10.primenumbers.runnable;

import eu.hillel.hw10.primenumbers.util.ArrayUtils;
import eu.hillel.hw10.primenumbers.storage.PrimeStorage;

import java.util.Arrays;

public class PrimeRunnable implements Runnable {
    private int min;
    private int max;
    private PrimeStorage primeStorage;
    private int[] primeLocal = {};

    public PrimeRunnable(int min, int max, PrimeStorage primeStorage) {
        this.min = min;
        this.max = max;
        this.primeStorage = primeStorage;
    }

    public void run() {
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                primeLocal = ArrayUtils.addToArray(primeLocal, i);
            }
        }
        primeStorage.addPrimes(primeLocal);
    }

    boolean isPrime(int digit) {
        for (int i = 2; i <= Math.sqrt(digit); i++)
            if (digit % i == 0) {
                return false;
            }
        return true;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int[] getPrimeLocal() {
        return primeLocal;
    }

    public int getFirstPrimeLocal() {
        return primeLocal[0];
    }

    public int getLastPrimeLocal() {
        return primeLocal[primeLocal.length - 1];
    }

    @Override
    public String toString() {
        return "PrimeRunnable{" +
                "min=" + min +
                ", max=" + max +
                ", primeLocal=" + Arrays.toString(primeLocal) +
                '}';
    }
}
