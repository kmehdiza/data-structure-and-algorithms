package com.algorithm.hash.leetcode;


import java.util.*;

public class Exercise1160 {

    public static void main(String[] args) {
        String[] string = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int i = countCharacters(string, chars);
        System.out.println(i);
    }

    public static int countCharacters(String[] words, String chars) {

        Stack<String> stack = new Stack<>(); //O(1)
        HashMap<Character, Integer> map = new HashMap<>();

        for (String word : words) {//O(n)
            stack.push(word);
        }

        for (char ch : chars.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count = 0;
        int sum = 0;
        HashMap<Character,Integer> copyMap;
        while (!stack.isEmpty()) {
            copyMap = (HashMap<Character, Integer>) map.clone();
            String word = stack.pop();
            System.out.println("word = " +word);
            for (char ch : word.toCharArray()) {
               if (copyMap.get(ch)==null || copyMap.get(ch)==0){

               }
            }
            if (count == word.length())
                sum += count;
            count=0;
        }
        return sum;
    }

}
