package com.company.Lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamAPIDemo {
    public static void main(String[] args) {
        String names[] = new String[]{"Peter", "Helen", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex"};
        List<String> listNames = new ArrayList<>(Arrays.asList(names));
        Arrays.stream(names)
                .filter(s -> s.charAt(0) == 'A')
                .forEach(System.out::println);
        listNames.stream()
                .distinct()
                .sorted()
                .forEach((System.out::println));
    }
}
