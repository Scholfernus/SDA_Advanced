package org.example.pl.SDA.pol141.JA.Day3.Set;

import org.example.pl.SDA.pol141.JA.Day2.App.AddressBookItem;

import java.time.LocalDate;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();
        Set<String> names = new HashSet<>(List.of("Ewa", "Adam", "Karol", "Ewa"));
        System.out.println(names); // nie wyświetla 2 razy Ewa ponieważ kolekcja Set ma tylko unikalne wartości
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            integers.add(random.nextInt(100));
        }
        Set<Integer> numbers = new HashSet<>(integers);
        System.out.println(numbers);
        System.out.println(new HashSet<>(integers));
        Set<AddressBookItem> itemSet = new HashSet<>();
        for (int i = 0; i < 1_000_000; i++) {
            integers.add(random.nextInt(100));
            itemSet.add(AddressBookItem.of(Integer.toString(random.nextInt(100)),Integer.toString(random.nextInt(100)),
                    LocalDate.of(random.nextInt(1990,2010 ),random.nextInt(1,12), random.nextInt(1,28))));
        }
        System.out.println(itemSet.contains(AddressBookItem.of("10","10",LocalDate.of(2000,10,10))));
    }
}
