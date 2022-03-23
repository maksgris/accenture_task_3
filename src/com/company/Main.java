package com.company;

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
    }
}
