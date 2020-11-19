package com.algorithm.stack.udemy;

import java.util.NoSuchElementException;

public class MyQueue {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public MyQueue() {
        head = null;
        length = 0;
    }

    public void enQueue(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public int deQueue() {
        if (isEmpty())
            throw new NoSuchElementException();
        int temp = head.data;
        head = head.next;
        if (head == null) tail = null;
        length--;
        return temp;
    }

    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int first() {
        if (isEmpty()) throw new NoSuchElementException();
        return head.data;
    }

    public int last() {
        if (isEmpty()) throw new NoSuchElementException();
        return tail.data;
    }

    public void print() {
        if (isEmpty()) {
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");

    }
}
