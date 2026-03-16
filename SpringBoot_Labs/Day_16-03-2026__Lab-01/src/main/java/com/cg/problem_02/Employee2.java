package com.cg.problem_02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:data.properties")
public class Employee2 {
    @Value("${empId}")
    private int employeeId;

    @Value("${employeeName}")
    private String employeeName;

    @Value("${salary}")
    private double salary;

    private SBU businessUnit;

    @Value("${age}")
    private int age;


    public Employee2(SBU businessUnit) {
        this.businessUnit = businessUnit;
    }

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

    public SBU getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(SBU businessUnit) {
        this.businessUnit = businessUnit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SBU getSBUDetails(){
        return businessUnit;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", \nbusinessUnit=" + businessUnit +
                ']';
    }
}