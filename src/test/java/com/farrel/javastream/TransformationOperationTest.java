package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class TransformationOperationTest {

    @Test
    void testMap() {
        Stream.of("Farrel", "Athaillah", "Putra")
                .map(String::toUpperCase)
                .map(String::length)
                .forEach(System.out::println);
    }

    @Test
    void testFlatMap() {
        Stream.of("Farrel", "Athaillah", "Putra")
                .map(String::toUpperCase)
                .flatMap(upper -> Stream.of(upper, upper.length()))
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(System.out::println);
    }
}
