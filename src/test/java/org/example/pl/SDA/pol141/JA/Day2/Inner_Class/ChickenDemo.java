package org.example.pl.SDA.pol141.JA.Day2.Inner_Class;

public class ChickenDemo {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        var egg1 = chicken.new ChickenEgg();
        var egg2 = chicken.new ChickenEgg();
        System.out.println(chicken.getEggCounter());
    }
}
