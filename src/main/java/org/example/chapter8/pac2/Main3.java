package org.example.chapter8.pac2;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main3 {
    public static void main(String[] args) {
        Supplier<String> query = () -> "select * from stores";
        System.out.println(query.get());
        UnaryOperator<String> unaryOperator = String::new;
        final var foo = unaryOperator.apply("Foo");
        System.out.println(foo);
        System.out.println(foo.isEmpty());
        unaryOperator = s -> s.concat("Moo");
        System.out.println(unaryOperator.apply("A"));

        Predicate<Integer> predicate = integer -> integer > 10;


        System.out.println(predicate.test(3));


        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate<String> white = s -> s.contains("white");
        System.out.println(egg.and(brown).and(white).negate().test(" egg brown"));

        Consumer<String> consumer1 = s -> System.out.println("Consumer-1: " + s);
        Consumer<String> consumer2 = s -> System.out.println("Consumer-2: " + s);
        consumer1.andThen(consumer2).accept("TEST");


    }
}
