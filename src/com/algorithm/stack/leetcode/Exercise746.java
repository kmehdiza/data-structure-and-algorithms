package com.algorithm.stack.leetcode;

public class Exercise746 {

    public static void main(String[] args) {
        int[] cost = {10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int oneStep = cost[0];
        int twoStep = cost[1];
        int current = 0;
        for (int i = 2; i < cost.length; i++) {
            current = Math.min(oneStep, twoStep) + cost[i];
            oneStep = twoStep;
            twoStep = current;
        }
        return Math.min(oneStep, twoStep);
    }

}
