package com.algorithm.stack.udemy;

import java.util.EmptyStackException;

public class Stack {

    private ListNode top; // here top is null
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public Stack() {
        top = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        int temp = top.data;
        top = top.next;
        length--;
        return temp;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(15);
        System.out.println(stack.peek());
    }

}
