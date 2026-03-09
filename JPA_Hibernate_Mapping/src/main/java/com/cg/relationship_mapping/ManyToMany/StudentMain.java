package com.cg.relationship_mapping.ManyToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.HashSet;
import java.util.Set;

public class StudentMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();


//        em.getTransaction().begin();
//        Student s = new Student("Rahul");
//
//        Course c1 = new Course("Java");
//        Course c2 = new Course("SpringBoot");
//        em.persist(c1);
//        em.persist(c2);
//
//        Set<Course> li = new HashSet<>();
//        li.add(c1);
//        li.add(c2);
//        s.setCourses(li);
//        em.persist(s);
//
//        em.getTransaction().commit();
//        System.out.println("Created....");


        // 2. Other way: by finding the course and then add the student in the course
        em.getTransaction().begin();
        Student s = new Student("John");

        Course c = em.find(Course.class, 1);

        Set<Course> li = new HashSet<>();
        li.add(c);
        s.setCourses(li);
        em.persist(s);

        em.getTransaction().commit();
        System.out.println("Created....");
    }
}
