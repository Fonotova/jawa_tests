package com.company;

public class Main {

    public static void main(String[] args) {
        for (int j=0; j<7; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
