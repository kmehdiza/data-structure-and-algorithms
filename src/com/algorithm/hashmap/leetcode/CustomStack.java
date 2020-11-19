package com.algorithm.hashmap.leetcode;

public class CustomStack {

    private ListNode head;
    private int length;
    private int maxSize;

    private class ListNode {

        private int data;
        private ListNode next;

        private ListNode(int data) {
            this.data = data;
        }
    }

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        head = null;
        length = 0;
    }

    public void push(int x) {
        ListNode newNode = new ListNode(x);
        while (length != maxSize) {
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
            }
            head = newNode;
        }
        length++;
    }

    public int pop() {
        if (length <= 0) {
            return -1;
        }
        int temp = head.data;
        head = head.next;
        length--;
        return temp;
    }

    public void increment(int k, int val) {
        ListNode current = head;
        int i = Math.min(k, length - 1);
        while (i >= 0) {
            current.data += val;
            current = current.next;
            i--;
        }
    }
}
