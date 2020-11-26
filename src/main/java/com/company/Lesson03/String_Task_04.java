package com.company.Lesson03;

import java.util.Scanner;

public class String_Task_04 {
    public static String inputString() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.printf("Original string - %s \n", inputString);
        return inputString;
    }

    public static void deleteDigit(String str) {
        char[] arrChars;
        char[] arrDigit = new char[str.length()];
        char [] arrCharsNew = new char[str.length()];
        arrChars = str.toCharArray();
        int i ;
        int limit = str.length();
        //int charCount = str.length();
        for (i = 0; i <limit; i++) {
            if (arrChars[i] == '0' ||
                    arrChars[i] == '1'||
                    arrChars[i] == '2'||
                    arrChars[i] == '3'||
                    arrChars[i] == '4'||
                    arrChars[i] == '5'||
                    arrChars[i] == '6'||
                    arrChars[i] == '7'||
                    arrChars[i] == '8'||
                    arrChars[i] == '9') {
                arrDigit[i] = arrChars[i];
               // charCount--;
            }else {arrCharsNew[i]=arrChars[i];}

        }
        System.out.print("New string -      ");
        for (i = 0; i < (str.length()); i++) {
            System.out.print(arrCharsNew[i]);
        }
        System.out.println();
        System.out.print("Remote symbols -  ");
        for (i = 0; i < (str.length()); i++) {
            System.out.print(arrDigit[i]);
        }

    }

    public static void main(String[] args) {
        deleteDigit(inputString());
    }
}







