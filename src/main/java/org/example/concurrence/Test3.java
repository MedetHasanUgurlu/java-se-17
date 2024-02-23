package org.example.concurrence;

import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            double random = Math.random()*10;
            for (int i = 0; i < random; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println("Runnable: "+ i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleWithFixedDelay(runnable,2,7,TimeUnit.SECONDS);


    }
}
