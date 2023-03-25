package org.example.pl.SDA.pol141.JA.Day2.Interfaces;

import java.util.Random;

public class PolishTranslator implements Translator{
    private static String[]HELLO_MSG = {"Cześć", "Dzień dobry", "Sie ma", "Jak się masz"};
    private static String[]GOODBYE_MSG = {"Narka", "Do widzenia", "Do zobaczenia", "Narazie"};
    private static Random random = new Random();
    @Override
    public String sayHello() {
        return HELLO_MSG[random.nextInt(HELLO_MSG.length)];
    }

    @Override
    public String sayGoodbye() {
        return GOODBYE_MSG[random.nextInt(GOODBYE_MSG.length)];

    }
}
