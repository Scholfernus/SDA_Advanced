package org.example.pl.SDA.pol141.JA.Day3.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class MyCollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        System.out.println(integers.size());
        integers.remove(6);
        System.out.println(integers.size());
        integers.remove(7);
        System.out.println(integers.size());
        for (var item:integers
             ) {
            System.out.println(item);
        }
        System.out.println("Czy kolekcja zawiea 8");
        System.out.println(integers.contains(8));
        System.out.println("Czy kolekcja zawiea 7");
        System.out.println(integers.contains(7));
    }
}
