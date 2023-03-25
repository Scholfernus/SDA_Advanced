package org.example.pl.SDA.pol141.JA.Day2.Interfaces;

import java.util.Scanner;

public class StdTerminal implements Console{
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String read() {
        return scanner.nextLine();
    }
}
