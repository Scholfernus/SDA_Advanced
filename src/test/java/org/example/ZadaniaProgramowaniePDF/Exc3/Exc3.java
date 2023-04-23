package org.example.ZadaniaProgramowaniePDF.Exc3;

import java.util.List;

public class Exc3 {
    public static void main(String[] args) {

    }
    public static double average(List<Integer> numbers){
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
}
