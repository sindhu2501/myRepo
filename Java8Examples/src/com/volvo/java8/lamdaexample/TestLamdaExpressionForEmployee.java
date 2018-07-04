package com.volvo.java8.lamdaexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestLamdaExpressionForEmployee {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "A", "Developer", 12345);
        Employee emp2 = new Employee(2, "B", "Manager", 123456);
        Employee emp3 = new Employee(3, "C", "Tester", 12309);
        Employee emp4 = new Employee(4, "D", "Architect", 123489);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        testEmployees(employees, (e) -> e.getName().equalsIgnoreCase("A"));
        System.out.println("------------------------------------------------");
        testEmployees(employees, (e) -> e.getDesignation().equalsIgnoreCase("Tester"));
        System.out.println("------------------------------------------------");
        testEmployees(employees, (e) -> e.getEmpId() > 1);
        System.out.println("------------------------------------------------");
        testEmployees(employees, (e) -> e.getSalary() > 12309);
        System.out.println("------------------------------------------------");
    }

    static void testEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        for (Employee e : employees) {
            if (predicate.test(e)) {
                System.out.println(e);
            }
        }
    }

}
