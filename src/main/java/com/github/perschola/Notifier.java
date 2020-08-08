package com.github.perschola;

public class Notifier implements Runnable {
    private Message msg;

    public Notifier(Message message) {
        this.msg = message;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();

        System.out.println(name + " started");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMessage(name + " Notifier work done");
                msg.notifyAll();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
