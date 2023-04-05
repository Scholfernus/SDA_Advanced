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

    public static int[] countBy(int x, int n) {
        // Your code here
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = (i + 1) * x;
        }
        return count;
        // return IntStream.rangeClosed(1, n * x).filter(i -> (i % x) == 0).toArray();
    }

    static String removeExclamationMarks(String s) {
        s = s.replace("!", "");
        return s;
    }

    //  return s.replaceAll("!", "");
    //Biorąc pod uwagę ciąg cyfr, każdą cyfrę poniżej 5 należy zastąpić „0”, a każdą cyfrę od 5 wzwyż – „1”. Zwróć wynikowy ciąg.
    //
    //Uwaga: dane wejściowe nigdy nie będą pustym ciągiem
    public static String fakeBin(String numberString) {
        numberString = "25469521325412358931L";
        StringBuilder result = new StringBuilder();
        for (char c : numberString.toCharArray()) {
            if (c < '5') {
                result.append('0');
            } else {
                result.append('1');
            }
        }
        return result.toString();
    }
    // return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    // return str.replaceAll("[1-4]","0").replaceAll("[5-9]","1");


    //Given an array of integers, return a new array with each value doubled.
    //For example:
    //[1, 2, 3] --> [2, 4, 6]
    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
    // return Arrays.stream(arr).map(x -> x*2).toArray();


    //Otrzymujesz tablicę z wynikami testów Twoich rówieśników. Teraz oblicz średnią i porównaj swój wynik!
    //
    //Zwróć Prawda, jeśli jesteś lepszy, w przeciwnym razie Fałsz!
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        boolean areYouBetter = true;
        if (Arrays.stream(classPoints).sum() / classPoints.length < yourPoints) {
            return areYouBetter;
        } else return !areYouBetter;
    }

    //Transportation on vacation
    public static int rentalCarCost(int d) {
        // Your solution here
        int amount = 40;
        int cost = 0;
        if (d < 3) {
            cost = amount * d;
        } else if (d >=3 && d<= 6) {
            cost = (amount * d) - 20;
        } else if (d >= 7) {
            cost = (amount * d) - 50;
        }
        return cost;
    }
    // return d < 7 ? d < 3 ? 40 * d : 40 * d - 20 : 40 * d - 50;
    // return d < 3 ? d * 40 : d < 7 ? d * 40 - 20 : d * 40 - 50;

    public static void main(String[] args) {
        int[] input = new int[]{-1, -2, -3, -4, -5};
        invert(input);
        System.out.println(Arrays.toString(input));
        String[] total = {"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"};
        System.out.println(points(total));
        System.out.println(total);
        System.out.println("\n" + Arrays.toString(total));
        System.out.println(even_or_odd(5));
        System.out.println(Arrays.toString(countBy(5, 10)));
        System.out.println(removeExclamationMarks("Hello!"));
        System.out.println(fakeBin("25469521325412358931L"));
        System.out.println(Arrays.toString(map(new int[5])));
        System.out.println(betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(rentalCarCost(7));
    }
}
