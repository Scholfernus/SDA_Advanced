package org.example.ZadaniaProgramowaniePDF.MyProjects;

public class Occupation extends Person {
    private String occupation;

    public Occupation(String name, String city, int age, String sex, String occupation) {
        super(name, city, age, sex);
        this.occupation = occupation;
    }

    public String getDiscipline() {
        return occupation;
    }

    public void setDiscipline(String discipline) {
        this.occupation = discipline;
    }

    @Override
    public String toString() {
        return "Occupation{" +
                "discipline='" + occupation + '\'' +
                '}';
    }
}
