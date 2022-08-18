package eu.hillel.hw10.primenumbers.storage;

import eu.hillel.hw10.primenumbers.util.ArrayUtils;

import java.util.Arrays;

public class PrimeStorage {
    private int[] primes = new int[0];

    public synchronized void addPrimes(int[] addPrimes) {

        primes = ArrayUtils.addArrayToArray(primes, addPrimes);
    }

    @Override
    public String toString() {
        return "StoragePrimes{" +
                "primes=" + Arrays.toString(primes) +
                '}';
    }

    public int[] getPrimes() {
        return primes;
    }
}
