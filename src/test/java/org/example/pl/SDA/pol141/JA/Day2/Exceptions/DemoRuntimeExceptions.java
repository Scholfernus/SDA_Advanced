package org.example.pl.SDA.pol141.JA.Day2.Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class DemoRuntimeExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczbę całkowitą");
        final String s = scanner.nextLine();
        try {
            int i = Integer.parseInt(s);
            System.out.println(percent(10, i));
            int[] arr = new int[2];
            arr[i] = 5;
        } catch (NumberFormatException e) {
            System.out.println("Niepoprawny łańcuch, wpisz liczbę całkowitą!");
        } catch (ArithmeticException e1) {
            System.out.println("Nie dziel przez 0");
        } finally {
            System.out.println("Koniec programu!");
        }
    }

    public static double percent(int a, int b) {
        return 100.0 * a / b;
    }

    public static int percentInt(int a, int b) {
        return 100 * a / b;
    }
}
