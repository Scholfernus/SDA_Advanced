package org.example.pl.SDA.pol141.JA.Day3.Generic;

public class MusicianDemo {
    public static void main(String[] args) {
        MusicianDuet<Musician, Musician> musicianDuet = new MusicianDuet<>(
                new Musician(),
                new Musician()
        );
        MusicianDuet<GuitarPlayer, GuitarPlayer> guitarPlayer = new MusicianDuet<>(
                new GuitarPlayer(),
                new GuitarPlayer()
        );
        // W konstruktorze można wstawić dowolny typ muzyka
        MusicianDuet<?,?> unknownDuet = new MusicianDuet<>(
                new DrumsPlayer(),
                new GuitarPlayer()
        );
    }
}
