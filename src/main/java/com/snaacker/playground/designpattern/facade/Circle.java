package com.snaacker.playground.designpattern.facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm drawing circle");
    }
}
