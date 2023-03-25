package org.example.pl.SDA.pol141.JA.Day2.Enums;

import org.example.pl.SDA.pol141.JA.Day2.Interfaces.*;

import java.util.Scanner;
public class LanguagesDemo1 {
    static Console console = new StdTerminal();

    public static void main(String[] args) {
        console.print("Choose your language");
        for (var language : Languages.values()
        ) {
            console.print(language.name());
        }
        String languageAsString = console.read();
        var language = Languages.valueOf(languageAsString.toUpperCase());
        Translator translator;
        switch (language){
            case FRENCH:
                translator = new FrenchTranslator();
                break;
            case POLISH:
                translator = new PolishTranslator();
                break;
            case ENGLISH:
                translator = new EnglishTranslator();
                break;
        }



        console.print(Languages.values().toString());
    }
}
