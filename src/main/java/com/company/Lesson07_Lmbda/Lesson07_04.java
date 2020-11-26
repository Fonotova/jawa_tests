package com.company.Lesson07_Lmbda;


public class Lesson07_04 {
    public static void main(String[] args) {
        DeleteSpaces delSpa = x -> {
            char[] arrChars;
            arrChars = x.toCharArray();

            for (int i = 0; i < x.length(); i++) {
                if (arrChars[i] == ' ') {
                    x = x.substring(0, i) + x.substring(i + 1, x.length());
                    arrChars = x.toCharArray();

                }
            }
            return x;
        };

        System.out.print(delSpa.delSpaces("Helen Abdel Leon abc array var jMeter Selenium Yaguar"));
    }
}
