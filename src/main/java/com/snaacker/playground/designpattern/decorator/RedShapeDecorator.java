package com.snaacker.playground.designpattern.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape sape){
        super(sape);
    }

    @Override
    public void draw() {
        shapeDecorator.draw();
        setRedColor();
    }

    public void setRedColor(){
        System.out.println("I have a red border");
    }
}
