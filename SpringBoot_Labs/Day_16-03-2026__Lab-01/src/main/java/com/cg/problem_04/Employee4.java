package com.cg.problem_04;

import org.springframework.context.annotation.PropertySource;

// @Component
@PropertySource("classpath:data.properties")
public class Employee4 {
    // @Value("${empId}")
    private int employeeId;

    // @Value("${employeeName}")
    private String employeeName;

    // @Value("${salary}")
    private double salary;

    // @Value("${age}")
    private int age;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee [" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                "]\n";
    }
}