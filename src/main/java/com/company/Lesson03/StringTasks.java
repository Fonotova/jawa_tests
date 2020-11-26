package com.company.Lesson03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTasks {
    // Считываем строку
    public static String inputString() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.printf("Original string - %s \n", inputString);
        return inputString;
    }


    public static String[] findStartD(String Srt) {
        String[] splitStrings = Srt.split(" ");
        for (int i = 0; i < splitStrings.length; i++) {

            System.out.printf("%s ", splitStrings[i]);
        }
        return splitStrings;
    }

    public static int countWords(String str, String varPattern) {
        String[] splitStrings = str.split(" ");
        Pattern pattern = Pattern.compile(varPattern);
        int countWords = 0;
        for (int i = 0; i < splitStrings.length; i++) {
            {
                Matcher m = pattern.matcher(splitStrings[i]);
                if (m.find()) {
                    countWords++;
                    System.out.printf("Pass RegExp - %s \n", splitStrings[i]);
                }
            }
        }
        return countWords;
    }

    public static void main(String[] args) {
        String str1 = "String1 sjdh ajsd asjd asjhd";
        String str2 = "String2 dog dig fdsffed duck upsdfed";
        String varPattern1 = "^[d|D]\\w*";
        String varPattern2 = "^\\w*ed\\b";
        // printString(inputString());
        //printString(str1);
        //findStartD(str2);
        //int c = countWords(str2, varPattern2);
        int c = countWords(inputString(), varPattern2);

        System.out.println("Counts words = "+c);
    }
}
