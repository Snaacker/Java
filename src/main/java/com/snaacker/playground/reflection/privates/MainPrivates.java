package com.snaacker.playground.reflection.privates;

import com.snaacker.playground.reflection.example.MyClass;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by quanghuy on 8/26/17.
 */
public class MainPrivates {

    public static void main(String args[]) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        MyClass myObjectClass = new MyClass("Huy");

        //private fields
        Field privateField = MyClass.class.getDeclaredField("name");
        privateField.setAccessible(true);
        String fieldValue = (String) privateField.get(myObjectClass);
        System.out.println("fieldValue = " + fieldValue);

        //private methods
        Method privateMethod = MyClass.class.getDeclaredMethod("AgeOfAge", int.class);
        privateMethod.setAccessible(true);
        int returnValue = (int) privateMethod.invoke(myObjectClass, Integer.valueOf(1));
        System.out.println("returnValue = " + returnValue);
    }

}
