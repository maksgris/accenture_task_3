package com.company;

import java.util.Locale;

public class MyCar extends Car {
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
