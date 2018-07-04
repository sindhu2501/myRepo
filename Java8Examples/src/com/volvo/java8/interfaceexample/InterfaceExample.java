package com.volvo.java8.interfaceexample;

public interface InterfaceExample {

    int add(int a, int b);

    default int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}
