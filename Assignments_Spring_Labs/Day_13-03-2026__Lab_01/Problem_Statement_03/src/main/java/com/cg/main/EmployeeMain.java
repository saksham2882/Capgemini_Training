package com.cg.main;

import com.cg.bean.SBU;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        SBU sbu = (SBU) context.getBean("sbu");

        System.out.println("SBU Details");
        System.out.println("--------------");

        System.out.println("SBU Code : " + sbu.getSbuCode());
        System.out.println("SBU Name : " + sbu.getSbuName());
        System.out.println("SBU Head : " + sbu.getSbuHead());

        System.out.println("\nEmployee Details");
        System.out.println("-----------------");

        System.out.println(sbu.getEmpList());
    }
}
