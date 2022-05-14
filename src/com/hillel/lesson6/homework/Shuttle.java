package com.hillel.lesson6.homework;

public class Shuttle {
    public static void main(String[] args) {

        int numberOfShuttles = 100;
        String arg = args[0];
        if (arg != null) {
            numberOfShuttles = Integer.parseInt(arg);
        }
        int counter = 0;
        String[] arr = new String[args.length - 1];
        System.arraycopy(args, 1, arr, 0, args.length - 1);
        for (int i = 1; counter <= numberOfShuttles; i++) {
            if (isHappyDigit(arr, i)) {
                System.out.println(counter + " - shuttle number: " + i);
                counter++;
            }
        }
    }

    private static boolean isHappyDigit(String s, String digitOne, String digitTwo) {
        return !(s.contains(digitOne) || s.contains(digitTwo));
    }


    private static boolean isHappyDigit(String[] arr, int digit) {
        return !isUnhappyDigit(arr, digit);
    }

    private static boolean isUnhappyDigit(String[] arr, int digit) {
        String number = String.valueOf(digit);
        for (String s : arr) {
            if (number.contains(s)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isUnhappyDigit(String[] arr, String digit) {
        for (String s : arr) {
            if (s.contains(digit)) {
                return true;
            }
        }
        return false;
    }
}
