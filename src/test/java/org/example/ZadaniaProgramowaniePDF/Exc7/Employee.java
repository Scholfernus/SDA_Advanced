package org.example.ZadaniaProgramowaniePDF.Exc7;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) throws Exception {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(1, "John", 25000);
        Employee employee4 = (null);
        employees.add(employee1);
        employees.add(new Employee(2, "Henry", 30000));
        employees.add(new Employee(3, "Richardson", 45098));
        employees.add(employee4);
        Employee firstWithSalary3plus = employees.stream()
                .filter(s -> s != null)
                .filter(s->s.getSalary()>=30000)
                .findFirst().orElseThrow(() ->new Exception("Nie znaleziono pracownika"));
        System.out.println(firstWithSalary3plus.getName());
    }
}
