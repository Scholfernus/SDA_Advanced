package org.example.pl.SDA.pol141.JA.Day4.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerInputStreamDemo {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        //konstrukcja try with resource...
        try (
                FileInputStream inputStream = new FileInputStream("c:\\Data\\data.txt");
                Scanner scanner = new Scanner(inputStream);) {
            while (scanner.hasNext()) {
                ints.add(scanner.nextInt());
            }
        }catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku do odczytu:" + e.getMessage());
            return;
        }catch (IOException e){
            System.out.println("Błąd odczytu " + e.getMessage());
            return;
        }
        long sum = 0;
        for (var number : ints) {
            sum += number;
        }
        System.out.println(sum);
    }
}


