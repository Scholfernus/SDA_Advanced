package org.example.pl.SDA.pol141.JA.Exc1;

import java.util.ArrayList;
import java.util.List;

public class CodeWarsExcercise2 {
    // Convert a Number to a String!
    public static String numberToString(int num) {
        // Return a string of the number here!
        String string = Integer.toString(num);
        return string;
    }

    // return ""+ n;
    // Vowel Count We will consider a, e, i, o, u as vowels for this Kata (but not y).
    public static int getCount(String str) {
        int count = 0;
        char[] vovel = str.toCharArray();
        for (var item : vovel) {
            if (item == ('a') || item == ('e') || item == ('i')
                    || item == ('o') || item == ('u')) {
                count++;
            }
        }
        return count;
    }

    //  return (int)str.chars().filter(c -> "aeiou".indexOf(c) != -1).count();
    // Return Negative
    public static int makeNegative(final int x) {

        if (x < 0) return x;
        else return x * (-1);
    }

    //  return -abs(x);
    // return (x < 0) ? x : -x;

    //Grasshopper - Summation
    public static int summation(int n) {
        int sum = 0;
        while (n >= 0) {
            sum += n;
            n--;
        }
        return sum;
    }

    // return  n*(n+1)/2;
    //Rock Paper Scissors!
    public static String rps(String p1, String p2) {
        // your code
        if (p1.equals(p2)) {
            return "Draw !";
        } else if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        } else if (p1.equals("scissors") && p2.equals("rock")) {
            return "Player 2 won!";
        } else if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        } else if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        } else return "end";
    }

    // Opposites Attract
    public static boolean isLove(final int flower1, final int flower2) {
        int love = flower1 + flower2;
        if (love % 2 == 0) {
            return false;
        } else return true;
    }

    // return (flower1 + flower2) % 2 == 1;
    public static String hoopCount(int n) {
        if (n >= 10) {
            return "Great, now move on to tricks";
        } else if (n < 10) {
            return "Keep at it until you get it";
        }
        return "";
    }
    //  return n >= 10 ? "Great, now move on to tricks" : "Keep at it until you get it";



    public static void main(String[] args) {
        System.out.println(numberToString(365));
        System.out.println(getCount("o a kak ushakov lil vo kashu kakao"));
        System.out.println(makeNegative(44));
        System.out.println(summation(8));
        System.out.println(isLove(5, 4));
        System.out.println(hoopCount(9));
    }
}
