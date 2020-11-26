package com.company.Lesson10;

import com.company.Lesson08.Abonent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        Abonent abonent1 = new Abonent();
        abonent1.setId(123);
        abonent1.setFirstName("Vika");

        Abonent abonent2 = new Abonent();
        abonent2.setId(5);
        abonent2.setFirstName("Rita");

        Map<Integer,Abonent> abonents = new HashMap<>();
        abonents.put (abonent1.getId(),abonent1);//123
        abonents.put(abonent2.getId(), abonent2);//5
        System.out.println(abonents.get(123));
        System.out.println(abonents.get(5));
        System.out.println(abonents);

        Set<Integer> keys = abonents.keySet();
        Abonent abonent = abonents.get(keys);
        //System.out.println(abonent.getFirstName());

    }
}
