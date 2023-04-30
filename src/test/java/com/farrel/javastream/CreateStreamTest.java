package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {

    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
//        emptyStream.forEach(data -> {
//            System.out.println(data);
//        });
        emptyStream.forEach(System.out::println);

        Stream<String> oneStream = Stream.of("Farrel");
        oneStream.forEach(System.out::println);

        Stream<Object> emptyOrNotStream = Stream.ofNullable(null);
        emptyOrNotStream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromArray() {

        Stream<String> arrayStream = Stream.of("Farrel", "Athaillah", "Putra");
        arrayStream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerStream.forEach(System.out::println);

        String[] array = {"Farrel", "Athaillah", "Putra"};
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Farrel", "Athaillah", "Putra");

        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);

        Stream<String> stringStream2 = collection.stream();
        stringStream2.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Farrel Putra");
//        stream.forEach(System.out::println); // it will always print the text and never stop

        Stream<Integer> iterate = Stream.iterate(1, value -> value+1);
//        iterate.forEach(System.out::println); // it will always print the value and never stop
    }
}
