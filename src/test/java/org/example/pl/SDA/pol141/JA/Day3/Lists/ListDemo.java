package org.example.pl.SDA.pol141.JA.Day3.Lists;

import org.example.pl.SDA.pol141.JA.Day2.App.AddressBookItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<AddressBookItem> items = new ArrayList<>(100);
        items.add(0,AddressBookItem.of("1", "1", LocalDate.of(2000,10,26)));
        items.add(0,AddressBookItem.of("2", "2", LocalDate.now()));
        items.add(0,AddressBookItem.of("3", "3", LocalDate.now()));

        boolean czyJest = items.contains(AddressBookItem.of("2", "2", LocalDate.now()));

        int index = items.indexOf(AddressBookItem.of("1", "1", LocalDate.of(2000, 10, 26)));
        System.out.println("Index szukanego indeksu: " + index);
        System.out.println("Czy istnieje element: " + items.contains(czyJest));

        items.set(2,AddressBookItem.of("4","4",LocalDate.now()));
        items.get(0);
        for (var item : items
             ) {
            System.out.println(item);
        }
        if (!items.isEmpty()) {
            System.out.println("Ostatni element listy ; " + items.get(items.size() - 1));
            System.out.println("Pierwszy element listy ; " + items.get(0));
        }
        AddressBookItem remove = items.remove(2);
        var item = items.get(0);
        System.out.println(items);
        System.out.println(items.indexOf(remove));
        System.out.println(items.indexOf(item));// wyświetli nam 0
    }
}
