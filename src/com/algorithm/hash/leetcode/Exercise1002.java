package com.algorithm.hash.leetcode;

import java.util.*;

public class Exercise1002 {

    public static void main(String[] args) {
        String[] string = {"bella", "label", "roller"};
        System.out.println(commonChars(string));
    }


    public static List<String> commonChars(String[] A) {

        List<String> results = new ArrayList<>();
        int[] ferqMap = new int[26];
        for (char curr:A[0].toCharArray()){
            //System.out.println(curr);
            ferqMap[curr - 'a']++;
        }
        int[] temp = new int[26];
        for (int i=1;i<A.length;i++){
            for (char curr:A[i].toCharArray()){
                temp[curr -'a']++;
            }

            for (int j=0; j<ferqMap.length;++j){
                ferqMap[j]= Math.min(ferqMap[j],temp[j]);
            }
        }

        for (int i=0; i<ferqMap.length;++i){
            while (ferqMap[i]>0){
                results.add(""+(char)('a'+i));
                ferqMap[i]--;
            }
        }

        for (int ch:temp){
            System.out.println(ch);
        }
        return results;
    }
}

