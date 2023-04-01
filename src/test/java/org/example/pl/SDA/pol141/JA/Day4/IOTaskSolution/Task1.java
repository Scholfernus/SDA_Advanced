package org.example.pl.SDA.pol141.JA.Day4.IOTaskSolution;

import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
//        Path pathCSV = Paths.get("https://raw.githubusercontent.com/record-it/sda-zdjavapol141-ja/master/src/main/java/pl/sda/pol141/task/us-500.csv");
          Path pathCSV = Paths.get("c:\\Data\\FileCSV.txt");
        BufferedWriter namesData = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("c:\\Data\\FileCSV.txt"))
        );

        List<String> lines = Files.readAllLines(pathCSV);




        Path destinationPath = Paths.get("c:\\Data\\FileCSV.txt");
        Files.write(destinationPath, lines, StandardCharsets.UTF_8);
    }
}
