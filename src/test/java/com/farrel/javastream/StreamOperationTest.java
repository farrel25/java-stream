package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation() {
        List<String> names = List.of("Farrel", "Athaillah", "Putra");

        //Stream<List<String>> streamOfNameList = Stream.of(names);
        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(String::toUpperCase);

        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);
    }
}
