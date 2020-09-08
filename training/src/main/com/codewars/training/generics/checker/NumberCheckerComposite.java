package com.codewars.training.generics.checker;

import java.util.ArrayList;
import java.util.List;

public class NumberCheckerComposite<T extends Number> {
    private List<NumberChecker<T>> numberCheckers;
    private int numberOfOddNumbers = 0;
    private int numberOfPrimeNumbers = 0;
    private int numberOfPalindromeNumbers = 0;

    public NumberCheckerComposite() {
        this.numberCheckers = new ArrayList<>();
    }

    public NumberCheckerComposite(List<NumberChecker<T>> numberCheckers) {
        this.numberCheckers = numberCheckers;
    }

    public void addChecker(NumberChecker<T> numberChecker) {
        if (!numberCheckers.contains(numberChecker)) {
            numberCheckers.add(numberChecker);
        }
    }

    public PropertyHolder doCheck(T integer) {
        PropertyHolder propertyHolder = new PropertyHolder();
        for (NumberChecker<T> numberChecker : numberCheckers
             ) {
            propertyHolder.addProperty(numberChecker.checkNumber(integer));
        }
        return propertyHolder;
    }
}
