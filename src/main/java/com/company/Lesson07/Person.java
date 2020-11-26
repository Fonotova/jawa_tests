package com.company.Lesson07;

public class Person implements Profile {

    private String name;

    public Person(String name) {
        this.name = name;
    }


    public void info() {
        System.out.println("I am a person "+name);
    }

    public static void about() {
        System.out.println("Static -person");
    }
}

