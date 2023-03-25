package org.example.pl.SDA.pol141.JA.Day1.value_object;

public class Power {
    public static final String POWER_UNIT_W = "W";
    public static final String POWER_UNIT_KW = "kW";
    public final double value;
    public final String unit;

    public Power(double value) {
        this.value = value;
        this.unit = "Watt";
    }

    public static Power ofKW(double value) {
        return new Power(value * 1000, POWER_UNIT_KW);
//        return new Power(value * 1000);
    }

    private Power(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public Power mulByScalar(double f) {
        return new Power(value * f);
    }

    public Power addPower(Power add) {
        if (unit.equals(add.unit)) {
            return new Power(add.value + value, unit);
        }
        if (unit.equals(POWER_UNIT_W) && add.unit.equals(POWER_UNIT_KW)) {
            return new Power(value + add.value * 1000, unit);
        }
        if (unit.equals(POWER_UNIT_KW) && add.unit.equals(POWER_UNIT_W)) {
            return new Power(value + add.value/1000, unit);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Power{" + value + " " + unit + '}';
    }
}
