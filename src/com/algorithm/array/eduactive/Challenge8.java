package com.algorithm.array.eduactive;

public class Challenge8 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArray(arr);
    }

    public static void rotateArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
