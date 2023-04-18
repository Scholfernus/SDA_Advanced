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
        System.out.println(greet("ruski"));
        System.out.println(Arrays.toString(between(1, 4)));
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
        return Integer.toString(count) + "/" + Integer.toString(sLength);
        //  return s.replaceAll("[a-m]", "").length() + "/" + s.length();

        // return s.chars().filter(c -> c > 'm').count() + "/" + s.length();

        //  String errors = s.replaceAll("[a-m]","");
        //        return "" + errors.length() + "/" + s.length();
    }

    public static int saleHotdogs(final int n) {
        if (n < 5) return 100 * n;
        if (n >= 5 && n < 10) return 95 * n;
        else return n * 90;
        // return (n < 5) ? 100 * n : (n < 10) ? 95 * n : 90 * n
    }

    // All Star Code Challenge #18
    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;
        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;
        } else if (humanYears == 2) {
            catYears = 24;
            dogYears = 24;
        } else {
            catYears = 24 + (humanYears - 2) * 4;
            dogYears = 24 + (humanYears - 2) * 5;
        }
        int[] years = {humanYears, catYears, dogYears};
        return years;
    }

    public static String greet(String language) {
        switch (language) {
            case "czech":
                return "Vitejte";
            case "danish":
                return "Velkomst";
            case "dutch":
                return "Welkom";
            case "estonian":
                return "Tere tulemast";
            case "finnish":
                return "Tervetuloa";
            case "flemish":
                return "Welgekomen";
            case "french":
                return "Bienvenue";
            case "german":
                return "Willkommen";
            case "irish":
                return "Failte";
            case "italian":
                return "Benvenuto";
            case "latvian":
                return "Gaidits";
            case "lithuanian":
                return "Laukiamas";
            case "polish":
                return "Witamy";
            case "spanish":
                return "Bienvenido";
            case "swedish":
                return "Valkommen";
            case "welsh":
                return "Croeso";
            case "english":
                return "Welcome";
            default:
                return "Welcome";
        }
    }

    public static int[] between(int a, int b) {
        int[] result = new int[b - a + 1];
        for (int i = a; i <= b; i++) {
            result[i - a] = i;
        }
        return result;
    }
}

