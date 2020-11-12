package com.algorithm.stack.leetcode;

import java.util.Stack;

public class Exercise1450 {

    public static void main(String[] args) {
        int[] start = {1, 2, 3};
        int[] end = {3, 2, 7};
        System.out.println(busyStudent(start, end, 4));
    }

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int num : startTime) {
            stack.push(num);
        }

        for (int i = endTime.length - 1; i > 0; i--) {
            if (stack.pop() <= queryTime && endTime[i] >= queryTime) count++;
        }
        return count;
    }

}
