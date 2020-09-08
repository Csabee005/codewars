package com.codewars.training.generics.checker;

public class IntegerPrimeChecker implements NumberChecker<Integer> {
    @Override
    public Property checkNumber(Integer number) {
        int numberOfDivisors = getNumberOfDivisors(number);
        boolean isPrime = checkPrime(numberOfDivisors);
        return getProperty(isPrime);
    }

    private int getNumberOfDivisors(Integer number) {
        int numberOfDivisors = 0;
        for (int i = 1; i < number / 2; i++) {
            if (number % i == 0) {
                numberOfDivisors++;
            }
        }
        return numberOfDivisors;
    }

    private Property getProperty(boolean isPrime) {
        Property property;
        if (isPrime) {
            property = Property.PRIME;
        } else {
            property = Property.NORMAL;
        }
        return property;
    }

    private boolean checkPrime(int numberOfDivisors) {
        return numberOfDivisors == 1;
    }
}
