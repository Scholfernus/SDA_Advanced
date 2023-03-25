package org.example.pl.SDA.pol141.JA.Day2.Interfaces;

public class FrenchTranslator implements Translator{
    @Override
    public String sayHello() {
        return "Bonjour";
    }

    @Override
    public String sayGoodbye() {
        return "Au revoir";
    }
}
