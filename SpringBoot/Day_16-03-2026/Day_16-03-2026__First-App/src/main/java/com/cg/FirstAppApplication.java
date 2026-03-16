package com.cg;

import com.cg.bean.Address;
import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
// @ComponentScan("com")                            // scan the "com" package
@PropertySource("classpath:data.properties")
public class FirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstAppApplication.class, args);


//		HelloWorld h = ctx.getBean(HelloWorld.class);
//		System.out.println("====================== ");
//		System.out.println(h.sayHello("Saksham"));


		Employee emp = ctx.getBean(Employee.class);
		System.out.println("---------------");
		emp.printEmployeeInfo();
	}


	@Bean
	public Address getBean1(){
		Address address = new Address();
		address.setCity("Seoul");
		address.setCountry("Korea");
		address.setZip(12345);
		return address;
	}

	@Bean
	public Address getBean2(){
		Address address = new Address();
		address.setCity("Tokyo");
		address.setCountry("Japan");
		address.setZip(29834);
		return address;
	}
}