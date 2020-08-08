package com.github.perschola;

public class Account implements Runnable {
    private double accountBalance = 50.0;
    private final double withdrawalAmount = 10.0;

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException("Sleep interrupted");
            }
            if (accountBalance >= withdrawalAmount) {
                System.out.println(Thread.currentThread().getName() + " is going to withdraw");
                accountBalance -= withdrawalAmount;
                System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
            } else {
                System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw. Account balance = " + accountBalance);
            }
        }
    }
}
