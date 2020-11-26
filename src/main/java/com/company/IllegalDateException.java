package com.company;

public class IllegalDateException extends Exception{
    private int number;

    public IllegalDateException(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
