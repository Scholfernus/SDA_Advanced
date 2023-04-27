package org.example.ZadaniaProgramowaniePDF.MyProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class People_Main {
    public static void main(String[] args) {
        List<Sport> teams = new ArrayList<>();
        Person sportsMan = new Sport("Paul", "New York", 33, "Man", "Swimming");
        teams.add(0, new Sport("Marie", "Boston", 45, "Woman", "Box"));
        teams.add(1, new Sport("Monika", "Washington", 22, "Woman", "Biathlon"));
        teams.add(2, new Sport("Andrew", "Luisianna", 21, "Man", "Kickboxing"));
        Occupation occupation = new Occupation("Peter", "Alabama", 30, "Man", "Tennis");
        System.out.println(teams);
        System.out.println(sportsMan);
        System.out.println(teams.stream().sorted().collect(Collectors.toList()));
        System.out.println(teams);
        Person getAge = new Person();
        teams.stream().count();
        System.out.println(teams);
        teams.add(new Sport("John", "Chicago", 28, "Man", "Football"));
//        teams.remove(1);
        for (Object elem : teams) {
            System.out.println(elem.toString());
        }
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i).toString());
        }
        Collections.sort(teams);
        System.out.println(teams);
        boolean handball = teams.contains("Handball");
        System.out.println(handball);
        int index = teams.lastIndexOf("Man");
        index = -1;
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).name.equals("Andrew")) {
                index = i;
            }
        }
        System.out.println(index);
        List<Sport> subList = teams.subList(1, 3);
        System.out.println(subList);
        int size = teams.size();
        System.out.println(size);
        Object[] objects = teams.stream().toArray();
        System.out.println(Arrays.toString(objects));
        for (Person person : teams) {
            System.out.println(person.name);
        }
        teams.stream().map(Person::getName).forEach(System.out::println);
        teams.get(0).setName("Suzanne");
        System.out.println("Nowe imię dla 1 indeksu: " + teams.get(0).name);
        for (Person person : teams) {
            if (person.getName().equals("Monika")){
                person.setAge(25);
                break;
            }
        }
        System.out.println(teams.get(2).age);
    }
}
