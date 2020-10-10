package com.algorithm.array.leetcode;

public class XOROperationAnArray {

    public static void main(String[] args) {
        xorOperation(10,5);
    }

    public static int xorOperation(int n, int start) {
        int[] nums = new int[n];

        for (int i=0; i<n;i++){
            nums[i] = start+2*i;
        }

        int xor = 0;
        for (int num: nums){
            xor^=num;
        }

        return xor;
    }

}
