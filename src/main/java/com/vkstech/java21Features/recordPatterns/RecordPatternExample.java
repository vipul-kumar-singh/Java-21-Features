package com.vkstech.java21Features.recordPatterns;

/**
 * Record patterns simplify working with 'record' classes by enabling destructuring and pattern matching.
 * With record patterns, you can match on and decompose records concisely in various contexts, like switch and if statements.
 */
public class RecordPatternExample {

    // Define a Point record with x and y coordinates
    record Point(int x, int y) {
    }

    // Method to print information about a Point using if statements
    static void printPointInfo(Object obj) {
        if (obj instanceof Point(int x, int y)) {
            System.out.println("Point located at (" + x + ", " + y + ")");
        } else {
            System.out.println("Object is not a Point.");
        }
    }

    // Method to categorize a Point based on its location using a switch expression
    static String categorizePoint(Point point) {
        return switch (point) {
            case Point(int x, int y) when x == 0 && y == 0 -> "Origin";
            case Point(int x, int y) when x == 0 -> "On the Y-axis";
            case Point(int x, int y) when y == 0 -> "On the X-axis";
            case Point(int x, int y) when x > 0 && y > 0 -> "Quadrant I";
            case Point(int x, int y) when x < 0 && y > 0 -> "Quadrant II";
            case Point(int x, int y) when x < 0 && y < 0 -> "Quadrant III";
            case Point(int x, int y) when x > 0 && y < 0 -> "Quadrant IV";
            default -> "Unknown location";
        };
    }

    public static void main(String[] args) {
        // Test cases
        Object obj1 = new Point(5, 10);
        Object obj2 = "Not a Point";

        // Using printPointInfo with if statement pattern matching
        System.out.println("Using if pattern matching:");
        printPointInfo(obj1); // Expected: "Point located at (5, 10)"
        printPointInfo(obj2); // Expected: "Object is not a Point."

        // Categorizing different Points using switch expression with record patterns
        System.out.println("\nUsing switch expression with record patterns:");
        System.out.println("Point (0, 0): " + categorizePoint(new Point(0, 0)));         // Origin
        System.out.println("Point (0, 5): " + categorizePoint(new Point(0, 5)));         // On the Y-axis
        System.out.println("Point (6, 0): " + categorizePoint(new Point(6, 0)));         // On the X-axis
        System.out.println("Point (3, 4): " + categorizePoint(new Point(3, 4)));         // Quadrant I
        System.out.println("Point (-3, 4): " + categorizePoint(new Point(-3, 4)));       // Quadrant II
        System.out.println("Point (-2, -8): " + categorizePoint(new Point(-2, -8)));     // Quadrant III
        System.out.println("Point (6, -3): " + categorizePoint(new Point(6, -3)));       // Quadrant IV
    }
}
