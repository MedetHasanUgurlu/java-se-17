package org.example.concurrence;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test7 {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        new Thread(() -> {
            try {
                printHello(lock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
        if (lock.tryLock()){
            System.out.println("Anahtar alındı");
        }
    }


    public static void printHello(Lock lock) throws InterruptedException {
        try {
            lock.lock();

            System.out.println("Hello");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            Thread.sleep(3000);
            System.out.println("Bar");
            lock.unlock();
        }
    }
}
