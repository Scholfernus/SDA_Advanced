package org.example.pl.SDA.pol141.JA.Day3.Lists;

import java.util.ArrayList;
import java.util.List;

public class ListTask {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Ewa");
        names.add("Karol");

        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }
        names.remove("Karol");
        String nameToReplace = "Ewa";
        if (names.contains(nameToReplace)) {
            names.remove(names.lastIndexOf(nameToReplace));
            names.add(1, "Ania");
        }
        final int index = names.indexOf("Adam");
        if (index > -1){
            names.set(index,"Robert");
        }
            System.out.println(names);
        names.addAll(1,List.of("Ola", "Krzysiek"));
        System.out.println(names);
        List<String> subList = names.subList(0, 2);
        subList.add("Edward");
        System.out.println(names);
        List<String> copyOfSublist = new ArrayList<>(subList);
        copyOfSublist.add("Karoline");
        System.out.println(names); // tutaj nie będzie Karoliny
        System.out.println(copyOfSublist); //tutaj jest Karolina

    }
}
