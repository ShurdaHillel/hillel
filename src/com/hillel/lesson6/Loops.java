package com.hillel.lesson6;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        int a = 5;
        if (a > 10) {
            System.out.printf("Hello".concat("World"));
        }
        System.out.println();

// Практика  №1
// Вивести перших 10 парних чисел

// Практика №2
//Зробіть таймер зі зворотним відліком від 10 до 0 за допомогою циклу WHILE
//додайте до вашого таймера умову, що якщо він зупинений, то він зупиняє відлік
//
    /*
    Практика №3
    Зробити цикли на визначення позитивного цілого числа із консолі. Використати цикл do while
    - Ввести із консолі щось
    - Якщо це double або String, то вивести повідомлення, що це не ціле позитивне число та попросити спробувати ще
    - Якщо це int, але негативне число, вивести повідомлення, що потрібно саме позитивне
    - Якщо число int вивести його та подякувати.

Enter number :55.56
It's not a number. Please enter an integer number
Enter number :іва
It's not a number. Please enter an integer number
Enter number :-45
Enter positive number
Enter number :4
Thank you your entered positive number is 4
     */

        int limit = 20;
        for (int i = 1; i <= limit; i++) {
            System.out.println("cycle: " + i);
        }

        for (int i = limit; i > 0; i--) {
            System.out.println("decrement cycle: " + i);
        }

        int i = 0;
        while (i < limit) {
            i++;
            System.out.println("while cycle: " + i);
        }

        do {
            System.out.println("loop do while: " + i--);
            if (i == 10) {
                break;
            }
        } while (i > 0);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Please enter some value: ");
            String s = scanner.nextLine();
            if (s.equals("q")) {
                break;
            }
        } while (true);
    }
}
