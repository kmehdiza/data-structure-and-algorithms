package com.algorithm.stack.udemy;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {
        System.out.println(reverseString("Kanan"));
    }

    public static String reverseString(String value) {
        Stack<Character> stack = new Stack();
        for (char let : value.toCharArray()) {
            stack.push(let);
        }

        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        return builder.toString();
    }
}
