package org.step.multithreading.sinchronization.wait.notify;

import java.util.Random;

public class IntegerGetterSetter extends Thread {

    private SharedResource resource;
    private boolean run;

    private Random rand = new Random();

    public IntegerGetterSetter(String name, SharedResource resource) {
        super(name);
        this.resource = resource;
        run = true;
    }

    public void stopThread() {
        run = false;
    }

    @Override
    public void run() {
        int action;

        try {
            while (run) {
                action = rand.nextInt(1000);
                if (action % 2 == 0) {
                    getIntegersFromResource();
                } else {
                    setIntegerFromResource();
                }
            }
            System.out.println("Thread " + getName() + " finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void getIntegersFromResource() throws InterruptedException {
        Integer number;

        synchronized (resource) {
            System.out.println("Thread " + getName() + " want to execute the number");

            number = resource.getElement();

            while (number == null) {
                System.out.println("Thread " + getName() + " is waiting till the queue would be fulfilled");
                resource.wait();
                System.out.println("Thread " + getName() + " is continuing his work");
                number = resource.getElement();
            }
            System.out.println("Thread " + getName() + " executed the number " + number);
        }
    }

    private void setIntegerFromResource() throws InterruptedException {
        Integer number = rand.nextInt(500);

        synchronized (resource) {
            resource.setElement(number);
            System.out.println("Thread " + getName() + " wrote the number " + number);
            resource.notify();
        }
    }
}
