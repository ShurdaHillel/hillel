package com.hillel.lesson12;

import com.hillel.lesson13.Maker;

public class Circle extends Shape implements Maker {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle draw");
    }

    @Override
    public double calculateArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "color=" + getColor() +
                '}';
    }

    @Override
    public void make() {
        System.out.println("Make circle");
    }
}
