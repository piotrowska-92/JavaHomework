package com.sylwia.homework.homework_1;

import java.util.Scanner;

public class Exercise_5 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println( "User name");
        String username = sc.next();

        int upperCaseLettersCounter = 0;
        int lowerCaseLettersCounter = 0;

        for (char c : username.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseLettersCounter++;
            }
        }

        for (char c : username.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowerCaseLettersCounter++;
            }
        }

        System.out.println("Wielkich znakow: " + upperCaseLettersCounter);
        System.out.println("Malych znakow: " + lowerCaseLettersCounter);
    }

}
