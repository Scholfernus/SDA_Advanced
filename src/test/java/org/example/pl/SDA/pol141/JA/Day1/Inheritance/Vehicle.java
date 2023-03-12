package org.example.pl.SDA.pol141.JA.Day1.Inheritance;

public class Vehicle {
    public final double weight;
    public final String name;

    public void drive(double distance){
        System.out.println("Odległość" + distance);
    }

    public Vehicle(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
