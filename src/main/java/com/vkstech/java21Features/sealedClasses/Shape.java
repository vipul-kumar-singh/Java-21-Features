package com.vkstech.java21Features.sealedClasses;

/**
 * Sealed classes allow you to restrict which classes can extend or implement them.
 * Only specified classes can be direct subclasses, which improves control over the class hierarchy.
 * Subclasses of sealed classes need to be final
 */
public abstract sealed class Shape permits Circle, Square, Rectangle {

    public abstract double area(); // Abstract method for calculating area

}
