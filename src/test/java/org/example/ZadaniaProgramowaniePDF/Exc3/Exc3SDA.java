package org.example.ZadaniaProgramowaniePDF.Exc3;

import java.util.List;

public class Exc3SDA {
    public static void main(String[] args) {

    }
    public Double average(List<Integer> list){
        return list.stream().mapToInt(i->i).average().getAsDouble();
    }
}
