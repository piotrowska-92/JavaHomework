package com.sylwia.homework.homework_2;

import java.util.Scanner;

public class Exercise_2 {
    public static Scanner sc = new Scanner(System.in);

    public static final int K = 10;

    public static void main(String[] args) {
        int sum = 0;

        int m = 1;
        while (m <= K){
            System.out.println("Podaj " + m + ". liczbe: ");
            sum += sc.nextInt();

            m++;
        }

        System.out.println("suma: " + sum);
    }
}
