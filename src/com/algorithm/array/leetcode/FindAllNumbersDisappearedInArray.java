package com.algorithm.array.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAllNumbersDisappearedInArray {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        findDisappearNumbers(nums);
    }

    public static List<Integer> findDisappearNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i=0; i<nums.length;i++){
            hashMap.put(nums[i],true);
        }

        for (int i=1; i<nums.length;i++){
            if (!hashMap.containsKey(i)){
                list.add(i);
            }
        }

        return list;
    }
}
