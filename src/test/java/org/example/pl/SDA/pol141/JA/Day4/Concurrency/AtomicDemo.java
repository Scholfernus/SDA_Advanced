package org.example.pl.SDA.pol141.JA.Day4.Concurrency;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicDemo {
    public static void main(String[] args) throws InterruptedException {
        AtomicLong counter = new AtomicLong(0); // powoduje, że nie ma problemu z różnymi wynikami
        //long[] counter = {0}; // wcześniejszy kod - powodował różne wyniki
        Thread count1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                  //  counter[0]++; // wcześniejszy kod - powodował różne wyniki
                    counter.incrementAndGet(); //
                }
            }
        });
        Thread count2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    //counter[0]++; // wcześniejszy kod - powodował różne wyniki
                    counter.incrementAndGet();
                }
            }
        });
        count1.start();
        count2.start();
        count1.join();
        count2.join();
        System.out.println(counter.get());
    }
}
