package com.algorithm.crackingtocoding;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise12 {

    public static void main(String[] args) {
        isPermutations("doog", "good");
    }

    public static boolean isPermutations(String s, String t) {
        if (s.length() != t.length()) return false;
        return sortString(s).equals(sortString(t));
    }

    private static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }
}
