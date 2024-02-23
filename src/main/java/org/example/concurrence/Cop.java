package org.example.concurrence;

import java.util.concurrent.*;

public class Cop {
    private static int COUNTER = 0;

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    COUNTER++;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Callable<Integer> integerCallable = () -> {
            return 5;
        };
        try(ExecutorService executorService = Executors.newSingleThreadExecutor()){
            final Future<?> future = executorService.submit(runnable);
            final var integerFuture = executorService.submit(integerCallable);
            System.out.println(future.get(6, TimeUnit.SECONDS));
            System.out.println(integerFuture.get());
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
