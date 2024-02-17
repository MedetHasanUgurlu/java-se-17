package org.example.concurrence;

public class Kop {

    private static  int counter = 0;


    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter++;
            }
        }).start();
        while (counter<1_000_000){
            System.out.println("Not Reached Yet");
            Thread.sleep(1_000);
        }
        System.out.println(counter);

        /*
        Thread lifecycle
        1 - NEW

        2 - RUNNABLE

        3.1 - BLOCKED resource request, resource granted
        3.2 - WAITING wait, notify
        3.3 - TIMED_WAITING sleep()

        4 - TERMINATED

        context-switch: threadin anlık durumunu sorgular.
        thread-schedular: threadin bitip bitmediğini belirler.
        */



    }
}
