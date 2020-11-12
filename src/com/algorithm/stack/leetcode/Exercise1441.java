package com.algorithm.stack.leetcode;

import java.util.*;

public class Exercise1441 {

    public static void main(String[] args) {
        int[] target = {2, 3, 4};
        int n = 4;
        System.out.println(buildArray(target, n));
    }

    public static List<String> buildArray(int[] target, int n) {
        Set<Integer> set = new HashSet<>();
        Stack<String> stack = new Stack<>();
        int length = target.length;
        int count = 1;

        for (int num : target) set.add(num);

        while (count <= n) {
            if (set.contains(count)) {
                stack.push("push");
                length--;
                if (length == 0) break;
            } else {
                stack.push("push");
                stack.push("pop");
            }
            count++;
        }
        return new ArrayList<>(stack);

    }

}

// Time Complexity : O(N)