package com.hillel.lesson13;

import com.hillel.lesson12.*;

public class InstanceOfUse {
    public static void main(String[] args) {
        Shape triangle = new Triangle(5, 3, 5, Color.RED);
        Shape circle = new Circle(2.5, Color.YELLOW);


        String simpleName = circle.getClass().getSimpleName();
        System.out.println(simpleName);

        boolean isInstance = circle instanceof Maker;

        System.out.println("equals by class name: " + simpleName.equals("Circle"));
        System.out.println("instanceof: " + isInstance);


        Shape[] shapes = {triangle, circle};
        for (Shape shape : shapes) {
            if (shape instanceof Maker) {
                Maker maker = (Maker) shape;
                maker.make();
            }
                shape.draw();
        }
    }
}
