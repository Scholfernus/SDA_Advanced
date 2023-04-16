package org.example.pl.SDA.pol141.JA.Exc1;

import java.util.Arrays;

public class CodeWarsExercise4 {
    public static void main(String[] args) {
        System.out.println(high("what time are we climbing up to the volcano"));
        System.out.println(longestWord("what time are we climbing up to the volcano"));
    }

    // Highest Scoring Word
    public static String high(String s) {
        String[] words = s.split(" ");
        String maxWord = "";
        int maxScore = 0;
        for (String w : words) {
            int sum = 0;
            for (var elem : w.toCharArray()) {
                sum += elem - 'a' + 1;
            }
            if (sum > maxScore) {
                maxScore = sum;
                maxWord = w;
            }
        }

        return maxWord;
    }

    public static String longestWord(String str) {
        String[] s = str.split(" ");
        System.out.println(Arrays.toString(s));
        int score = 0;
        String worstWord = "";
        int maxScore = 0;
        for (String item : s) {
            for (var w : item.toCharArray()) {
                score += w - 100;
            }
            if (score > maxScore) {
                maxScore = score;
                worstWord = item;
            }
        }
        return worstWord;
    }

    // Function 2 - squaring an argument
    public static int square(int n) {
        return n * n;
        //Your Code
    }
}
