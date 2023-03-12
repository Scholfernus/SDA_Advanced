package org.example.pl.SDA.pol141.JA.Day1.value_object;

public class DemoPower {
    public static void main(String[] args) {
        Power power = new Power(10);
        System.out.println(power);
        Power doublerPower = power.mulByScalar(2);
        System.out.println(doublerPower);
        System.out.println(power.addPower(doublerPower));
        Power inKW = Power.ofKW(2);
        System.out.println(inKW);
       // System.out.println(inKW.);


    }
}
