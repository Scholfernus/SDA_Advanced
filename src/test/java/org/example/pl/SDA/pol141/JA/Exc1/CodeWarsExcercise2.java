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
        name = "Patrick Feenan";
        String newWord = name.substring(0,7);
        char[] chars = newWord.toCharArray();
        System.out.println(Arrays.toString(chars));
        return newWord;
    }

    public static void main(String[] args) {
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
    }
}
