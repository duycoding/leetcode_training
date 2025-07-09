package com.duycoding;

import java.util.Arrays;

public class MaxSubsequence {
    public static int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);

        int[] indexs = new int[k];
        for (int i = 0; i < k; i++) {
            indexs[i] = arr[i][1];
        }

        Arrays.sort(indexs);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[indexs[i]];
        }

        return result;
    }
}
