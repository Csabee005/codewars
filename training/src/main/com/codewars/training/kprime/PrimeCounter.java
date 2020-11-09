package com.codewars.training.kprime;

import java.util.ArrayList;
import java.util.List;

public class PrimeCounter {
    private final long numberToCheck;
    private final long kPrimeLevel;

    public PrimeCounter(long numberToCheck, int kPrimeLevel) {
        this.numberToCheck = numberToCheck;
        this.kPrimeLevel = kPrimeLevel;
    }

    public int countDivisors() {
        int numberOfDivisors = 0;
        List<Long> divisors = new ArrayList<>();
        for (int i = 1; i < numberToCheck / 2 + 1; i++) {
            if (numberToCheck %i == 0 && !divisors.contains(i) && !divisors.contains(numberToCheck/i)) {
                numberOfDivisors++;
                divisors.add(Integer.toUnsignedLong(i));
                long power = kPrimeLevel;
                while (Math.pow(i,power) != numberToCheck && numberToCheck%Math.pow(i,power) == 0 && i != 1) {
                    numberOfDivisors++;
                    divisors.add(Integer.toUnsignedLong((int) Math.pow(i,power)));
                    power++;
                }
            }
        }
        return numberOfDivisors;
    }

}
