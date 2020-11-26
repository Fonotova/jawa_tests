package com.company;

import java.util.Objects;

public class DateTime extends Date {
    private int hour;
    private int minute;
    private int second;

    public DateTime() {

    }

    public DateTime(int year, int month, int day, int hour, int minute, int second) throws Exception {
        super(day, month, year);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public DateTime(DateTime dateTime) throws Exception {
        super(dateTime.getDay(), dateTime.getMonth(), dateTime.getYear());

        this.hour = dateTime.getHour();
        this.minute = dateTime.getMinute();
        this.second = dateTime.getSecond();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String toString() {
        String format = String.format("%02d.%02d.%d %02d:%02d:%02d",
                getDay(), getMonth(), getYear(), getHour(), getMinute(), getSecond());

        return format;
    }
    public void print() {
        System.out.println(toString());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DateTime dateTime = (DateTime) o;
        return hour == dateTime.hour &&
                minute == dateTime.minute &&
                second == dateTime.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hour, minute, second);
    }
}
