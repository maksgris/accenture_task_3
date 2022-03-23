package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // First exercise

        int arr[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = (i+1) * (j+1);
                String str = String.valueOf(arr[i][j]);
                System.out.print(String.format("%4s",str));
            }
            System.out.println("\n");
        }

        // Second exercise

        Random rand = new Random();
        int arrRand[] = new int[4];
        System.out.print("Random array: ");
        for (int i = 0; i < 4; i++) {
            arrRand[i] = rand.nextInt(1000);
            System.out.print(arrRand[i] + " ");
        }
    }
}
