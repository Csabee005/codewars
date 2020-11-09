package com.codewars.training.kprime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

public class KPrimes {

    public static long[] countKprimes(int k, long start, long end) {
        return LongStream.range(start, end + 1)
                .filter(number -> new PrimeCounter(number, k).countDivisors() == k)
                .toArray();
    }

    public static int puzzle(int s) {
        return 0;
    }
}
