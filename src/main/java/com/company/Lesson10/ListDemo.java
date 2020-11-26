package com.company.Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        String names[] = new String[]{"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex"};
        List<String> listNames = new ArrayList<>(Arrays.asList(names));
        listNames.remove("Andry");
        listNames.sort((a1, a2) -> {
            if (a1.compareTo(a2) == 0)
                return 0;
            if (a1.compareTo(a2) < 0)
                return -1;
            return 1;
        });
        for (int i = 0; i < listNames.size(); i++) {
            if (listNames.get(i).charAt(0) == 'A')
                System.out.println(listNames.get(i));
        }
        ListIterator <String> iterator = listNames.listIterator();
        while (iterator.hasNext()){}

        // Collections.sort(listNames);
        // System.out.println(listNames);
    }

}
