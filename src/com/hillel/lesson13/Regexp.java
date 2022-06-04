package com.hillel.lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
    public static void main(String[] args) {
       String s = "Andrii45 May\t!";
        System.out.println(s);
        System.out.println(s.replaceAll(" ", ""));
        System.out.println(s.replaceAll("\\d", ""));
        System.out.println(s.replaceAll("[0-4]", ""));
        System.out.println(s.replaceAll("[A-Z]", ""));


        String inputString = "This is simple that contains phone iso number +380505055050 That's great"
                + ".  +380505055012";

        chechText(inputString, "\\d+");
        chechText(inputString, "(\\bis|phone)");
    }

    private static void chechText(String inputString, String regexp) {
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
