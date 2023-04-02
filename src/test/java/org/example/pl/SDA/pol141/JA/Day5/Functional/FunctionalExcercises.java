package org.example.pl.SDA.pol141.JA.Day5.Functional;

@FunctionalInterface
interface StringOperations {
    String apply(String s);
}

// a+b   a-b   a*b    a/b     a*a*a+b tyle funkcji można zrobić na tych dwóch danych
@FunctionalInterface
interface NumbersOperation {
    double apply(double a, double b);
}

interface AbstractNumberOperation<R extends Number, T extends Number, V extends Number> {
    R apply(T a, V b);
}

interface MyFunction<T, R> {
    R apply(T value);
}

public class FunctionalExcercises {
    public static void main(String[] args) {
        StringOperations trim = s -> s.trim(); // zwraca łańcuch wejściowy bez żadnych spacji
        StringOperations join = s -> s + "abcd_znaki"; // lambda, łączy łańcuch wejściowy z "abc"
        System.out.println(process(" sda  dcf", trim));
        System.out.println(process(" sda  dcf", join));

        NumbersOperation add = (liczba1, liczba2) -> liczba1 + liczba2;
        NumbersOperation fun = (number1, number2) -> number1 * 2 + number2 / 2;
        System.out.println(fun.apply(6, 8));

        AbstractNumberOperation<Long, Long, Long> addLong = (a, b) -> a + b;
        AbstractNumberOperation<Double, Integer, Double> customAdd = (a, b) -> (double) (a + b);
        System.out.println(customAdd.apply(1, 2.5));
        //                     wynik, liczba, liczba
        AbstractNumberOperation<Long, Byte, Integer> differ = (num, num2) -> (long) (num * num2);
        System.out.println(differ.apply((byte) 30, 23));
    }

    //funkcja wyższego rzędu - argumentem jest inna funkcja
    public static String process(String s, StringOperations operation) {
        return operation.apply(s);
    }
}
