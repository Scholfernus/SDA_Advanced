package org.example.pl.SDA.pol141.JA.Day2.Interfaces;

import org.example.pl.SDA.pol141.JA.Day1.aggregation.Person;

import java.io.Serializable;

public class Assistant extends Person implements Translator, Serializable {
    @Override
    public String sayHello() {
        return "Ahoj";
    }

    @Override
    public String sayGoodbye() {
        return "Uvidimy se";
    }
}
