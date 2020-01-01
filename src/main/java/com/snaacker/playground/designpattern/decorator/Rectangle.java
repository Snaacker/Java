package com.snaacker.playground.designpattern.decorator;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("I'm rectangle");
    }
}
