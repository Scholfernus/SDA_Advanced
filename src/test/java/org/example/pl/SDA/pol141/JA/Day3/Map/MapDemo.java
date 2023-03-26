package org.example.pl.SDA.pol141.JA.Day3.Map;

import org.example.pl.SDA.pol141.JA.Day2.App.AddressBookItem;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, AddressBookItem> phoneBook = new HashMap<>();
        AddressBookItem item = AddressBookItem.of("1@.com.pl", "1111", LocalDate.now());
        phoneBook.put(item.getPhone(), item);
        AddressBookItem item2 = AddressBookItem.of("2@.com.pl", "2222", LocalDate.now());
        phoneBook.put(item.getPhone(), item);
        AddressBookItem item3 = AddressBookItem.of("3@.com.pl", "3333", LocalDate.now());
        phoneBook.put(item.getPhone(), item);
        phoneBook.putIfAbsent("2222",AddressBookItem.of("1", "1", LocalDate.now()));

        AddressBookItem bookItem = phoneBook.get("2222");
        if (bookItem == null) {
            System.out.println("Brak takiego wpisu");
        } else {
            System.out.println("wyszukana osoba o numerze: " + bookItem.getPhone());
            System.out.println(bookItem);
        }
        Set<String> phoneNumbers = phoneBook.keySet();
        System.out.println(phoneNumbers);
        Collection<AddressBookItem> items = phoneBook.values();
        System.out.println(items);
        for (var entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        var s = phoneBook.getOrDefault("1111", AddressBookItem.of("empty", "empty", LocalDate.EPOCH));
        System.out.println(s);

    }
}
