package com.suresh.java8.streams;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamintermediateOperations {

  public static void main(String[] args) {
    // Stream intermediate operations

    Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 10).filter(n -> n % 2 == 0)
        .forEach(System.out::println);

    // Stream for distinct elements
    printIt((s) -> System.out.println(s), "Printing distinct elements");
    Stream.of(4, 4, 4, 4, 4, 4).distinct().forEach(System.out::println);

    // example for limit and skip
    System.out.println("Limiting elements to 5");
    Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).limit(5).forEach(System.out::println);

    // example for skipping elements
    System.out.println("Skiping elements");
    Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).skip(5).forEach(System.out::println);

    // Mapping elements
    System.out.println("Convert one type to other type");
    Stream.of("suresh", "susmitha", "sunil", "sunitha").map(s -> s.length())
        .forEach(System.out::println);

    // Sort the elements
    Stream.of("x", "y", "z", "a", "b", "c", "d").sorted((a, b) -> b.compareTo(a))
        .forEach(System.out::println);

    // peek for debugging
    Stream.of("abcd", "mno", "wxyz", "wer").peek(System.out::println).filter(a -> a.length() > 3)
        .peek(System.out::println).limit(2).forEach(System.out::println);

    // Here onwards should work with primitive types
    System.out.println("Working with primitives");
    IntStream.of(1, 2, 3, 4, 5, 6).average().ifPresent(System.out::println);

    // Generate infinite random numbers
    DoubleStream.generate(Math::random).skip(5).limit(10).forEach(System.out::println);

    // Generate infinite double numbers
    // System.out.println(DoubleStream.iterate(1.0, n -> n / 2)
    // .filter(n -> n < 0.000000000001).count());

    DoubleStream.iterate(.5, n -> n / 2).peek(System.out::println).anyMatch(n -> n == 0.0);
    
   
    System.out.println( Stream.of(1,2,3,4,5,6,7).reduce((u,v)->u+v)+"         ------");

  }

  public static void printIt(PrintInterface p, String str) {
    p.toPrint(str);
  }

}
