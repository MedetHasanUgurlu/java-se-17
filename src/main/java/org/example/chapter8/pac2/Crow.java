package org.example.chapter8.pac2;

import java.util.function.Consumer;

public class Crow {
    private String color;

    public void caw(String name) {
        String volume = "loudly";
        color = "black";
        Consumer<String > consumer = s -> System.out.println(volume);
    }
}
