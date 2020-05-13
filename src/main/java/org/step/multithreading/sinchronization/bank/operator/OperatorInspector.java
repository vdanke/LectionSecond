package org.step.multithreading.sinchronization.bank.operator;

import org.step.multithreading.sinchronization.bank.Account;

public class OperatorInspector {

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(200);

        OperatorDeposit deposit = new OperatorDeposit(account);
        OperatorWithdraw withdraw = new OperatorWithdraw(account);

        deposit.start();
        withdraw.start();

        deposit.join();
        withdraw.join();

        System.out.println(account.getBalance());
    }
}
