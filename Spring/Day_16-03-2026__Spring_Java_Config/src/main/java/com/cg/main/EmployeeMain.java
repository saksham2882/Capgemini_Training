package com.cg.main;

import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import com.cg.cfg.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class EmployeeMain {
    public static void main(String[] args) {

        // ============= Java Based Configuration ===============
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);

        Employee e = ctx.getBean(Employee.class);
        e.printEmployeeInfo();
    }
}
