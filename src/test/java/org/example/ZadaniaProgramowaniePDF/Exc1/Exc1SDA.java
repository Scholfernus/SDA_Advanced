package org.example.ZadaniaProgramowaniePDF.Exc1;

import java.util.Scanner;

public class Exc1SDA {
    public static void main(String[] args) {
        int numb = 0;
        int reversedNumb = 0;
        System.out.println("Input your number and press enter:");
        Scanner in = new Scanner(System.in);
        numb = in.nextInt();
        while (numb != 0) {
            reversedNumb = reversedNumb * 10;
            reversedNumb = reversedNumb + numb % 10;
            numb = numb / 10;
        }
        System.out.println("Reverse of input number is: " + reversedNumb);
    }
}
