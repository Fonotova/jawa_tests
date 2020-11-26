package com.company.Lesson03;

import java.util.Scanner;

public class String_Task_01 {

    public static String inputString() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.printf("Original string - %s \n", inputString);
        return inputString;
    }

    public static int getDWords (String str){
        int count = 0;
        String [] words =str.split("\\s");
        int arrWords = words.length;
        for (int i =0; i < arrWords; i++){
            if (words[i].charAt(0)=='d'){
                System.out.printf("%s\n",words[i]);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //Test string: djk kjn we dog duck qewq
        System.out.printf("Count words start from 'd' - %s",getDWords(inputString()));
    }
}
