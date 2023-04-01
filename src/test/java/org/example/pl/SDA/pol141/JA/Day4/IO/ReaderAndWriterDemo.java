package org.example.pl.SDA.pol141.JA.Day4.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriterDemo {
    public static void main(String[] args) throws IOException {
        Reader reader = new InputStreamReader(new FileInputStream("c:\\data\\output.txt"));
        int item = reader.read();
        while (item != -1) {
            System.out.print((char) item);
            item = reader.read();
        }
        reader.close();
        System.out.println();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("c:\\data\\output.txt")));
        String readLine = null;
        List<String> lines = new ArrayList<>();
        while ((readLine = bufferedReader.readLine()) != null) {
           lines.add(readLine);
            System.out.println(readLine);
        }
        bufferedReader.close();

        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("c:\\data\\result.txt")
                )
        );
        writer.write("To jest plik do dodania");
        writer.write(256);
        writer.close();





        //
//        InputStreamReader input = new InputStreamReader(new FileInputStream("c:\\data\\output.txt"));
//        System.out.println(
    }
}
