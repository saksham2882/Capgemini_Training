package main.java.com.cg.pl;


import main.java.com.cg.service.EmployeeService;
import main.java.com.cg.service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		IEmployeeService es=new EmployeeService();
//		String result=es.createEmployee(new Employee("Rama", "ram@gmail.com", "1981-06-26"));
//		String result=es.createEmployee(new Employee("Rohit", "rohit@gmail.com", "1998-01-01"));
//		System.out.println(result);



//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Employee ID: ");
//		String empid =sc.nextLine();
//		Employee emp = es.findById(empid);
//		if (emp != null) {
//			System.out.println("ID: " + emp.getEmpid() + ", Name: " + emp.getName() + ", Email: " + emp.getEmail() + ", DOB: " + emp.getDob());
//		} else {
//			System.out.println("Employee Not Found");
//		}



//		List<Employee> list = es.getAllEmployee();
//		if (list.isEmpty()) {
//			System.out.println("No Employees Found");
//		} else {
//			for (Employee e : list) {
//				System.out.println("ID: " + e.getEmpid() + ", Name: " + e.getName() + ", Email: " + e.getEmail() + ", DOB: " + e.getDob());
//			}
//		}



//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter Employee ID: ");
//		String id =  sc.nextLine();
//		System.out.print("Enter New Name: ");
//		String newName = sc.nextLine();
//
//		String rs = es.updateEmployeeName(id, newName);
//		System.out.println(rs);



		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID: ");
		String empid = sc.nextLine();

		String res = es.removeEmployee(empid);
		System.out.println(res);
	}
}
