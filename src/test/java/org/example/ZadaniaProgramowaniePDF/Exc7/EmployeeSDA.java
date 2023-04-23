package org.example.ZadaniaProgramowaniePDF.Exc7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeSDA {
    private Integer id;
    private Integer salary;
    private String name;

    public EmployeeSDA(Integer id, Integer salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EmployeeSDA{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<EmployeeSDA> employees = new ArrayList<>();
        employees.add(new EmployeeSDA(1, 30000, "John"));
        employees.add(new EmployeeSDA(2, 15000, "Mark"));
        employees.add(new EmployeeSDA(3, 40000, "Bill"));
        EmployeeSDA employee = employees.stream().filter(Objects::nonNull)
                .filter(e -> e.getSalary() > 30000).findFirst().orElseThrow(() -> new RuntimeException("Not found"));
        System.out.println(employee.getName());
    }
}
