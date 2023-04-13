package org.example.pl.SDA.pol141.JA.Exc1;

import java.util.Arrays;

public class CodeWarsExcercise3 {
    public static int findEvenIndex(int[] arr) {
        int countLeft = 0;
        int countRight = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            countLeft += arr[i];
        }
        for (int j = arr.length - 1; j > 0; j--) {
            countRight += arr[j];

            if (countLeft == countRight) {
                index = j;
            }
            countLeft -= arr[j-1];
            }
            return index;
          //  int i, j; int leftsum, rightsum; int n = arr.length;
        //    for ( i = 0; i < n; ++i) {
        //      leftsum = 0; rightsum = 0;
        //      for ( j = 0; j < i; j++)
        //        leftsum  += arr[j];
        //      for( j = i+1; j < n; j++)
        //        rightsum += arr[j];
        //      if (leftsum == rightsum)
        //        return i;
        //    }
        //    return -1;
        //  }
        }
    public static String toJadenCase(String phrase) {
        StringBuilder fewWords = new StringBuilder();
        String [] words = phrase.split( " ");
        for ( String w : words ) {
            String firstLetter = Character.toUpperCase(w.charAt(0));
        }
        return "";
    }

   //  minMax number
    public static int[] minMax(int[] arr) {
        Arrays.sort(arr);
        int[]finalNumber = new int[2];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            finalNumber[0] = arr[0];
            finalNumber[1] = arr[arr.length-1];
        }
        return finalNumber;
    }

    public int min(int[] list) {
        Arrays.sort(list);
        return list[0];
    }
    public int max(int[] list) {
        Arrays.sort(list);
        return list[list.length-1];
    }

    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[]{2824, 1774, -1490, -9084, -9696, 23094}));
        System.out.println(Arrays.toString(minMax(new int[]{1,2,3,4,5})));
    }
}

