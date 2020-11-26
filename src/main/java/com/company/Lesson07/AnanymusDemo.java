package com.company.Lesson07;

public class AnanymusDemo {
    public static void main(String[] args) {
        Profile musician = new Profile(){
            @Override
            public void info() {
                System.out.println("I am a musician");
            }
        };
        musician.info();
        Profile footboller = () -> System.out.println("I am footboller");
        footboller.info();
    }
 }
