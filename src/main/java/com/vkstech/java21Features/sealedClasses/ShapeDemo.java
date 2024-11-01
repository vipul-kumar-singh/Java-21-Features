package com.vkstech.java21Features.sealedClasses;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(3, 7);

        // Print out the details of each shape
        System.out.println(circle);
        System.out.println("Area: " + circle.area());

        System.out.println(square);
        System.out.println("Area: " + square.area());

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.area());
    }
}
