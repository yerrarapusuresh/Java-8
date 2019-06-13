package com.suresh.java8.streams;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminals {

  public static void main(String[] args) {
    // Count terminator
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
    System.out.println(stream.count());

    // findAny and findFirst
    System.out.println("Example for find any");
    Stream<Integer> streamFindAny = Stream.iterate(1, (n) -> ++n);
    streamFindAny.findAny().ifPresent(System.out::println);

    System.out.println("Example for find first");
    Stream<Integer> streamFindFirst = Stream.iterate(1, n -> ++n);
    streamFindFirst.findFirst().ifPresent(System.out::println);

    // MatchAll, MatchAny, MatchIf
    System.out.println(Stream.of(1, 2, 3, 4, 5).allMatch(n -> n > 0)); // true
    System.out.println(Stream.of(1, 2, 3, 4, 5).anyMatch((n) -> n == 3)); // true
    System.out.println(Stream.of(1, 2, 3, 4, 5, 6).noneMatch(n -> n > 6)); // true

    // ForEach
    Stream.of(1, 2, 3, 4, 5).forEach(System.out::println);

    // Reduction
    System.out.println("Reduction starts here");
    System.out.println(Stream.of(1, 2, 3, 4, 5).reduce(0, (n, m) -> n + m));

    // min and max
    System.out.println(Stream.of(1, 2, 3, 4, 5).min((x, y) -> x - y));
    System.out.println(Stream.of(1, 2, 3, 4, 5).max((x, y) -> x - y));

    // collector
    System.out.println("collector example");
    Set<Integer> intSet = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toSet());
    System.out.println(intSet.toString());
  }

}
