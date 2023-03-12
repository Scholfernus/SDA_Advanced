package org.example.pl.SDA.pol141.JA.Day1.Inheritance;

public class Scooter {
    public final String serialNumber;
    public final double weight;

    protected int millage;

    public Scooter(String serialNumber, double weight) {
        this.serialNumber = serialNumber;
        this.weight = weight;
    }

    public void printSerial() {
        System.out.println("Numer seryjny: " + serialNumber);
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "serialNumber='" + serialNumber + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }
}
