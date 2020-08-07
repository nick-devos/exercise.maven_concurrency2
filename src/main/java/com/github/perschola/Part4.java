package com.github.perschola;

public class Part4 implements Runnable {
    public static void main(String[] args) {
        Runnable task = new Part4();
        Thread thread0 = new Thread(task, "Fred the Thread, I");
        Thread thread1 = new Thread(task, "Fred the Thread, II");
        Thread thread2 = new Thread(task, "Fred the Thread, III");

        thread0.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.NORM_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread0.start();
        thread1.start();
        thread2.start();
        System.out.println("==============================");
        //TODO - figure out how to repeat task 3 times
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException("Sleep interrupted");
        }
        System.out.println("running thread name is: " + Thread.currentThread().getName() +
                "\nrunning thread priority is: " + Thread.currentThread().getPriority());
    }
}
