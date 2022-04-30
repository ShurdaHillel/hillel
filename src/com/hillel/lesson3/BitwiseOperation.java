package com.hillel.lesson3;

public class BitwiseOperation {
    public static void main(String[] args) {

        int a = 0b1111_0000;//240
        int b = 0b1010_0011;
//      &  AND  0b1010_0000;
//                0101_0011

//        00000011_1010_0011_1010_0011_1010_0011

//        | or
//        & and
//        ^ xor
        System.out.println("a = " + a);
        System.out.println("binary a: " + Integer.toBinaryString(a));
        System.out.println("binary b: " + Integer.toBinaryString(b));
        System.out.println("binary a & b: " + Integer.toBinaryString(a & b));
        System.out.println("binary a | b: " + Integer.toBinaryString(a | b));
        System.out.println("binary a ^ b: " + Integer.toBinaryString(a ^ b));
//        >> <<
        System.out.println("binary a ^ b: " + Integer.toBinaryString(a ^ b));
        int t = 240 >> 3;
        int k = 60 << 2;
//        0001111_0
        System.out.println("t = " + t);//60
        System.out.println("k = " + k);//240
        System.out.println("t = " + Integer.toBinaryString(t));//60
        System.out.println("k = " + Integer.toBinaryString(k));//60

        // c = c * 2*2

    }
}
