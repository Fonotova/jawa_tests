package com.company.Lesson06;
import com.company.Date;
import com.company.DateTime;

public class OOPPolymorph {
    public static void main(String[] args) throws Exception {
        Date date = new Date(3,12,12);
        Object date2 = new Date (1,1,32);
        Date date5 = new DateTime();

        Date [] arr = {date, date5};
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        Object [] arr2 = {date, date5,"hello"};
        for (int i=0; i<arr2.length; i++){
            System.out.println(arr[i]);
        }
    }
}
