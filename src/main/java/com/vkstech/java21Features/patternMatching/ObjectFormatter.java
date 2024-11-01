package com.vkstech.java21Features.patternMatching;

/**
 * Pattern matching allows you to use switch statements with type checks,
 * enabling more concise code when working with different types or values.
 */
public class ObjectFormatter {

    static String formatObject(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case Long l -> "Long: " + l;
            case String s -> "String: " + s.toUpperCase();
            case null -> "Null value";
            default -> "Unknown type";
        };
    }

    public static void main(String[] args) {
        System.out.println(formatObject(123));         // Output: Integer: 123
        System.out.println(formatObject("hello"));     // Output: String: HELLO
        System.out.println(formatObject(45L));         // Output: Long: 45
    }
}
