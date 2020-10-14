package com.algorithm.linkedlist.leetcode;

import java.util.Stack;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(1);
        head.next = first;
        first.next = second;
        second.next = third;

        System.out.println(isPalindrome(head));

    }

    public static boolean isPalindrome(ListNode head) {
        ListNode current = head;
        ListNode temp = head;
        Stack stack = new Stack();
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        while (temp != null) {
            if (temp.val != (int) stack.pop()) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

}
