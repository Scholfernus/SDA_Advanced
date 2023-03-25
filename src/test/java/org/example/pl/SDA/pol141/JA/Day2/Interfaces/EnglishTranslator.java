package org.example.pl.SDA.pol141.JA.Day2.Interfaces;

public class EnglishTranslator implements Translator{
    @Override
    public String sayHello() {
        return "Hello";
    }

    @Override
    public String sayGoodbye() {
        return "Goodbye";
    }
}
