package com.cg.main;

import com.cg.bean.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) context.getBean("employee");

        System.out.println("Employee details");
        System.out.println("-------------------");

        System.out.println("Employee ID : " + employee.getEmployeeId());
        System.out.println("Employee Name : " + employee.getEmployeeName());
        System.out.println("Employee Salary : " + employee.getSalary());
        System.out.println("Employee BU : " + employee.getBusinessUnit());
        System.out.println("Employee Age : " + employee.getAge());
    }
}
