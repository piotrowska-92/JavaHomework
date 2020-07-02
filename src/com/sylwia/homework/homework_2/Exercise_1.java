package com.sylwia.homework.homework_2;

import java.util.Scanner;

public class Exercise_1 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println ( "Podaj liczbe a: " );
        int a = sc.nextInt();

        System.out.println( "Podaj liczbe b: ");
        int b = sc.nextInt();

//        int power = a ^ b; // operator XOR, a nie potęgowanie
        int power = (int) Math.pow(a, b); // rzutowanie 8
        double power2 = Math.pow(a, b);// 2^3 = 8.0
        System.out.println(power);
        System.out.println(power2);

        // 5dec = 101bin => w
        // 6dec = 110bin => r
        // w & r =100

        // 2dec = 10bin => w
        // 3dec = 11bin => r
        // w ^ r =01bin -> 1dec

//        int x = 10;
//        if (x % 2 == 0) {
//            System.out.println("x jest parzyste");
//        }

        // 10dec = 1010bin
    }
}
