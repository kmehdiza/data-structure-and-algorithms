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

    public ListNode getMiddleNode(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    public ListNode getNthMethodFromEnd(int n) {

        if (head == null) {
            return null;
        }

        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value: " + n);
        }

        ListNode mainPoint = head;
        ListNode referencePoint = head;
        int count = 0;
        while (count < n) {
            referencePoint = referencePoint.next;
            count++;
        }

        while (referencePoint != null) {
            referencePoint = referencePoint.next;
            mainPoint = mainPoint.next;
        }
        return mainPoint;
    }

    public void removeDuplicate() {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public ListNode insertNewNode(int value) {

        ListNode newNode = new ListNode(value);

        if (head == null) {
            return null;
        }

        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public void removeGivenKey(int value) {
        ListNode current = head;
        ListNode prev = null;
        while (current!=null && current.next!=null){
            if (current.data!=value){
                prev = current;
                current = current.next;
            }else {
                prev.next = current.next;
            }
        }
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
        System.out.print(singlyLinkedList.getNthMethodFromEnd(2));
    }
}
