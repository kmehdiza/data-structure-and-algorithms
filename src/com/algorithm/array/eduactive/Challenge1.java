package com.algorithm.array.eduactive;

public class Challenge1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 10, 6, 3};
        int[] result = removeEven(arr);
        for (int res : result) {
            System.out.print(res);
        }

    }

    public static int[] removeEven(int[] arr) {

        int oddElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) oddElement++;
        }

        int[] newArr = new int[oddElement];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

}
