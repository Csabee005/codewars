package com.codewars.training.generics.checker;

public class IntegerPalindromeChecker implements IntegerChecker {

    @Override
    public Property checkNumber(Integer integer) {
        String integerLeftToRight = integer.toString();
        String integerRightToLeft = getIntegerRightToLeft(integerLeftToRight);
        return determineProperty(integerLeftToRight.equals(integerRightToLeft));
    }

    private Property determineProperty(boolean equals) {
        Property property;
        if (equals) {
            property = Property.PALINDROME;
        } else {
            property = Property.NORMAL;
        }
        return property;
    }

    private String getIntegerRightToLeft(String integerLeftToRight) {
        return new StringBuilder(integerLeftToRight).reverse().toString();
    }
}
