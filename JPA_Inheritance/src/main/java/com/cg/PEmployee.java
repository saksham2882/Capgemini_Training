package com.cg;

import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue("permanent-Emp")
public class PEmployee  extends  Employee{

    private double salary;

    public PEmployee() {}

    public PEmployee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
