package com.hillel.lesson16;

public class PrinterNumber extends Printer{
    @Override
    public void printNumber(Object value) throws PrinterException, NullPointerException, ArithmeticException {
        if (value instanceof Number) {
            super.printNumber(value);
        } else {
            throw new ArithmeticException();
        }
    }
}
