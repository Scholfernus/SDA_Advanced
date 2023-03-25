package org.example.pl.SDA.pol141.JA.Day2.Exceptions;

public class EmailDemo {
    public static void main(String[] args) {
        Email email = Email.of(null, null, "", null);
        System.out.println(email);
    }
}
