package org.example.pl.SDA.pol141.JA.Day2.Interfaces;

public class Demo {
    public static void main(String[] args) {
        Translator translator1 = new FrenchTranslator();
        Translator translator = new PolishTranslator();

        System.out.println(translator.sayHello());
        System.out.println(translator1.sayHello());
        System.out.println(translator.sayGoodbye());
        System.out.println(translator1.sayGoodbye());

        Console console = new StdTerminal();
        System.out.println("Jak masz na imię");

        final String name = console.read();
        console.print(translator.sayHello() + " " + name);
        console.print(translator.sayGoodbye() + " " + name);
    }
}
