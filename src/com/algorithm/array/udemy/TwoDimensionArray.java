package com.algorithm.array.udemy;

import java.util.Arrays;

public class TwoDimensionArray {

    public static void main(String[] args) {
        TwoDimensionArray twoDimensionArray = new TwoDimensionArray(1, 5);
        twoDimensionArray.traverseArray();
        twoDimensionArray.insertValueInTheArray(0,6,21);
        twoDimensionArray.traverseArray();
    }

    int[][] arr;

    public TwoDimensionArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    public void traverseArray() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
            } else {
                System.out.println("System is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid index to access array");
        }
    }
}
