package com.snaacker.playground.reflection.constructors;


import com.snaacker.playground.reflection.example.MyClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * Created by quanghuy on 8/20/17.
 */
public class MainConstructors {

    public static void main(String args[]) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class myObjectClass = MyClass.class;

        Arrays.stream(myObjectClass.getConstructors()).forEach(x -> System.out.println("x.getTypeParameters() = " + x.getName()));

        Constructor<MyClass> constructor = myObjectClass.getConstructor(String.class);
        MyClass myObject = (MyClass) constructor.newInstance("Huy");

        Constructor<MyClass> constructor1 = myObjectClass.getConstructor(String.class, Integer.TYPE, String.class);
        MyClass myObject2 = (MyClass) constructor1.newInstance("Huy", 30, "Hanoi");

        System.out.println(myObject.getName());
        System.out.println(myObject2.getAddress());
    }
}
