package org.example.pl.SDA.pol141.JA.Day1.hermetization;

final public class Battery {        // klasa nie może być dziedziczona
    public static final int CONSUMPTION_FACTOR = 20;
    private final double capacity;
    private double levelBattery;

    public double getCapacity() {
        return capacity;
    }

    public Battery(double capacity) {
        this.capacity = capacity;
        this.levelBattery = 0;
    }

    public double getLevelBattery() {
        return levelBattery;
    }

    public boolean drive(double distance) {
        double consumption = distance * CONSUMPTION_FACTOR;
        levelBattery -= consumption;
        if (levelBattery >= consumption) {
            levelBattery -= consumption;
            return true;
        } else {
            return false;
        }
    }

    public void recharge() {
        levelBattery = capacity;
    }

    public boolean isEmpty() {
            return levelBattery == 0;
        }
    }

