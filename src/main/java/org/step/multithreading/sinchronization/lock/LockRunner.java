package org.step.multithreading.sinchronization.lock;

public class LockRunner {

    public static void main(String[] args) {
        LockDemo first = new LockDemo();
        LockDemo second = new LockDemo();

        Thread firstThread = new Thread(first);
        Thread secondThread = new Thread(second);

        firstThread.start();
        secondThread.start();
    }
}
