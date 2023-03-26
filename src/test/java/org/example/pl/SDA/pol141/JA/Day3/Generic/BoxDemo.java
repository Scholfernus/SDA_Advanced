package org.example.pl.SDA.pol141.JA.Day3.Generic;

import java.util.Arrays;

public class BoxDemo {
    public static void main(String[] args) {
        //Box typu generycznego - w miejsce T wstawiamy konkretny typ z <T>
        Box<String>letter = new Box<>("adres1","adres2","Hello");
        Box<Integer>intBox = new Box<>("nr konta 1", "nr konta 2", 1000);
        Box[]items = new Box[5];
        items[0] = letter;
        items[1] = intBox;
        //Box typu surowego
        Box objBox = new Box<>("a1", "a2", true);
        Box<String>[] letters = new Box[5];
        letters[0]= letter;
        System.out.println(Arrays.toString(letters));
        Box<?> box = new Box<>("", "", 1000);
        Box<? extends Number> number = new Box<>(" ", "200", 45);
        Box<? extends Musician> musicianBox = new Box<>("John","Mc",new DrumsPlayer());
    }

}
