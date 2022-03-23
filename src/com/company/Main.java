package com.company;

import java.util.Random;
import java.util.Scanner;

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
            private int balance;
            public final int transferLimit = 5000;

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


    }
}
