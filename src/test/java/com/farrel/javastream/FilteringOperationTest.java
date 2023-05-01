package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class FilteringOperationTest {

    @Test
    void testFilter() {
        Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana")
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);

        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        Stream.of("Farrel", "Jihan", "Athaillah", "Farrel", "Putra", "Jihan", "Jana")
                .distinct()
                .forEach(System.out::println);
    }
}
