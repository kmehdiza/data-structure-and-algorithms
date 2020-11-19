package com.algorithm.hashmap.leetcode;


import java.util.Stack;

public class MyCustomStack {

    private Stack<Integer> stack;
    private int maxSize;
    private int[] arr;

    public MyCustomStack(int maxSize) {
        stack = new Stack<>();
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    public void push(int x) {
        if (stack.size() < maxSize)
            stack.push(x);
    }

    public int pop() {

        return -1;
    }

    public void increment() {

    }
}
