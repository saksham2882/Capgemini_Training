package com.cg.main;

import com.cg.bean.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp = (Employee) context.getBean("employee");
        emp.printEmployeeInfo();
        context.close();
    }
}
