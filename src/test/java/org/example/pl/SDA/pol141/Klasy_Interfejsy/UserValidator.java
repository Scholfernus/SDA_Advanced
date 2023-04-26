package org.example.pl.SDA.pol141.Klasy_Interfejsy;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserValidator {
    public String[] validateEmails(String email, String alternativeEmails) {
        class Email {
            private String email;

            public Email(String addEmail) {
                if (addEmail == null || addEmail.isEmpty() || !validate(addEmail)) {
                    this.email = "unknown";
                } else {
                    this.email = addEmail;
                }
            }
        }
        Email email1 = new Email(email);
        Email email2 = new Email(alternativeEmails);
        return new String[]{email1.email, email2.email};
    }

    public static final Pattern VALID_EMAILS_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]  {2,6}$", Pattern.CASE_INSENSITIVE);


    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAILS_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }


}