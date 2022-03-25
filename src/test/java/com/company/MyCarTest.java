package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCarTest {
    MyCar testCar = new MyCar("Test Car", 25, Direction.FORWARD, 0);

    @Test
    void speedUpTest() {
        testCar.speedUp(50);
        assertEquals(75, testCar.getSpeed());
    }

    @Test
    void slowDownTest() {
        testCar.slowDown(25);
        assertEquals(0, testCar.getSpeed());
    }

    @Test
    void steerTest() {
        testCar.steer(Direction.RIGHT);
        assertEquals(Direction.RIGHT, testCar.getDirection());
    }
}