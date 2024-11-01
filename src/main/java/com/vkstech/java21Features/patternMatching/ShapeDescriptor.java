package com.vkstech.java21Features.patternMatching;

import com.vkstech.java21Features.sealedClasses.Circle;
import com.vkstech.java21Features.sealedClasses.Rectangle;
import com.vkstech.java21Features.sealedClasses.Shape;
import com.vkstech.java21Features.sealedClasses.Square;

public class ShapeDescriptor {

    public static void shapeDescriptor(Shape shape) {
        String shapeDescription = switch (shape) {
            case Circle c -> "A circle with radius " + c.getRadius();
            case Square s -> "A square with side " + s.getSide();
            case Rectangle r -> "A rectangle with length " + r.getLength() + " and width " + r.getWidth();
        };

        System.out.println("Shape description: " + shapeDescription);
    }

    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(3, 7);

        shapeDescriptor(circle);
        shapeDescriptor(square);
        shapeDescriptor(rectangle);
    }
}
