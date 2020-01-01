package com.snaacker.playground.designpattern.singleton;

public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject(){
    }

    public static SingletonObject getSingletonObject(){
        if (instance == null){
            instance = new SingletonObject();
        }
        return instance;
    }
}
