package com.hillel.lesson6.homework;

public class PiramidaDiditsAndChars {
//    i
//    0 1 2 3 4 5 6 7 8 9

    //    A       i=1 j=1
//    2 1     i=2 j=1,2
//    C B A
//    4 3 2 1
//    E D C B A
//    6 5 4 3 2 1
//    G F E D C B A
//    8 7 6 5 4 3 2 1
//    I H G F E D C B A j=1,2,3,4,5,6,7,8,9
    public static void main(String[] args) {
        char a = 'A';
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                int diff = i - j;
                if (i % 2 == 0){
                    System.out.print(diff + " ");
                } else {
                    System.out.print((char) (diff + a - 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
