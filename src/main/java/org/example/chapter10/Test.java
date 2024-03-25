package org.example.chapter10;

import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        Stream<Integer> ints = Stream.of(1, 3, 4, 54, 9, 3, 6, 7, 8, 9);

        final var collect = ints.peek(integer -> System.out.println(integer % 2.0)).toList();
        System.out.println(collect);

        Stream.generate(() -> Math.random() * 100).limit(2).filter(aDouble -> aDouble < 50).forEach(System.out::println);
        long a = (int) 15;
        int b = (int) a;
        byte q = 3;
        byte w = 15;
        byte x = (byte) (q+w);
    }
}
