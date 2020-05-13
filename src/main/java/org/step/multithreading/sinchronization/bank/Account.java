package org.step.multithreading.sinchronization.bank;

public class Account {

    private int balance;
//    private Object lock = new Object();

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
//        synchronized (this) {
            int x = this.balance + amount;

            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = x;
//        }
    }

    public void withdraw(int amount) {
//        synchronized (this) {
            int x = this.balance - amount;

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = x;
//        }
    }

    public int getBalance() {
        return balance;
    }
}
