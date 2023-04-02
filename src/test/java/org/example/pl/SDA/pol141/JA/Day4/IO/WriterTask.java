package org.example.pl.SDA.pol141.JA.Day4.IO;

import java.io.*;
import java.util.List;

public class WriterTask {
    public static List<String> names = List.of("Adam", "Ewa", "Karol");
    public static void main(String[] args) throws IOException {
        BufferedWriter namesWriter = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("c:\\data\\names.txt")
                )
        );
        
        for (var n :names
             ) {
            namesWriter.write(n + " ");
        }
        namesWriter.close();
    }
}
