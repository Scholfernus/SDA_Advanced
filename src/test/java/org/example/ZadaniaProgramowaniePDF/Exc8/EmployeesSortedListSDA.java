package org.example.ZadaniaProgramowaniePDF.Exc8;

import org.example.ZadaniaProgramowaniePDF.Exc7.Employee;
import org.example.ZadaniaProgramowaniePDF.Exc7.EmployeeSDA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesSortedListSDA {
    public static void main(String[] args) {
        List<EmployeeSDA> employees = new ArrayList<>();
        employees.add(new EmployeeSDA(1, 3000, "John"));
        employees.add(new EmployeeSDA(2, 15000, "Mark"));
        employees.add(new EmployeeSDA(3, 40000, "Bill"));
        List <EmployeeSDA>employeesSorted = employees.stream()
                .sorted(Comparator.comparing(EmployeeSDA::getName))
                .collect(Collectors.toList());
    }
}
