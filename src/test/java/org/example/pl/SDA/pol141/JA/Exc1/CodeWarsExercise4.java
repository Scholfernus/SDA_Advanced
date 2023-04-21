package org.example.pl.SDA.pol141.JA.Exc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CodeWarsExercise4 {
    public static void main(String[] args) {
        System.out.println(high("what time are we climbing up to the volcano"));
        System.out.println(longestWord("what time are we climbing up to the volcano"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(twoSort(new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
        System.out.println(greet("ruski"));
        System.out.println(Arrays.toString(between(1, 4)));
        System.out.println(smallEnough(new int[]{78, 117, 110, 99, 104, 117, 107, 115}, 100));
        System.out.println(isPalindrome(31213));
        System.out.println(capitalize("abcdef"));
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        System.out.println(reverseLetter("krish21an"));
        System.out.println(Arrays.toString(flattenAndSort(new int[][]{{111, 999}, {222}, {333}})));
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

    public static String howMuchILoveYou(int nb_petals) {
        int petals = nb_petals % 6;
        switch (petals) {
            case 1:
                return "I love you";
            case 2:
                return "a little";
            case 3:
                return "a lot";
            case 4:
                return "passionately";
            case 5:
                return "madly";
            default:
                return "not at all";
        }
        // String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};
        //      return arr[nb_petals%6];
    }

    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }

    // Anagram Detection
    public static boolean isAnagram(String test, String original) {
        char[] chars = test.toLowerCase().toCharArray();
        char[] chars1 = original.toLowerCase().toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars, chars1);
        // final char[] a = test.toLowerCase().toCharArray(), b = original.toLowerCase().toCharArray();
        //    Arrays.sort(a);
        //    Arrays.sort(b);
        //    return Arrays.equals(a,b); }
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> numbers = new ArrayList<>();
        for (var numb : list) {
            if (numb instanceof Integer)
                numbers.add(numb);
        }
        return numbers;
        // return list.stream().filter(Integer.class::isInstance).toList();
    }

    // Testing 1-2-3
    public static List<String> number(List<String> lines) {
        List<String> numbers = new ArrayList<>();
        int n = 1;
        for (String str : lines) {
            numbers.add(Integer.toString(n) + ": " + str);
            n++;
        }
        return numbers;
    }

    public static boolean smallEnough(int[] a, int limit) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > limit) {
                return false;
            }
        }
        return true;
    }

    // Palindrome Number
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
        //  String s = String.valueOf(x);
        //    String reversed = new StringBuilder(s).reverse().toString();
        //    return s.equals(reversed);
    }

    public static int move(int position, int roll) {
        return (roll * 2) + position;
    }

    public static String noSpace(final String x) {
        String s = x.replaceAll("\\s", "");
        return s;
    }

    public static String[] capitalize(String s) {
        String first = "", second = "";
        String[] gorillaCap = new String[2];
        char[] gorilla = s.toCharArray();
        for (int i = 0; i < gorilla.length; i++) {
            if (i % 2 != 0) {
                second += Character.toString(gorilla[i]).toUpperCase();
            } else {
                second += Character.toString(gorilla[i]).toLowerCase();
            }
            gorillaCap[1] = second;
        }
        for (int i = 0; i < gorilla.length; i++) {
            if (i % 2 == 0) {
                first += Character.toString(gorilla[i]).toUpperCase();
            } else {
                first += Character.toString(gorilla[i]).toLowerCase();
            }
            gorillaCap[0] = first;
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(Arrays.toString(gorillaCap));
        return gorillaCap;
        //   StringBuilder sb = new StringBuilder(s);
        //       StringBuilder sb2 = new StringBuilder(s);
        //       for(int i = 0; i<sb.length(); i+=2) sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        //       for(int i = 1; i<sb2.length(); i+=2) sb2.setCharAt(i, Character.toUpperCase(sb2.charAt(i)));
        //       return new String[]{sb.toString(), sb2.toString()};
        //    }
    }

    public static String highAndLow(String numbers) {
        String[] split = numbers.split(" ");
        Arrays.sort(split);
        int[] numbers2 = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            numbers2[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(split));
        System.out.println(Arrays.toString(numbers2));
        return "" + Integer.toString(numbers2[numbers2.length - 1]) + " " + Integer.toString(numbers2[0]) + "";
        // var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        //    return stats.getMax() + " " + stats.getMin();
    }

    public static String chromosomeCheck(String sperm) {
        return sperm.equals("XX") ? "Congratulations! You're going to have a daughter." :
                "Congratulations! You're going to have a son.";
    }

    public static int binToDecimal(String inp) {
        int number = Integer.parseInt(inp, 2);
        return number;
    }

    public static int countSmileys(List<String> arr) {
        String validSmilyFaces = ":) ;) :-) :~) ;-) ;~) :D ;D :-D :~D ;~D ;~) ;-D";
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (validSmilyFaces.contains(arr.get(i))) {
                count++;
            }
        }
        return count;
        // return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
    }

    public static String reverseLetter(final String str) {
        String s = str.replaceAll("\\d", "");
        s = str.replaceAll("\\?", "").replaceAll("\\d", "");
        StringBuilder reversed = new StringBuilder(s).reverse();
        return reversed.toString();
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        int max = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (nums[i] == numbers[i]) {
                    max = count++;
                }
            }
        }
        return max;
    }

    public static int enough(int cap, int on, int wait) {
        return (on + wait) < cap ? 0 : (on + wait) - cap;
    }

    public static int toBinary(int n) {
        String binary = Integer.toBinaryString(n);
        return Integer.parseInt(binary);
        //  return Integer.parseInt(Integer.toBinaryString(n));
    }

    public static int[] flattenAndSort(int[][] array) {
        int sumLength = 0;
        int index = 0;
        for (int[] innerArray : array) {
            sumLength += innerArray.length;
        }
        int[] twoTabs = new int[sumLength];
        for (int[] tempArray : array) {
            for (var elem : tempArray) {
                twoTabs[index] = elem;
                index++;
            }
        }
        Arrays.sort(twoTabs);
        return twoTabs;
     // return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
    }
}




