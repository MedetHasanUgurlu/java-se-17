package org.example.concurrence;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
    private volatile List<HashMap<String, String>> hashMaps;
    private int sheepCount = 0;
    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
    public static void main(String[] args) throws InterruptedException {
        SheepManager sheepManager = new SheepManager();
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        try {
            for (int i = 0; i < 10; i++) {
                executorService.execute(sheepManager::incrementAndReport);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            executorService.shutdown();
        }
        executorService.awaitTermination(1, TimeUnit.MILLISECONDS);

        if (executorService.isTerminated()){
            System.err.println(sheepManager.sheepCount);
        }


    }

    public void incrementAndReport() {
        synchronized(this){
            System.out.print((++sheepCount) + " ");
        }
    }
}
