package com.snaacker.playground.designpattern.strategy.java7;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehavior = new FlyWithWing();
    }

    public void display(){
        this.performFly();
        super.display();
    }
}
