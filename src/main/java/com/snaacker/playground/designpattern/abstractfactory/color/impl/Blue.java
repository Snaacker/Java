package com.snaacker.playground.designpattern.abstractfactory.color.impl;

import com.snaacker.playground.designpattern.abstractfactory.color.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("we've filled blue to this selection");
    }
}
