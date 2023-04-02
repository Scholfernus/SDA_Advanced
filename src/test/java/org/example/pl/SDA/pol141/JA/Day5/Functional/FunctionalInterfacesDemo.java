package org.example.pl.SDA.pol141.JA.Day5.Functional;

import java.util.function.Function;

public class FunctionalInterfacesDemo {
    public static void main(String[] args) {
        Function<Double, Double> power = a -> a * a;
        Function<String,Double> parseDouble = s->Double.parseDouble(s);
    }
}
