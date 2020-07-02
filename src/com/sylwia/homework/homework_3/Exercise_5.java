package com.sylwia.homework.homework_3;

import java.util.Scanner;

public class Exercise_5 {

    // 1011 = 1*2^0 + 1*2^1 + 1*2^3
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        String bin = sc.next();

        System.out.println("Wartosc dziesietna: " + binToInt(bin));
    }

    public static int binToInt(String binaryValue) {
        int sum = 0;
        int i = 0;

        while (i < binaryValue.length()) {
            if (binaryValue.charAt(i) == '1') {
                sum += Math.pow(2, binaryValue.length() - 1 - i);
            }

            i++;
        }

        return sum;
    }
}
