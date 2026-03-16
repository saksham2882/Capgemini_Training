package com.cg;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataAppApplication.class, args);

		IEmployeeRepo e_repo = ctx.getBean(IEmployeeRepo.class);

		e_repo.save(new Employee("Jack", LocalDate.of(2000, 12, 3), 76000));

		System.out.println("Employee saved successfully");
	}
}
