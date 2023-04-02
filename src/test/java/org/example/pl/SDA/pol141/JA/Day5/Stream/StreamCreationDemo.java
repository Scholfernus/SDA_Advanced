package org.example.pl.SDA.pol141.JA.Day5.Stream;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationDemo {
    static Random random = new Random();
   static List<String> names = List.of("Adam", "Karol", "Ewa", "Ania", "Piotr","Zenon","Michał","Anastazja", "Michalina");
   public static Stream<String>namesStream(){
      return Stream.generate(() -> names.get(random.nextInt(names.size() - 1)));
   }
    public static void main(String[] args) {

        Stream<String> s1 = names.stream();
        Set<String> set = Set.of("A", "B", "C", "A", "E");
        Stream<String> s2 = set.stream();
        Stream<String> s3 = Stream.of("A", "B", "C", "F", "G", "Z");
        Stream<Integer> s4 = Stream.generate(() -> random.nextInt(100));
        Stream<String> s5 = Stream.generate(() -> names.get(random.nextInt(names.size() - 1)));
        Stream<Integer> s6 = Stream.iterate(0, n -> n + 2); //przechodzenie przez indeksy co 2
        IntStream s7 = IntStream.range(0, 100);
    }

}
