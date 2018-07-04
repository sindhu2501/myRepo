package com.volvo.java8.lamdaexample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestLamdaExpressionForEmployeeSort {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "A", "Developer", 12345);
        Employee emp2 = new Employee(2, "B", "Manager", 123456);
        Employee emp3 = new Employee(3, "C", "Tester", 12309);
        Employee emp4 = new Employee(5, "E", "Architect", 123489);
        Employee emp5 = new Employee(4, "D", "Architect", 123489);
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        System.out.println("Before::" + employees);
        employees.sort((e1, e2) -> (e1.getSalary() + e1.getName()).compareTo((e2.getSalary() + e2.getName())));
        employees.sort(Comparator.comparing(Employee::getSalary));
        System.out.println("After::" + employees);
    }

}
