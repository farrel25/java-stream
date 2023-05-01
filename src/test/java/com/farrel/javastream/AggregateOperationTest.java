package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class AggregateOperationTest {

    @Test
    void testMax() {
        Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana")
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);

        Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana")
                .max(Comparator.reverseOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana")
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCount() {
        long count = Stream.of("Farrel", "Athaillah", "Putra", "Jihan", "Jana").count();
        System.out.println(count);
    }

    @Test
    void testSum() {
        Integer sumResult1 = Stream.of(1, 2, 3, 4, 5).reduce(0, (result, item) -> result + item);
        System.out.println(sumResult1);

        Integer sumResult2 = Stream.of(1, 2, 3, 4, 5).reduce(0, Integer::sum);
        System.out.println(sumResult2);
    }

    @Test
    void testFactorial() {
        Integer factorialResult = Stream.of(1, 2, 3, 4, 5).reduce(1, (result, item) -> result * item);
        System.out.println(factorialResult);
    }
}
