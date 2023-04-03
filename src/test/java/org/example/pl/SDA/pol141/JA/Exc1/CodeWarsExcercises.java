package org.example.pl.SDA.pol141.JA.Exc1;

import java.util.Arrays;
import java.util.Random;

public class CodeWarsExcercises {
    public String dnaToRna(String dna) {
        return dna.replaceAll("U", "T");
        // Do your magic!
    }

    public static int[] digitize(long n) {
        // Code here
        Random random = new Random();
        String numbers = String.valueOf(n = random.nextInt(100000));
        char[] chars = numbers.toCharArray();
        int[] liczby = new int[chars.length];
        int tabLen = 0;

        for (int i = chars.length - 1; i >= 0; i--) {
            {
                int temp = Character.getNumericValue(chars[i]);
                liczby[tabLen] = temp;
                tabLen++;
            }
            System.out.println(Arrays.toString(chars));
        }
    return null;
    }
        public static void main (String[]args){
            digitize(25500);
            digitize(10);
        }
    }




