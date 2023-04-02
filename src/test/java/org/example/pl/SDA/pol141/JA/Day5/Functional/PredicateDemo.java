package org.example.pl.SDA.pol141.JA.Day5.Functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //domyślnie zwracają typ boolean
        Predicate<String> endsWithA = s -> s.toUpperCase().endsWith("A");
        endsWithA = s -> s.length()>=3;

        List<String> names = List.of("Adam","Ewa","Karol","Robert","Ania");
        System.out.println(search(names, s -> s.length()==4));
        System.out.println(search(names, s -> s.toUpperCase().startsWith("A")));
        Predicate<String>leng4 = s -> s.length() == 4;
        System.out.println(search(names, s -> s.toUpperCase().endsWith("A") && s.length()==3));

        System.out.println(search(names,endsWithA.and(leng4)));
        System.out.println(search(names,endsWithA.negate())); // sprawdź dlaczego nie działa kod
    }
    public static List<String>search(List<String>collection,Predicate<String>filter){
        List<String>results = new ArrayList<>();
        for (var item:collection) {
            if (filter.test(item)){
                results.add(item);
            }
        }
        return results;
    }
}
