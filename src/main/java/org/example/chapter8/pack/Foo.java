package org.example.chapter8.pack;

public class Foo {
    static {
        System.out.println("static initializers");
    }
    {
        System.out.println("instance initializers");
    }

    public Foo() {
        System.out.println("No out constructor");
    }

    public static void main(String[] args) {
        new Foo();
        System.out.println();
        new Foo();
    }
}
