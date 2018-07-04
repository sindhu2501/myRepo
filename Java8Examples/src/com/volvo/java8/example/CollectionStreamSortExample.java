package com.volvo.java8.example;

import java.util.Arrays;
import java.util.List;

public class CollectionStreamSortExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(12, 3, 51, 666, 89, 1, 2, 38, 90, 4, 5);
        integers.stream().filter(n -> n % 2 == 1).sorted().forEach(n -> System.out.println(n));
        System.out.println("--------------------------------------------------------------------");
        integers.parallelStream().filter(n -> n % 2 == 1).sorted().forEach(n -> System.out.println(n));
    }

}
