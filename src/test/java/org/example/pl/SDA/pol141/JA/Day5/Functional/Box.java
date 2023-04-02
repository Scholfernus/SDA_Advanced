package org.example.pl.SDA.pol141.JA.Day5.Functional;

import java.util.function.Supplier;

public class Box<T> {
    Supplier<T[]> content;
    public Box(Supplier<T[]> source) {
        this.content = source;
    }
    public T[] getContent() {
        return content.get();
    }
}
