package com.duycoding.DailyQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArrayIntoArray {
    // git challenge Divede Array into array with max difference
//    Bài toán yêu cầu chia mảng nums thành các mảng con kích thước 3 sao cho:
//
//    Tất cả phần tử trong mỗi mảng con đều có hiệu giữa 2 phần tử bất kỳ không vượt quá k.
//
//    Số lượng phần tử trong nums là bội số của 3 (nên ta sẽ chia được thành đúng n / 3 mảng con).
//
//    Nếu chia không được → trả về [].
//
//    Nếu có nhiều cách chia → trả về bất kỳ một cách chia hợp lệ nào.

    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i+=3) {
            int num1 = nums[i];
            int num2 = nums[i+1];
            int num3 = nums[i+2];
            if (num3 - num1 <= k) {
                List<Integer> group = Arrays.asList(num1, num2, num3);
                result.add(group);
            } else {
                return new int[0][0];
            }
        }

        int [][] output = new int[result.size()][3];
        for (int i = 0; i < result.size(); i++) {
            List<Integer> group = result.get(i);
            output[i][0] = group.get(0);
            output[i][1] = group.get(1);
            output[i][2] = group.get(2);
        }

        return output;
    }
}
