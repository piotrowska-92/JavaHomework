package com.sylwia.homework.homework_1;

import java.util.Scanner;

public class Exercise_4 {

    public static final int CURRENT_YEAR = 2020;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj PESEL");
        String pesel = sc.next();

        if (pesel.length() != 1) {
            System.out.println("Podałeś zły PESEL");
            System.exit(1);
        }

        String yearStr = pesel.substring(0, 2);

        int year = 0;
        try {
            year = Integer.parseInt(yearStr);
        } catch (NumberFormatException e) {
            System.out.println("Podałeś zły PESEL");
            System.exit(1);
        }

        // (20-99) 97 -> 1997
        // (0-19) 01 -> 2001

        if ( year > 20 && year < 99) {
            year += 1900;
        } else {
            year += 2000;
        }

        int age = CURRENT_YEAR - year;
        if( age >= 18) {
            System.out.println("Pełnoletni");
        }
        else {
            System.out.println("Niepełnoletni");
        }

    }

}
