package org.example.pl.SDA.pol141.JA.Day5.Functional;

import java.util.List;

class Employee {
    Bonus bonus;
    String name;
    double salary;

    public Employee(Bonus bonus, String name, double salary) {
        this.bonus = bonus;
        this.name = name;
        this.salary = salary;
    }
}

public class BonusDemo {
    public static void main(String[] args) {
        Bonus bonus1 = (double salary) -> 200;
        Employee e3 = new Employee(bonus1, "Robert", 5000);
        Bonus bonus2 = salary -> salary * 1.05; // nie potrzeba wpisywać double salary
        Employee e4 = new Employee(bonus2, "Krzysztof",4800);
        Employee e1 = new Employee(new Bonus() {
            @Override
            public double calculate(double salary) {
                return 100;
            }
        }, "Karol", 4000);
        Employee e2 = new Employee(new Bonus() {
            @Override
            public double calculate(double salary) {
                return salary * 0.05;
            }
        }, "Ewa", 4300);
        List<Employee> firm = List.of(e1, e2);
        for (var e : firm) {
            System.out.print(e.name + " ");
            System.out.println(e.bonus.calculate(e.salary));
        }


    }
}
