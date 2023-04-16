package org.example.pl.SDA.pol141.JA.Exc1;

public class CodeWarsExercise4 {
    public static void main(String[] args) {
        System.out.println(high("what time are we climbing up to the volcano"));
    }

    // Highest Scoring Word
    public static String high(String s) {
        String[] words = s.split(" ");
        String maxWord = "";
        int maxScore = 0;
        //char[] array = s.toCharArray();
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
}
