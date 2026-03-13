package com.cg.main;

import com.cg.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // 1. Creating the Object normally
//        HelloWorld helloWorld = new HelloWorld();
//        String greet = helloWorld.sayHello("Saksham");
//        System.out.println(greet);



        // 2. using xml configuration (using the scope (default) => "singleton" -> same object)
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        HelloWorld h1 = (HelloWorld) context.getBean("hello");
//        HelloWorld h2 = (HelloWorld) context.getBean("hello");
//
//        System.out.println(h1.sayHello("Saksham"));
//        System.out.println(h2.sayHello("Saksham"));
//
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h1 == h2);
//
//        context.close();



        // 2. using XML configuration (change the scope to => "prototype" -> different object create)
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        HelloWorld h1 = (HelloWorld) context.getBean("hello");
//        HelloWorld h2 = (HelloWorld) context.getBean("hello");
//
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h1 == h2);
//
//        h1.setName("Saksham");
//
//        System.out.println(h1.sayHello());
//        System.out.println(h2.sayHello());
//
//        context.close();



       // Example 1: Without Setter Injection
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        HelloWorld h1 = (HelloWorld) context.getBean("hello");
//        // set the name using the setName
//        // h1.setName("Saksham");                         // without the setter injection (not set the property name and value) give the NULLPointerException
//        System.out.println(h1.sayHello());
//        context.close();



        // Example 2: With Setter Injection
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        HelloWorld h1 = (HelloWorld) context.getBean("hello");
//        System.out.println(h1.sayHello());                  // NOTE: set the name from the bean property
//        context.close();



        // 3. Example: With Constructor Injection (using the constructor-args in bean.xml)
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        HelloWorld h1 = (HelloWorld) context.getBean("hello");
//        System.out.println(h1.sayHello());                  // NOTE: set the name from the bean constructor-args
//        context.close();


        // 2.1. Example: With Setter Injection (for multiple property like list, set, map etc.)
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld h1 = (HelloWorld) context.getBean("hello");
        System.out.println(h1.sayHello());                   // NOTE: set the name from the bean setter injection
        System.out.println("======= Language ======");
        System.out.println(h1.getLanguage());                // NOTE: set the language list using the setter Injection
        context.close();

    }
}
