package org.step.multithreading;

import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class ThreadExample {

    public static void main(String[] args) {
//        Queue<String> stringQueue = new SynchronousQueue<>();
//
//        stringQueue.offer("");

        Thread thread = Thread.currentThread();

        System.out.println(thread.getName());

        thread.setName("Boss");

        System.out.println(thread.getName());

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        Talk talk = new Talk();
//        Thread walk = new Thread(new Walk());
//
//        talk.start();
//        walk.start();

//        Thread.yield();

//        Thread.sleep(400);

//        boolean isInterrupted = talk.isInterrupted();

        // Walk walk = new Walk(); Это просто объект, не поток
        // walk.run(); Выполнится метод, а не поток

//        Thread thread = Thread.currentThread();

//        talk.setDaemon(true);
//        boolean isDaemon = talk.isDaemon();

//        talk.interrupt();

//        ThreadGroup threadGroup = talk.getThreadGroup();

//        boolean alive = talk.isAlive();

//        Thread.State state = talk.getState();

//        long id = talk.getId();
//        try {
//            talk.join(400);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        int priority = talk.getPriority();
//        talk.setPriority(11);

//        String talkName = talk.getName();
//
//        talk.setName("talkName");
//
//        String name = talk.getName();
    }
}
