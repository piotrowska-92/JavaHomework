package com.sylwia.homework.homework_1;

public class Exercise_3 {

    public static void main(String[] args) {

        int k = 10;

        if (k % 2 == 0) {
            System.out.println("K podzielne przez 2");
        }

        if (k % 3 == 0) {
            System.out.println("K podzielne przez 3");
        }

        // AND - &&
        // OR - ||

        System.out.println("- - - Jednoczesnie podzielne przez 2 i przez 3 - - - ");
        if (k % 2 == 0 && k % 3 == 0) {
            System.out.println("K jednoczesnie podzielne przez 2 i 3");
        }

        System.out.println("- - - Podzielne przez 2 lub przez 3 - - - ");
        if (k % 2 == 0 || k % 3 == 0) {
            System.out.println("K podzielne przez 2 lub 3");
        }

        for (int i = 1; i<=1000; i ++) {
            if (i % 2 ==0 && i % 3 == 0 ) {
                System.out.println( i + " podzielne przez 2 i 3");
            }
        }

//        for (int i = 0; i < 10; i++)
//            System.out.println("X X X");
//            System.out.println("Y Y Y");

//        TO SAMO

//        for (int i = 0; i < 10; i++) {
//            System.out.println("X X X");
//        }
//
//        System.out.println("Y Y Y");
    }

}
