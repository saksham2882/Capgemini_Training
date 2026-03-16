package com.cg;

import com.cg.problem_01.Employee;
import com.cg.problem_02.Employee2;
import com.cg.problem_03.Employee3;
import com.cg.problem_03.SBU3;
import com.cg.problem_04.Employee4;
import com.cg.problem_04.SBU4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class Lab01Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Lab01Application.class, args);


        // -------------- Problem 01 -------------------
//        Employee emp = ctx.getBean(Employee.class);
//
//        System.out.println("------ Employee Info ------");
//        System.out.println("Employee Id: " + emp.getEmployeeId());
//        System.out.println("Employee Name : " + emp.getEmployeeName());
//        System.out.println("Employee Salary : " + emp.getSalary());
//        System.out.println("Employee BU : " + emp.getBusinessUnit());
//        System.out.println("Employee Age : " + emp.getAge());



        // --------------- Problem 02 ---------------------
//        Employee2 emp = ctx.getBean(Employee2.class);
//        System.out.println("------ Employee Info ------");
//        System.out.println(emp);



        // --------------- Problem 03 --------------------
//        SBU3 sbu = ctx.getBean(SBU3.class);
//
//        System.out.println("--------------");
//        System.out.println("SBU Details");
//        System.out.println("--------------");
//
//        System.out.println("SBU Code : " + sbu.getSbuCode());
//        System.out.println("SBU Name : " + sbu.getSbuName());
//        System.out.println("SBU Head : " + sbu.getSbuHead());
//
//        System.out.println("\nEmployee Details");
//        System.out.println("-----------------");
//        System.out.println(sbu.getEmpList());



        // ---------------- Problem 04 -------------------
        SBU4 sbu = ctx.getBean(SBU4.class);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for(Employee4 emp : sbu.getEmpList()){
            if(emp.getEmployeeId() == id){
                System.out.println(emp);
            }
        }
    }


    // ------- for problem 03 --------
//    @Bean
//    public Employee3 getBean1(){
//        Employee3 emp = new Employee3();
//        emp.setEmployeeId(101);
//        emp.setEmployeeName("Jack");
//        emp.setSalary(78000);
//        emp.setAge(22);
//        return emp;
//    }
//
//    // -------- for problem 03 ----------
//    @Bean
//    public Employee3 getBean2(){
//        Employee3 emp = new Employee3();
//        emp.setEmployeeId(102);
//        emp.setEmployeeName("Harry");
//        emp.setSalary(54000);
//        emp.setAge(24);
//        return emp;
//    }



    // --------- for problem 04 -----------
    @Bean
    public Employee4 getBean1(){
        Employee4 emp = new Employee4();
        emp.setEmployeeId(101);
        emp.setEmployeeName("Mohit");
        emp.setSalary(68000);
        emp.setAge(28);
        return emp;
    }

    // --------- for problem 04 -----------
    @Bean
    public Employee4 getBean2(){
        Employee4 emp = new Employee4();
        emp.setEmployeeId(102);
        emp.setEmployeeName("Ram");
        emp.setSalary(53000);
        emp.setAge(26);
        return emp;
    }
}
