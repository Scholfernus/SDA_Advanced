package org.example.ZadaniaProgramowaniePDF.Exc6;

import java.util.List;
import java.util.stream.Collectors;

public class Exc6 {
    public static void main(String[] args) {

    }
    public static String numbers(List<Integer> integerList) {
        return integerList.stream().map(s -> {
            String prefix = s % 2 == 0 ? "e" : "o";
            return prefix + s;
        }).collect(Collectors.joining(","));
    }
}
