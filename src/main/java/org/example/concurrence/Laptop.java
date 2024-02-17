package org.example.concurrence;

public class Laptop extends Thread{
    public static void main(String[] args) {
        final var laptop = new Laptop();
        laptop.run();
        laptop.start();
        System.out.println("Baz2");
    }
    @Override
    public void run() {
        System.out.println("Laptop running");
    }

    @Override
    public void start() {
        System.out.println("adADFAS");
    }
}
