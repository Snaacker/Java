package com.snaacker.playground.designpattern.abstractfactory.color.impl;


import com.snaacker.playground.designpattern.abstractfactory.color.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("we've filled green to this selection");
    }
}
