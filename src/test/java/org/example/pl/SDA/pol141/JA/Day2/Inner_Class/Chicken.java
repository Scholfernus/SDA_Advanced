package org.example.pl.SDA.pol141.JA.Day2.Inner_Class;

public class Chicken {
    private int eggCounter;
    class ChickenEgg{
        public ChickenEgg() {
            eggCounter++;
        }
    }

    public int getEggCounter() {
        return eggCounter;
    }
}
