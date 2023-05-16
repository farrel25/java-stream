package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

    Stream<String> getStream() {
        return Stream.of("Farrel", "Athaillah", "Putra");
    }

    @Test
    void testCollection() {
        Set<String> stringSet = this.getStream().collect(Collectors.toSet());
        System.out.println("stringSet: " + stringSet);
        Set<String> stringImmutableSet = this.getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println("stringImmutableSet: " + stringImmutableSet);

        List<String> stringList1 = this.getStream().collect(Collectors.toList());
        List<String> stringList2 = this.getStream().toList();
        System.out.println("stringList1: " + stringList1);

        List<String> stringImmutableList1 = this.getStream().collect(Collectors.toUnmodifiableList());
        List<String> stringImmutableList2 = this.getStream().toList();
        System.out.println("stringImmutableList1: " + stringImmutableList1);
    }

    @Test
    void testMap() {
        Map<String, Integer> stringIntegerMap1 = this.getStream().collect(Collectors.toMap(
                value -> value,
                value -> value.length()
        ));
        System.out.println(stringIntegerMap1);

        Map<String, Integer> stringIntegerMap2 = this.getStream().collect(Collectors.toMap(
                value -> value,
                String::length
        ));
        System.out.println(stringIntegerMap2);
    }
}
