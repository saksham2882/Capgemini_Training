package com.cg;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class EmployeeMain {

    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em= emf.createEntityManager();

        em.getTransaction().begin();

        PEmployee obj = new PEmployee();
        obj.setName("Deep");
        obj.setDob(LocalDate.of(2003,6,10));
        obj.setSalary(480000);
        em.persist(obj);

        CEmployee obj2 = new CEmployee();
        obj2.setName("Ashtam");
        obj2.setDob(LocalDate.of(2003,1,1));
        obj2.setPayPerHour(10000);
        em.persist(obj2);

        em.getTransaction().commit();
        System.out.println("Created.......");
    }
}
