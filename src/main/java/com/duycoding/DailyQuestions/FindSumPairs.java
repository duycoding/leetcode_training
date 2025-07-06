package com.duycoding.DailyQuestions;

import java.util.HashMap;

class FindSumPairs {
    int[] nums1;
    int[] nums2;
    HashMap<Integer, Integer> HMNums2;

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        HMNums2 = new HashMap<>();
        for (int i : nums2)
            HMNums2.put(i, HMNums2.getOrDefault(i, 0) + 1);
    }

    public void add(int index, int val) {
        int oldVal = nums2[index];
        int newVal = oldVal + val;

        HMNums2.put(oldVal, HMNums2.get(oldVal) - 1);
        if (HMNums2.get(oldVal) == 0)
            HMNums2.remove(oldVal);

        HMNums2.put(newVal, HMNums2.getOrDefault(newVal, 0) + 1);

        nums2[index] = newVal;
    }

    public int count(int tot) {
        int count = 0;

        for (int num : nums1) {
            int n1 = tot - num;
            count += HMNums2.getOrDefault(n1, 0);
        }

        return count;
    }
}
