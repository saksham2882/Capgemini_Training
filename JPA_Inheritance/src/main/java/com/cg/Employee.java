package com.cg;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(name = "Emp_type")
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;

    private String name;
    private LocalDate dob;


    public Employee() {}

    public Employee(int empId, String name, LocalDate dob) {
        this.empId = empId;
        this.name = name;
        this.dob = dob;
    }

    public Employee(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
