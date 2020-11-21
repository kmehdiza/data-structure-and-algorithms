package com.algorithm.hash.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    private List<Node> buckets;
    private int length;

    private class Node {
        private Integer val;
        private Integer key;
        private Node next;

        public Node(Integer key, Integer val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }

    public MyHashMap(){
        buckets = new ArrayList<>();
        length=0;
    }


    /** value will always be non-negative. */
    public void put(int key, int value) {
        int bucketIndex = hash(key);
        Node node = buckets.get(bucketIndex);

        //Update the already exist key's value
        while (node != null) {
            if (node.key.equals(key)) {
                node.val = value;
            }
            node = node.next;
        }
        Node newNode = new Node(key, value, node);
        buckets.set(bucketIndex, newNode);
        length++;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        Node node = buckets.get(hash(key));
        while (node != null) {
            if (node.key.equals(key)) {
                return node.val;
            }
            node = node.next;
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int bucketIndex = hash(key);
        Node node = buckets.get(bucketIndex);
        while (node != null) {
            if (node.key.equals(key)) {
                buckets.set(bucketIndex, node.next);
            }
            node = node.next;
        }
        length--;
    }
    private int hash(int key) {
        return Integer.hashCode(key);
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1,10);
    }
}
