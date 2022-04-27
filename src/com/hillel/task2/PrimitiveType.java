package com.hillel.task2;

public class PrimitiveType {

    public static void main(String[] args) {
//        Практика #1::
//                Створюємо новий клас MyCar
//        в ньому описуємо свою улюблену машину
//        String name = // назва машини
//        char category = // літера категорії посвідчення водія; А - мотоцикл,
//        В - легкова машина, С - вантажна
//                Byte wheels = // кількість коліс
//        short passengers = // кількість пасажирів
//        int number = // номер (числовий)
//        long phone = // номер телефону власника
//        float price = // ціна 19.99 ;
//        double radio = // частота автомобільного радіо: наприклад 105.3 - це просто радіо, 90.2
//
//        Виводимо всі дані в консоль.




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
