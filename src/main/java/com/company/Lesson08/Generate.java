package com.company.Lesson08;

import java.util.Arrays;
import java.util.Random;

public class Generate {
    public static void main(String[] args) {
        String [] names = new String[]{"Архип","Болеслав","Марат","Семен",
                "Юлиан","Сергей","Нифонт","Максим","Кирилл","Иван"};

        Abonent[] abonents = new Abonent[10];
        Random random = new Random();
        for (int i=0; i< abonents.length; i++) {
            Abonent abonent = new Abonent();
            int nextNameIndex = random.nextInt(names.length);
            String nextName = names[nextNameIndex];

            abonent.setFirstName(nextName);
            abonent.setGender(Gender.MALE);
            abonents[i]=abonent;

        }
        random.nextInt();
        System.out.println(Arrays.toString(abonents));

    }
}
