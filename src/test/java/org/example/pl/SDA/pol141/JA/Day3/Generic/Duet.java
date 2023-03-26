package org.example.pl.SDA.pol141.JA.Day3.Generic;

public class Duet <T,K>{
    private T first;
    private K second;

    public Duet(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }
    public boolean isValid (){
    return first !=null && second!=null;
    }
}
