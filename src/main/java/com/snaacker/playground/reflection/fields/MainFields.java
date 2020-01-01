package com.snaacker.playground.reflection.fields;


import com.snaacker.playground.reflection.example.MyClass;

import java.lang.reflect.Field;
import java.util.stream.Stream;

/**
 * Created by quanghuy on 8/24/17.
 */
public class MainFields {
    public static void main(String args[]) throws NoSuchFieldException {
        Class myObjectClass = MyClass.class;

        Field[] fields = myObjectClass.getFields();

        System.out.println("fields = " + Stream.of(fields).filter(x -> x.getName().equals("abcd")));
        Field abcd = myObjectClass.getField("abcd");
        System.out.println("field type is " + abcd.getType());

    }
}
