package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamTest {

    @Test
    void testCreate() {
        IntStream intStream = IntStream.range(50, 100);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.of(1, 2, 3, 4);
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.builder().add(0.1).add(0.2).add(0.3).build();
        doubleStream.forEach(System.out::println);
    }

    @Test
    void testOperations() {
        IntStream intStream = IntStream.range(1, 100);

        OptionalDouble average = intStream.average();
        average.ifPresent(System.out::println);

        Stream<Integer> integerStream1 = IntStream.range(1, 100).mapToObj(value -> Integer.valueOf(value));
        Stream<Integer> integerStream2 = IntStream.range(1, 100).mapToObj(Integer::valueOf);
        Stream<Integer> integerStream3 = IntStream.range(1, 100).boxed();

        Stream<String> stringStream = IntStream.range(1, 100).mapToObj(String::valueOf);
        stringStream.forEach(value -> System.out.println("Number: " + value));
    }
}
