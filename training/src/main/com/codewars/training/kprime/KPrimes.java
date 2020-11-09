package com.codewars.training.kprime;

import java.util.ArrayList;
import java.util.List;

public class KPrimes {

    public static long[] countKprimes(int k, long start, long end) {
        List<Long> kPrimeList = new ArrayList<>();
        for (long i = start; i < end; i++) {
            PrimeCounter primeCounter = new PrimeCounter(i, k);
            if (primeCounter.countDivisors() == k) {
                kPrimeList.add(i);
            }
        }
        return convertToArray(kPrimeList);
    }

    private static long[] convertToArray(List<Long> kPrimeList) {
        long[] kPrimes = new long[kPrimeList.size()];
        for (int i = 0; i < kPrimeList.size(); i++) {
            kPrimes[i] = kPrimeList.get(i);
        }
        return kPrimes;
    }

    public static int puzzle(int s) {
        return 0;
    }
}
