package org.example.pl.SDA.pol141.JA.Exc1;

import java.util.Arrays;

public class CodeWarsExcercise {

            public static int[] invert ( int[] array){

               // int number = -1;
                for (int i = 0; i < array.length; i++) {
                    int invertn = array[i];
                    array[i] = invertn * (-1);
                }
                for(int i = 0; i < array.length; i++) {
                    array[i] *= -1;
                }
                for (int i = 0;i < array.length; i++)
                    array[i] = -(array[i]);

//                return array;
                return java.util.Arrays.stream(array).map(i -> -i).toArray();
            }

        public static void main(String[] args) {
            int[] input = new int[] {-1,-2,-3,-4,-5};
        invert(input);
            System.out.println(Arrays.toString(input));
    }
}