package com.github.perschola;

public class Part3 implements Runnable {
    public static void main(String[] args) {
        Runnable task = new Part3();
        Thread thread0 = new Thread(task, "Fred the Thread, I");
        Thread thread1 = new Thread(task, "Fred the Thread, II");
        Thread thread2 = new Thread(task, "Fred the Thread, III");

        System.out.println(thread0.getName());
        thread0.start();


        try {
            thread0.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(thread1.getName());
        System.out.println(thread2.getName());
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
            System.out.println(i);
        }
    }
}
