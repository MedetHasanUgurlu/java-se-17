package org.example.chapter8.pac2;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;

public class Main {
    public static void main(String[] args) {
        ToLongFunction<Integer> converter = Math::round;
        String test = "El psy congroo";
        System.out.println(test(test));
    }

    private static boolean test(String input) {
        Predicate<String> function = s -> s.startsWith("E");
        return function.test(input);
    }
}
