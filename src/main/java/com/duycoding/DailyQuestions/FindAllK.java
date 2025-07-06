package com.duycoding.DailyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllK {
    public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keyindex = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key)
                keyindex.add(i);

        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j : keyindex) {
                if (Math.abs(j - i) <= k) {
                    result.add(i);
                    break;
                }
            }
        }

        return result;
    }
}
