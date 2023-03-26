package org.example.pl.SDA.pol141.JA.Day2.App;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AdressBookApp {
    private static AddressBookItem[]items = new AddressBookItem[100];
    private static Scanner scanner = new Scanner(System.in);
    private static int index = 0;
    public static void main(String[] args) {
        System.out.println("Wpisz adres email");
        String email = scanner.nextLine();
        System.out.println("Wpisz nr telefonu");
        String phone = scanner.nextLine();
        boolean isDateValid = false;
        while (!isDateValid) {
            System.out.println("Podaj datę urodzin wg wzoru: YYYY-MM-DD, np. 2000-10-26");
            String date = scanner.nextLine();
            try {
            final AddressBookItem item = AddressBookItem.of(email, phone, LocalDate.parse(date));
            items[index++] = item;
            } catch (DateTimeParseException e) {
                System.out.println("Data urodzin jest niezgodna z formatem! Spróbuj jeszcze raz");
            }
        }
    }
}
