package org.example.pl.SDA.pol141.JA.Day5.Stream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.concurrent.atomic.AtomicInteger;
class Person {
    public String name;
    public int id;
    public double salary;

    public Person(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class StreamMapDemo {

    public static void main(String[] args) {
        StreamCreationDemo.namesStream()
                .limit(50)
                .map(name -> name.length())
                .filter(len -> len % 2 == 0)
                .forEach(System.out::println);

        StreamCreationDemo.namesStream()
                .limit(50)
                .map(name -> {
                    if (name.toUpperCase().endsWith("A")) {
                        return "Lady " + name;
                    } else {
                        return "Sir " + name;
                    }
                })
                .forEach(System.out::println);

        AtomicInteger id = new AtomicInteger(1);
        final List<Person> people = StreamCreationDemo.namesStream()
                .limit(100)
                .map(name -> new Person(name, id.getAndIncrement(), 4000 + id.get()))
                .toList();

        final int sum = StreamCreationDemo.namesStream()
                .limit(100)
                .mapToInt(name -> name.length())
                .sum();
        System.out.println("Suma długości imion: " + sum);


        final double salarySum = people.stream().mapToDouble(p -> p.salary).sum();
        System.out.println("Suma wszystkich pensji " + salarySum);
        final OptionalDouble optionalDouble = people.stream().filter(name -> name.salary < 5000).mapToDouble(p -> p.salary).average();
        optionalDouble.ifPresent(avg -> System.out.println("Obliczona średnia: " + avg));

    }
}
