package com.volvo.java8.lamdaexample;

public class Employee {

    private Integer empId;
    private String name;
    private String designation;
    private Integer salary;

    public Employee(Integer empId, String name, String designation, Integer salary) {
        super();
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
    }

}
