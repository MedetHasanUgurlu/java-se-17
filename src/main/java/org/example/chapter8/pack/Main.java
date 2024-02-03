package org.example.chapter8.pack;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        final var animals = List.of(new Animal("12A", true, false), new Animal("12A", true, true), new Animal("12A", true, false));
        test(animals,Animal::canSwim);
        test2(animals,a -> a.canHop());
    }

    private static void test(List<Animal> foo, Predicate<Animal> predicate){
        foo.stream().filter(predicate).forEach(System.out::println);
    }
    private static void test2(List<Animal> foo, Swimmable swimmable){
        foo.stream().filter(swimmable::test).forEach(System.out::println);
    }
}
