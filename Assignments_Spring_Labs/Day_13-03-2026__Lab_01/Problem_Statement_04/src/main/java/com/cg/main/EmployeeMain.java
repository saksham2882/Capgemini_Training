package com.cg.main;

import com.cg.bean.Employee;
import com.cg.bean.SBU;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        SBU sbu = (SBU) context.getBean("sbu");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for(Employee emp : sbu.getEmpList()){
            if(emp.getEmployeeId() == id){
                System.out.println(emp);
            }
        }
    }
}
