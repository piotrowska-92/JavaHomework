package com.sylwia.homework.homework_2;

import java.util.Scanner;

public class Exercise_3 {

    public static Scanner sc = new Scanner (System.in);

    public static final int K = 10;

    public static void main(String[] args) {
        double sum = 0;

        for ( int m = 1; m <= K; m++ ) {
            System.out.println(m);
            sum += sc.nextDouble();
        }

        double avg = sum / K;
        System.out.println( "średnia: " + String.format("%.2f", avg));

        System.out.println(String.format("Mam na imie %s, mam %d lat i waze %fkg", "Ania", 20, 50.123));
    }
}
