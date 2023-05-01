package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class RetrievingOperationTest {

    @Test
    void testLimit() {
        Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana")
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana")
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana")
                .takeWhile(name -> name.length() <= 6)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        Stream.of("Farrel", "Putri", "Athaillah", "Putra", "Jihan", "Jana")
                .dropWhile(name -> name.length() <= 6)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana").findAny();

        optional.ifPresent(System.out::println);
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana").findFirst();

        optional.ifPresent(System.out::println);
    }
}
