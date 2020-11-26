package com.company;

import java.util.Scanner;

public class MaxMinAvr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input please 3 numbers:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double third = scanner.nextDouble();
        double max = first;
        if (second > first) max = second;
        double min = first;
        if (third > second) max = third;
        if (third < min) min = third;
        System.out.println("max = "+Double.toString(max));
        System.out.println("min = "+Double.toString(min));
        System.out.println("Avr = " + Double.toString((first+second+third)/3));

    }
}
