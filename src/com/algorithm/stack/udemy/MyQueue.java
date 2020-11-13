package com.algorithm.stack.udemy;

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
        if (isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public int deQueue() {
        int temp = head.data;
        head = head.next;
        return temp;
    }

    public int peek(){
        return head.data;
    }

    public boolean isEmpty(){
        return length==0;
    }
}
