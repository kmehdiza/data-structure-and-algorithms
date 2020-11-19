package com.algorithm.runtimeanalysis;

import java.util.NoSuchElementException;

public class FindBiggestNumber {

    public static void main(String[] args) {
        int[] A = {2, 31, 1, 23};
        int n = 3;
        System.out.println(findBiggestNumberWithArraySize(A, n));
    }

    public static int findBiggestNumberInArray(int[] arr) {
        int biggestNum = arr[0];//O(1)
        for (int i = 1; i < arr.length; i++) {//O(n)
            if (arr[i] > biggestNum) //O(1)
                biggestNum = arr[i]; //O(1)
        }
        return biggestNum; //O(1)
    }

    public static int findBiggestNumberWithArraySize(int[] A, int n) {
        int highest = 0;
        if (n == -1) {
            return highest;
        } else if (A[n] > highest)
            highest = A[n];
        return findBiggestNumberWithArraySize(A, n - 1);
    }

    public static void insertToArray(int[] arr, int valueTobeInserted, int location) {
        if (arr[location] != 0) throw new NoSuchElementException();
        else
            arr[location] = valueTobeInserted;
    }



}
