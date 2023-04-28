package org.example.ZadaniaProgramowaniePDF.MyProjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Emails_List {
    public static void main(String[] args) {


        File path = new File("c:\\Data\\FileCSV.txt");
        List<String> emailList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("c:\\Data\\FileCSV.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                emailList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<?> dataList = new ArrayList<>();
        String fileName = "c:\\Data\\FileCSV.txt";
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tokens = line.split(",");

                String firstName = tokens[0];
                String lastName = tokens[1];
                String companyName = tokens[2];
                String address = tokens[3];
                String city = tokens[4];
                String county = tokens[5];
                String state = tokens[6];
                String zip = tokens[7];
                String phone1 = tokens[8];
                String phone2 = tokens[9];
                String email = tokens[10];
                String web = tokens[11];

             //   System.out.println(tokens[0]);
               // System.out.println(Arrays.toString(tokens));
                System.out.print(firstName + ", ");
                System.out.print(city + ", ");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            e.printStackTrace();
        }
        System.out.println(emailList.size());
        System.out.println(emailList.get(258));
        System.out.println(emailList);
    }
}
// tutaj przetwarzasz każdą linię i tworzysz obiekt klasy Data
// a następnie dodajesz go do listy dataList
// np. jeśli linia zawiera oddzielone przecinkami dane "imię,nazwisko,wiek",
// możesz użyć metody split(","), żeby je rozdzielić i utworzyć nowy obiekt Data