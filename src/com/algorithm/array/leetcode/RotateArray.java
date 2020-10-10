package com.algorithm.array.leetcode;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {

        for (; k > 0; k--) {
            int end = nums[nums.length - 1];
            System.out.println("end" + end);
            for (int i = 0; i < nums.length; i++) {
                int temp = nums[i];
                nums[i] = end;
                end = temp;
            }
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void rotate2(int[] nums, int k) {
        int step = k% nums.length;
        int start = 0;
        int index = 0;
        int[] newArr = new int[nums.length];

        while (start<k){
            newArr[start] = nums[nums.length-step];
            start++;
            step--;
        }

        while (index<nums.length-k){
            newArr[start] = nums[index];
            start++;
            index++;
        }

        for (int i =0; i<nums.length;i++){
            nums[i] = newArr[i];
        }

        for (int num:nums) System.out.println(num);
    }
}
