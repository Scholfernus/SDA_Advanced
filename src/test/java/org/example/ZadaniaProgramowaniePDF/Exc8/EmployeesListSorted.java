package org.example.ZadaniaProgramowaniePDF.Exc8;

import org.example.ZadaniaProgramowaniePDF.Exc7.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeesListSorted {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 25000));
        employees.add(new Employee(2, "Henry", 30000));
        employees.add(new Employee(3, "Richardson", 45098));
        Employee employee4 = (null);
        employees.add(employee4);
        List<Employee> employeeListSorted = employees.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        for (var elem: employeeListSorted) {

            System.out.println(elem);
        }

        System.out.println(employeeListSorted);
    }
}
