package org.example.ZadaniaProgramowaniePDF.Exc1;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        boolean go = true;
        Scanner scanner = new Scanner(System.in);
        String reversedNumber = "";
        System.out.println("Podaj liczbę 9 cyfrową:");
        int number = scanner.nextInt();
        while (go) {
            String s = Integer.toString(number);
            String[] split = s.split("");
            for (int i = split.length - 1; i >= 0; i--) {
                reversedNumber += split[i];
            }
            go = false;
        }
        number = Integer.parseInt(reversedNumber);
        System.out.println(number);
    }
}
