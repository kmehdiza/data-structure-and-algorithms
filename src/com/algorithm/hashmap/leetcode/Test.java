package com.algorithm.hashmap.leetcode;

public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 9, 11, 3, -1};
        int[] array = bubbleSort(arr);
        for (int i:array){
            System.out.println(i);
        }
    }

    static int[] bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        return array;
    }
}
