package com.vkstech.java21Features.virtualThreads;

import java.util.concurrent.Executors;

/**
 * Virtual Threads, part of Project Loom, are now a standard feature.
 * Virtual threads provide lightweight concurrency, making it easier to build scalable applications without worrying about thread management overhead.
 * This feature significantly improves scalability by allowing thousands (or even millions) of virtual threads to be created without hitting resource limits.
 */
public class VirtualThreadExample {

    private static void performTask(int taskId) {
        System.out.println("Task " + taskId + " is starting on virtual thread: " + Thread.currentThread());

        try {
            Thread.sleep(1000); // Simulate work by sleeping for 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupted status
            System.out.println("Task " + taskId + " was interrupted.");
        }
        System.out.println("Task " + taskId + " is completed.");
    }

    public static void main(String[] args) {
        // Create a virtual thread executor
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            // Submit several tasks to be executed on virtual threads
            for (int i = 1; i <= 5; i++) {
                final int taskId = i; // Capture task ID for use in lambda
                executor.submit(() -> performTask(taskId));
            }
        } // Executor is closed automatically at the end of the try-with-resources block
    }
}
