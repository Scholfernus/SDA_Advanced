package org.example.pl.SDA.pol141.JA.Day4.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsFixedDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Wątek " + Thread.currentThread().getName() + " " + i);
                }
            }
        });
        //Thread.sleep(1000);
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Wątek " + Thread.currentThread().getName() + " " + i);
                }
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Wątek " + Thread.currentThread().getName() + " " + i);
                }
            }
        });
    }
}
