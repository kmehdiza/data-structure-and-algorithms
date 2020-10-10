package com.algorithm.array.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FindLuckyIntegerInArray {

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4};
        System.out.println(findLucky(arr));
    }

    public static int findLucky(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : arr) {
            hashMap.put(num, 1 + hashMap.getOrDefault(num, 0));
        }

        int ans = -1;
        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
            if (e.getKey() == e.getValue()) {
                ans = Math.max(ans, e.getKey());
            }
        }
        return ans;
    }

}
