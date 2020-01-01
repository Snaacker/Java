package com.snaacker.playground.designpattern.strategy.java7;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        flyBehavior = new FlyWithMotor();
    }

    public void display(){
        flyBehavior.fly();
        System.out.println("I'm a decoy duck, quack quack");
    }
}
