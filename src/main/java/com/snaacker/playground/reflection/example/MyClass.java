package com.snaacker.playground.reflection.example;

/**
 * Created by quanghuy on 8/20/17.
 */
@SuppressWarnings("")
public class MyClass implements Comparable{

    @Deprecated
    private String sth;
    private String name;
    private int age;
    private String address;

    public String abcd;
    public MyClass() {
    }

    public MyClass(String name){
        this.name = name;
    }

    public MyClass(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String NameOfName(String name){
        System.out.println("this is kingdom of the name");
        return "Name of the age: " + name;
    }

    private int AgeOfAge(int age){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
