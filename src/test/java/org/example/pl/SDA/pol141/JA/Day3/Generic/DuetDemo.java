package org.example.pl.SDA.pol141.JA.Day3.Generic;

public class DuetDemo {
    public static void main(String[] args) {
        Duet<String,Integer> duet = new Duet<>("first String", 10);
        Duet<Integer,String> duet1 = new Duet<>(2000, "Coś");
        System.out.println(duet.getFirst());
        System.out.println(duet.getSecond());
        System.out.println(duet1.getFirst());
        System.out.println(duet1.getSecond());
    }
}
