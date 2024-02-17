package org.example.concurrence;

public class Main {
    public static void main(String[] args) {
        final var thread = new Thread(() -> {
            System.out.println("Foo");
        });
        thread.start();

        System.out.println("Baz");
    }

}
