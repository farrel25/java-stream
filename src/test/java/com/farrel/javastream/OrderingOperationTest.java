package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Stream;

public class OrderingOperationTest {

    @Test
    void testSorted() {
        Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana")
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana")
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        System.out.println("\n===============\n");

        Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana")
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
