package org.example.ZadaniaProgramowaniePDF.Exc5;

import java.util.List;
import java.util.stream.Collectors;

public class Exc5 {
    public static void main(String[] args) {

    }
    public List<String> beginA(List<String>strings){
        return strings.stream().filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());
    }
}
