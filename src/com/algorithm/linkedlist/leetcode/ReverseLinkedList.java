package com.algorithm.linkedlist.leetcode;

public class ReverseLinkedList {


    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
