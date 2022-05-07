package com.hillel.lesson5;

import java.util.Scanner;

public class ConditionalOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Ctrl + Alt + Arrow left/right
        System.out.print("Enter value: ");
        boolean hasNextInt = scanner.hasNextInt();

        String result = !hasNextInt ? "Value integer" : "Other type";
        int a = scanner.nextInt();

        System.out.println("Check is int: " + result);

//        primitive, wrappers primitives int -> Integer
        String s = "";
        switch (a) {
            case 1:
                s = "One";
                break;
            case 2:
            case 3:
                s = "Three";
                break;
            default:
                s = "Do not  know what the value";
        }

        System.out.println("Case result: " + s);

        if (a >= -100 && a <= 100) {
            calculateValue(a);
        } else {
            System.out.println("The number should be in range -100 to 100");
        }
    }

    private static void calculateValue(int a) {
        if (a == 0) {
            System.out.println("Zero value");
        } else if (a > 0) {
            System.out.println("Positive value: " + a);
        } else {
            System.out.println("Negative value: " + a);
        }
    }
}
