package org.example.pl.SDA.pol141.JA.Day4.IOTaskSolution;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Path pathCSV = Paths.get("c:\\Data\\FileCSV.txt");
        BufferedWriter namesData = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("c:\\Data\\NewFileCSV.txt"))
        );
        BufferedWriter emailData = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("c:\\Data\\emails.txt"))); // Strumień do zapisywania adresów email do pliku
        Map<String, Integer> cities = new HashMap<>(); // Mapa do przechowywania liczby osób w poszczególnych miastach
        Map<String, Integer> names = new HashMap<>();  // Licznik wystąpień każdego imienia
        List<String> lines = Files.readAllLines(pathCSV);
        for (var line : lines) {
            String[] columns = line.split(",");
            String firstName = columns[0].trim();
            String city = columns[4].trim();
            String email = columns[10].trim();

            names.put(firstName, names.getOrDefault(firstName, 0) + 1);
            cities.put(city, cities.getOrDefault(city, 0) + 1);
            System.out.print(columns[0]);
            System.out.println(columns[4]);
            System.out.println(columns[10]);
            emailData.write(email); // Zapisz adres email do pliku
            emailData.newLine();
        }
        emailData.close();

        // Wypisz na ekranie liczbę osób w każdym z miast
        for (Map.Entry<String, Integer> entry : cities.entrySet()) {
            String city = entry.getKey();
            int count = entry.getValue();
            if (count == 1) {
                System.out.println(city + ":-> " + count + " mieszkaniec.");
            } else {
                System.out.println(city + ":-> " + count + " mieszkańców.");
            }
        }
        // Wypisz na ekranie imię, które występuje najczęściej
        String mostCommonName = "";
        int mostCommonNameCount = 0;
        for (Map.Entry<String, Integer> entry : names.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            if (count > mostCommonNameCount) {
                mostCommonName = name;
                mostCommonNameCount = count;
            }
        }
        System.out.println();
        System.out.println("Najczęściej występujące imię: " + mostCommonName.toUpperCase(Locale.ROOT)
                + " " + mostCommonNameCount + " razy.");
    }
}
