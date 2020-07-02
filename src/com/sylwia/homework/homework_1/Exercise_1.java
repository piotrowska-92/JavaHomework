package com.sylwia.homework.homework_1;

public class Exercise_1 {

    public static final int N = 10;

    public static void main(String[] args) {

        System.out.println("Za pomocą pętli for");
        for (int i=1; i <= N; i++) {
            System.out.println(i);

        }

        System.out.println("Za pomocą pętli while");
        int i=1;
        while (i<=N){
//            System.out.println(i);
//            i++;
            System.out.println(i++); // postinkrementacja
//            System.out.println(++i); // preinkrementacja
        }
    }

}
