package com.algorithm.array.eduactive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Challenge6 {


    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 6, 6,9};
        System.out.println(findFirstUnique2(arr));

    }

    public static int findFirstUnique(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, 1 + map.getOrDefault(num, 0));
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) <= 1) {
                return arr[i];
            }
        }

        System.out.println(map);
        return -1;
    }
//{2, 3, 2, 6, 6,9};
    public static int findFirstUnique2(int[] arr) {
        boolean isRepeated = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j] && i!=j){
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated){
                return arr[i];
            }else {
                isRepeated =false;
            }
        }
        return -1;
    }
}
