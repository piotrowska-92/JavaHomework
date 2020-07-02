package com.sylwia.homework.homework_3;

import java.util.Scanner;

public class Exercise_2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        String bin = sc.next();

        int decimal = Integer.parseInt(bin,2);

        if (decimal % 3 == 0){
            System.out.println( bin + " jest podzielna przez 3");
        } else {
            System.out.println( bin + " nie jest podzielna przez 3");
        }
    }
}
