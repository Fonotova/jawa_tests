package com.company.Lesson08;

import com.company.Date;

public class ExceptionDemo {
    public static void main(String[] args) {
        Abonent abonent = new Abonent();
        abonent.setFirstName("Vasya");
        try {
            abonent.setAge(-10);
            System.out.println("________");

        } catch (WrongAgeException e) {
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

        try {
            Date date = new Date(0, 23, 2020);
            System.out.println(date);
        } catch (Exception e) {
            System.out.println("Wrong day!!");

        }


    }
}
