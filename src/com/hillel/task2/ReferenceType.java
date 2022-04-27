package com.hillel.task2;

public class ReferenceType {
    public static void main(String[] args) {
        int a = 456; //1_1100_1000
        Integer i = a;
        Integer b = new Integer(45);

        int g = i;

        byte k = (byte) a;
        Double d = 5466646D;
        Double dd = Double.valueOf(new Integer(45));

        System.out.println(a);
        System.out.println(k);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(k));

        int x = 45;
        int y = 5;
//Ctrl+Alt+V
        int sum = x + y;
        int sub = x - y;
        int mul = x * y;
        int div = x / y;

        System.out.println("x+y=" + sum);
        System.out.println("x-y=" + sub);
        System.out.println("x*y=" + mul);
        System.out.println("x/y=" + div);
//2 Ctrl + Arrow down
        System.out.println(" ***    *   *       *   *  ");
        System.out.println("    *  * *   *     *   * * ");
        System.out.println("    * *   *   *   *   *   *");
        System.out.println("*   * *****    * *    *****");
        System.out.println(" ***  *   *     *     *   *");

    }
}
