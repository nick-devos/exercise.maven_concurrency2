package com.github.perschola;

import org.junit.Test;

public class WaitNotifyTest {
    public static void main(String[] args) {
        Message myMessage = new Message("Some message");
        Waiter waiter1 = new Waiter(myMessage);
        Thread waiterThread1 = new Thread(waiter1, "waiter1");
        Waiter waiter2 = new Waiter(myMessage);
        Thread waiterThread2 = new Thread(waiter2, "waiter2");
        Notifier notifier = new Notifier(myMessage);
        Thread notifierThread = new Thread(notifier, "notifier");

        waiterThread1.start();
        waiterThread2.start();
        notifierThread.start();

        System.out.println("All threads are started");
    }
}
