package com.hillel.lesson4;

public class Recursion {
    public static void main(String[] args) {
//  1*2*3*6*20
        int factorial = factorial(5);
        System.out.println("factorial: " + factorial);
    }

    private static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        }
        return 1;
    }
}
