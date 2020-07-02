package com.sylwia.homework.homework_3;

import java.util.Scanner;

public class Exercise_4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String binWithMostOnes = "";
        int ones = 0;

        for ( int i = 0; i <5; i++){
            System.out.println("Podaj liczbe");
            String bin = sc.next();

            int sum = 0;
            for (int k = 0; k < bin.length(); k++){
                sum += Character.getNumericValue(bin.charAt(k));
            }

            if (sum > ones) {
                binWithMostOnes = bin;
                ones = sum;
            }
        }

        System.out.println("Najwiecej 1 ma: " + binWithMostOnes);
        System.out.println("Liczba 1: " + ones);

    }

}
