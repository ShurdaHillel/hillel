package com.hillel.lesson12;

public class Enums {
    public static void main(String[] args) {
        System.out.println(Level.LOW);

        System.out.println("Level.values():");
        for (Level value : Level.values()) {
            System.out.println(value);
        }

//        Ctrl+Shift+U - to upperCase/lowerCase
        Level high = Level.valueOf("HIGH");
        System.out.println("Level.valueOf: " + high);

        String level = "high".toUpperCase();
        Level highLower = Level.valueOf(level);
        System.out.println("highLower: " + highLower);

        System.out.println("Level.convert:");
        Level low = Level.convert("Low");
        System.out.println(low);

        levelConverter(Level.LOW);
        levelConverter(Level.HIGH);
    }

    private static void levelConverter(Level level) {
        switch (level){
            case LOW:
                sentMsg();
                break;
            case MEDIUM:
            case HIGH:
                System.out.println("The level OK");
                break;
        }
    }

    private static void sentMsg() {
        System.out.println("Send msg");
    }

}
