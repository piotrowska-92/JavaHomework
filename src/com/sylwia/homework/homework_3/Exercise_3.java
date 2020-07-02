package com.sylwia.homework.homework_3;

import java.util.Scanner;

public class Exercise_3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String longestLine = "";
        String line;
        int i =0;

        while (i++ < 10) {
            System.out.println("Wpisz tekst");
            line = sc.nextLine();

            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        System.out.println("Najdluzsza linijka: " + longestLine);
    }
}
