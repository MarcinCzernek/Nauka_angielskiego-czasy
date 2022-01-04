package com.example;

import java.util.Random;

public class Test {

    public static void main(String[] args) {

        int [] randomNumber = new int[20];


        for(int i = 0 ; i <= 19; i++){
            randomNumber[i] = (int) (Math.random() *9);
            System.out.println(randomNumber[i]);
        }

/*
        for(int i = 0; i <= 10;i++){
            Random random = new Random();
            randomNumber[i] = random.nextInt(10);
            System.out.println(randomNumber[i]);
        }
*/
    }
}
