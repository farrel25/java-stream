package com.farrel.javastream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {

    @Test
    void testIntermediateOperation() {

        List<String> names = List.of("Farrel", "Athaillah", "Putra");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .map(name -> {
                    System.out.println("Add " + name + " with 'Mr.'");
                    return "Mr. " + name;
                });
    }

    @Test
    void testTerminalOperation() {

        List<String> names = List.of("Farrel", "Athaillah", "Putra");

        names.stream()
                .map(name -> {
                    System.out.println("Change " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .map(name -> {
                    System.out.println("Add " + name + " with 'Mr.'");
                    return "Mr. " + name;
                })
                .forEach(System.out::println);
    }
}
