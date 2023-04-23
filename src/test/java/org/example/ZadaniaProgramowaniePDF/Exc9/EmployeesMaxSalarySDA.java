package org.example.ZadaniaProgramowaniePDF.Exc9;

import org.example.ZadaniaProgramowaniePDF.Exc7.EmployeeSDA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class EmployeesMaxSalarySDA {
    public static void main(String[] args)

    {
        List<EmployeeSDA> employees = new ArrayList<>();
        employees.add(new EmployeeSDA(1, 3000, "John"));
        employees.add(new EmployeeSDA(2, 15000, "Mark"));
        employees.add(new EmployeeSDA(3, 40000, "Bill"));
        Integer max = employees.stream().map(EmployeeSDA::getSalary)
                .max(Comparator.naturalOrder()).orElseThrow(NoSuchElementException::new);
        System.out.println(max);
    }
}
