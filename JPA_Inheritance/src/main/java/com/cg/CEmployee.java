package com.cg;

import jakarta.persistence.Entity;

@Entity
// @DiscriminatorValue("contract-Emp")
public class CEmployee extends Employee {

    private double payPerHour;

    public CEmployee() {}

    public CEmployee(double payPerHour) {
        this.payPerHour = payPerHour;
    }

    public double getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(double payPerHour) {
        this.payPerHour = payPerHour;
    }
}
