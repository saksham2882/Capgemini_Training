package com.cg.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Value("${employeeId}")
    private int employeeId;

    @Value("${employeeName}")
    private String employeeName;

    @Value("${salary}")
    private double salary;

    @Autowired
    @Qualifier("sbu")
    private SBU businessUnit;

    @Value("${age}")
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
                ", businessUnit=" + businessUnit.getSbuCode() +
                "]\n";
    }
}
