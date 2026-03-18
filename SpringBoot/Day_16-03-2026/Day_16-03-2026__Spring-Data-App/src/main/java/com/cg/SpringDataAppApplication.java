package com.cg;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import com.cg.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.Scanner;


@SpringBootApplication
public class SpringDataAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataAppApplication.class, args);

		EmployeeService es = ctx.getBean(EmployeeService.class);
		Scanner sc = new Scanner(System.in);


		// 1. ----------- Create Employee -------------
//		String s = es.createEmployee(new Employee("John", LocalDate.of(2005, 2, 17), 7000));
//		System.out.println(s);



		// 2. ----------- Get All Employee --------------
//		es.getAllEmployees().forEach(e -> System.out.println(e));



		// 3. ------------ Get By Id -----------------
//		System.out.println("Enter Employee ID: ");
//		int empId = sc.nextInt();
//		Employee e = es.getEmployee(empId);
//		System.out.println(e);



		// 4. ----------- Update Employee ------------
//		Employee e = es.getEmployee(52);
//		if(e != null) {
//			e.setDob(LocalDate.of(2000, 1, 2));
//			System.out.println(es.updateEmployee(e));
//		} else {
//			System.out.println("Employee Not Found");
//		}



		// 5. ------------ Remove Employee -------------
//		System.out.println("Enter Employee Id: ");
//		int eId =  sc.nextInt();
//		System.out.println(es.removeEmployee(eId));



		// 6. ------------- Find by name (by non-primary key) -----------
//		es.getEmployeeByName("Jack").forEach(System.out::println);



		// 7. ------------- Find employee whose salary is less than 60000 -------------
//		es.getEmployeeBySalaryLessThan(60000).forEach(System.out::println);



		// 8. ------------ Find Employee born in Jan of 2003 --------------
		// es.getByDOB(1, 2003).forEach(System.out::println);
		// es.getByDOB(LocalDate.of(2003, 1, 1), LocalDate.of(2003, 1, 31)).forEach(System.out::println);
		// es.getByDobBetween(LocalDate.of(2003, 1, 1), LocalDate.of(2003, 1, 31)).forEach(System.out::println);
	}
}
