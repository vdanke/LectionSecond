package org.step.multithreading;

public class ThreadGroupExample {

    public static void main(String[] args) {
        ThreadGroup first = new ThreadGroup("first");
        ThreadGroup second = new ThreadGroup(first, "second");


        int activeCount = first.activeCount();
        int activeGroupCount = first.activeGroupCount();
        first.checkAccess();
        first.destroy();

        first.enumerate(new Thread[1]);
        first.enumerate(new ThreadGroup[1]);

        int maxPriority = first.getMaxPriority();
        first.setMaxPriority(Thread.NORM_PRIORITY);

        String name = first.getName();

        ThreadGroup parent = first.getParent();

        first.interrupt();

        first.setDaemon(true);
        boolean isDaemon = first.isDaemon();

        first.list();

        boolean isParent = first.parentOf(second);

        first.uncaughtException(new Talk(), new InterruptedException());
    }
}
