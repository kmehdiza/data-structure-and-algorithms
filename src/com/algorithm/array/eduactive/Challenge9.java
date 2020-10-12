package com.algorithm.array.eduactive;

import java.util.ArrayList;
import java.util.List;

public class Challenge9 {


    public static void main(String[] args) {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        int[] res = reArrange(arr);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }

    public static int[] reArrange(int[] arr) {

        int[] newArr = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            if (num < 0) newArr[index++] = num;
        }

        for (int num : arr) {
            if (num > 0) newArr[index++] = num;
        }

        for (int i = 0; i < newArr.length; i++) {
            arr[i] = newArr[i];
        }
        return arr;
    }

    public static void reArrange2(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num < 0) list.add(num);
        }

        for (int num : arr) {
            if (num > 0) list.add(num);
        }

        System.out.println(list);
    }

}
