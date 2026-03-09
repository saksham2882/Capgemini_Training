package com.cg.relationship_mapping.OneToMany_Exercise;

import jakarta.persistence.*;


@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;

    private String empName;
    private int empSal;

    @ManyToOne                                        // Many-to-one, Making bidirectional, (Two table)
    @JoinColumn(name = "department_id")               // used for the naming of the foreign key
    private Department dept;


    public Employee() {}

    public Employee(String empName, int empSal, Department dept) {
        super();
        this.empName = empName;
        this.empSal = empSal;
        this.dept = dept;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
