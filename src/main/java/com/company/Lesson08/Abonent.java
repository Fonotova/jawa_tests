package com.company.Lesson08;

public class Abonent {
    private String firstName;
    private Gender gender; // 'f', 'm'
    private int age;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws  WrongAgeException{
        if (age > 0)
            this.age = age;
        else
            throw new WrongAgeException (age);
            //throw new RuntimeException("Wrong age: " + age);
            //System.out.println("Wrong age: " + age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstName + ":" + gender;
    }
}

