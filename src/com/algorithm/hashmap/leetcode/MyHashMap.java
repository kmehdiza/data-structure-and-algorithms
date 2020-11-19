package com.algorithm.hashmap.leetcode;


import java.util.HashMap;

public class MyHashMap {

    private ListNode[] nodes;

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

    public MyHashMap() {
        nodes = new ListNode[1000];
    }

    public void put(int key, int value) {
        int hash = hashCode(key);
        ListNode node = find(nodes[hash],key);
        if (node!=null){
            node.value = value;
        }else {
            nodes[hash] = new ListNode(key,value,nodes[hash]);
        }
    }

    public int get(int key) {
        int hash = hashCode(key);
        ListNode node = find(nodes[hash],key);
        if (node!=null)
            return node.value;
        return -1;
    }

    public void remove(int key) {
        int hash = hashCode(key);
        ListNode node = find(nodes[hash],key);
        if (node!=null)
            node.next = null;
    }

    private int hashCode(int key) {
        return Integer.hashCode(key) % nodes.length;
    }

    private ListNode find(ListNode node, int key){
        if (node==null) return null;
        if (node.key==key)return node;
        return find(node.next,key);
    }
    HashMap map;
}
