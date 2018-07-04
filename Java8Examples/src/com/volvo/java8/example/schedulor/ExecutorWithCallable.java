package com.volvo.java8.example.schedulor;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorWithCallable {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 58, 9, 0);
        Callable<Integer> callable = () -> {
            int result = integers.stream().mapToInt(n -> n.intValue()).sum();
            return result;
        };
        ExecutorService service = Executors.newFixedThreadPool(5);
        Future<Integer> future = service.submit(callable);
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }

}
