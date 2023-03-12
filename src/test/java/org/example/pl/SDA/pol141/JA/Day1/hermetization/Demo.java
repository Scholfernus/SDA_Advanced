package org.example.pl.SDA.pol141.JA.Day1.hermetization;

public class Demo {
    public static void main(String[] args) {
        Battery battery = new Battery(1000);
        battery.recharge();
        System.out.println(battery.getLevelBattery());
        System.out.println("Can drive ? " + battery.drive(15));
        System.out.println(battery.getLevelBattery());
        System.out.println("Can drive ? " + battery.drive(55));
        System.out.println(battery.getLevelBattery());
        System.out.println("Can drive ? " + battery.drive(10));
    }
}
