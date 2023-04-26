package org.example.pl.SDA.pol141.Klasy_Interfejsy;

public class Validator_Main {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String[]results = userValidator.validateEmails("Phih@","Yahoo.com" );
        System.out.println(results[0]);
        System.out.println(results[1]);
    }
}
