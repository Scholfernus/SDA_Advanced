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
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        Random random = new Random();
        int n = random.nextInt(100000);
        String numb = String.valueOf((n));
        char[] chars = numb.toCharArray();
        int[] liczby = new int[chars.length];
        int tabLen = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            {
                int temp = Character.getNumericValue(chars[i]);
                 liczby[tabLen] = temp;
                tabLen++;
            }
        }
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(liczby));
    }
}
//Genialne rozwiązanie -
//public class Kata {
//  public static int[] digitize(long n) {
//        return new StringBuilder().append(n)
//                                  .reverse()
//                                  .chars()
//                                  .map(Character::getNumericValue)
//                                  .toArray();
//  }
//}