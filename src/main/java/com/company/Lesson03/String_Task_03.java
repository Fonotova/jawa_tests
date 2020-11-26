package com.company.Lesson03;

import java.util.Scanner;

public class String_Task_03 {
    public static String inputString() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.printf("%s \n", inputString);
        return inputString;
    }

    public static int countSubstring(String str, String subStr){
        int count = 0;
        String s1;
            if (str.contains(subStr) == true){
                for (int i=0; i<str.length()-subStr.length()+1; i++){
                  s1 = str.substring(i,i+subStr.length());
                  // System.out.println(s1);
                  if  (s1.equals(subStr)){
                  count ++;}
                }
            }

        return count;
    }


    public static void main(String[] args) {
        // qwerty hbjhqwekj hbh qwerty
        System.out.println("Count subStrings = "+countSubstring(inputString(),inputString()));
    }
}
