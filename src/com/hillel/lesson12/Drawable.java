package com.hillel.lesson12;

public interface Drawable {
    int a = 10;
    public abstract void draw();

    default void print(){
        System.out.println("Print Shape");
    }

    static void paint(){
        System.out.println("Paint line");
    }
}
