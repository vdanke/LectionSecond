package org.step.multithreading;

public class PriorityDemo {

    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        Click first = new Click();
        Click second = new Click();

        first.setPriority(1);
        second.setPriority(4);

        first.start();
        second.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        first.stopClick();
        second.stopClick();

        try {
            first.join();
            second.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("First click " + first.getClick());
        System.out.println("Second click " + second.getClick());
        System.out.println("Difference " + (second.getClick() - first.getClick()));
    }
}
