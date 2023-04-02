package org.example.pl.SDA.pol141.JA.Day5.Stream;

import java.util.stream.Stream;

public class StreamProcessingDemo {
    public static void main(String[] args) {
        StreamCreationDemo.namesStream()
                .limit(10)
                .filter(name -> {
                    System.out.println("predictae for " + name);
                    return name.toUpperCase().startsWith("A");
                })//operacja pośrednia
                .forEach(System.out::println);  // operacja finalna
       Stream<String>after = StreamCreationDemo.namesStream()
                .limit(10)
                .filter(name -> {
                    System.out.println("predicate for " + name);
                    return name.toUpperCase().startsWith("A");  //strumień zapamiętuje tylko operacje do wykonania
                });
        after.forEach(System.out::println); ////operacja terminalna wymusza wykonania operacji na strumieniu

    }
}

