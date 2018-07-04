package com.volvo.java8.lamdaexample;

import java.util.Arrays;

public class LoopListExample {

    public static void main(String[] args) {
        Integer sum = 0;
        int[] ar = { 1, 2, 5 };

        sum = Arrays.stream(ar).sum();
        System.out.println(sum);
    }
}
