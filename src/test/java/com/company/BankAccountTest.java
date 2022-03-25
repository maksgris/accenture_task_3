package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount1 = new BankAccount(1000);
    BankAccount bankAccount2 = new BankAccount(1000);

    @Test
    void transferTest() {
        bankAccount1.transfer(bankAccount2, 1000);
        assertEquals(0, bankAccount1.getBalance());
    }

    @Test
    void transferFromTest() {
        bankAccount1.transferFrom(bankAccount2, 500);
        assertEquals(1500, bankAccount1.getBalance());
    }
}