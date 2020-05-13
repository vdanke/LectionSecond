package org.step.multithreading.sinchronization.method;

public class StaticSync {

    public static synchronized void first() throws InterruptedException {
        System.out.println("Line 1 in first");
        Thread.sleep(1000);
        System.out.println("Line 2 in first");
    }

    public static synchronized void second() throws InterruptedException {
        System.out.println("Line 1 in second");
        Thread.sleep(1000);
        System.out.println("Line 2 in second");
    }


}
