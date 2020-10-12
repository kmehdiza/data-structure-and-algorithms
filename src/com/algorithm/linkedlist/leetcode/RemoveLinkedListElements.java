package com.algorithm.linkedlist.leetcode;

import java.util.List;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(11);
        head.next = first;
        first.next = second;
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        while (current!=null){
            if (current.val == val){
                current = current.next;
            }
        }
        return null;
    }

}
