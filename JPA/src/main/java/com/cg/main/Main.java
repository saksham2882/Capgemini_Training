package main.java.com.cg.main;

import main.java.com.cg.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(103, "iPhone 16", 75000, 5, LocalDate.of(2025, 1, 6));
        Product p2 = new Product(104, "Samsung Galaxy S25", 82000, 8, LocalDate.of(2025, 2, 15));
        Product p3 = new Product(105, "OnePlus 13", 65000, 10, LocalDate.of(2025, 3, 10));
        Product p4 = new Product(106, "Google Pixel 9", 78000, 6, LocalDate.of(2025, 4, 5));
        Product p5 = new Product(107, "Nothing Phone 3", 52000, 12, LocalDate.of(2025, 5, 20));

        // read the persistence unit configuration and create EntityManagerFactor, it creates a connection setup to the database. usually created only once per application
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");

        // create EntityManager which is responsible for performing CRUD operations.
        // It acts as a bridge between Java objects and the database
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // save or persist the product object in persistence context (like cache)
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.persist(p5);

        // p1.setPrice(3000);     // before the commit we can change the fields, in the persistence context and changes are shown in database after commit.

        tx.commit();              // if we not commit, then the object present in persistence context is not stored in database.

        // p1.setPrice(200);      // after commit, no changes happened

        System.out.println("Product created successfully");
    }
}
