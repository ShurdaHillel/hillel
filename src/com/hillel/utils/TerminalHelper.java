package com.hillel.utils;

public class TerminalHelper {
    public static void printArray(int[] array, String delimiter) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                delimiter = "";
            }
            System.out.print(array[i] + delimiter);
        }
    }
}
