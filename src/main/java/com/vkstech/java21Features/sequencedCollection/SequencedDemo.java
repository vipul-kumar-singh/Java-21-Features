package com.vkstech.java21Features.sequencedCollection;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.SequencedCollection;
import java.util.SequencedMap;

/**
 * Java introduced SequencedCollection to unify access to ordered elements in lists, sets, and maps.
 * Classes like List, Set, and Map now implement this interface, allowing easier access to the first and last elements.
 */
public class SequencedDemo {

    public static void main(String[] args) {
        SequencedCollection<String> list = List.of("apple", "banana", "cherry");

        System.out.println("First element: " + list.getFirst()); // Output: apple
        System.out.println("Last element: " + list.getLast());   // Output: cherry

        SequencedMap<String, Integer> map = new LinkedHashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);

        System.out.println("First key-value pair: " + map.firstEntry()); // Output: apple=1
        System.out.println("Last key-value pair: " + map.lastEntry());
    }
}
