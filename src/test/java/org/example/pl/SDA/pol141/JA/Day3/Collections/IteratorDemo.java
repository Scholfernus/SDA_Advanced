package org.example.pl.SDA.pol141.JA.Day3.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String>names = new ArrayList<>();
        names.add("Paul");
        names.add("Anne");
        names.add("Mike");
        // to jest ten sam kod co pętla foreach
        System.out.println("Iterowanie po kolekcji z użyciem iteratora");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            final String item = iterator.next();
            System.out.println(item);
        }
        System.out.println("Iterowanie po kolekcji z użyciem pętli foreach");
        // wykorzystujemy pętle foreach zamiast iteratora
        for (String item : names) {
            System.out.println(item);
        }
    }
}
