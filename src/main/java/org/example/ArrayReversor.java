package org.example;

import java.util.Arrays;


public class ArrayReversor {
    private ArrayFlattenerService service;

    public ArrayReversor(ArrayFlattenerService service) {
        this.service = service;
    }

    public int[] reverseArray(int[][] inputArray) {
        int[] flattenedArray = service.flattenArray(inputArray);
        int[] reversedArray = new int[flattenedArray.length];

        for (int i = 0; i < flattenedArray.length; i++) {
            reversedArray[i] = flattenedArray[flattenedArray.length - 1 - i];
        }
        return reversedArray;
    }
}
