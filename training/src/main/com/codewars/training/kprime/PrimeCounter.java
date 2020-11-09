package com.codewars.training.kprime;

import java.util.ArrayList;
import java.util.List;

public class PrimeCounter {
    private final long kPrimeLevel;

    private long numberToCheck;

    public PrimeCounter(long numberToCheck, int kPrimeLevel) {
        this.numberToCheck = numberToCheck;
        this.kPrimeLevel = kPrimeLevel;
    }

    public int countDivisors() {
        int primeLevel = 0;
        for (long i = 2; i < Math.sqrt(numberToCheck) + 1; ++i) {
            while (numberToCheck % i == 0) {
                primeLevel++;
                numberToCheck /= i;
            }
        }
        if (numberToCheck > 1) {
            primeLevel++;
        }
        return primeLevel;
    }

}
