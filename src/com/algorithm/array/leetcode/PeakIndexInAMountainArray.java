package com.algorithm.array.leetcode;

import java.util.*;

public class PeakIndexInAMountainArray {

    public static void main(String[] args) {
        int[] arr = {24, 69, 99, 79, 78, 67, 36, 26, 19,100};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            list.add(num);
        }

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        Integer max = Collections.max(list);
        return map.get(max);
    }
}
