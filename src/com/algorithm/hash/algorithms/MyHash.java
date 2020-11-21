package com.algorithm.hash.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MyHash {

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

    public MyHash() {
        buckets = new ArrayList<>();
    }

    public void put(Integer key, Integer val) {

        if (key == null)
            throw new IllegalArgumentException("Key cannot be null");

        if (val == null) {
            return;
        }

        int bucketIndex = hash(key);
        Node node = buckets.get(bucketIndex);

        //Update the already exist key's value
        while (node != null) {
            if (node.key.equals(key)) {
                node.val = val;
            }
            node = node.next;
        }
        Node newNode = new Node(key, val, node);
        buckets.set(bucketIndex, newNode);
        length++;
    }


    public Integer get(Integer key) {
        Node node = buckets.get(hash(key));
        while (node != null) {
            if (node.key.equals(key)) {
                return node.val;
            }
            node = node.next;
        }
        return null;
    }

    public void delete(Integer key) {
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

    public boolean isEmpty() {
        return length == 0;
    }


    private int hash(int key) {
        return key % buckets.size();
    }


    public static void main(String[] args) {

    }

}
