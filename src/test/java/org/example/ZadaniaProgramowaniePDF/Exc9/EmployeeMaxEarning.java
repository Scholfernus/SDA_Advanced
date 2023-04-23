package org.example.ZadaniaProgramowaniePDF.Exc9;

import org.example.ZadaniaProgramowaniePDF.Exc7.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class EmployeeMaxEarning {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 25000));
        employees.add(new Employee(2, "Henry", 30001));
        employees.add(new Employee(3, "Richardson", 450918));

        Double maxGain = employees.stream()
                .map(Employee::getSalary)
                .max(Comparator.naturalOrder())
                .orElseThrow(NoSuchElementException::new);
        System.out.println(maxGain);
    }
}
