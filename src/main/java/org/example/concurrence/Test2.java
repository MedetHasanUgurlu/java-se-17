package org.example.concurrence;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test2 {
    public static void main(String[] args) {
        Runnable runnable2
                = () -> System.out.println("Runnable");

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
//        scheduledExecutorService.scheduleAtFixedRate(runnable2,5,10, TimeUnit.SECONDS);
//        scheduledExecutorService.scheduleWithFixedDelay(runnable2,5,10, TimeUnit.SECONDS);
    }
}
