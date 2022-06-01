package com.hillel.lesson12;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(Color color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double a, double b, double c, Color color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("Triangle draw");
    }

    @Override
    public void print() {
        System.out.println("print Triangle");
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public double calculateArea() {
        double s = (getA() + getB() + getC()) / 2;
        double d = s * (s - getA()) * (s - getB()) * (s - getC());
        return Math.pow(d, 0.5);
    }
}
