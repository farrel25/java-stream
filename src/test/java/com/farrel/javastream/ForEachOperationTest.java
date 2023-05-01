package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ForEachOperationTest {

    @Test
    void testPeek() {
        Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana")
                .peek(data -> System.out.println("Before change name to upper: " + data))
                .map(String::toUpperCase)
                .peek(data -> System.out.println("After change name to upper: " + data))
                .forEach(System.out::println);
    }
}
