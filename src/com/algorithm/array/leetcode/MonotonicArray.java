package com.algorithm.array.leetcode;

public class MonotonicArray {

    public static void main(String[] args) {
        int[] A = {12,5,4};
        System.out.println(isMonotonic(A));
    }

    public static boolean isMonotonic(int[] A) {

        boolean increasing = true;
        boolean decreasing = true;

        for (int i=0; i<A.length-1;i++){
            if (A[i]>A[i+1]){
                increasing = false;
            }else if(A[i]<A[i+1]){
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
}
