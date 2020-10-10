package com.algorithm.array.leetcode;

import java.util.Arrays;

public class ArrayPartition1 {

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        int start = 0;
        int end = nums.length - 1;
        Arrays.sort(nums);
        while (start < end) {
            sum+=Math.min(nums[start],nums[start+1]);
            start+=2;
        }
        return sum;
    }
}
