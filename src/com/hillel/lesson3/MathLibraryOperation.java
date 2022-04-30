package com.hillel.lesson3;

import java.util.Scanner;

public class MathLibraryOperation {
    public static void main(String[] args) {
        int abs = Math.abs(-15);
//        Ctrl + P
        double sqrt = Math.sqrt(64.0);
        double pow = Math.pow(5, 3);
        double p = Math.pow(125, 1.0 / 3.0);
        long round = Math.round(p);
        double roundDouble = Math.round(p);//(double)round

        int random = (int) (Math.random() * 10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a: ");
        String next = scanner.next();
        System.out.println("Enter number b: ");
        int nextInt = scanner.nextInt();

        System.out.println("next string: " + next);
        System.out.println("next int: " + nextInt);

        System.out.println("abs = " + abs);
        System.out.println("sqrt = " + sqrt);
        System.out.println("pow = " + pow);
        System.out.println("pow 1/3 = " + p);
        System.out.println("round = " + round);
        System.out.println("round = " + (double) round);
        System.out.println("random = " + random);
    }
}
