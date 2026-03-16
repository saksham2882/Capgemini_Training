package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Employee {
    @Value("${empId}")
    private int empId;

    @Value("${name}")
    private String name;

    // @Autowired                                       // -> not recommended to use in the field injection
    // private Address address;

    @Autowired
    private List<Address> address;


    // public Employee() {}

    // NOTE: If we use the constructor injection so, no need to write the @Autowired

    // use the constructor injection
    // @Autowired                                       // no need, if not using the default constructor
    // public Employee(Address address) {
    //     this.address = address;
    // }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }


    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public void printEmployeeInfo(){
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " +name);
        System.out.println("======== Address =======");

        for (Address a : address) {
            System.out.println("City: " + a.getCity() + ", Country: " + a.getCountry() + ", Zip: " + a.getZip());
        }
    }
}


// NOTE: Using the Autowired in field Injection is not recommended.