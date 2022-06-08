package com.hillel.lesson8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraySorts {
    public static void main(String[] args) {
        Random random = new Random();

        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        System.out.println("Before sort: " + Arrays.toString(array));
        long begin = System.currentTimeMillis();
        Arrays.sort(array);
//        bubbleSort(array);
        long end = System.currentTimeMillis();
        System.out.println((end - begin) + "ms");
        System.out.println("After bubble sorting: " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());

        Arrays.sort(array, 0, array.length / 2);
        Arrays.sort(array, array.length / 2, array.length, Collections.reverseOrder());


        printElements(2, 3, 4);
        printElements(2);
        printElements(2, 8, 5, 10);

        Integer[] firstPart = Arrays.copyOf(array, 4);
        System.out.println("Copy from beginning: " + Arrays.toString(firstPart));

        Integer[] middlePart = Arrays.copyOfRange(array, 4, 8);
        System.out.println("Copy from middle: " + Arrays.toString(middlePart));

        String s = "Andrii";
        String res = "";
        for (char c : s.toCharArray()) {
            if (c == 'i') {
                continue;
            }
            res += String.valueOf(c);
        }
        System.out.println("res: " + res);
    }

    private static void printElements(int... array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    private static void bubbleSort(int[] array) {
        int buffer;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    buffer = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = buffer;
                }
            }
        }
    }
}
