package org.example.pl.SDA.pol141.JA.Day4.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("c://Data/output.txt");
        File file1 = new File("d://SDA/test.txt");
        file.createNewFile();
        file1.createNewFile();
        file.setWritable(true);
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        fileOutputStream.write("Tekst w pliku".getBytes(), 0,13);
        fileOutputStream.write(" the end".getBytes());
        fileOutputStream.close();
        scanner.nextLine();
    }
}
