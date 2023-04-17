package org.example.pl.SDA.pol141.JA.Exc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeWarsExercise4 {
    public static void main(String[] args) {
        System.out.println(high("what time are we climbing up to the volcano"));
        System.out.println(longestWord("what time are we climbing up to the volcano"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(twoSort(new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
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

    // Who likes it?
    public static String whoLikesIt(String... names) {
        List<String> nameAll = new ArrayList<>(Arrays.asList(names));
        int namesCount = nameAll.size();
        switch (namesCount) {
            case 0:
                return "no one likes this";
            case 1:
                return String.format("%s and %s likes this", nameAll.get(0));
            case 2:
                return String.format("%s and %s like this", nameAll.get(0), nameAll.get(1));
            case 3:
                return String.format("%s, %s and %s like this", nameAll.get(0), nameAll.get(1), nameAll.get(2));
            default:
                return String.format("%s, %s and %d others like this", nameAll.get(0), nameAll.get(1), namesCount - 2);
        }
        //    switch (names.length) {
        //          case 0: return "no one likes this";
        //          case 1: return String.format("%s likes this", names[0]);
        //          case 2: return String.format("%s and %s like this", names[0], names[1]);
        //          case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
        //          default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        //        }
    }

    public static double sum(double[] numbers) {
        double sum = 0;
        for (var d : numbers) {
            if (numbers.length == 0) {
                return 0;
            } else {
                sum += d;
            }
        }
        return sum;
        // return Arrays.stream(numbers).sum();
    }

    // Sort and Star
    public static String twoSort(String[] s) {
        Arrays.sort(s);
        String word = s[0];
        return String.join("***", word.split(""));
        //   java.util.Arrays.sort(s);
        //        return String.join("***",s[0].split(""));
    }

    // Is it even?
    public boolean isEven(double n) {
        return n % 2 == 0 ? true : false;
    }

    public static String printerError(String s) {
        int sLength = s.length();
        char[] strToChar = s.toCharArray();
        System.out.println(Arrays.toString(strToChar));
            int count = 0;
            for (char sign : strToChar) {
                if (sign > 'm') {
                    strToChar[count] = sign;
                    count++;
                }
            }
        return Integer.toString(count)+"/" + Integer.toString(sLength);
            //  return s.replaceAll("[a-m]", "").length() + "/" + s.length();

            // return s.chars().filter(c -> c > 'm').count() + "/" + s.length();

            //  String errors = s.replaceAll("[a-m]","");
        //        return "" + errors.length() + "/" + s.length();
    }
}