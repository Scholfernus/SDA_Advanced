package org.example.pl.SDA.pol141.JA.Day4.IO;

import java.io.*;
import java.util.Arrays;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream stream = new PrintStream(System.out);
        stream.write("Hello World".getBytes());
        stream = new FileOutputStream("c:\\data\\console.txt");
        stream.write("Hello World".getBytes());
        byte[] buffer = new byte[1024];
        stream = new ByteArrayOutputStream();
        stream.write("Hello World".getBytes());

        InputStream inputStream = new FileInputStream("c:\\data\\console.txt");
        System.out.println(inputStream.read() );
        int readBytes = inputStream.read();
        System.out.println(readBytes); // wczyta jeden znak


    }
}
