package org.example.pl.SDA.pol141.JA.Day5.Functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Napis dowolny.");
        printer = s -> {
            try {
                Files.writeString(Paths.get("c:\\Data\\Hello.txt"), s, StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println(e);
            }
        };
        printer.accept("Przywitanie.");
        List<String>names = List.of("Adam", "Karol", "Ewa");
        names.forEach(printer);
        names.forEach(s -> System.out.println(s));
        System.out.println(names);

        List<Integer>numbers = List.of (1,4,3,5,6,7,3,7,2);
        numbers.forEach(i-> System.out.println(i*i));

    }
}
