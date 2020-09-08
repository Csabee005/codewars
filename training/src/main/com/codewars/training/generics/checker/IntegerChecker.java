package com.codewars.training.generics.checker;

public interface IntegerChecker extends NumberChecker<Integer> {
    Property checkNumber(Integer integer);
}
