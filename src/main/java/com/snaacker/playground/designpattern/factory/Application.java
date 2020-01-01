package com.snaacker.playground.designpattern.factory;

public class Application {
    public static void main(String args[]){
        Computer computer = ComputerFactory.getComputer("Server", "8 GB", "200GB", "Core i7");
        System.out.println("CPU: " + computer.getCPU());
        System.out.println("Ram: " + computer.getRAM());
        System.out.println("HDD: " + computer.getHDD());

    }
}
