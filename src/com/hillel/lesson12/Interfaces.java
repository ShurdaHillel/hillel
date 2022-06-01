package com.hillel.lesson12;

public class Interfaces {
    public static void main(String[] args) {
        Shape triangle = new Triangle(5, 3, 5, Color.RED);
        triangle.draw();
        triangle.print();
        Drawable.paint();

        Shape circle = new Circle(2.5, Color.YELLOW);

        Drawable rectangle = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Rectangle draw");
            }
        };

        rectangle.draw();
        System.out.println("==========================================");
        System.out.println("Working with array");

        Drawable[] drawables = {triangle, circle, rectangle};
        for (Drawable shape : drawables) {
            shape.draw();
        }

        Shape shapeAbs = new Shape() {
            @Override
            public double calculateArea() {
                return 0;
            }
        };
        Shape[] shapes = {triangle, circle, shapeAbs};
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.calculateArea());
        }

    }
}
