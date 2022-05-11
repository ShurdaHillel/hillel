package com.hillel.lesson6;

import static java.lang.Character.isLowerCase;

public class CharacterMethods {
    public static void main(String[] args) {
        char c = '\n';
        char empty = ' ';
        char symbol = ' ';
        boolean isLetterOrDigit = Character.isDigit(symbol) || Character.isLetter(symbol);
        System.out.println("isLetterOrDigit: " + isLetterOrDigit);
        boolean isLetter = Character.isLetter(c);
        System.out.println("isLetter: " + isLetter);
        System.out.println("isDigit: " + java.lang.Character.isDigit(c));
        System.out.println("isDigit: " + Character.isDigit('5'));
        System.out.println("isWhitespace: " + Character.isWhitespace('c'));
        System.out.println("isWhitespace: " + Character.isWhitespace(empty));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit('5'));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit('a'));

        System.out.println("compare(\"a\", 'b')" + Character.compare('a', 'b'));

        char bigA = 'A';
        System.out.println("lowerCase: " + isLowerCase(bigA));
        System.out.println("isUpperCase: " + Character.isUpperCase(bigA));
    }

}
