package org.example.pl.SDA.pol141.JA.Day4.IOTaskSolution;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) throws IOException, MalformedURLException {
        URL url = new URL("https://raw.githubusercontent.com/record-it/sda-zdjavapol141-ja/master/src/main/java/pl/sda/pol141/task/us-500.csv");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            // Pomijamy pierwszą linię z nagłówkami kolumn
            String line = reader.readLine();
            Map<String, Integer> cities = new HashMap<>();
            Map<String, Integer> names = new HashMap<>();

            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(",");
                String firstName = columns[0];
                String city = columns[6];

                // Zliczamy ilość osób w każdym z miast
                cities.put(city, cities.getOrDefault(city, 0) + 1);

                // Zliczamy ilość wystąpień każdego z imion
                names.put(firstName, names.getOrDefault(firstName, 0) + 1);
            }

            // Szukamy imienia, które wystąpiło najczęściej
            List<String> mostCommonNames = names.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(1)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());

            // Wyświetlamy informacje o ilości osób w każdym z miast
            System.out.println("Liczba osób w poszczególnych miastach:");
            cities.forEach((city, count) -> System.out.println(city + ": " + count));

            // Wyświetlamy informacje o imieniu, które wystąpiło najczęściej
            System.out.println("Najczęściej występujące imię:");
            System.out.println(mostCommonNames.get(0));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
