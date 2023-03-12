package org.example.pl.SDA.pol141.JA.Exc1;

public class MainMessage {
    public static void main(String[] args) {
        smsMessage sms = new smsMessage();
        emailMessage email = new emailMessage();

        sms.howMany = 10;
        sms.content = "Otrzymałeś wiadomość mms";

        email.content = "Masz 3 wiadomości nieodczytane";
        email.howMany = 3;
    }
}
