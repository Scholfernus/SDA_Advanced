package org.example.pl.SDA.pol141.JA.Day3.Collections;
import org.example.pl.SDA.pol141.JA.Day3.Generic.DrumsPlayer;
import org.example.pl.SDA.pol141.JA.Day3.Generic.GuitarPlayer;
import org.example.pl.SDA.pol141.JA.Day3.Generic.Musician;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTask {
    public static void main(String[] args) {
        Collection<GuitarPlayer> guitarPlayers = new ArrayList<>();
        guitarPlayers.add(new GuitarPlayer());
        guitarPlayers.add(new GuitarPlayer());
        for (var player: guitarPlayers
             ) {
            player.play();
        }
        System.out.println(guitarPlayers.size());
        Collection<Musician> musicians = new ArrayList<>();
        musicians.add(new GuitarPlayer());
        musicians.add((new Musician()));
        musicians.add(new DrumsPlayer());
        Collection<DrumsPlayer> drumsPlayers = new ArrayList<>();
        drumsPlayers.add(new DrumsPlayer());
        Collection<Musician>band = new ArrayList<>();
        band.addAll(guitarPlayers);
        band.addAll(drumsPlayers);
        band.addAll(musicians);
        //policzyć ilu jest gitarzystów w kolekcji - obiektów klasy GuitarPLayer
        int guitarPlayerCounter =0;
        int drumsPLayer = 0;
        for (var player : musicians){
            if (player instanceof GuitarPlayer)
                guitarPlayerCounter++;
        }
        System.out.println("Liczba gitarzystów wśród gitarzystów: " + guitarPlayerCounter);
        for (var player : musicians){
            if (player instanceof Musician)
                guitarPlayerCounter++;
        }
        System.out.println("Liczba gitarzystów wśród muzyków: " + guitarPlayerCounter);
        for (var player : musicians){
            if (player instanceof DrumsPlayer)
                drumsPLayer++;
        }
        System.out.println("Liczba perkusistów: " + drumsPLayer);
    }
}
