package com.github.perschola;

public class Part2B implements Runnable {
    public static void main(String[] args) {
        Runnable task = new Part2B();
        Thread thread0 = new Thread(task);
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);


        thread0.start();

        try {
            thread0.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        // TODO
        for(int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Sleep interrupted");
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
