package org.example.pl.SDA.pol141.JA.Exc1;

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
        return "";
    }



    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[]{2824, 1774, -1490, -9084, -9696, 23094}));
    }
}

