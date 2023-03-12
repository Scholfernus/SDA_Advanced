package org.example.pl.SDA.pol141.JA.Day1.aggregation;

public class DemoAggregation {
    public static void main(String[] args) {
        Person man = new Person();
        HumanBody body = new HumanBody(man);
//        body.heart = new Heart(); // ten element jest niepoprawny
    }
}
