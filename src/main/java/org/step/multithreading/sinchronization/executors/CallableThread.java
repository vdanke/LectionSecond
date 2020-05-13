package org.step.multithreading.sinchronization.executors;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<Integer> {

    public int count = 0;

    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 1000000; i++) {
            count++;
        }
        Thread.sleep(1000);

        return count;
    }
}
