package org.example.pl.SDA.pol141.JA.Day3.Generic;

public class MusicianDuet<T extends Musician,V extends Musician>{
    private T musisianFirst;
    private V musisianSecond;

    public MusicianDuet(T musisianFirst, V musisianSecond) {
        this.musisianFirst = musisianFirst;
        this.musisianSecond = musisianSecond;
    }

    public T getMusisianFirst() {
        return musisianFirst;
    }

    public V getMusisianSecond() {
        return musisianSecond;
    }
    public void play(){

    }
}
