package org.example.ZadaniaProgramowaniePDF.Exc4;

import java.util.List;
import java.util.stream.Collectors;

public class Exc4SDA {
    public static void main(String[] args) {

    }

    public List<String> upperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
