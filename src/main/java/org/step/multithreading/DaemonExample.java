package org.step.multithreading;

public class DaemonExample {

    public static void main(String[] args) {
        System.out.println("Start main thread " + Thread.currentThread().getName());

        Talk talk = new Talk();

        talk.setDaemon(true);

        boolean isDaemon = talk.isDaemon();
        talk.setName("DaemonTalk");
        System.out.println(talk.getName() + " is Daemon? " + isDaemon);

        talk.start();

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread stopped");
    }
}
