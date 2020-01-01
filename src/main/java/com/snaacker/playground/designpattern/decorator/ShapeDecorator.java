package com.snaacker.playground.designpattern.decorator;

public abstract class ShapeDecorator {

    Shape shapeDecorator;

    public ShapeDecorator(Shape shapeDecorator){
        this.shapeDecorator = shapeDecorator;
    }

    public void draw(){
        shapeDecorator.draw();
    }

}
