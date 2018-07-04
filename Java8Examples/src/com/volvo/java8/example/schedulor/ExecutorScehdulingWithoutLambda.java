package com.volvo.java8.example.schedulor;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExecutorScehdulingWithoutLambda {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        Task task = new Task("Task");
        // Create new task and sends to executor.
        // It will start with delay of 1 second and then runs every 2 seconds
        ScheduledFuture<?> result = service.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);
        // Controlling execution of tasks
        for (int i = 0; i <= 10; i++) {
            System.out.println(result.getDelay(TimeUnit.SECONDS));
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        service.shutdown();
        System.out.println("No more tasks to run" + new Date());

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished at:" + new Date());
    }

}

class Task implements Runnable {

    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Running::" + name + " on: " + new Date());

    }

}