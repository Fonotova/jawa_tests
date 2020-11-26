package com.company.Lesson03;

import java.util.Scanner;

public class String_Task_05 {

    public static String inputString() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.printf("%s \n", inputString);
        return inputString;
    }

    public static String changeString(String str) {
        String newString = "";
        char[] arrChars;
        char[] newArrChars = new char[str.length()];
        arrChars = str.toCharArray();

        for (int i = 0 ; i <str.length(); i++) {
            newArrChars[i] = arrChars[str.length()-i-1];
        }
        newString = String.valueOf(newArrChars);
        System.out.println(newString);
        return newString;
    }

    public static void main(String[] args) {
        changeString(inputString());
    }
}
