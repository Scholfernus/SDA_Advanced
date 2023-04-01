package org.example.pl.SDA.pol141.JA.Day4.Concurrency;

public class SumatorThread extends Thread {
    @Override
    public void run() {
        long sum = 0;
        int counter = 0;
        for (int i = 0; i < 10_000 && !this.isInterrupted(); i++) {
            counter++;
            try {
                Thread.sleep(1);
                sum += i;
            } catch (InterruptedException e) {
                this.interrupt();
            }
        }
        System.out.println("Suma obliczeniowa przez wątek po " + counter + " iteracjach wynosi " + sum);
    }
}

