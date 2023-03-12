package org.example.pl.SDA.pol141.JA.Day1.aggregation;
//przykład agragatu
public class Customer {
    public final String firstName;
    public final String lastName;
    public final Address contactAddress;
    public final Address deliveryAddress;

    public Customer(String firstName, String lastName, Address contactAddress, Address deliveryAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactAddress = contactAddress;
        this.deliveryAddress = deliveryAddress;
    }
}

