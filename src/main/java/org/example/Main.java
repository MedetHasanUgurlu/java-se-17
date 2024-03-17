package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String [] args) {
        final var integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);


        integers.forEach(System.out::println);
        integers.add(0,7);
        System.out.println();
        integers.forEach(System.out::println);

    }

}