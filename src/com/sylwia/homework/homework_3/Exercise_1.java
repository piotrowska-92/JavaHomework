package com.sylwia.homework.homework_3;

import java.util.Scanner;

public class Exercise_1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj liczbe: ");
        String bin = sc.next();

        if (bin.charAt(bin.length() - 1) == '0') {
            System.out.println( bin + " jest parzysta");
        } else {
            System.out.println( bin + " jest nieparzysta");
        }

    }
}