package org.example.concurrence;

public class Zop {
    private int a = 5;
    public static void main(String[] args) throws InterruptedException {
    Zop zop = new Zop();

        Thread thread = new Thread(() -> {
            try {
                extracted(zop);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread.start();
        thread.setDaemon(false);
        System.out.println(zop.a);
        System.out.println("Bitti");

    }


    private static void extracted(Zop zop) throws InterruptedException {
        for (int i = 0; i < 5000; i++) {
            try {
                Thread.sleep(1);
                zop.a++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("method finished");

    }

}
