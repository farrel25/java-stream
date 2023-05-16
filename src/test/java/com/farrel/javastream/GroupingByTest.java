package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {

    @Test
    void testGroupingBy() {
        Map<Integer, List<Integer>> integerListMap1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(number -> number));
        System.out.println(integerListMap1);

        Map<String, List<Integer>> stringListMap2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(
                        Collectors.groupingBy(number -> {
                            if (number > 5) {
                                return "Big";
                            } else {
                                return "Small";
                            }
                        })
                );
        System.out.println(stringListMap2);

        Map<String, List<Integer>> stringListMap3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(
                        Collectors.groupingBy(number -> number > 5 ? "Big" : "Small")
                );
        System.out.println(stringListMap3);
    }

    @Test
    void testGroupingBy2() {
        Map<String, List<String>> stringListMap = Stream.of("Farrel", "Athaillah", "Putra", "Leraf", "Artup")
                .collect(
                        Collectors.groupingBy(name -> {
                            if (name.length() > 5) {
                                return "Long";
                            } else {
                                return "Short";
                            }
                        })
                );
        System.out.println(stringListMap);

        Map<String, List<String>> stringListMap2 = Stream.of("Farrel", "Athaillah", "Putra", "Leraf", "Artup")
                .collect(
                        Collectors.groupingBy(name -> name.length() > 5 ? "Long" : "Short")
                );
        System.out.println(stringListMap2);
    }

    @Test
    void testPartitioningBy() {
        Map<Boolean, List<Integer>> booleanListMap = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(
                        Collectors.partitioningBy(number -> number > 5)
                );
        System.out.println(booleanListMap);
    }

    @Test
    void testPartitioningBy2() {
        Map<Boolean, List<String>> stringListMap2 = Stream.of("Farrel", "Athaillah", "Putra", "Leraf", "Artup")
                .collect(
                        Collectors.partitioningBy(name -> name.length() > 5)
                );
        System.out.println(stringListMap2);
    }
}
