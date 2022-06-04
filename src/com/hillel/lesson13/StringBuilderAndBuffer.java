package com.hillel.lesson13;

import java.util.Arrays;

public class StringBuilderAndBuffer {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
//        StringBuffer stringBuffer = new StringBuffer();

        System.out.println("append: " + stringBuilder.append("Hello"));
        System.out.println("append: " + stringBuilder.append("World"));

        String str = " Java ";
        System.out.println("insert: " + stringBuilder.insert(5, str));
        int indexOf = stringBuilder.indexOf("World");
        System.out.println("indexOf: " + indexOf);
        StringBuilder delete = stringBuilder.delete(5, 5 + str.length() - 1);
        System.out.println("delete: " + delete);

        System.out.println("replace: " + stringBuilder.replace(3, 6, "test"));

        System.out.println("reverse: " + stringBuilder.reverse());

        System.out.println("Reverse via loop____________________");

        String s = stringBuilder.toString();
        reverseManual(s);
        System.out.println("-------------------------------------------");
        String hello = "Hello Java World";
        String[] split = hello.split(" ");
        System.out.println("split: " + Arrays.toString(split));

        for (int i = 0; i < split.length; i++) {
            if (i % 2 == 0){
                reverseManual(split[i]);
            } else {
                System.out.println(split[i]);
            }
        }
    }

    private static void reverseManual(String s) {
        for (int length = s.toCharArray().length - 1; length >= 0; length--) {
            System.out.print(s.charAt(length));
        }
        System.out.println();
    }
}
