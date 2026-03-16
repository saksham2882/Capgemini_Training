package com.cg.cfg;

import com.cg.bean.Address;
import com.cg.bean.Employee;
import com.cg.bean.HelloWorld;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:data.properties")
@ComponentScan("com")                                 // NOTE: use to scan the bean present in the com package
public class MyConfig {

    // ================= If we use the

//    // @Bean("h")
//    @Bean
//    @Scope("prototype")
//    public HelloWorld getBean(){
//        HelloWorld hello = new HelloWorld();
//        hello.setName("Saksham");
//        return hello;
//    }
//
//
//    @Bean
//    public Employee getBean1(){
//        return new Employee(getBean2());
//    }
//
//    @Bean
//    public Address getBean2(){
//        return new Address();
//    }
//
//    @Bean
//    public Address getBean3(){
//        Address address = new Address();
//        address.setCity("Paris");
//        address.setCountry("France");
//        address.setZip(78542);
//
//        return address;
//    }
}
