package org.example.pl.SDA.pol141.JA.Day2.Enums;

import org.example.pl.SDA.pol141.JA.Day2.Interfaces.Console;
import org.example.pl.SDA.pol141.JA.Day2.Interfaces.StdTerminal;
import org.example.pl.SDA.pol141.JA.Day2.Interfaces.Translator;

public class LanguagesDemo2 {
    static Console console = new StdTerminal();
    public static void main(String[] args) {
        console.print("Choose your language");
        for (var language : Languages.values()
        ) {
            console.print(language.name());
        }
        String languageAsString = console.read();
        Languages language;
        try {

            language = Languages.valueOf(languageAsString.toUpperCase());
        }
        catch (IllegalArgumentException exception){
            console.print("You're typed wrong language. Choose again");
            return;
        }
        console.print(language.ordinal() + "");
        Translator translator = language.getTranslator();
        console.print(translator.sayHello());
        console.print(translator.sayGoodbye());

    }
}
