package org.example.pl.SDA.pol141.JA.Day4.IOTaskSolution;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task3 {
    public static void main(String[] args) throws IOException {
        Path pathCSV = Paths.get("https://raw.githubusercontent.com/record-it/sda-zdjavapol141-ja/master/src/main/java/pl/sda/pol141/task/us-500.csv");
        List<String> lines = Files.readAllLines(pathCSV);

        // Mapa do przechowywania liczby osób w poszczególnych miastach
        Map<String, Integer> cityCountMap = new HashMap<>();

        // Licznik wystąpień każdego imienia
        Map<String, Integer> nameCountMap = new HashMap<>();

        // Strumień do zapisywania adresów email do pliku
        BufferedWriter emailData = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("c:\\Data\\emails.txt")));

        for (String line : lines) {
            String[] data = line.split(",");
            String firstName = data[0].trim();
            String city = data[4].trim();
            String email = data[10].trim();

            // Zwiększ licznik wystąpień imienia
            nameCountMap.put(firstName, nameCountMap.getOrDefault(firstName, 0) + 1);

            // Zwiększ licznik osób w danym mieście
            cityCountMap.put(city, cityCountMap.getOrDefault(city, 0) + 1);

            // Zapisz adres email do pliku
            emailData.write(email);
            emailData.newLine();
        }

        emailData.close();

        // Wypisz na ekranie imię, które występuje najczęściej
        String mostCommonName = "";
        int mostCommonNameCount = 0;
        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            if (count > mostCommonNameCount) {
                mostCommonName = name;
                mostCommonNameCount = count;
            }
        }
        System.out.println("Najczęściej występujące imię: " + mostCommonName);

        // Wypisz na ekranie liczbę osób w każdym z miast
        for (Map.Entry<String, Integer> entry : cityCountMap.entrySet()) {
            String city = entry.getKey();
            int count = entry.getValue();
            System.out.println(city + ": " + count);
        }
    }
}
