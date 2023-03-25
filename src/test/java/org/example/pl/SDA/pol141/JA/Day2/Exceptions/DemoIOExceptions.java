package org.example.pl.SDA.pol141.JA.Day2.Exceptions;

import java.io.IOException;

public class DemoIOExceptions {
    public static void main(String[] args) {
        try {
            System.out.println(read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(readWithCatchingException());
    }
    //Metoda nie obsługuje obowiązkowego wyjątku IOExceptions, tylko deklaruje przekazanie wyjątku do klienta
    // - metody, która ją wywołała.
    public static int read() throws IOException {
        return System.in.read();
    }
    public static int readWithCatchingException(){
        try {
            return System.in.read();
        } catch (IOException e) {
            //Zgłoszenie wyjątku nieweryfikowalnego
            throw new RuntimeException(e);
        }
    }
}
