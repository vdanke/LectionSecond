package org.step.multithreading.sinchronization.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        service.execute(new SimpleThread());
        service.execute(new SimpleThread());

        boolean isShutdown = service.isShutdown();

        if (!isShutdown) {
            service.shutdown();
//            service.shutdownNow();
        }
    }
}
