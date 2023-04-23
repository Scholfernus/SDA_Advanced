package org.example.pl.SDA.pol141.JA.Exc1;

public class KlasaStringExample {
    public static void main(String[] args) {
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println("abc");
        String cde = "c,d,e";
        System.out.println("abc" + cde);
        String c = "abc".substring(2,3);
        String d = cde.substring(1, 2);
        System.out.println(str);
        int index = cde.lastIndexOf(",");
        System.out.println(index);
        System.out.println(cde.length());
        System.out.println(c);
        System.out.println(d);
    }
}
