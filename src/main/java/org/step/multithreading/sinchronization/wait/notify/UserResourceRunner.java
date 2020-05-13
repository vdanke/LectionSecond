package org.step.multithreading.sinchronization.wait.notify;

public class UserResourceRunner {

    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        IntegerGetterSetter first = new IntegerGetterSetter("1", resource);
        IntegerGetterSetter second = new IntegerGetterSetter("2", resource);
        IntegerGetterSetter third = new IntegerGetterSetter("3", resource);
        IntegerGetterSetter fourth = new IntegerGetterSetter("4", resource);
        IntegerGetterSetter fifth = new IntegerGetterSetter("5", resource);

        first.start();
        second.start();
        third.start();
        fourth.start();
        fifth.start();

        Thread.sleep(100);

        first.stopThread();
        second.stopThread();
        third.stopThread();
        fourth.stopThread();
        fifth.stopThread();

        first.join();
        second.join();
        third.join();
        fourth.join();
        fifth.join();

        System.out.println("Main");
    }
}
