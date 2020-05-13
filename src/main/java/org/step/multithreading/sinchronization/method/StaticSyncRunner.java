package org.step.multithreading.sinchronization.method;

public class StaticSyncRunner {

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++) {
                    try {
                        StaticSync.first();
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        for (int i = 0; i < 5; i++) {
            try {
                StaticSync.second();
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
