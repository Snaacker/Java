package com.snaacker.playground.reflection.methods;

import com.snaacker.playground.reflection.example.MyClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.stream.Stream;

/**
 * Created by quanghuy on 8/26/17.
 */
public class MainMethods {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class myObjectClass = MyClass.class;

        System.out.println("list method");
        Stream.of(myObjectClass.getMethods()).forEach(System.out::println);

        Method myObjectMethod = myObjectClass.getMethod("NameOfName", String.class);
        System.out.println("myObjectClass = " + myObjectMethod.getName());
        Class returnType = myObjectMethod.getReturnType();
        System.out.println("return type of Object: " + returnType.getName());
        Class[] parameterType = myObjectMethod.getParameterTypes();
        System.out.println("list parameter of method NameOfName");
        Stream.of(parameterType.toString()).forEach(System.out::println);

        // using reflection to invoke method
        Method method = MyClass.class.getMethod("NameOfName", String.class);
        MyClass instance = new MyClass();
        // if method is static then we can invoke with null instance instead of real instance
        Object returnvalue = method.invoke(instance, "Huy");
        System.out.println(returnvalue);
    }
}
