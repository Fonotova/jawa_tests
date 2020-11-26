package com.company;

public class InitializeArray {
    public static void main(String[] args) {
        int[] array = new int[7];
        array[0] = 6;
        array[1] = 2;
        array[2] = 6;
        array[3] = 2;
        array[4] = 6;
        array[5] = 2;
        array[6] = 6;

        System.out.print("[");
        for (int i = 0; i < 7; i++) {
            System.out.print(Integer.toString(array[i]));
            if (i<6) System.out.print(",");
        }
        System.out.print("]");

        int i =6;
        System.out.println();
        System.out.print("[");
        while (i >= 0) {
            System.out.print(Integer.toString(array[i]));
            i--;
            if (i>=0) System.out.print(",");
        }
        System.out.print("]");
    }
}
