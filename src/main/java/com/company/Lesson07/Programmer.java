package com.company.Lesson07;

public class Programmer  extends Person{
    public Programmer(String name){
        super(name);
    }

    @Override
    public void info() {
        super.info();
System.out.println(("I am a programmer"));
    }
    public  void ciding(){
        System.out.println(("I build application"));
    }
}
