package com.algorithm.array.udemy;

import java.util.Arrays;

public class SingleDimensionArray {

    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(3);
        sda.insertToArray(1, 100);
        sda.insertToArray(78, 120);
        sda.traverseArray();
    }

    int[] arr = null;

    public SingleDimensionArray(int arraySize) {
        arr = new int[arraySize];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }

    public void traverseArray() {
        try {
            for (int i : arr)
                System.out.println(i + " ");
        } catch (Exception ex) {
            System.out.println("Array is no longer exist " + ex);
        }
    }

    public void insertToArray(int location, int valueToBeInserted) {
        try {
            if (arr[location] == Integer.MIN_VALUE)
                arr[location] = valueToBeInserted;
            else
                System.out.println("This location is already by another value");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid Index to access array" + ex);
        }
    }

    public void accessingCell(int cellNumber) {
        try {
            System.out.println(arr[cellNumber]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid Index to access Array " + ex);
        }
    }

    public void searchInArray(int searchValue) {
        for (int num : arr) {
            if (num == searchValue) System.out.println(searchValue + " is found");
            else System.out.println("Value is not found");
        }
    }

    public void deleteValueFromArray(int deleteValueFromThisCell) {
        try {
            arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Cannot delete value as index is out of range" + ex);

        }
    }
}
