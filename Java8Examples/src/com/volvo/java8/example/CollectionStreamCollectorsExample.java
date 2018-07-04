package com.volvo.java8.example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionStreamCollectorsExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(7, 98, 4, 5, 1, 2, 3, 8);
        List<Integer> filterIntegers = integers.stream().filter(n -> n > 1).collect(Collectors.toList());
        System.out.println(filterIntegers);

        Set<Integer> uniqueIntegers = integers.stream().filter(n -> n > 1).collect(Collectors.toCollection(TreeSet::new));
        System.out.println(uniqueIntegers);

        IntSummaryStatistics summary = integers.stream().filter(n -> n > 1).collect(Collectors.summarizingInt(Integer::new));
        System.out.println(summary);

    }

}
