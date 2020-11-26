package com.company.Lesson07_Lmbda;

public class Lambda {
    public static void main(String[] args) {
        Function functionRange = x -> {
            if (x >= 10 & x <= 20) {
                System.out.printf("True");
            } else {
                System.out.printf("False\n");
            }
        };
        functionRange.calc(21);

        Function faktorial = x -> {
            int n = 1;
            for (int i = 1; i < x + 1; i++) {
                n = n * i;
            }
            System.out.println(+n);
        };
        faktorial.calc(8);
    }
}
