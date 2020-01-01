package com.snaacker.playground.designpattern.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm drawing square");
    }
}
