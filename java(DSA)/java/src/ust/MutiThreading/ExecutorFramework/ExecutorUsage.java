package ust.MutiThreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorUsage {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i < 10; i++) {
            int finalI =i;
            executor.submit(()->{
                        long result = factorial(finalI);
                        System.out.println(result);
                    }
            );

        }
        executor.shutdown();
//        executor.awaitTermination(100, TimeUnit.SECONDS);
//        Meaning:
//        It tells the current thread (usually main) to wait up to 100 seconds for the executor to finish all submitted tasks after shutdown is called.
        try {
            executor.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Toatal time "+ (System.currentTimeMillis()-startTime));
    }

    private static long factorial(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }
        long result = 1;
        for (int j = 0; j < i; j++) {
            result*=i;
        }
        return result;
    }
}
