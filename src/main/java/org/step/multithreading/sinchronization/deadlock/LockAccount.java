package org.step.multithreading.sinchronization.deadlock;

public class LockAccount {

    private int balance;

    public LockAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(int amount) {
        this.balance = this.balance - amount;
    }
}
