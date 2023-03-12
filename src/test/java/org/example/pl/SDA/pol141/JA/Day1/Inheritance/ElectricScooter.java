package org.example.pl.SDA.pol141.JA.Day1.Inheritance;

public class ElectricScooter extends Scooter {
    public final double power;

    public ElectricScooter(String serialNumber, double weight, double power) {
        super(serialNumber, weight);
        this.power = power;
        this.millage =0;
//        this.setMillage(0);
    }

//    public ElectricScooter() {
//        super(serialNumber, weight);
//    }

    @Override
    public String toString() {
        return "ElectricScooter{" +
                "power=" + power +
                ", serialNumber='" + serialNumber + '\'' +
                ", weight=" + weight +
                '}';
    }
}
