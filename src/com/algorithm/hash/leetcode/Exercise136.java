package com.algorithm.hash.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Exercise136 {

    public static void main(String[] args) {
        int[] num = {2,2,1};
        int i = singleNumber(num);
        System.out.println(i);
    }
    public static  int singleNumber(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int num = 0;
        for (int i:map.keySet()){
            if(map.get(i)==1){
                num=i;
            }
        }
        return num;
    }
}
