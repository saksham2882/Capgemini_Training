package com.cg.relationship_mapping.OneToMany_Exercise;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dId;

    @Column(unique = true)
    private String dName;

    @OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)         // mapped is used to map the dept in employee (two table)
    private List<Employee> emp;


    public Department(){}

    public Department(String dName) {
        super();
        this.dName = dName;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", emp=" + emp +
                '}';
    }
}
