package com.algorithm.array.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquaresOfSortedArray {

    public static void main(String[] args) {
        int[] A = {-4, -1, 0, 3, 10};
        int[] res = sortedSquares(A);
        for (int num:res){
            System.out.print(num);
        }
    }

    public static int[] sortedSquares(int[] A) {

        List<Integer> list = new ArrayList<>();

        for (int num : A) {
            list.add(num * num);
        }
        Collections.sort(list);
        return list.stream().mapToInt(i->i).toArray();
    }

}
