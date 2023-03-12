package org.example.pl.SDA.pol141.JA.Day1.value_object;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("abc"=="abc"); //true
        String str = new String("abc");
        System.out.println(str=="abc"); //false, bo str jest osobnym obiektem
        str = "abc";
        System.out.println(str=="abc"); //true, porównanie tych samych obiektów
        System.out.println("ABC" == str.toUpperCase()); //false, porównanie referencji
        System.out.println("ABC".equals(str.toUpperCase())); // true, porównanie wartości
    }
}
