package com.algorithm.recrusive;

import java.util.NoSuchElementException;

public class RecursionMethod {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static void foo(int n) {//3
        if (n < 2) return;
        else
            foo(n - 1);
        System.out.println("Hello world " + n);
    }

    public static int factorial(int n){
        if(n==0) return 1;
        return (n * factorial(n-1));
    }

    public static int fib(int n){
        if (n<1) throw new NoSuchElementException();
        else if (n==1 || n==2) return n-1;
        else
            return fib(n-1)+fib(n-2);
    }

}
