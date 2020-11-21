package com.algorithm.hash.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Exercise1078 {

    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student", first = "a", second = "good";
        findOcurrences(text, first, second);
    }

    public static String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] word = text.split(" ");
        for (int i = 2; i < word.length; i++) {
            System.out.println(word[i]);
            if (first.equals(word[i - 2]) && second.equals(word[i - 1])) {
                list.add(word[i]);
            }
        }
        return list.toArray(new String[0]);
    }

}
