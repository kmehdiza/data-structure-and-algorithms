package com.algorithm.stack.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        Queue<Integer> temp = new LinkedList<>();
        while (!queue.isEmpty()) {
            temp.add(queue.poll());
        }
        queue.add(x);
        while (!temp.isEmpty()) {
            queue.add(temp.poll());
        }
    }

    public int pop() {
        if (queue.isEmpty())
            return 0;
        return queue.poll();
    }
    public int top(){
        if (queue.isEmpty())
            return 0;
        return queue.peek();
    }

    public boolean empty(){
        return queue.isEmpty();
    }
}
