package org.step.multithreading.sinchronization.lock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo implements Runnable {

    private static AtomicInteger count = new AtomicInteger(0);
//    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
//            lock.lock();
            // count.incrementAndGet
            // count.addAndGet(1)
            count.getAndAdd(1);
//            lock.unlock();
        }
        System.out.println(count);
    }
}
