package org.example.pl.SDA.pol141.JA.Day3.Generic;

public class Box<T> {
    //konstruktor z parametrem generycznym - content
    private String addressFrom;
    private String addressTo;
    private T content;

    public Box(String addressFrom, String addressTo, T content) {
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.content = content;
    }
    //metoda generyczna zwracająca typ generyczny
    public T getContent(){
        return content;
    }
}
