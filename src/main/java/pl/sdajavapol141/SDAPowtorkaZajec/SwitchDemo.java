package pl.sdajavapol141.SDAPowtorkaZajec;

import java.util.Scanner;

public class SwitchDemo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Add");
            System.out.println("Dodaj");
            System.out.println("Sub");
            System.out.println("Mul");
            System.out.println("Quit");
            String command = scanner.nextLine();
            switch (command) {
                case "Add":
                case "Dodaj":
                    System.out.println("Dodawanie");
                case "Quit":
                    return;
            }
        }
    }
}
