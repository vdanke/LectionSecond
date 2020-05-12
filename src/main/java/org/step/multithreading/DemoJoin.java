package org.step.multithreading;

public class DemoJoin {

    public static void main(String[] args) {
        NewThread first = new NewThread("First");
        NewThread second = new NewThread("second");
        NewThread third = new NewThread("third");

        System.out.println(first.getThreadName() + " is alive " + first.getThread().isAlive());
        System.out.println(second.getThreadName() + " is alive " + second.getThread().isAlive());
        System.out.println(third.getThreadName() + " is alive " + third.getThread().isAlive());

        try {
            System.out.println("Waiting threads to finish");
            first.getThread().join();
            second.getThread().join();
            third.getThread().join();

            Thread thread = Thread.currentThread();
            System.out.println(thread.getState().name());
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println(first.getThreadName() + " is alive " + first.getThread().isAlive());
        System.out.println(second.getThreadName() + " is alive " + second.getThread().isAlive());
        System.out.println(third.getThreadName() + " is alive " + third.getThread().isAlive());
    }
}
