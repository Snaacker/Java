package com.snaacker.playground.reflection.classes;

import com.snaacker.playground.reflection.example.MyChildClass;
import com.snaacker.playground.reflection.example.MyClass;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class MainClasses {
    public static void main(String args[]){

        Class myObjectClass = MyClass.class;
        Class mySecondObjectClass = MyChildClass.class;

        String className = myObjectClass.getName();
        int modifierOfClass = myObjectClass.getModifiers();

        Package packageOfClass = myObjectClass.getPackage();
        Class superClass = mySecondObjectClass.getSuperclass();

        Class[] interfaces = mySecondObjectClass.getInterfaces();
        Arrays.stream(interfaces).forEach(x -> System.out.println("interface of MyChildClass is: " + x.getName()));

        Method[] methods = myObjectClass.getMethods();
        Stream<Method> myClassMethod = Arrays.stream(methods);
        Method setNameMethod = myClassMethod.filter(x -> x.getName().equals("setName")).findAny().orElse(null);
        System.out.println("method name of MyClass is: " + setNameMethod);

        Arrays.stream(mySecondObjectClass.getFields()).forEach(x -> System.out.println("public field of MyChildClass is: " + x.getName()));
        Annotation[] annotations = myObjectClass.getAnnotations();
        Arrays.stream(annotations).forEach(x -> System.out.println(x.getClass().getName()));

        System.out.println("class name of myObjectClass = [" + className + "]");
        System.out.println("modifiers of myObjectClass = [" + modifierOfClass + "]");
        System.out.println("package of myObjectClass = [" + packageOfClass.getName() + "]");
        System.out.println("super class of mySecondObjectClass = [" + superClass.getName() + "]");
    }
}
