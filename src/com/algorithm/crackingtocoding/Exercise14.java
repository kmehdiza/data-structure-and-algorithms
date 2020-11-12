package com.algorithm.crackingtocoding;

import java.util.HashMap;
import java.util.Map;

public class Exercise14 {

    public static void main(String[] args) {
        boolean res = palindromePermutation("Tact Coa");
        System.out.println(res);

    }

    public static boolean palindromePermutation(String string) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : string.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        boolean hasOdd = false;
        for (int count : map.values()) {
            if (count % 2 == 1) {
                if (hasOdd) {
                    return false;
                } else {
                    hasOdd = true;
                }
            }
        }
        return hasOdd;
    }
}
