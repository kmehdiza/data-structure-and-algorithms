package com.algorithm.hash.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MyHashMapArrayList {

    private List<Node> buckets;
    private int length;

    private class Node {
        private int key;
        private int value;
        private Node next;

        public Node(int key, int value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public MyHashMapArrayList() {
        buckets = new ArrayList<>(1000);
        for (int i = 0; i < 1001; i++) {
            buckets.add(null);
        }
        length = 0;
    }

    public void put(int key, int value) {
        int hashCode = hash(key);
        Node node = find(key);
        while (node != null) {
            if (node.key == key) {
                node.value = value;
            }
            node = node.next;
        }
        Node newNode = new Node(key, value, node);
        buckets.set(hashCode, newNode);
        length++;
    }

    public int get(int key) {
        Node node = find(key);

        if (node == null) {
            return -1;
        }

        while (node != null) {
            if (node.key == key) {
                return node.value;
            }
            node = node.next;
        }
        return -1;
    }

    private Node find(int key) {
        int hashCode = hash(key);
        Node node = buckets.get(hashCode);
        if (node == null) {
            return null;
        }

        while (node != null) {
            if (node.key == key) {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    private int hash(int key) {
        return Integer.hashCode(key)%buckets.size();
    }

    public static void main(String[] args) {
        MyHashMapArrayList map = new MyHashMapArrayList();
        map.put(1, 10);
        int i = map.get(1);
        System.out.println(i);
        System.out.println(map.length);
    }
}
