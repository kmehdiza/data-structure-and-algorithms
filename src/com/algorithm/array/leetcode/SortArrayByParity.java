package com.algorithm.array.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {


    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4};
        sortArrayByParity(A);
    }

    public static int[] sortArrayByParity(int[] A) {

        List<Integer> list = new ArrayList<>();

        for (int num : A) {
            if (num % 2 == 0) list.add(num);
        }

        for (int num : A) {
            if (num % 2 == 1) list.add(num);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] sortArrayByParity2(int[] A) {
        for (int i = 0, j=0; j < A.length; j++) {
            if(A[j]%2==0){
                int temp = A[i];
                A[i++] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }

}
