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
        AddressBookItem item2 = AddressBookItem.of("2@.com.pl", "24548646", LocalDate.now());
        phoneBook.put(item.getPhone(), item);
        AddressBookItem item3 = AddressBookItem.of("3@.com.pl", "3124548646", LocalDate.now());
        phoneBook.put(item.getPhone(), item);

        AddressBookItem bookItem = phoneBook.get("1111");
        if (bookItem == null) {
            System.out.println("Brak takiego wpisu");
        } else {
            System.out.println("wyszukana osoba o numerze: " + bookItem.getPhone());
        }
        System.out.println(bookItem);
        Set<String> phoneNumbers = phoneBook.keySet();
        System.out.println(phoneNumbers);
        Collection<AddressBookItem> values = phoneBook.values();
        System.out.println(values);
        System.out.println(phoneBook.containsKey(phoneNumbers));
        for (var entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
