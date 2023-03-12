package org.example.pl.SDA.pol141.JA.Day1.abstractions;
import org.example.pl.SDA.pol141.JA.Day1.Inheritance.Scooter;

public class Main {
    public static void main(String[] args) {
        Scooter scooter = new Scooter("6786789", 9);
        Vehicle vehicle = new Truck();
        vehicle.drive(10);
        System.out.println(vehicle.millage);
        Vehicle bicycle = new Bike(9);
        bicycle.drive(35);
        System.out.println(bicycle.millage);
    }
}
