package com.volvo.java8.lamdaexample;

import java.util.function.IntFunction;

/**
 * Recursive call using lamda
 */
public class TestFactorial {

    public static void main(String[] args) {
        IntFunction<Long> factorial = TestFactorial::factorial;
        System.out.println(factorial.apply(5));

    }

    public static Long factorial(int n) {
        if (n == 0) {
            return 1L;
        } else {
            return n * factorial(n - 1);
        }
    }
}
