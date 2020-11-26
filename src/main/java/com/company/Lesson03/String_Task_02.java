package com.company.Lesson03;

import java.util.Scanner;

public class  String_Task_02 {

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
            if (words[i].charAt(words[i].length()-2)=='e'& words[i].charAt(words[i].length()-1)=='d'){
                System.out.printf("%s\n",words[i]);
                count++;
            }
        }
        return count;
    }
//Test string : jklhed kj ads qwed lkm vhjkbed
    public static void main(String[] args) {
        System.out.printf("Count words finished '-ed' = %s",getDWords(inputString()));
    }
}
