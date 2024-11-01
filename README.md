# Java 21 New Features

Java 21 introduces several exciting features aimed at enhancing the developer experience. This README highlights some of these features with their respective syntax.

## 1. Record Patterns

Record patterns allow for easier deconstruction of record values. They enable more concise pattern matching, enhancing the readability of code.

### Syntax
```java
if (obj instanceof Point(var x, var y)) {
    // Use x and y
}
```

## 2. Pattern Matching for Switch

Pattern matching for switch enhances the switch statement by allowing patterns to be used in case labels, enabling more expressive and type-safe conditional logic.

### Syntax
```java
switch (shape) {
    case Circle(var radius) -> // Handle circle
    case Rectangle(var length, var width) -> // Handle rectangle
    default -> // Handle default case
}
```

## 3. Sealed Classes

Sealed classes and interfaces restrict which classes can extend or implement them. This provides better control over the class hierarchy and helps in modeling constrained data.

### Syntax
```java
sealed class Shape permits Circle, Rectangle {
    // Base class code
}

final class Circle extends Shape {
    // Circle specific code
}

final class Rectangle extends Shape {
    // Rectangle specific code
}
```

## 4. Virtual Threads

Virtual threads provide a lightweight way to create and manage threads, enabling high levels of concurrency with minimal resource overhead.

### Syntax
```java
var executor = Executors.newVirtualThreadPerTaskExecutor();
executor.submit(() -> {
    // Task code
});
```

## 5. Foreign Function & Memory API (Standard)

The Foreign Function & Memory API provides a mechanism to interact with native code and manage memory outside the Java heap, allowing for more efficient native method calls and memory manipulation.

### Syntax
```java
try (MemorySession session = MemorySession.openConfined()) {
    MemorySegment segment = session.allocate(ValueLayout.JAVA_INT.byteSize());
    segment.set(ValueLayout.JAVA_INT, 0, value);
    int result = segment.get(ValueLayout.JAVA_INT, 0);
}
```

## Conclusion

Java 21 introduces powerful new features that enhance the language's capabilities and developer experience. For more detailed examples and documentation, refer to the official Java documentation.
