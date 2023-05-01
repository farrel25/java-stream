package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

    @Test
    void testCreateStreamPipeline() {
//        List.of("Farrel", "Athaillah", "Putra").stream()
//                .map(name -> name.toUpperCase())
//                .map(nameUpper -> "Mr. " + nameUpper)
//                .forEach(value -> System.out.println(value));

        Stream.of("Farrel", "Athaillah", "Putra")
                .map(String::toUpperCase)
                .map(nameUpper -> "Mr. " + nameUpper)
                .forEach(System.out::println);
    }
}
