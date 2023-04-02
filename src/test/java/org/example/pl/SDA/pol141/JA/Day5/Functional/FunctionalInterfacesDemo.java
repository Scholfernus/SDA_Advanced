package org.example.pl.SDA.pol141.JA.Day5.Functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        Function<Double, Double> power = a -> a * a;
        Function<String, Double> parseDouble = s -> Double.parseDouble(s);
        //sekwencyjne parsowanie i potęgowanie
        Double number = parseDouble.apply("1.23");
        System.out.println(power.apply(number));
        //złożenie funkcji - to samo co wyżej, 1 linijka mniej
        Double applyResult = parseDouble.andThen(power).apply("1.23");
        System.out.println(applyResult);
        Function<Double, String> formater = l -> String.format("%.2f", l);
        String aResult = parseDouble.andThen(power).andThen(formater).apply("8.4597");
        System.out.println(aResult);

        String str =
                parseDouble.andThen(a -> a * a)
                        .andThen(l -> String.format("%.2f", l))
                        .apply("8.4597");
        System.out.println(str);
        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        BiFunction<String,Integer,String> nTimes = (s,ile)->s.repeat(ile);
        System.out.println(nTimes.apply("asad",5));
        nTimes = (s,i)->s + " " + i;
        System.out.println(nTimes.apply("Wiek Karola", 23));
    }
}
