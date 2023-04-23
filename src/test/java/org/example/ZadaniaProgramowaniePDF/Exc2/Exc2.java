package org.example.ZadaniaProgramowaniePDF.Exc2;

import java.util.Arrays;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the long of array:");
        int n = scanner.nextInt();
        scanner.nextLine();
        int [] userTab = new int[n];
        System.out.println("Type " + n + " numbers giving a coma between");
        String nextInt = scanner.nextLine();
        String[] split = nextInt.split(",");
        for (int i = 0; i < split.length; i++) {
            userTab[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(userTab);
        System.out.println(Arrays.toString(userTab));
    }
}
