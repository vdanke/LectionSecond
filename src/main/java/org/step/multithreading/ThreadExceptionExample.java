package org.step.multithreading;

public class ThreadExceptionExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new Walk());

//        thread.setUncaughtExceptionHandler(
//                new Thread.UncaughtExceptionHandler() {
//                    @Override
//                    public void uncaughtException(Thread t, Throwable e) {
//                        System.out.println(t + " throws exception " + e);
//                    }
//                }
//        );

        Thread.setDefaultUncaughtExceptionHandler(
                new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println(t + " default exception " + e);
                    }
                }
        );
        thread.start();
    }
}
