package org.step.multithreading.sinchronization.executors;

import java.util.concurrent.*;

public class CallableRunner {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        Future<Integer> first = service.submit(new CallableThread());
        Future<Integer> second = service.submit(new CallableThread());

//        TimeUnit days = TimeUnit.DAYS;
//        TimeUnit hours = TimeUnit.HOURS;
//        TimeUnit seconds = TimeUnit.SECONDS;
//
//        seconds.sleep(100);

//        first.cancel(true);
//        first.isCancelled();

        try {
            System.out.println("I'am here");
            System.out.println(first.isDone());
            System.out.println(first.get(3, TimeUnit.SECONDS));
            System.out.println(second.get());
            System.out.println(first.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        boolean isShutdown = service.isShutdown();

        if (!isShutdown) {
            service.shutdown();
        }
    }
}
