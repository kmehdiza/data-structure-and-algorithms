package com.algorithm.stack.leetcode;


import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }

    private int min = Integer.MAX_VALUE;
    private Stack<Integer> stack;

    public MinStack(){
        stack = new Stack<>();

    }

    public void push(int x){
        if (x<=min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop(){
       if (stack.pop()==min) min=stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return min;
    }
}
