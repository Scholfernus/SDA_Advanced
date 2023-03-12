package org.example.pl.SDA.pol141.JA.Day1.abstractions;
import org.example.pl.SDA.pol141.JA.Day1.aggregation.Person;

public class OwnerCar extends Car{
    private final Person owner;
    public OwnerCar(Person owner){
        this.owner = owner;
    }
    @Override
    public void drive(int distance) {

    }
}
