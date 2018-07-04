package com.volvo.java8.example;

import java.util.Arrays;
import java.util.List;

public class CollectionStreamExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (Integer integer : integers) {
            if (integer % 2 == 1) {
                int square = integer * integer;
                sum = sum + square;
            }
        }
        System.out.println(sum);

        // Sequential Streaming
        int sum1 = integers.stream().filter(n -> n % 2 == 1).map(n -> (n * n)).reduce(0, Integer::sum);
        System.out.println("Sequential stream result::" + sum1);

        // Parallel Streaming
        int sum2 = integers.parallelStream().filter(n -> n % 2 == 1).map(n -> (n * n)).reduce(0, Integer::sum);
        System.out.println("Parallel stream result::" + sum2);
    }

}
