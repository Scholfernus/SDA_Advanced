package org.example.ZadaniaProgramAdvancedPDF.Exc2;

public class Person {
    private String name, address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person student = new Student("Mike",2000, 1500);
        Person staff = new Staff("Computer IT", 4500f);
        System.out.println(student);
        System.out.println(staff);
        Person person = new Person("Filip Morris", "Kamczacka");
        System.out.println(person);
    }
}
