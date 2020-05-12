package org.step.multithreading;

public class ThreadGroupDemo {

    public static void main(String[] args) {
        ThreadGroup alphaGroup = new ThreadGroup("Group Alpha");
        ThreadGroup bettaGroup = new ThreadGroup("Group Betta");

        MyThread first = new MyThread("First", alphaGroup);
        MyThread second = new MyThread("Second", alphaGroup);
        MyThread third = new MyThread("Third", bettaGroup);
        MyThread fourth = new MyThread("Fourth", bettaGroup);

        alphaGroup.list();
        bettaGroup.list();
//        try {
//            Thread.sleep(2500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        alphaGroup.interrupt();

    }
}
