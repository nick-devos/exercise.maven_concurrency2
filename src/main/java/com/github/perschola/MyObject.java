package com.github.perschola;

import java.util.stream.IntStream;

public class MyObject implements Runnable {
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
