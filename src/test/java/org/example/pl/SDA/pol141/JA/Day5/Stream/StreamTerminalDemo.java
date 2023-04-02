package org.example.pl.SDA.pol141.JA.Day5.Stream;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTerminalDemo {
    public static void main(String[] args) {
        String joining = StreamCreationDemo.namesStream().limit(100)
                .collect(Collectors.joining(":."));
        System.out.println(joining);

        Set<String> collect = StreamCreationDemo.namesStream().limit(100).collect(Collectors.toSet());
        System.out.println(collect);

        List<String> collect1 = StreamCreationDemo.namesStream().limit(100).collect(Collectors.toList());
        System.out.println(collect1);

        boolean match = StreamCreationDemo.namesStream()
                .limit(100)
                .anyMatch(name -> name.startsWith("A"));
        System.out.println("Czy jest jakieś imię na A ? " + match);

        boolean allMatch = StreamCreationDemo.namesStream()
                .limit(100)
                .allMatch(name -> name.contains("a"));
        System.out.println("Czy wszystkie imiona zawierają literę a ? " + allMatch);

        Optional<String> any = StreamCreationDemo.namesStream()
                .limit(100)
                .findAny();
        System.out.println("Jakikolwiek element " + any);

        Optional<String> findFirst = StreamCreationDemo.namesStream()
                .limit(100)
                .findFirst();
        System.out.println("Jakikolwiek pierwszy element " + findFirst);

        String reduce = StreamCreationDemo.namesStream()
                .limit(100)
                .reduce("", (a, name) -> a + " - " + name);
        System.out.println("Wynik reduce" + reduce);
    }
}
