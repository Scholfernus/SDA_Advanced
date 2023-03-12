package org.example.pl.SDA.pol141.JA.Day1.abstractions;

public class Bike extends Vehicle{
    public int switchNumber;

    public Bike(int switchNumber) {
        this.switchNumber = switchNumber;
    }

    @Override
    public void drive(int distance) {
        System.out.println("Rower przejechał: " + distance);
        millage += distance;
    }
}
