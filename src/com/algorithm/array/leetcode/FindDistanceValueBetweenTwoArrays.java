package com.algorithm.array.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindDistanceValueBetweenTwoArrays {


    public static void main(String[] args) {
        int[] arr1 = {4,5,8}, arr2 = {10,9,1,8};
        int d = 2;
        findTheDistanceValue(arr1,arr2,d);
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int count = 0;

        for (int i=0; i<arr1.length;i++){
            for (int j=0; j<arr2.length;j++){
                if (Math.abs(arr1[i]-arr2[j])<=d && Math.abs(arr1[i]-arr2[j])!=0){
                    count++;
                }
            }
        }
        return count;

    }

}
