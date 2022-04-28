package com.hillel.lesson2;

public class PrimitiveType {

    public static void main(String[] args) {
        //-128 127
        //Ctrl+Alt+L
        //Ctrl+D - duplicate
        //Ctrl+Y - delete

        //Integers
        int i;
//        byte b = 0b0111_1111;//127 == 0x7F
        byte b = 0x7F;//127
        short s = 32565;
        char c = 65;
        i = 2_000_000_000;
        long l = 2_000_000_000_000L;

        float f = 45.2456F;
        double d = 435345.4353D;

        boolean bb = true;

        String str = "Hello";

        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("c = " + c);
        System.out.println("i = " + i);
        System.out.println("l = " + l);

        System.out.printf("f = %.2f", f);
        System.out.println();
        System.out.printf("d = %.2f", d);
        System.out.println();
        System.out.println("bb = " + bb);
        System.out.println(str + "World");
    }
}
