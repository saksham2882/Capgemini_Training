package com.cg.bean1;

/*
 * This Car Class is loose coupled
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//@Component
//@Service
@Repository
public class Car {
    @Value("${carname}")
    private String name;

    @Autowired
//    @Qualifier("CNGEngine")
    @Qualifier("cng")
    private IEngine engine;

    @Autowired
//    @Qualifier("JKTyre")
    @Qualifier("jk")
    private ITyre tyre;



    public Car() {}

    public Car(IEngine engine, ITyre tyre) {
        super();
        this.engine = engine;
        this.tyre = tyre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public ITyre getTyre() {
        return tyre;
    }

    public void setTyre(ITyre tyre) {
        this.tyre = tyre;
    }

    public void printCar(){
        System.out.println("Car name: " + name);
        System.out.println("BHP: " + engine.getBHP());
        System.out.println("Tyre Details: " + tyre.getTyreDetails());
    }
}
