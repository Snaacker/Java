package com.snaacker.playground.designpattern.abstractfactory;

import com.snaacker.playground.designpattern.abstractfactory.color.Color;
import com.snaacker.playground.designpattern.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
