package org.example.pl.SDA.pol141.JA.Day1.abstractions;

import org.example.pl.SDA.pol141.JA.Day1.Inheritance.Scooter;

public class SuperScooter extends Scooter {
    public SuperScooter(String serialNumber, double weight) {
        super(serialNumber, weight);
        this.millage = 5;
    }
}
