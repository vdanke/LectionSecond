package org.step.multithreading;

public class Click extends Thread {

    private int click = 0;
    private volatile boolean running = true;

    public Click() {
    }

    @Override
    public void run() {
        while (running) {
            click++;
        }
    }

    public void stopClick() {
        this.running = false;
    }

    public int getClick() {
        return click;
    }

    public boolean isRunning() {
        return running;
    }
}
