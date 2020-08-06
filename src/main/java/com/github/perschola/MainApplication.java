package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) {
        Runnable task0 = new MyObject();
        Thread thread0 = new Thread(task0);
        Runnable task1 = new MyObject();
        Thread thread1 = new Thread(task1);

        thread0.start();
        thread1.start();

    }
}
