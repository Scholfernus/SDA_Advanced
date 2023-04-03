package org.example.pl.SDA.pol141.JA.Exc1;

import java.util.Arrays;
import java.util.List;

public class FindNeedleExcercise {
    public static void main(String[] args) {
        String[] needle = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        for (int i = 0; i < needle.length; i++) {
            if (needle[i].equals("needle")) {
                int inedx = i;
                System.out.println(Arrays.toString(needle) + " --> found the needle at position " + inedx);
            }
        }
        String[] findNeedle = {"hay", "junk", "needle", "hay", "hay", "moreJunk", "randomJunk"};
        int i = 0;
        while (!String.valueOf(findNeedle[i]).equals("needle")) {
            i++;
        }
        System.out.println(Arrays.toString(needle) + " --> found the needle at position " + i);

        String msg = "found the needle at position ";
        String needle1 = msg + Arrays.asList(needle).indexOf("needle");
        System.out.println(needle1);

        String[] array = {"foo", "bar", "baz"};
        List<String> list = Arrays.asList(array);
        list.set(2, "bzik");
        //list.add("grig");
        System.out.println(list);

        int[] numbers = {2, 3, 4, 5};
        int sum = 1;
        for (int j = 0; j < numbers.length; j++) {
            sum *= numbers[j];
        }
        System.out.println(sum);
        int[] array1 = {1, 2, 3, 4};
        int result1 = array1[0];
        for (int x = 1; x < array1.length; x++) {
            result1 *= array1[x];
        }
        System.out.println(result1);
    }
}
