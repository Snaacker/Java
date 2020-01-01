package com.snaacker.playground.designpattern.decorator;


public class BlueShapeDecorator extends ShapeDecorator{

    public BlueShapeDecorator(Shape shapeDecorator){
        super(shapeDecorator);
    }

    @Override
    public void draw(){
        shapeDecorator.draw();
        setColor();
    }

    public void setColor(){
        System.out.println("I have blue border");
    }
}
