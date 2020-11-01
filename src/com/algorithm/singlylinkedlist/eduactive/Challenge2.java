package com.algorithm.singlylinkedlist.eduactive;

import com.algorithm.singlylinkedlist.leetcode.ListNode;

public class Challenge2 {


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
        System.out.println(searchNode(head,15));
    }

    public static boolean searchNode(ListNode head, int value) {
        ListNode current = head;

        while (current != null) {
            if (current.val == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

}
