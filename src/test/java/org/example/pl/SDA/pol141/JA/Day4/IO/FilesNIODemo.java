package org.example.pl.SDA.pol141.JA.Day4.IO;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FilesNIODemo {
    public static void main(String[] args) throws IOException {
        Path pathToFile = Paths.get("c:\\Data\\data.txt");
        Files.copy(pathToFile,System.out);
        CopyOption []options = {StandardCopyOption.REPLACE_EXISTING};
        Path copy = Paths.get("c:\\Data\\copy.txt");
        Files.copy(pathToFile,copy,options);
        List<String> lines = Files.readAllLines(pathToFile);
        String content = Files.readString(pathToFile);
        System.out.println(content);
        lines.add("666");
        lines.remove(0);
        Files.write(pathToFile,lines);
        System.out.println(content);
    }
}
