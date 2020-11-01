package com.algorithm.singlylinkedlist.eduactive;

import com.algorithm.singlylinkedlist.leetcode.ListNode;

public class LinkedListDeletion {


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
        ListNode.display(deleteHead(head));
    }

    public static ListNode deleteHead(ListNode head) {
        ListNode current = head;
        ListNode temp = null;
        while (current != null) {
            temp = current.next;
            current.next = null;
            current = temp;
        }

        return current;
    }

}
