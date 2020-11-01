package com.algorithm.crackingtocoding;

import java.util.HashMap;
import java.util.Map;

public class Exercise11 {

    public static void main(String[] args) {
        System.out.println(isUniqueChars2("abcdefghs"));
    }

    public static boolean isUniqueChars(String s) {
        if (s.length() > 128) return false;

        boolean[] charSet = new boolean[128];

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }

    public static boolean isUniqueChars2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char letter : s.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        for (Map.Entry<Character, Integer> i : map.entrySet()) {
            if (i.getValue() > 1) return false;
        }
        return true;
    }

}
