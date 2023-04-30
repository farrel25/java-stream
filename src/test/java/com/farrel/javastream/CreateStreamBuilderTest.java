package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {

        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Farrel");
        builder.add("Athaillah").add("Putra");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {

        Stream<Object> stream = Stream.builder()
                .add("Farrel")
                .add("Athaillah")
                .add("Putra")
                .build();

        stream.forEach(System.out::println);
    }
}
