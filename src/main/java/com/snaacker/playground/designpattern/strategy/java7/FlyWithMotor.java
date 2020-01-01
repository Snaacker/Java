package com.snaacker.playground.designpattern.strategy.java7;

public class FlyWithMotor implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Vroom Vroom, I'm flying without wings");
    }
}
