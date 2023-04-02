package org.example.pl.SDA.pol141.JA.Day5.Stream;

public class StreamOtherMethodsDemo {
    public static void main(String[] args) {
        StreamCreationDemo.namesStream()
                .skip(5)
                .limit(10)
                .distinct()               //bez powtórzeń imion
                .forEach(System.out::println);
        System.out.println("******************Przykład dla sort *********************");
        StreamCreationDemo.namesStream()
                .limit(10)
                .peek(System.out::println)
                .sorted()
                .forEach(System.out::println);
        System.out.println("***************dla Parallel***************");
        StreamCreationDemo.namesStream()
                .limit(10)
                .parallel()
                .map(name->"<" + name + "/>")
                .forEach(System.out::println);

    }
}
