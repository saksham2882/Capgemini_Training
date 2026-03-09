package com.cg.relationship_mapping.OneToOne;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;

    private String name;
    private LocalDate dob;

    // @OneToOne(cascade = CascadeType.ALL)                                     // By Default Eager Loading
    // @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)            // relation one-to-one, Cascade provide the ownership, (NOTE: One-to-One is Eager loading, and for One-to-One is Lazy loading)
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)                // relation one-to-one, Cascade provide the ownership, (NOTE: One-to-One is Eager loading)
    @JoinColumn(name = "Person_DL")                                             // Name the foreign key attribute
    private Dl dl;


    public Person() {}

    public Person(String name, LocalDate dob) {
        super();
        this.name = name;
        this.dob = dob;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Dl getDl() {
        return dl;
    }

    public void setDl(Dl dl) {
        this.dl = dl;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", dl=" + dl +
                '}';
    }
}
