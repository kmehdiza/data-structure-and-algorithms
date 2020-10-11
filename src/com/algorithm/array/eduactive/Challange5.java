package com.algorithm.array.eduactive;

public class Challange5 {

    public static void main(String[] args) {

        int[] arr = {9, 2, 3, 6};
        System.out.println(findMinimum(arr));

    }

    public static int findMinimum(int[] arr) {
        int minimum = arr[0];

        for (int i=1; i<arr.length;i++){
            if (arr[i]<minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
