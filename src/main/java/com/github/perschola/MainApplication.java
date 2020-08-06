package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) {
        Runnable task0 = new MyObject();
        Thread thread0 = new Thread(task0);
        Runnable task1 = new MyObject();
        Thread thread1 = new Thread(task1);
        Runnable task2 = new MyObject();
        Thread thread2 = new Thread(task2);

        thread0.start();

        try {
            thread0.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread1.start();
        thread2.start();
    }
}
