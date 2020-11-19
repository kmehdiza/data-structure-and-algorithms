package com.algorithm.hashmap.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise1431 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWitCandies(arr, extraCandies));
    }

    public static List<Boolean> kidsWitCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int biggest = Integer.MIN_VALUE;
        for (int num : candies) {
            if (num > biggest)
                biggest = num;
        }

        for (int num : candies) {
            if (num + extraCandies >= biggest)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}
