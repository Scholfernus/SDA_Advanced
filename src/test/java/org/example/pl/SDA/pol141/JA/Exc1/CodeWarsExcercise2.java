package org.example.pl.SDA.pol141.JA.Exc1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
    // Odd or Even?
    public static String oddOrEven(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
            if (sum % 2 == 0) {
                return "odd";
            } else if (sum % 2 != 0) {
                return "even";
            } else return null;
        }
        return "end";
    }

    //  Twice as old
    public static int TwiceAsOld(int dadYears, int sonYears) {
        //TODO: Add code here
        if (dadYears >= 2 * sonYears) {
            int howManyYears = dadYears - 2 * sonYears;
            return howManyYears;
        } else {
            int howManyYears = 2 * sonYears - dadYears;
            return howManyYears;
        }
    }

    // Parse nice int from char problem
    public static int howOld(final String herOld) {
        //your code here, return correct age as int ; )
        int age = Character.getNumericValue(herOld.charAt(0));
        return age;
    }
    // String s = herOld.substring(0,1);
    //  return Integer.parseInt(s);

    // L1: Set Alarm
    public static boolean setAlarm(boolean employed, boolean vacation) {

        if (employed == vacation) {
            return false;
        }
        if (employed == false && vacation == true) {
            return false;
        }
        if (employed == true && vacation == false) {
            return true;
        }
        return true;
    }
    //  return employed && !vacation;
    //  if(employed && !vacation)
    //      return true;
    //    return false;

    // Sum Mixed Array
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object s : mixed) {
            sum += Integer.parseInt(String.valueOf(s));
        }
        return sum;
    }

    // int sum = 0;
    //
    //      for (Object element : mixed)
    //      {
    //        if (element instanceof Integer)
    //        {
    //          sum += (Integer) element;
    //        }
    //        else if (element instanceof String){
    //        sum += Integer.parseInt( (String) element );
    //        }
    //      }
    //      return sum;
    //	}
    // Switch it Up!
    public static String switchItUp(int number) {
        switch (number) {

            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            default:
                return "nine";
        }
    }

    // String[] numbers =
    //          {"Zero","One", "Two", "Three",
    //           "Four", "Five", "Six",
    //           "Seven", "Eight", "Nine"};
    //
    //    return numbers[number];
    //  }
    // switch (number)
    //    {
    //      case 0: return "Zero";
    //      case 1: return "One";
    //      case 2: return "Two";
    //      case 3: return "Three";
    //      case 4: return "Four";
    //      case 5: return "Five";
    //      case 6: return "Six";
    //      case 7: return "Seven";
    //      case 8: return "Eight";
    //    }
    //    return "Nine";
    //  }
    // Find the first non-consecutive number
    static Integer find(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i] + 1) {
                return array[i + 1];
            }
        }
        return null;
    }

    //  for(int i = 1; i < array.length; ++i)
    //       {
    //         if(array[i] - array[i - 1] != 1)
    //         {
    //           return array[i];
    //          }
    //        }
    //       return null;
    //    }
    public static String solution(String str) {
        String reverse = "";
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse += chars[i];
        }
        return reverse;
    }

    // return new StringBuilder(str).reverse().toString();
    // Descending Order
    public static int sortDesc(final int num) {
        String numb = Integer.toString(num);
        char[] reversedNumbers = numb.toCharArray();
        Arrays.sort(reversedNumbers);
        String result = new StringBuilder(new String(reversedNumbers)).reverse().toString();
        return Integer.parseInt(result);
    }

    // Double Char
    public static String doubleChar(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            result += "" + temp + temp;
        }
        return result;
    }

    //Century From Year
    public static int century(int number) {
        return (number - 1) / 100 + 1;
        //return (number + 99) / 100;
        // return ((number % 100 == 0))? (number = number / 100 ) :  (number = (number / 100) + 1);
        // if (number % 100 == 0) {
        //      return number/100;
        //    }
        //    return number/100 + 1;
        //  }
    }

    // Abbreviate a Two Word Name
    public static String abbrevName(String name) {
        String name2 = ".";
        String[] newWord = name.split(" ");
        for (String ss : newWord
        ) {
            name2 += ss.substring(0, 1) + ".";
        }
        name = name2.substring(1, 4);
        return name.toUpperCase();
        // String[] names = name.split(" ");
        //  return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }

    // Area or Perimeter
    public static int areaOrPerimeter(int l, int w) {
        return (l == w) ? l * w : (2 * l) + (2 * w);
    }

    public static String boolToWord(boolean b) {
        return b ? "No" : "Yes";
    }

    // Grasshopper - Grade book
    public static char getGrade(int s1, int s2, int s3) {
        int score = (s1 + s2 + s3) / 3;
        if (score >= 90 && score <= 100) return 'A';
        if (score >= 80 && score < 90) return 'B';
        if (score >= 70 && score < 80) return 'C';
        if (score >= 60 && score < 70) return 'D';
        if (score >= 0 && score < 60) return 'F';
        return 'A';
        //  return "FFFFFFDCBAA".charAt((s1+s2+s3)/30);
        // int mean = (s1 + s2 + s3) / 3;
        //        if (mean >= 90) return 'A';
        //        if (mean >= 80) return 'B';
        //        if (mean >= 70) return 'C';
        //        if (mean >= 60) return 'D';
        //        return 'F';

        //s1=(s1+s2+s3)/3;
        //return s1 >= 90 ? 'A':s1 >= 80 ? 'B':s1 >= 70 ? 'C':s1 >= 60 ? 'D':'F';
    }

    // String repeat
    public static String repeatStr(final int repeat, final String string) {
        String word = "";
        for (int i = 0; i < repeat; i++) {
            word += "" + string;
        }
        return word;
        // return string.repeat(repeat);  great solution
        //  StringBuilder sb = new StringBuilder();
        //        for (int i = 0; i < repeat; i++) {
        //            sb.append(string);
        //        }        //
        //        return sb.toString();
    }

    // Counting sheep...
    public int countSheeps(Boolean[] arrayOfSheeps) {
        if (arrayOfSheeps == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int sheepCount = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null) {
                if (arrayOfSheeps[i] == true) {
                    sheepCount++;
                }
            } else {
                break;
            }
        }
        return sheepCount;
        //   int counter = 0;
        //    for (Boolean present : arrayOfSheeps) {
        //      if (present != null && present) {
        //        counter += 1;
        //      }
        //    }
        //    return counter;
    }

    //
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String number = "";
        for (var n : binary
        ) {
            number += n;
        }
        int i = Integer.parseInt(number, 2);
        System.out.println(i);
        return i;
    }

    //  N-th Power
    public static int nthPower(int[] array, int n) {

        return n >= 0 && n < array.length ? (int) Math.pow((array[n]), n) : -1;
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] * a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    //  The Feast of Many Beasts
    public static boolean feast(String beast, String dish) {
        char first = beast.charAt(0);
        char first2 = dish.charAt(0);
        char last = beast.charAt((beast.length() - 1));
        char last2 = dish.charAt(dish.length() - 1);
        return first == first2 && last == last2;
    }

    //  Find the odd int
    public static int findIt(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count % 2 != 0)
                return a[i];
        }
        return -1;
        // return Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity())).entrySet()
        // .stream().filter(e -> e.getValue().size() % 2 == 1).mapToInt(e -> e.getKey()).findFirst().getAsInt();
        //    }
    }
    //  Mexican Wave

    public static String[] wave(String str) {
        if (str == null || str.isEmpty()) {
            return new String[] {};
        }
        List<String> waves = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isWhitespace(c)) {
                continue;
            }
            String wave = str.substring(0, i) + Character.toUpperCase(c) + str.substring(i + 1);

            waves.add(wave);
        }

        return waves.toArray(new String[0]);
    }
        public static void main (String[]args){
            System.out.println(numberToString(365));
            System.out.println(getCount("o a kak ushakov lil vo kashu kakao"));
            System.out.println(makeNegative(44));
            System.out.println(summation(8));
            System.out.println(isLove(5, 4));
            System.out.println(hoopCount(9));
            System.out.println(oddOrEven(new int[]{2, 5, 34, 6}));
            System.out.println(TwiceAsOld(30, 12));
            System.out.println(howOld("9 years old"));
            System.out.println(setAlarm(true, true));
            System.out.println(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7));
            System.out.println(switchItUp(5));
            System.out.println(find(new int[]{4, 6, 7, 8, 9, 11}));
            System.out.println(solution("world"));
            System.out.println(sortDesc(153648125));
            System.out.println(doubleChar("Hello World"));
            System.out.println(century(1593));
            System.out.println(abbrevName("Patrick Feenan"));
            System.out.println(areaOrPerimeter(2, 5));
            System.out.println(getGrade(66, 62, 68));
            System.out.println(repeatStr(5, "Hello"));
            System.out.println(ConvertBinaryArrayToInt(Arrays.asList(1, 1, 1, 1)));
            System.out.println(comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11},
                    new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
            System.out.println(feast("brown bear", "bear claw"));
            System.out.println(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
            System.out.println(Arrays.toString(wave("codewars")));

        }
    }
