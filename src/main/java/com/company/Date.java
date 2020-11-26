package com.company;

import java.util.Objects;

public class Date {
    private int day;
    private int month;
    private int year;
    private Date date;

    public Date() {
        day = 1;
        month = 1;
        year = 1970;
    }


    public Date(int day, int month, int year) throws IllegalDateException {
        if (day <= 0 || day > 31) {
            System.out.println("Error day");throw new IllegalDateException(day);}
        this.day = day;
        if (month < 1 || month > 12) {
            System.out.println("Error month");
            throw new IllegalDateException(month);
        }
        ;
        this.month = month;
        if (year % 4 != 0) {
            if ((month == 2) & (day > 28)) {
                System.out.println("February has 28 days"); throw new IllegalDateException(day);}
            this.year = year;
        } else {
            if ((year % 100 == 0) & (year % 400 == 0)) this.year = year;
        }
        if ((month == 2) & (day > 29)) {System.out.println("High-rise February has 29 days");
        throw new IllegalDateException(day);}
    }


// public Date (Date date) {
//     this.date = date;
// }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void set(int d, int m, int y) throws IllegalDateException {
        if (d > 31) {
            throw new IllegalDateException(d);
        }
        System.out.println("Error. Please change the day. Day must be 1-31");
        if (d <= 0)
            throw new IllegalDateException(d);
        //System.out.println("Error. Please change the day. Day must be 1-31");
        day = d;
        month = m;
        year = y;

    }

    public void set(Date date) {
        day = date.day;
        month = date.month;
        year = date.year;
    }

    @Override
    public String toString() {
        String format = String.format("%02d.%02d.%04d", getDay(), getMonth(), getYear());
        return format;
    }

    public void print() {

        System.out.println(toString());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day == date.day &&
                month == date.month &&
                year == date.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
