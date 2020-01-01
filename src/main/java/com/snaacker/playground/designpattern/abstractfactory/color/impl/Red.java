package com.snaacker.playground.designpattern.abstractfactory.color.impl;


import com.snaacker.playground.designpattern.abstractfactory.color.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("We've filled red to this selection");
    }
}
