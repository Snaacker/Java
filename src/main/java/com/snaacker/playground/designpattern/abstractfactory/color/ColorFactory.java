package com.snaacker.playground.designpattern.abstractfactory.color;

import com.snaacker.playground.designpattern.abstractfactory.AbstractFactory;
import com.snaacker.playground.designpattern.abstractfactory.color.impl.Blue;
import com.snaacker.playground.designpattern.abstractfactory.color.impl.Green;
import com.snaacker.playground.designpattern.abstractfactory.color.impl.Red;
import com.snaacker.playground.designpattern.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}
