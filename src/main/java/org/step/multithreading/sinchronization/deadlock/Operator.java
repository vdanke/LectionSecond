package org.step.multithreading.sinchronization.deadlock;

import org.step.multithreading.sinchronization.bank.Account;

public class Operator extends Thread {
    private LockAccount first;
    private LockAccount second;

    public Operator(LockAccount first, LockAccount second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            secondOperation(10);
        }
    }

    private void secondOperation(int amount) {
        int firstHashCode = this.first.hashCode();
        int secondHashCode = this.second.hashCode();

        LockAccount accountFirst = null, accountSecond = null;

        if (firstHashCode < secondHashCode) {
            accountFirst = this.first;
            accountSecond = this.second;
        } else {
            accountFirst = this.second;
            accountSecond = this.first;
        }

        synchronized (accountFirst) {
            System.out.println("First account is blocked");
            synchronized (accountSecond) {
                System.out.println("Second account is blocked");
                this.first.deposit(amount);
                this.second.withdraw(amount);
            }
        }
        System.out.println("Accounts are free");
    }

    private void operation(int amount) {
        synchronized (first) {
            System.out.println("First account is blocked");
            synchronized (second) {
                System.out.println("Second account is blocked");
                first.deposit(amount);
                second.withdraw(amount);
            }
        }
    }
}
