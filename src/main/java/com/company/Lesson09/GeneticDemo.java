package com.company.Lesson09;

import java.util.List;

public class GeneticDemo {
    public static void main(String[] args) {
        List<String> list;
        Object universal = "Hello";
        universal = 1;
        universal = "Ivan";
        //  universal = new Abonet();
        if (universal instanceof String)
            universal = ((String) universal).toUpperCase();

        Pair <String,Integer> pair = getPair();
        String value1 = pair.getValue1();
        Integer value2 = pair.getValue2();
System.out.println(value1);
    }
       // System.out.println(universal);
        public static Pair getPair () {
            Pair<String,Integer> pair = new Pair<>();
            pair.setValue1("Hello");
            pair.setValue2(2);
            return pair;
        }


    }

