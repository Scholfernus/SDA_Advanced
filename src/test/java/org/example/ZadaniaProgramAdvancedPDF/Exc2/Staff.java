package org.example.ZadaniaProgramAdvancedPDF.Exc2;

public class Staff extends Person{
    String specialization;
    double salary;

    public Staff(String specialization, double salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public Staff(String name, String address, String specialization, double salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" + "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }
}
