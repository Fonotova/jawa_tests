package com.company.Lesson09;

import com.company.Lesson08.Abonent;
import com.company.Lesson08.WrongAgeException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.company.Lesson08.Gender.FEMALE;
import static com.company.Lesson08.Gender.MALE;

public class ListDemo {
    public static void main(String[] args) throws WrongAgeException {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(23);
        list.add(0);
        list.add(76);
        list.add(-98);
        list.add(-76);
        list.add(4);

        System.out.println(list.size());
        System.out.println(list.get(0));
        // System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        List<String> listStr = new ArrayList<>();
        listStr.add("Hello");
        listStr.add("Vika");
        listStr.add("qwerty");
        listStr.add("Hello");
        listStr.add("Hello");
        Collections.sort(listStr);
        System.out.println(listStr);
        Comparator<Integer> sortRule = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == o2)
                    return 0;

                if (o1 < o2)
                    return 1;

                return -1;
            }
        };

        List<String> listStr1 = new ArrayList<>();
        listStr.add("Hello");
        listStr.add("Zet");
        listStr.add("Ivan");
        listStr.add("Peter");
        listStr.add("Василий");

        Collections.sort(listStr);
        System.out.println(listStr);

        Abonent abonent1 = new Abonent();
        abonent1.setFirstName("Ivan");
        abonent1.setAge(23);
        abonent1.setGender(MALE);

        Abonent abonent2 = new Abonent();
        abonent2.setFirstName("Kolya");
        abonent2.setAge(65);
        abonent2.setGender(MALE);

        Abonent abonent3 = new Abonent();
        abonent3.setFirstName("Helen");
        abonent3.setAge(18);
        abonent3.setGender(FEMALE);

        List<Abonent> abonents = new ArrayList<>();
        abonents.add(abonent1);
        abonents.add(abonent2);
        abonents.add(abonent3);

//        Collections.sort(abonents);
        abonents.sort((a1, a2) -> {
            if (a1.getAge() == a2.getAge())
                return 0;

            if (a1.getAge() < a2.getAge())
                return 1;

            return -1;
        });

        abonents.sort((a1, a2) -> {
            if (a1.getFirstName().compareTo(a2.getFirstName()) == 0)
                return 0;

            if (a1.getFirstName().compareTo(a2.getFirstName()) < 0)
                return -1;
                return 1;
        });

        abonents.sort(Comparator.comparingInt(Abonent::getAge));
        System.out.println(abonents);


    }
}
