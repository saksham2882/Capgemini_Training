package com.cg.main;


import com.cg.bean1.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

    public static void main(String[] args) {

//        Car honda = new Car(new PetrolEngine(), new MRFTyre());
//        honda.setName("Honda");
//        honda.printCar();



        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Car car = (Car) context.getBean("car");
//        car.setName("Honda City");
        // Now set name using the data.properties file
        car.printCar();
    }
}
