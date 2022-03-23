package com.company;

import java.util.Locale;
import java.util.Random;

enum Direction {LEFT, FORWARD, RIGHT}

public class Main {
    public static void main(String[] args) {

        // First exercise

        int arr[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = (i + 1) * (j + 1);
                String str = String.valueOf(arr[i][j]);
                System.out.print(String.format("%4s", str));
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

        // Third & fourth exercises

        class BankAccount {
            public final int transferLimit = 5000;
            private int balance;

            public BankAccount() {
            }

            public BankAccount(int balance) {
                this.balance = balance;
            }

            public void deposit(int amount) {
                balance += amount;
            }

            public void withdraw(int amount) {
                balance -= amount;
            }

            public void printBalance() {
                System.out.println("\nYour balance currently is: " + balance);
            }

            public void transfer(BankAccount account2, int transferAmount) {

                if (transferLimit >= transferAmount) {
                    if (this.balance >= transferAmount) {
                        account2.balance += transferAmount;
                        this.balance -= transferAmount;
                    } else
                        System.out.println("\nThere is not enough funds");
                } else
                    System.out.println("\nTransaction cancelled. Max deposit - " + transferLimit + " | Your deposit - " + transferAmount);
            }

            public void transferFrom(BankAccount account2, int transferAmount) {

                if (transferLimit >= transferAmount) {
                    if (account2.balance >= transferAmount) {
                        account2.balance -= transferAmount;
                        this.balance += transferAmount;
                    } else
                        System.out.println("\nTransfer cancelled. You are trying to transfer " + transferAmount + " units, but only " + account2.balance + " is available.");
                } else
                    System.out.println("\nTransaction cancelled. Max deposit - " + transferLimit + " | Your deposit - " + transferAmount);
            }
        }

        // Third and fourth exercises work example

        BankAccount bankAccountA = new BankAccount(1000);
        BankAccount bankAccountB = new BankAccount(1000);
        BankAccount bankAccountC = new BankAccount(10000);

        bankAccountA.transfer(bankAccountB, 1001);
        bankAccountC.transfer(bankAccountB, 5001);
        bankAccountA.transferFrom(bankAccountB, 1001);

        // Fifth exercise

        class Vehicle {
            protected Direction direction;
            protected int speed;
            protected int gears;
        }

        class Car extends Vehicle {

            public int getSpeed() {
                return speed;
            }

            public void setSpeed(int speed) {
                this.speed = speed;
            }

            public Direction getDirection() {
                return direction;
            }

            public void setDirection(Direction direction) {
                this.direction = direction;
            }

            public int getGears() {
                return gears;
            }

            public void setGears(int gears) {
                this.gears = gears;
            }


        }

        class MyCar extends Car {
            protected String name;

            public MyCar() {
                this.setName("A new car");
                this.setSpeed(0);
                this.setDirection(Direction.FORWARD);
                this.setGears(0);
            }

            public MyCar(String name, int speed, Direction direction, int gears) {
                this.setName(name);
                this.setSpeed(speed);
                this.setDirection(direction);
                this.setGears(gears);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void speedUp(int speed) {
                this.speed += speed;
                System.out.println("Your speed is " + this.speed);
            }

            public void slowDown(int speed) {
                this.speed -= speed;
                System.out.println("Your speed is " + this.speed);
            }

            public void steer(Direction direction) {
                this.direction = direction;
                System.out.println("You are now going " + (this.direction).toString().toLowerCase(Locale.ROOT));
            }

            public void changeGears(int gears) {
                this.gears = gears;
                System.out.println("Your car is now on " + this.gears + "th gear");
            }
        }

        // Fifth exercise work example

        MyCar Sport_car = new MyCar("Bugatti", 100, Direction.FORWARD, 3);
        Sport_car.speedUp(10);
        Sport_car.slowDown(5);
        Sport_car.steer(Direction.RIGHT);
        Sport_car.changeGears(4);
    }
}
