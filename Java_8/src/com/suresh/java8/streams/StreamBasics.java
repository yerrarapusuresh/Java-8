package com.suresh.java8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamBasics {

  public static void main(String[] args) {
    Stream<Integer> empty = Stream.empty();
    Stream<Integer> singleValue = Stream.of(1);
    Stream<Integer> multiValue = Stream.of(1, 2, 3, 4);

    // printing empty stream
    System.out.println("Printing empty stream");
    empty.forEach(System.out::println);

    // printing empty stream
    System.out.println("Printing single value in stream");
    singleValue.forEach(System.out::println);

    // printing multiple stream
    System.out.print("Printn multiple values in stream");
    multiValue.forEach(System.out::println);

    // printing direct stream
    System.out.println("Printing list as stream");
    Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().forEach(System.out::println);

    // generating infinite numbers
    Stream.generate(Math::random).forEach(System.out::println);

    // genetaing odd numbers
    Stream.iterate(1, n -> n + 2).forEach(System.out::println);

  }

}
