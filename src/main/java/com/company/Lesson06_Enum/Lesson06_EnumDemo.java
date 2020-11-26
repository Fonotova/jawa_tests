package com.company.Lesson06_Enum;

public class Lesson06_EnumDemo {

    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.FRIDAY;
        today.getDayBeforeYesterday();
        today.getDayAfterTomorrow();
    }
}



