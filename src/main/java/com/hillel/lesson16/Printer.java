package com.hillel.lesson16;

public class Printer {

    public void printNumber(Object value) throws NullPointerException, PrinterException {
        printFloat(value);
    }

    public static void printFloat(Object value) throws NullPointerException, PrinterException {
        if (value == null) {
            throw new NullPointerException();
        } else if (value instanceof Float) {
            print((float) value, 1);
        } else if (value instanceof Double) {
            print((double) value, 2);
        } else {
//            System.out.println("Can not convert value: " + value);
            throw new PrinterException("Can not convert value: " + value);
        }
    }

    public static void print(Object object) {
        System.out.println("Our object has value: " + object);
    }

    public static void print(Number object, int count) {
        System.out.printf("Our object has value: %." + count + "f\n", object);
    }

}
