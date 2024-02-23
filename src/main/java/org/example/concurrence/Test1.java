package org.example.concurrence;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try{
            Runnable runnable = () -> {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(1_000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
            Runnable runnable2
                    = () -> {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1_000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };

            executorService.execute(runnable);
            executorService.execute(runnable2);



        }catch (Exception e){

        }finally {
            executorService.shutdown();
        }

        executorService.awaitTermination(16, TimeUnit.SECONDS);
        if (executorService.isTerminated()){
            System.out.println("All task done");
        }else {
            System.err.println("Still running");
        }
    }
}
