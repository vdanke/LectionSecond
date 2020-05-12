package org.step.multithreading;

public class Walk implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Walking");

            if (i == 6) {
                throw new RuntimeException();
            }

            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
