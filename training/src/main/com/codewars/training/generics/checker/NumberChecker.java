package com.codewars.training.generics.checker;

public interface NumberChecker<T extends Number> {
    Property checkNumber(T number);
}
