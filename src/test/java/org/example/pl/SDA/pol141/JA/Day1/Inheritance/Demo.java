package org.example.pl.SDA.pol141.JA.Day1.Inheritance;

public class Demo {
    public static void main(String[] args) {
        //utwórz obiekt klasy Scooter i ElectricScooter
        Scooter scooter = new Scooter("876kmn987", 10); //klasa bazowa, rodzic, super klasa
        ElectricScooter electricScooter = new ElectricScooter("125AB879",9,5000); // klasa wyprowadzona - podklasa

        Scooter[] store = new Scooter[10];
        store[0] = scooter;
        store[1] = electricScooter;
        ElectricScooter electricScooter1 = (ElectricScooter) store[1];
        System.out.println(electricScooter1.power);
        System.out.println(electricScooter.serialNumber.toString());

        scooter.millage = 10;

        scooter.toString();
        electricScooter.toString();
        "dklkdlakl".toString();

        Object object = new Object();
        System.out.println(object);
        System.out.println(object.hashCode());
        System.out.println(object.equals(object));

        Object[] all = new Object[5];
        all[0] = 3;
        all[1] = true;
        all[2] = "ABC";
        all[3] = scooter;
        all[4] = electricScooter;

        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
        int counter = 0;
        int stringCounter = 0;

        for (Object item : all) {
            System.out.println(item);
            if (item instanceof Scooter) {
                counter++;
            }
            if (item instanceof String) {
                stringCounter++;
            }
        }
        System.out.println("Liczba znaków: " + stringCounter);
        System.out.println("Liczba hulajnóg: " + counter);
        System.out.println("Dodawanie liczb 2 + 3 = " + (2 + 3) + " w tym przypadku dałem w nawiasie liczby (2 + 3)");
        System.out.println("Dodawanie liczb 2 + 3 = " + 2 + 3 + " w tym przypadku nie dałem w nawiasie liczb");

//        ElectricScooter[] scooters = new ElectricScooter[5];
//        scooters[0] = scooter;// W tym kierunku nie można już przypisać typu ogólnego
    }
}
