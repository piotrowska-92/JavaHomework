package com.sylwia.homework.homework_2;

import java.util.Scanner;

public class Exercise_5 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj numer");
        String number = sc.nextLine().replaceAll(" ", "");

//        if (number.length() != 12 || !number.substring(0, 3).equals("+48")){
//            System.out.println("Podałeś zły numer 1");
//        } else {
//            System.out.println("Podales poprawny numer 1");
//        }

        if (number.length() != 12 || !number.startsWith("+48")){
            System.out.println("Podałeś zły numer");
        } else {
            System.out.println("Podales poprawny numer");
        }

    }
}
