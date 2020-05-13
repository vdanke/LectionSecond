package org.step.multithreading.sinchronization.bank.operator;

import org.step.multithreading.sinchronization.bank.Account;

public class OperatorDeposit extends Thread {

    private Account account;

    public OperatorDeposit(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (account) {
                account.deposit(100);
            }
        }
    }
}
