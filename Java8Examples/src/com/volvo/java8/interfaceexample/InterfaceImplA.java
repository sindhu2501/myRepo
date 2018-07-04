package com.volvo.java8.interfaceexample;

public class InterfaceImplA implements InterfaceExample {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return b - a;
    }

    public static void main(String args[]) {
        InterfaceExample implA = new InterfaceImplA();
        System.out.println(implA.add(2, 3));
        System.out.println(implA.subtract(3, 2));
        System.out.println(InterfaceExample.multiply(2, 3));
    }
}
