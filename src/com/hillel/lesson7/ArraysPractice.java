package com.hillel.lesson7;

import java.util.Arrays;
import java.util.Random;

public class ArraysPractice {
    public static void main(String[] args) {
//        0, 1, 2, 3, 4, 5
        Random random = new Random();
        int a = 10;
        int randomInt = 10 + random.nextInt(a + 1);

        int len = 5;
        int[] array = new int[len];
        int[] arrayDest = new int[10];

        array[0] = randomInt;
        array[2] = 45;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] and value: %d\n",i, array[i]);
        }

        String[] seasons = {"winter", "spring", "summer", "autumn"};

        for (String season : seasons) {
            System.out.println("season: " + season);
        }

        for (int i = 0; i < seasons.length; i++) {
            System.out.println("season by index: " + seasons[i]);
        }

        System.out.println("value of index 0: " + array[0]);
        System.out.println("value of index 1: " + array[1]);
        System.out.println("value of index 2: " + array[2]);
        System.out.println("array length: " + array.length);

        System.out.println("seasons of index 1: " + seasons[1]);

        System.out.println("array: " + Arrays.toString(array));
        System.out.println("arrayDest: " + Arrays.toString(arrayDest));

        System.arraycopy(array,1, arrayDest, 2, 2);
        System.out.println("After copy");
        System.out.println("arrayDest: " + Arrays.toString(arrayDest));

    }
}
