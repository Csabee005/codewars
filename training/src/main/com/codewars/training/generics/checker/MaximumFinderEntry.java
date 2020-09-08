package com.codewars.training.generics.checker;

import java.util.ArrayList;
import java.util.List;

public class MaximumFinderEntry {
    /*
    Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes).
     */

    public static void main(String[] args) {
        NumberChecker<Integer> integerOddNumberChecker = new IntegerOddChecker();
        NumberChecker<Integer> integerPrimeNumberChecker = new IntegerPrimeChecker();
        NumberChecker<Integer> integerPalindromeNumberChecker = new IntegerPalindromeChecker();
        NumberCheckerComposite<Integer> numberCheckerComposite = new NumberCheckerComposite<>();
        numberCheckerComposite.addChecker(integerOddNumberChecker);
        numberCheckerComposite.addChecker(integerPalindromeNumberChecker);
        numberCheckerComposite.addChecker(integerPrimeNumberChecker);
        List<Integer> integerList = createIntegerList();
        List<PropertyHolder> propertyList = new ArrayList<>();
        for (Integer integer : integerList
             ) {
             propertyList.add(numberCheckerComposite.doCheck(integer));
        }
        for (int i = 0; i < propertyList.size() ; i++) {
            if (propertyList.get(i).isOdd() && propertyList.get(i).isPalindrome() && propertyList.get(i).isPrime()) {
                String cool = "cool";
            }
        }
    }

    private static ArrayList<Integer> createIntegerList() {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integerArrayList.add(i);
        }
        return integerArrayList;
    }
}
