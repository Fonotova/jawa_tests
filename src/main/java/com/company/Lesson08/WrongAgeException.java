package com.company.Lesson08;

public class WrongAgeException  extends Exception{
    private int wrongAge;
    public WrongAgeException(int wrongAge){
        this.wrongAge = wrongAge;

    }
}
