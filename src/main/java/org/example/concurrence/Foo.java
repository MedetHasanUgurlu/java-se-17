package org.example.concurrence;

public class Foo {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        final var i1 = 10_000;
        final var mainThread = Thread.currentThread();

        new Thread(() -> {
            for (int i = 0; i < i1; i++) {
                counter++;
            }
            mainThread.interrupt();
        }).start();

        while (counter<i1){
            try{
                System.out.println("Not reached Yet!");
                Thread.sleep(1);
            }catch (Exception e){
                mainThread.interrupt();
            }
        }
    }
}
