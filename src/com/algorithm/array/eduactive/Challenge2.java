package com.algorithm.array.eduactive;

public class Challenge2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};
        int[] res = mergeArrays(arr1, arr2);

    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr3 = new int[len1 + len2];
        int arr1Index = 0, arr2Index = 0, index = 0;

        while (arr1Index < len1 && arr2Index < len2) {
            if (arr1[arr1Index] < arr2[arr2Index]) {
                arr3[index++] = arr1[arr1Index++];
            } else {
                arr3[index++] = arr2[arr2Index++];
            }
        }

        while (arr1Index < len1)
            arr3[index++] = arr1[arr1Index++];


        while (arr2Index < len2) {
            arr3[index++] = arr2[arr2Index++];
        }

        return arr3;
    }
}
