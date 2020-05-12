package org.step.multithreading;

public class MyThread extends Thread {

    public MyThread(String threadName, ThreadGroup group) {
        super(group, threadName);
        System.out.println("New thread " + this);
        this.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(this.getName() + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Exiting " + this.getName());
    }
}
