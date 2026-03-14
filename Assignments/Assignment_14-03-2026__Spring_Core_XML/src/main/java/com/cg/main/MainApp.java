package com.cg.main;

import com.cg.bean.Librarian;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Librarian lb = (Librarian) context.getBean("librarian");
        lb.issueBook();
    }
}
