package com.algorithm.array.leetcode;

public class ValidMountainArray {

    public static void main(String[] args) {
        int[] A = {0,2,3,3,5,2,1,0};
        boolean res = validMountainArray(A);
        System.out.println(res);
    }

    public static boolean validMountainArray(int[] A) {

        if (A.length < 3)
            return false;

        int start = 0;
        int end = A.length - 1;

        while (start < end) {
            if (A[start+1] > A[start]){
                start++;
            }else if (A[end-1] > A[end]){
                end--;
            }else {
                break;
            }
        }
        return start==end && start !=0 && end !=  A.length - 1;
    }
}
