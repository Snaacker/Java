package com.snaacker.playground.designpattern.strategy.java7;

public class Duck {
    FlyBehavior flyBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void display(){
        System.out.println("I'm a duck");
    }
}
