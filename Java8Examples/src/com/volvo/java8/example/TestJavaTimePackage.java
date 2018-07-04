package com.volvo.java8.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestJavaTimePackage {

    public static void main(String[] args) {
        TestJavaTimePackage test = new TestJavaTimePackage();
        test.testLocalTimeClass();
    }

    private void testLocalTimeClass() {
        System.out.println("My current date::" + LocalDate.now());
        System.out.println("My current time::" + LocalTime.now());
        System.out.println("My current date and Time::" + LocalDateTime.now());
        System.out.println("My date after 1 year::" + LocalDate.now().plus(1, ChronoUnit.YEARS));
        System.out.println("My date after 5 weeks::" + LocalDate.now().plus(5, ChronoUnit.WEEKS));
        Period period = Period.between(LocalDate.now(), LocalDate.now().plus(5, ChronoUnit.WEEKS));
        System.out.println("Period between today and 5 weeks::" + period.getDays() + "," + period.getMonths() + "," + period.getYears() + ","
                + period.getChronology());
    }
}
