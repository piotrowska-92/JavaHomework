package com.sylwia.homework.homework_3;

import java.util.Scanner;

public class Exercise_6 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println( "Podaj liczbe");
        int k = sc.nextInt();

        if (isEven(k)) {
            System.out.println("Parzysta");
        } else {
            System.out.println("Nieparzysta");
        }
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isPolish(String phoneNumber) {
        return phoneNumber.startsWith("+48");
    }
}
