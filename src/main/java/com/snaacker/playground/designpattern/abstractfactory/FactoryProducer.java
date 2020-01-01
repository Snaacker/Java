package com.snaacker.playground.designpattern.abstractfactory;

import com.snaacker.playground.designpattern.abstractfactory.color.ColorFactory;
import com.snaacker.playground.designpattern.abstractfactory.shape.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}
