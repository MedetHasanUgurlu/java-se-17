package org.example.concurrence;

public class Zoo {
    public static void main(String[] args) {
        final var thread = new Thread(Zoo::pause);
        thread.start();
        thread.setDaemon(true);
        System.out.println("Main method finished!");
    }
    public static void pause(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread finished");

    }
}
