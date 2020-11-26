package com.company;

public class DateTimeDemo {
    public static void main(String[] args) throws IllegalDateException {
        //Date date = new Date(1, 3, 2020);
        //date.set(8, 12, 12);
        // DateTime dateTime = new DateTime();
        // dateTime.print();
       // date.print();
        System.out.println("+++++++");
        Date[] dates = new Date[4];
        try {
            dates[0] = new Date(-1, 2, 2080);
        } catch (IllegalDateException d) {if (d.getNumber()<0) System.out.println("Day must not be -1 ");
        }
        ;
        try {
            dates[1] = new Date(30, 2, 14);
        } catch (IllegalDateException d) {if (d.getNumber()>29) System.out.println("In February 28 days, it is not "+ d);
        }
        ;
        try {
            dates[2] = new Date(29, 02, 2019);
        } catch (IllegalDateException d) {
        }
        ;
        try {
            dates[2] = new Date(31, 13, 2019);
        } catch (IllegalDateException d) {
        }
        ;
        try {
            dates[2] = new Date(0, 02, 2019);
        } catch (IllegalDateException d) {
        }
        ;
        try {
            dates[2] = new Date(0, 02, 2019);
        } catch (IllegalDateException d) {
        }
        ;
        System.out.println("+++++++");

        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i]);
        }

    }
}
