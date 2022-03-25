package com.company;

public class BankAccount {
    public final int transferLimit = 5000;
    private int balance;

    public BankAccount() {
    }

    public int getBalance() {
        return balance;
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
