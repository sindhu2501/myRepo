package com.volvo.java8.example;

import java.util.function.BinaryOperator;

public class TestBasicComparatorLambda {

    public static void main(String[] args) {
        BinaryOperator<Integer> sum = Integer::sum;
        int a = 10;
        int b = 20;
        sum = (a, b) -> Integer.sum(a, b);
        System.out.println(sum);
    }

    private static void sum() {
        BinaryOperator<Integer> sum = (a, b) -> Integer.sum(a, b);
    }
}
