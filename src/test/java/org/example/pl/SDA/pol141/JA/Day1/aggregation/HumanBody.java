package org.example.pl.SDA.pol141.JA.Day1.aggregation;

public class HumanBody {
    public final Person mother; // asocjacja
    public final Heart heart; //kompozycja
    public HumanBody(Person mother) {
        this.mother = mother;
        this.heart = new Heart();
    }
}
