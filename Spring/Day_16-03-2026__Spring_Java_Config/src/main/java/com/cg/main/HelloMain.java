package com.cg.main;


import com.cg.bean.HelloWorld;
import com.cg.cfg.MyConfig;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloMain {
    public static void main(String[] args) {

        // ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");      // This line is used to initialize the Spring Container, (Application Context is Child of BeanFactory)
        // BeanFactory ctx = new ClassPathXmlApplicationContext("bean.xml");                 // Parent of ApplicationContext. It is only used to get the "bean".
        // HelloWorld h = (HelloWorld) ctx.getBean("h");
        //  System.out.println(h.sayHello());


        // ------------ NOTE: Now we use the Java Based Configuration so, no need of bean.xml -------------


        // ============= Java Based Configuration ===============
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        // HelloWorld h1 = (HelloWorld) ctx.getBean("h");                                    // If give the name to Bean

        HelloWorld h1 = ctx.getBean(HelloWorld.class);
        HelloWorld h2 = ctx.getBean(HelloWorld.class);

        System.out.println(h1.sayHello());
        System.out.println(h2.sayHello());
        System.out.println(h1 == h2);
    }
}
