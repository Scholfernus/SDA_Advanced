package org.example.pl.SDA.pol141.JA.Day1.Inheritance;

public class Car extends Vehicle{
    public final int wheelNumber;

    @Override
    public String toString() {
        return "Car{" +
                "wheelNumber=" + wheelNumber +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public Car(double weight, String name, int wheelNumber) {
        super(weight, name);
        this.wheelNumber = wheelNumber;
    }
}
