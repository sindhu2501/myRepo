package com.volvo.java8.example;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionStreamCollectorsEmployeeExample {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "A", "Developer", 12345.00);
        Employee emp2 = new Employee(2, "B", "Manager", 123456.00);
        Employee emp3 = new Employee(3, "AC", "Tester", 12309.00);
        Employee emp4 = new Employee(4, "D", "Architect", 123489.00);
        Employee emp5 = new Employee(5, "DA", "Architect", 123480.00);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        List<Employee> filterIntegers = employees.stream().filter(n -> n.getName().equals("C")).collect(Collectors.toList());
        System.out.println(filterIntegers);

        IntSummaryStatistics intSummary = employees.stream().collect(Collectors.summarizingInt(Employee::getEmpId));
        System.out.println(intSummary);

        DoubleSummaryStatistics doubleSummary = employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(doubleSummary);

        Map<Integer, String> employeeMap = employees.stream().filter(n -> n.getSalary() > 100000.00)
                                                    .collect(Collectors.toMap(Employee::getEmpId, Employee::getName));
        System.out.println(employeeMap);

        Map<Integer, Object> newEmployeeMap = employees.stream().collect(Collectors.toMap(Employee::getEmpId, n -> n.getName().startsWith("A")));
        System.out.println(newEmployeeMap);

        System.out.println(employees.stream().map(Employee::getName).collect(Collectors.joining()));

        System.out.println(employees.stream().map(Employee::getName).collect(Collectors.joining(",")));

        System.out.println(employees.stream().map(Employee::getName).collect(Collectors.joining(",", "Hey! ", " Welcome!")));

        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDesignation, Collectors.counting())));

        // System.out.println(employees.stream().collect(Collectors.partitioningBy(Employee::getDesignation,
        // Collectors.mapping(Employee::getName, Collectors.joining()))));
    }
}

class Employee {
    private Integer empId;
    private String name;
    private String designation;
    private Double salary;

    public Integer getEmpId() {
        return empId;
    }

    public Employee(Integer empId, String name, String designation, Double salary) {
        super();
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
    }
}