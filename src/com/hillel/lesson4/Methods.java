package com.hillel.lesson4;

public class Methods {

    public static void main(String[] args) {

        System.out.println("before");

        String andrii = "Andrii";
        String jack = "Andrii";
        String will = "Will";
        hello(andrii);
        hello(jack);
        hello(will);
        hello("Kavin");
        hello(45);

        String hello = concat("Hello", andrii);
        System.out.println(hello);
        String helloWithAge = concat("Hello", andrii, 33);
        System.out.println(helloWithAge);


        Math.round(2.0);
        System.out.println("after");
    }

    public static void hello(String age) {
        System.out.println("Hello " + age);
    }

    /**
     * Say hello
     * @param age
     */
    public static void hello(int age) {
        System.out.println("Age " + age);
    }

    public static String concat(String str, String str2) {
        return concat(str, str2, "");
    }

    public static String concat(String str, String str2, String age) {
        return str + " :" + str2 + " age: " + age;
    }

    public static String concat(String str, String str2, int age) {
        System.out.println("Age: " + age);
        return str + " :" + str2 + " age: " + age;
    }

}
