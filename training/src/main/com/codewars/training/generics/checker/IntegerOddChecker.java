package com.codewars.training.generics.checker;

public class IntegerOddChecker implements IntegerChecker {


    @Override
    public Property checkNumber(Integer integer) {
        Property property;
        if (isOdd(integer)) {
            property = Property.ODD;
        } else {
            property = Property.NORMAL;
        }
        return property;
    }

    private boolean isOdd(Integer integer) {
        return integer %2 == 1;
    }
}
