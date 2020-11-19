package com.algorithm.hashmap.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Exercise888 {

    public static void main(String[] args) {
        int[] a = {1,1};
        int[] b = {2,2};
        fairCandySwap(a,b);
    }


    public static int[] fairCandySwap(int[] A, int[] B) {
        int sumA = 0;
        int sumB = 0;
        Set<Integer> setB = new HashSet<>();

        for (int x : A) {
            sumA += x;
        }
        for (int x : B) {
            sumB += x;
            setB.add(x);

        }
        int delta = (sumB - sumA) / 2;

        System.out.println(setB);
        System.out.println(delta);
        for (int i : A) {
            System.out.println(i);
            System.out.println(setB.contains(i+delta));
            if (setB.contains(i + delta)) {
                return new int[]{i, i + delta};
            }
        }
        return null;
    }

}
