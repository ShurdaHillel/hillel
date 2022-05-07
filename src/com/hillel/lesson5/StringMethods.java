package com.hillel.lesson5;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Andrii";

        String upperCase = s.toUpperCase();
        String shurda = s.concat("Shurda");

        int length = s.length();
        System.out.println("length s: " + length);
        System.out.println("is empty: " + s.isEmpty());
        int indexOfD = s.indexOf('d');
        System.out.println("index of d: " + indexOfD);

        System.out.println("substring with one parameter: " + s.substring(2));
        System.out.println("substring with two parameter: " + s.substring(2, 4));

        String trim = "Hello World ".trim();
        System.out.println("trim: " + trim);
        System.out.println("Hello World ");
        String replace = "Hello World ".replace(" ", "");
        System.out.println("replace: " + replace);

        Locale.setDefault(Locale.US);
        System.out.println(Locale.getDefault());

        System.out.println("format: " + String.format("%.2f", 9.2356));

        System.out.println(s);
        System.out.println(upperCase);
        System.out.println(shurda);
        System.out.println(s.toLowerCase());

        System.out.println(s.equals("ANDRII"));
        System.out.println(s.equals("Andrii"));
        System.out.println(s.equals(s.toLowerCase()));
    }
}
