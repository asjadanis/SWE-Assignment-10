package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayFlattener {
    public static int[] flattenArray(int[][] nestedArray) {
        if (nestedArray == null) return null;

        List<Integer> flatList = new ArrayList<>();
        for (int[] subArray : nestedArray) {
            for (int num : subArray) {
                flatList.add(num);
            }
        }
        return flatList.stream().mapToInt(i -> i).toArray();
    }
}

