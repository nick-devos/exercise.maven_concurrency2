package com.github.perschola;

public class Part2A implements Runnable {
    public static void main(String[] args) {
        Runnable task = new MyObject();
        Thread thread0 = new Thread(task);
        Thread thread1 = new Thread(task);

        thread0.start();
        thread1.start();
    }

    @Override
    public void run() {
        // TODO
        for(int i = 1; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Sleep interrupted");
            }
            System.out.println(i);
        }
    }
}
