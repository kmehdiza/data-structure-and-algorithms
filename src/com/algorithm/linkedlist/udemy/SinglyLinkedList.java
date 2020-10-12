package com.algorithm.linkedlist.udemy;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {

        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public int length() {

        if (head == null) return 0;

        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }

    public boolean search(ListNode head, int searchKey) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse() {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
//        singlyLinkedList.head = new ListNode(10);
//        ListNode second = new ListNode(2);
//        ListNode third = new ListNode(8);
//        ListNode fourth = new ListNode(11);

        // Now we will connect them together to form a chain.
//
//        singlyLinkedList.head.next = second;
//        second.next = third;
//        third.next = fourth;

        singlyLinkedList.insertLast(11);
        singlyLinkedList.insertLast(1);
        singlyLinkedList.insertLast(23);
        singlyLinkedList.display();
        System.out.print(singlyLinkedList.length());
    }
}
