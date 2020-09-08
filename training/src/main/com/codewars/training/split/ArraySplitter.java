package com.codewars.training.split;

import java.util.Arrays;

public class ArraySplitter {
    public static int[] splitAndAdd(int[] numbers, int n) {
        int[] outputArray = Arrays.copyOf(numbers, numbers.length);
        for (int i = 0; i < n; i++) {
            int splitIndex = splitArray(outputArray);
            int secondArrayLength = getSecondArrayLength(outputArray, splitIndex);
            for (int j = 0; j < splitIndex; j++) {
                outputArray[j] += outputArray[j + secondArrayLength];
            }
            outputArray = createOutputArray(outputArray, secondArrayLength);
        }
        return outputArray;
    }

    private static int[] createOutputArray(int[] outputArray, int secondArrayLength) {
        int[] newArray = Arrays.copyOf(outputArray, secondArrayLength);
        if (isShuffleRequired(outputArray)) {
            newArray = placeLastElementToFront(newArray);
        }
        return newArray;
    }

    private static boolean isShuffleRequired(int[] array) {
        return array.length%2==1;
    }

    private static int[] placeLastElementToFront(int[] newArray) {
        int[] correctedArray = Arrays.copyOf(newArray, newArray.length);
        int lastElement = correctedArray[correctedArray.length - 1];
        System.arraycopy(correctedArray, 0, correctedArray, 1, correctedArray.length - 1);
        correctedArray[0] = lastElement;
        return correctedArray;
    }

    private static int getSecondArrayLength(int[] outputArray, int splitIndex) {
        return outputArray.length - splitIndex;
    }

    private static int splitArray(int[] numbers) {
        return (numbers.length) / 2;
    }
}
