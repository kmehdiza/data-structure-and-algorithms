package com.algorithm.array.eduactive;

public class Challenge7 {

    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 6};
        System.out.println(findSecondMaximum(arr));
    }

    public static int findSecondMaximum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 2];
    }
}
