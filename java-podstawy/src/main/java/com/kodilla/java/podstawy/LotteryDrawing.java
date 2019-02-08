package com.kodilla.java.podstawy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ile liczb musisz wylosować? ");
        int k = in.nextInt();

        System.out.println("Z ilu liczb odbędzie się losowanie?");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i <numbers.length; i++){
            numbers[i] = i + 1;
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i ++){
            Random generator = new Random();
            int chosen = generator.nextInt(n);

            result[i] = numbers[chosen];

            numbers[chosen] = numbers[n-1];
            n--;
        }

//
//        Arrays.sort(result);
//        System.out.println("Postaw na następujące liczby: ");
//        for (int a: result) {
//            System.out.println(a);
//        }


        String abc = Arrays.toString(result);
        System.out.println(abc);


        //ustawia wszystkie elementy w tablicy na wartość val
        Arrays.fill(result, 1);
        String xyz = Arrays.toString(result);
        System.out.println(xyz);


    }
}
