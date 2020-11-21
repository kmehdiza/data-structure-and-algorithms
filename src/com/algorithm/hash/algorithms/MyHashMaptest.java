package com.algorithm.hash.algorithms;

public class MyHashMaptest {

    private class ListNode {
        private int key;
        private int value;
        private ListNode next;

        public ListNode(int key, int value, ListNode next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private ListNode[] listNodes;

    public MyHashMaptest() {
        listNodes = new ListNode[1000];
    }

    public void put(int key, int value) {
        int hasHCode = hash(key);
        ListNode listNode = findNode(key);
        if (listNode != null) {
            listNode.value = value;
        } else {
            listNodes[hasHCode] = new ListNode(key, value, listNodes[hasHCode]);
        }
    }

    public int get(int key) {
        ListNode listNode = findNode(key);
        if (listNode != null)
            return listNode.value;
        return -1;
    }

    public void remove(int key){
        ListNode listNode = findNode(key);

    }

    // @ToDO: Refactoring needed
    private ListNode findNode(int key) {
        ListNode listNode = listNodes[hash(key)];
        if (listNode == null) {
            return null;
        }
        while (listNode != null) {
            if (listNode.key == key) {
                return listNode;
            }
            listNode = listNode.next;
        }
        return null;
    }

    private int hash(int key) {
        return Integer.hashCode(key) % listNodes.length;
    }

}
