package com.hillel.lesson4;

public class Track {
    public static void main(String[] args) {
        int length = 10;
        int width = 5;
        int height = 6;

        long volume = countVolume(length, width, height);
        System.out.println("volume: " + volume);
    }

    private static long countVolume(int length, int width, int height) {
        return length * width * height;
    }
}
