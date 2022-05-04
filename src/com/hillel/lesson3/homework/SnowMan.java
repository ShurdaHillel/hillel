package com.hillel.lesson3.homework;

import java.util.Scanner;

public class SnowMan {
    public static void main(String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;

        int totalArmy = (int) (1.5 * 860);

        int totalAttackLi = (warriorLi + archerLi + riderLi) * totalArmy;

        System.out.println("Total attack of army Li: " + totalAttackLi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter min limit: ");

        int minLimit = scanner.nextInt();
        System.out.print("Enter max limit: ");
        int maxLimit = scanner.nextInt();
        // 0.0 < x < 1.0
        // 20 < x < 80  delta 60
//        79.5 ~ 80
//        int random = minLimit + Math.round(Math.random() * (maxLimit - minLimit));
        int random = minLimit + (int)(Math.random() * (maxLimit - minLimit + 1));

        System.out.println("Our random value: " + random);

    }
}
