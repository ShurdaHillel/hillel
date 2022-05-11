package com.hillel.lesson5.homework;

public class FormattedDouble {
    public static void main(String[] args) {
        double number = 4.556;
        double doubleToDecimalPlaces = doubleToDecimalPlaces(number, 2);

        String formatNumber = String.format("%.2f", number);

        System.out.println("Our number is: " + doubleToDecimalPlaces);
        System.out.println("Our number is with String.format(): " + formatNumber);
        double stringDoubleFormat = doubleToDecimalPlacesWithFormat(number, 2);
        System.out.println("Our number is  with String.format() method: " + stringDoubleFormat);
    }

    private static double doubleToDecimalPlaces(double number, int countAfterPoint) {
//        4.556->4.56
        double powTen = Math.pow(10, countAfterPoint);
        return Math.round(number * powTen) / powTen;
    }

    private static double doubleToDecimalPlacesWithFormat(double number, int countAfterPoint) {
        return Double.parseDouble(String.format("%." + countAfterPoint + "f", number));
    }
}
