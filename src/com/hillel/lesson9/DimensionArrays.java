package com.hillel.lesson9;

import com.hillel.utils.TerminalHelper;

import java.util.Arrays;

public class DimensionArrays {
    public static void main(String[] args) {
        int[] ints = {1, 2, 5, 6, 0};

        int[][] dimArray = {
                ints,
                {9, 2, 8},
                {1, 2}
        };

        for (int i = 0; i < dimArray.length; i++) {
            System.out.println("len: " + dimArray[i].length + " index: " + i + " " + Arrays.toString(dimArray[i]));
        }

        System.out.println("_________________________________________________________________________");
        for (int i = 0; i < dimArray.length; i++) {
            for (int j = 0; j < dimArray[i].length; j++) {
                System.out.print(dimArray[i][j] + " ");
            }
            System.out.println();
        }
        dimArray[1][1] = 3;
        System.out.println("dimArray[1][1]=" + dimArray[1][1]);

        int[][][] threeDemArray = {
                {{36, 9, 87}, {26, 54, 5}, {3, 11, 62}},
                {{17, 77, 28}, {3, 5, 4}, {13, 1, 6}}
        };

        System.out.println("__________________________________________________________________________");
        for (int i = 0; i < threeDemArray.length; i++) {
            for (int j = 0; j < threeDemArray[i].length; j++) {
                for (int k = 0; k < threeDemArray[i][j].length; k++) {
                    System.out.print(threeDemArray[i][j][k] + " ");
                }
                System.out.println();
//                System.out.println(Arrays.toString(threeDemArray[i][j]));
            }
            System.out.println();
        }
        System.out.println("_____________________________________________________________________");
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {4, 2, 7, 4, 8}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("__________________________________________________________________________________");
        int[][] transponseMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int value = matrix[j][i];
                transponseMatrix[j][i] = value;
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("_______________________________________________");
        int[] array = {1, 2, 5, 8};
        System.out.println("Use utils method:");
        TerminalHelper.printArray(array, ",");
        System.out.println();
        TerminalHelper.printArray(array, " ");
        System.out.println();
        TerminalHelper.printArray(array, "-");
    }
}
