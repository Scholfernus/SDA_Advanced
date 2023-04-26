package org.example.pl.SDA.pol141.JA.Day4.IO;

import org.example.pl.SDA.pol141.JA.Day2.App.AddressBookItem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportPhoneBook {
    public static String regex = "\\|";

    public static void main(String[] args) {

        Path pathToBook = Paths.get("c:\\Data\\phone-book.txt");
        List<AddressBookItem> items = new ArrayList<>();
        try {
            List<String> phoneBook = Files.readAllLines(pathToBook);
            for (var line : phoneBook) {
                final String[] tokens = line.split(regex);
                if (tokens.length != 3) {
                    continue;
                }
                try {
                    AddressBookItem item = AddressBookItem.of(tokens[0], tokens[1], LocalDate.parse(tokens[2]));
                    items.add(item);
                } catch (IllegalArgumentException e) {
                    System.out.println("Ten wiersz nie zawiera poprawnej daty!");
                }
            }
        } catch (IOException e) {
            System.out.println("Nie można wczytać pliku: " + e.getMessage());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dzień urodzin szukanych osób: ");
        int day = scanner.nextInt();
        List<AddressBookItem> found = new ArrayList<>();
        for (var item : items) {
            if (item.getBirth().getDayOfMonth() == day) {
                found.add(item);
            }
        }
        System.out.println("Lista osób urodzonych w dniu: " + day);
        for (var item : found) {
            System.out.println(item);
        }
        List<AddressBookItem> findPhone = new ArrayList<>();
        //Poszukaj osoby o podanym numerze telefonu
        System.out.println("Podaj numer telefonu");
        while (!scanner.hasNextLine()) {
            System.out.println("Oczekiwanie na wprowadzenie danych...");
        }
        String phone = scanner.next();
        for (var item : items) {
            if (item.getPhone().equals(phone)) {
                findPhone.add(item);
            }
        }
        System.out.println("Lista osób o numerze telefonu " + phone + ":");

        for (var tel : findPhone) {
            System.out.println("Adres e-mail " + tel.getEmail() + " data urodzenia: ->" + tel.getBirth());
        }
    }
}
