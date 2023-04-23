package org.example.ZadaniaProgramowaniePDF.Exc4;

import java.util.List;
import java.util.stream.Collectors;

public class Exc4 {
    public static void main(String[] args) {

    }
    public static List<String>toUpper(List<String> str){
        return str.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
