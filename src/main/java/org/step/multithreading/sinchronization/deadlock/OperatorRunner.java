package org.step.multithreading.sinchronization.deadlock;

public class OperatorRunner {

    public static void main(String[] args) {
        LockAccount first = new LockAccount(200);
        LockAccount second = new LockAccount(300);

        Operator firstOperator = new Operator(first, second);
        Operator secondOperator = new Operator(second, first);

        firstOperator.start();
        secondOperator.start();
    }
}
