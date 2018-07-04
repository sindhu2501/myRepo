package com.volvo.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalIntExample {

    public static void main(String[] args) {
        // OptionalInt is a null safe class
        OptionalInt num = IntStream.of(101, 20, 30).filter(n -> n % 2 == 1).max();
        if (num.isPresent()) {
            System.out.println("Max odd number::" + num);
        } else {
            System.out.println("empty result");
        }

        OptionalInt num1 = IntStream.of(10, 20, 30).filter(n -> n % 2 == 1).max();
        System.out.println("Max odd number::" + num1);

        List<Integer> integers = Arrays.asList(10, 20, 30);
        System.out.println(integers.stream().filter(n -> n % 2 == 1).count());
    }

}
