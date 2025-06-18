package com.duycoding;

import com.duycoding.DailyQuestions.DivideArrayIntoArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []nums = {1,3,4,8,7,9,3,5,1};

        int k = 2;

        int [][] result = DivideArrayIntoArray.divideArray(nums, k);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + ", " + result[i][1] + ", "+ result[i][2]);
        }
    }
}