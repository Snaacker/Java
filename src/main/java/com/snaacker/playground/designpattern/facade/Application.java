package com.snaacker.playground.designpattern.facade;

public class Application {
    public static void main(String args[]){
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
