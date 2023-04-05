package org.example.pl.SDA.pol141.JA.Exc1;

import java.util.Arrays;

public class CodeWarsExcercise {

    public static int[] invert(int[] array) {

        // int number = -1;
        for (int i = 0; i < array.length; i++) {
            int invertn = array[i];
            array[i] = invertn * (-1);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        for (int i = 0; i < array.length; i++)
            array[i] = -(array[i]);

//                return array;
        return java.util.Arrays.stream(array).map(i -> -i).toArray();
    }

    public static int points(String[] games) {
        //implement me
        int totalPoints = 0;
        for (String g : games) {
            String[] strings = g.split(":");
            int x = Integer.parseInt(strings[0]);
            int y = Integer.parseInt(strings[1]);
            if (x > y) {
                totalPoints += 3;
            } else if (x == y) {
                totalPoints++;
            }
            System.out.print(Arrays.toString(strings));
        }
        return totalPoints;
    }

    public static String even_or_odd(int number) {
        //Place code here
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
        // return (number %2 == 0) ? "Even" : "Odd";
        // return (number & 1) == 0 ? "Even" : "Odd";   genialne
        // return(number %2!=0)?"Odd":"even";
    }


    public static void main(String[] args) {
        int[] input = new int[]{-1, -2, -3, -4, -5};
        invert(input);
        System.out.println(Arrays.toString(input));
        String[] total = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};
        System.out.println(points(total));
        System.out.println(total);
        System.out.println("\n" + Arrays.toString(total));
        System.out.println(even_or_odd(5));

    }
}
