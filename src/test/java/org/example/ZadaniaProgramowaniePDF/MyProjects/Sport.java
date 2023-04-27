package org.example.ZadaniaProgramowaniePDF.MyProjects;

public class Sport extends Person implements Comparable<Sport>{
    private String kindOfSport;

    public Sport(String name, String city, int age, String sex, String kindOfSport) {
        super(name, city, age, sex);
        this.kindOfSport = kindOfSport;
    }

    public String getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(String kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "kindOfSport='" + kindOfSport + '\'' +
                '}';
    }

    @Override
    public int compareTo(Sport o) {
        return this.kindOfSport.compareTo(o.kindOfSport);
    }
}
