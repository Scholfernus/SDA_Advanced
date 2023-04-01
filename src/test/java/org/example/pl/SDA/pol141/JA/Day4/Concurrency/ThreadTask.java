package org.example.pl.SDA.pol141.JA.Day4.Concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(fib(45));
            }
        });
        System.out.println("czekamy na zadanie typu execute...");
        var result = service.submit(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return fib(45);
            }
        });
        System.out.println("czekamy na zadanie typu submit...");
        System.out.println(result.get());
        System.out.println("Wynik zadania...");
    }

    //Można też tak
//    System.out.println("czekamy na zadanie typu submit...");
//        while (!result.isDone()) {
//        System.out.println("Czekamy...");
//    }
//        System.out.println(result.get());

    public static long fib(int n) {
        if (n == 1) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        if (!Thread.currentThread().isInterrupted()){

            return fib(n - 2) + fib(n - 1);
        }else {
            throw new RuntimeException("Zatrzymanie obliczania: Interrupt");
        }
    }
}

