package com.cg.relationship_mapping.OneToMany_Exercise;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class Department_Main_1 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        // ======== Bidirectional Example ===========

        // 1. Create Department
//        em.getTransaction().begin();
//        Department d = new Department("Developer");
//
//        List<Employee> emp = new ArrayList<>();
//        emp.add(new Employee("Mohit", 4000, d));
//        emp.add(new Employee("Kim", 3000, d));
//        emp.add(new Employee("John", 7000, d));
//
//        d.setEmp(emp);
//        em.persist(d);
//        em.getTransaction().commit();
//        System.out.println("Department has been created");


        // 1. Find the Employee using the Department
//        Department dm = em.find(Department.class, 1);
//        System.out.println("====== Department Info ====== ");
//        System.out.println(dm);
//        System.out.println("====== Department Name ======");
//        System.out.println(dm.getdName());
//        System.out.println("====== Department Employee Info ====== ");
//        System.out.println(dm.getEmp());


        // 1. Find the Department using the Employee
        Employee emp = em.find(Employee.class, 3);
        System.out.println("====== Employee Info ====== ");
        System.out.println(emp);
        System.out.println("====== Department Info =======");
        System.out.println(emp.getDept());

    }
}
