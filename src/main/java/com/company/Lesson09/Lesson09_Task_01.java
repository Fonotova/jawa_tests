package com.company.Lesson09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lesson09_Task_01 {
    public static void main(String[] args) {
        String names[] = new String[]{"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex"};
        List<String> listNames = new ArrayList<>(Arrays.asList(names));
        listNames.add("one");
        listNames.remove("Helen");
        System.out.println(listNames);
        Collections.sort(listNames);
        System.out.println(listNames);
        Collections.sort(listNames, Collections.reverseOrder());
        //  listNames.add("Vika");
        System.out.println(listNames);

        System.out.printf("Has collection Andry name ? - "+ listNames.contains("Andry"));


        // listNames.add("Philip");
        // listNames.add("Joseph");
        //  listNames.add("Leon");
        // System.out.println(listNames);

    }
}
