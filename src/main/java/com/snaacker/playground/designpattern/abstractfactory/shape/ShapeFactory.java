package com.snaacker.playground.designpattern.abstractfactory.shape;

import com.snaacker.playground.designpattern.abstractfactory.AbstractFactory;
import com.snaacker.playground.designpattern.abstractfactory.color.Color;
import com.snaacker.playground.designpattern.abstractfactory.shape.impl.Rectangle;
import com.snaacker.playground.designpattern.abstractfactory.shape.impl.Square;
import com.snaacker.playground.designpattern.abstractfactory.shape.impl.Triangle;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (shape == null){
            return null;
        }

        if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();

        }else if(shape.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }

        return null;    }

    @Override
    public Color getColor(String color){
        return null;
    }
}
