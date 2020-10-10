package com.algorithm.array.eduactive;

import java.util.ArrayList;
import java.util.List;

public class Challenge3 {

    public static void main(String[] args) {

        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int value = 27;

        findSum(arr, value);

    }

    public static int[] findSum(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        //List<Integer> newList = new ArrayList<>();
        int[] result = new int[2];
        for (int num : arr) {
            list.add(num);
        }

        for (int i = 0; i < arr.length-1; i++) {
            int value = n - arr[i];;
            if (list.contains(value)){
                result[0]=(list.get(list.indexOf(value)));
                result[1] = arr[i];
            }
        }
        return result;
        //list.stream().mapToInt(i->i).toArray();
    }

}
