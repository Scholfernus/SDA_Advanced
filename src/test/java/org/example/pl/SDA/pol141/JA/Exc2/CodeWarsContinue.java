package org.example.pl.SDA.pol141.JA.Exc2;

import java.util.Arrays;

public class CodeWarsContinue {
    public static void main(String[] args) {
        String words = "Hey fellow warriors";
        String[] split = words.split(" ");

        System.out.println(spinWords(words));
        System.out.println(split.length);
        int pow = (int) Math.pow(20.5, 10.5);
        System.out.println(maskify(words));
    }

    public static String spinWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] str = sentence.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 4) {
                String reversed = new StringBuilder(str[i]).reverse().toString();
                sb.append(reversed);
            } else {
                sb.append(str[i]);
            }
            if (i != str.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String maskify(String str) {
        String special = "#";
        StringBuilder stringBuilder = new StringBuilder();
        char[] array = str.toCharArray();
//        for (int i = 0; i < array.length; i++) {
//            if (array.length > 4) {
//                stringBuilder.append(special);
//            } else {
//                stringBuilder.append(array[i]);
//            }
//        }
//        return stringBuilder.toString();
        for (int i = 0; i < array.length - 4; i++) {
            array[i] = '%';
        }
        return new String(array);
    }

    public int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if ((i % 3 == 0 || i % 5 == 0) || (i % 3 == 0 && i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }
}
