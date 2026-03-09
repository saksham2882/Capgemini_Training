package com.cg.relationship_mapping.OneToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();
        Scanner sc = new Scanner(System.in);

        em.getTransaction().begin();
        // Person p = new Person("Amit", LocalDate.of(2003, 10, 12));
        // Person p = new Person("Mohit", LocalDate.of(1999, 10, 12));
        Person p = new Person("Harry", LocalDate.of(1989, 4, 1));

        Dl obj = new Dl(LocalDate.of(2028, 9, 12), LocalDate.of(2012, 8,12), "LMV, HMV");
        p.setDl(obj);

        // em.persist(obj);       // first persist the DL then used in Person.
        em.persist(p);

        em.getTransaction().commit();
        System.out.println("Person Created......");



        // 2. Find the Person with pid
//        System.out.println("Enter Person ID: ");
//        int id = sc.nextInt();
//        Person pf = em.find(Person.class, id);
//        System.out.println(pf);


        // 3. Update Person Name
//        System.out.println("Enter Person Id: ");
//        int id2 = sc.nextInt();
//        Person pf2 = em.find(Person.class, id2);
//
//        if (pf2 != null) {
//            em.getTransaction().begin();
//            System.out.println("Enter the new DL Type: ");
//            String type = sc.next();
//            pf2.getDl().setType(type);
//            em.getTransaction().commit();
//            System.out.println(pf2);
//        }


        // 4. Delete Person
        // System.out.println("Enter Person Id: ");



        // Detach Example
//        Person p1 = em.find(Person.class, 202);
//        System.out.println(p1.getName());
//        // em.detach(p1);                                  // Detach the Person Object from the Database (Exception : LazyInitializationException)
//        System.out.println("===== DL =======");
//        System.out.println(p1.getDl());

    }
}