package com.algorithm.hash.udemy;

public class HashString {

    public static void main(String[] args) {
        System.out.println(sascii("ABCD", 12));
    }

    public static int sascii(String x, int M) {
        char[] ch = x.toCharArray();
        int sum = 0;
        for (char i : ch) {
            sum += i;
        }
        return sum % M;
    }
}
