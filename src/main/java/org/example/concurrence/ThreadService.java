package org.example.concurrence;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadService {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 15; i++) {
                System.out.println(i);
            }
        };
        Runnable runnable1 = () -> System.out.println("Start");
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
        try(executorService){
            System.out.println("1asdasdas");
            executorService.execute(runnable1);
            executorService.execute(runnable);
            System.out.println("2asdadad");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
