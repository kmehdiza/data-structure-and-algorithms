package com.algorithm.array.eduactive;

public class Challenge10 {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        maxMin(arr);

    }

    public static void maxMin(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            System.out.println(arr[end]);
            start++;
        }

        for (int num:arr){
            System.out.print(num);
        }
    }

}
