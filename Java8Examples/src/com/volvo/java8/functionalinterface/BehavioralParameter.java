package com.volvo.java8.functionalinterface;

/**
 * Different results based on the parameter passed.
 */
public class BehavioralParameter {

    public static void main(String[] args) {
        calculate((a, b) -> a + b);
        calculate((a, b) -> a - b);
        calculate((a, b) -> a * b);
        calculate((a, b) -> a / b);
    }

    private static void calculate(Calculator calculator) {
        int a = 2, b = 3;
        System.out.println(calculator.calculate(a, b));
    }
}

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}