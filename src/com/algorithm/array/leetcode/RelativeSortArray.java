package com.algorithm.array.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class RelativeSortArray {

    public static void main(String[] args) {

        //int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, arr2 = {2, 1, 4, 3, 9, 6};
        //int[] arr1 = {28, 6, 22, 8, 44, 17}, arr2 = {22, 28, 8, 6};
        int[] arr1 = {2, 21, 43, 38, 0, 42, 33, 7, 24, 13, 12, 27, 12, 24, 5, 23, 29, 48, 30, 31}, arr2 = {2, 42, 38, 0, 43, 21};
        int[] res = relativeSortArray(arr1, arr2);
        for (int num : res) {
            System.out.print(num + " ");
        }

    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            hashMap.put(arr1[i], 1 + hashMap.getOrDefault(arr1[i], 0));
        }

        for (int i = 0; i < arr2.length; i++) {
            Integer mapValue = hashMap.get(arr2[i]);
            int count = 0;
            while (count < mapValue) {
                list.add(arr2[i]);
                count++;
            }
            hashMap.remove(arr2[i]);
        }

        System.out.println(hashMap);
        List<Integer> newList = new ArrayList<>();

        for (Map.Entry<Integer,Integer> e : hashMap.entrySet()){
            int count = 0;
            while (count<e.getValue()){
                newList.add(e.getKey());
                count++;
            }
        }

        Collections.sort(newList);

        for (int num:newList){
            list.add(num);
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

}
