package com.algorithm.hash.algorithms;

import java.util.HashSet;
import java.util.Set;

public class Exercise341 {


    public static int convertToTableIndex(String string, int M){
        int sum = 0;
        for (char ch:string.toCharArray()){
            sum+=ch;
        }
        return 11*sum%M;
    }


    public static void main(String[] args) {
        Exercise341 exercise4 = new Exercise341();
        int[] values = exercise4.perfectHashFunction();

        if (values != null) {
            System.out.println("a = " + values[0]);
            System.out.println("m = " + values[1]);
        }
    }

    private int[] perfectHashFunction() {
        int[] values = new int[2];

        int[] letterValues = {19, 5, 1, 18, 3, 8, 24, 13, 16, 12};

        for(int m = 2; m <= 100; m++) {
            for(int a = 1; a <= 1000; a++) {
                Set<Integer> hashes = new HashSet<>();

                for(int i = 0; i < letterValues.length; i++) {
                    int hash = hashCodeFunction(a, letterValues[i], m);
                    hashes.add(hash);
                }

                if (hashes.size() == 10) {
                    //Perfect hash function found
                    values[0] = a;
                    values[1] = m;
                    return values;
                }
            }
        }

        return null;
    }

    private int hashCodeFunction(int a, int k, int m) {
        return (a * k) % m;
    }

}
