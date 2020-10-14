package com.algorithm.linkedlist.leetcode;

import java.util.List;

public class RemoveLinkedListElements {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(6);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = five;
        five.next = six;

        ListNode.display(head);
        ListNode res = removeElements(head, 6);
        ListNode.display(res);
    }

    public static ListNode removeElements(ListNode head, int val) {

        if (head==null){
            return null;
        }

        ListNode current = head;

        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        if (head.val == val){
            return head.next;
        }

        return head;
    }


}
