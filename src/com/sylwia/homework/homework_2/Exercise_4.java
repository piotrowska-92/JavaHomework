package com.sylwia.homework.homework_2;

public class Exercise_4 {
    public static void main(String[] args) {
        int sum = 0;

        for ( int i = 1; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.println( i + " Podzielne przez 3, 5 i 6");
                sum = sum + i;
            }
        }
        System.out.println("Suma " + sum);
    }
}

