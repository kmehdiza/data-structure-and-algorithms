package com.algorithm.singlylinkedlist.eduactive;

import com.algorithm.singlylinkedlist.leetcode.ListNode;

public class Challenge1 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        //insertAtEnd(head,10);
        insertAfter(head, 12,second);
        ListNode.display(head);
    }

    public static void insertAtEnd(ListNode head, int data) {
        ListNode current = head;
        ListNode newNode = new ListNode(data);
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public static void insertAtHead(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public static void insertAfter(ListNode head, int data, ListNode previous) {
        ListNode newNode = new ListNode(data);
        ListNode current = head;

        while (current.next != null && current.val != previous.val) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

}
