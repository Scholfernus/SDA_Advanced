package org.example.pl.SDA.pol141.JA.Day2.Anonymous;

import org.example.pl.SDA.pol141.JA.Day2.Interfaces.Console;
import org.example.pl.SDA.pol141.JA.Day2.Interfaces.Translator;

public class Demo {
    public static void main(String[] args) {
        Translator spanishTranslator = new Translator() {
            @Override
            public String sayHello() {
                return "Hola";
            }

            @Override
            public String sayGoodbye() {
                return "Adios";
            }
        };
//        System.out.println(spanishTranslator.sayHello());
//        System.out.println(spanishTranslator.sayGoodbye());

        Console console = new Console() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }

            @Override
            public String read() {
                return null;
            }
        };
        console.print(spanishTranslator.sayHello());
        console.print(spanishTranslator.sayGoodbye());
    }
}
