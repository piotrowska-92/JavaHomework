package com.sylwia.homework.homework_3;

import java.util.Scanner;

public class Exercise_2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        int t = sc.nextInt();

        if (t % 3 == 0){
            System.out.println( t + " jest podzielna przez 3");
        }
        else {
            System.out.println( t + " nie jest podzielna przez 3");
        }
    }
}
