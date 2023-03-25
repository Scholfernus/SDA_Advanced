package org.example.pl.SDA.pol141.JA.Day2.Enums;

public class Demo_Enums {
    public static void main(String[] args) {
        String weekDay = "Monday";
        WeekDay day = WeekDay.MONDAY;
        WeekDay birthDay = day;
        System.out.println(day);
        Languages polish = Languages.POLISH;
        System.out.println(polish);
    }
}
