package com.cg.relationship_mapping.OneToMany_Exercise;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class DepartmentMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        // ======== Department Unidirectional (one to many) Example ===========

        // 1. Create Department
//        em.getTransaction().begin();
//        List<Employee> emp = new ArrayList<>();
//        emp.add(new Employee("Mohit", 4000));
//        emp.add(new Employee("Kim", 3000));
//        emp.add(new Employee("John", 7000));
//
//        Department d = new Department("Full Stack Developer", emp);
//        em.persist(d);
//        em.getTransaction().commit();
//        System.out.println("Department has been created");



        // 1. Other way:
//        Department dept = em.find(Department.class, 1);
//        dept.setEmp(List.of(new Employee("Ashtam", 5000), new Employee("Deep", 5000)));
//        em.getTransaction().commit();


        // 2. Find the Employee using the Department
//        Department dm = em.find(Department.class, 1);
//        System.out.println("====== Department Info ====== ");
//        System.out.println(dm);
//        System.out.println("====== Department Name ======");
//        System.out.println(dm.getdName());
//        System.out.println("====== Department Employee Info ====== ");
//        System.out.println(dm.getEmp());
    }
}
