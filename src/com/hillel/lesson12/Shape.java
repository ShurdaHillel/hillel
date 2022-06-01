package com.hillel.lesson12;

public abstract class Shape implements Drawable {
    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public abstract double calculateArea();

    @Override
    public void draw() {
        System.out.println("Shape draw");
    }


    @Override
    public String toString() {
        return "This is shape: " + getClass().getSimpleName() + ", color is: " + color;
    }
}
