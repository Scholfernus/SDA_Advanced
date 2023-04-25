package org.example.ZadaniaProgramAdvancedPDF.Exc2;

import org.example.ZadaniaProgramAdvancedPDF.Exc2.Person;

public class Student extends Person {
    String type;
    int year;
    double cost;

    public Student(String type, int year, double cost) {
        super();
        this.type = type;
        this.year = year;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Student{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", cost=" + cost +
                '}';
    }
}
