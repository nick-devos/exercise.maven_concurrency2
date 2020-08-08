package com.github.perschola;

public class Waiter implements Runnable {
    private Message msg;
    private String name;

    public Waiter(Message message) {
        this.msg = message;
    }

    @Override
    public void run() {
        name = Thread.currentThread().getName();
        synchronized (msg) {
            try {
                System.out.println(name + " waiting to get notified at time: " + System.currentTimeMillis());
                msg.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException("Wait interrupted");
            }
            System.out.println(name + " waiter thread got notified at time: " + System.currentTimeMillis());
            System.out.println(name + " processed: " + msg.getMessage());
        }
    }
}
