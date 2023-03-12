package org.example.pl.SDA.pol141.JA.Day1.abstractions;

public class Truck extends Car{
    private double loading;

    @Override
    public void drive(int distance) {
        System.out.println("Driving distance " + distance);
        millage += distance;
    }
}
