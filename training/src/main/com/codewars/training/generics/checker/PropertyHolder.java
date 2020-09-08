package com.codewars.training.generics.checker;

import java.util.ArrayList;
import java.util.List;

public class PropertyHolder {
    private final List<Property> properties = new ArrayList<>();
    private int index = 0;

    public void addProperty(Property property) {
        properties.add(property);
    }

    public boolean isOdd() {
        return properties.contains(Property.ODD);
    }

    public boolean isPalindrome() {
        return properties.contains(Property.PALINDROME);
    }

    public boolean isPrime() {
        return properties.contains(Property.PRIME);
    }
}
