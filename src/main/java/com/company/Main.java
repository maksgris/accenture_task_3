package com.company;

import java.util.Locale;
import java.util.Random;

enum Direction {LEFT, FORWARD, RIGHT}

public class Main {

    public static void firstExercise() {
        int arr[][] = new int[10][10];
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                arr[i-1][j-1] = i * j;
                System.out.println(String.format("%d * %d = %d",i, j, arr[i-1][j-1]));
            }
            System.out.println("\n");
        }
    }

    public static void secondExercise() {
        Random rand = new Random();
        int arrRand[] = new int[4];
        System.out.print("Random array: ");
        for (int i = 0; i < 4; i++) {
            arrRand[i] = rand.nextInt(1000);
            System.out.print(arrRand[i] + " ");
        }
    }

    public static void main(String[] args) {

        // First exercise

        firstExercise();

        // Second exercise

        secondExercise();

        // Third & fourth exercises

        BankAccount bankAccountA = new BankAccount(1000);
        BankAccount bankAccountB = new BankAccount(1000);
        BankAccount bankAccountC = new BankAccount(10000);

        bankAccountA.transfer(bankAccountB, 1001);
        bankAccountC.transfer(bankAccountB, 5001);
        bankAccountA.transferFrom(bankAccountB, 1001);

        // Fifth exercise

        MyCar Sport_car = new MyCar("Bugatti", 100, Direction.FORWARD, 3);
        Sport_car.speedUp(10);
        Sport_car.slowDown(5);
        Sport_car.steer(Direction.RIGHT);
        Sport_car.changeGears(4);
    }
}
