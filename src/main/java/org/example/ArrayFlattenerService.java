package org.example;

import java.util.Arrays;

// Mock service
public class ArrayFlattenerService {
    public int[] flattenArray(int[][] arr) {
        return Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
    }
}
