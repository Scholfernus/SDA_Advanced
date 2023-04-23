package org.example.ZadaniaProgramowaniePDF.Exc6;

import java.util.List;
import java.util.stream.Collectors;


public class Exc6SDA {
    public static void main(String[] args) {

    }
    public String getString(List<Integer>list) {
        return list.stream()
                .map(i->i % 2 ==0 ? "e" +i : "o" +i)
                .collect(Collectors.joining());
    }
}
