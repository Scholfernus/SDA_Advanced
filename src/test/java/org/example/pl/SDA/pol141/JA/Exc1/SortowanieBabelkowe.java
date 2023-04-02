package org.example.pl.SDA.pol141.JA.Exc1;

import java.util.Arrays;
import java.util.Random;

public class SortowanieBabelkowe {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(41);
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
