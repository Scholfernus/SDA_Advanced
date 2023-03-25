package org.example.pl.SDA.pol141.JA.Day2.Enums;

import org.example.pl.SDA.pol141.JA.Day2.Interfaces.EnglishTranslator;
import org.example.pl.SDA.pol141.JA.Day2.Interfaces.FrenchTranslator;
import org.example.pl.SDA.pol141.JA.Day2.Interfaces.PolishTranslator;
import org.example.pl.SDA.pol141.JA.Day2.Interfaces.Translator;

public enum Languages {
    POLISH(new PolishTranslator()),
    ENGLISH(new EnglishTranslator()),
    FRENCH(new FrenchTranslator());
    private Translator translator;

    Languages(Translator translator) {
        this.translator = translator;
    }

    public Translator getTranslator() {
        return translator;
    }
}
