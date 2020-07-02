package com.sylwia.homework.homework_1;

public class Exercise_2 {

    public static void main(String[] args) {
//        int k = 10;
//        if (k % 2 == 0) { // 0 albo 1
//            System.out.println("k jest parzyste");
//        }

        int k = 10;
        k = k + 1;
        k += 1;
        k++;

        k = k + 5;
        k += 5;

        k = k - 5;
        k -= 5;

        k *= 3;

        for (int i=0; i<=100; i+=2){
            System.out.println(i + " jest parzyste");
        }

        for (int i=1; i<=100; i+=2){
            System.out.println(i + " jest nieparzyste");
        }
    }

}
