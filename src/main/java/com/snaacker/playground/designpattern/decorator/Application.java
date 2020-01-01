package com.snaacker.playground.designpattern.decorator;

public class Application {
    public static void main(String args[]){
        Shape circle = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();
        Shape rectangle = new Rectangle();
        BlueShapeDecorator blueShapeDecorator = new BlueShapeDecorator(rectangle);
        blueShapeDecorator.draw();
    }
}
