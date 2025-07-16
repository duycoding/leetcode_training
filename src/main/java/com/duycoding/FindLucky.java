package com.duycoding;

import java.util.HashMap;
import java.util.Map;

public class FindLucky {
    public static int findLucky(int []arr) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            result.put(arr[i], result.getOrDefault(arr[i], 0) + 1);
        }

        int maxLucky = 0;
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            // lay key
            int key = entry.getKey();
            // lay so lan xuat hien
            int count = entry.getValue();
            if (key == count) {
                maxLucky = Math.max(maxLucky, key);
            }
        }

        return maxLucky;
    }
}
