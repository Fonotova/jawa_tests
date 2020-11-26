package com.company;

public class StringExs {
    public static void main(String[] args) {
        String str="Hello wooorld!";
        //System.out.println(str.length(str));
        int count=0;
        for (int i=0; i< str.length();i++)
        {

            char ch= str.charAt(i);
            if (ch=='o')
                count++;
        }
        System.out.println(count);
    }
}
