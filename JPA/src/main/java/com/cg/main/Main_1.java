package main.java.com.cg.main;

import main.java.com.cg.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;

public class Main_1 {
    public static void main(String[] args) {

        Product p1 = new Product(113, "iPhone 16", 75000, 11, LocalDate.of(2025, 1, 6));
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // 1. Find the product based on pid
//        Product p = em.find(Product.class, 104);
//
//        // change the price, and this only reflect in persistence context, not change in database until I commit.
//        // p.setPrice(87499);
//
//        if (p != null) {
//            // em.remove(p);
//            System.out.println(p);
//        } else {
//            System.out.println("Product   not found");
//        }



        // 2. get all the data from database
        // List<Product> ls = em.createQuery("select p from Product p").getResultList();
        // ls.forEach(System.out::println);

        em.persist(p1);
        em.getTransaction().commit();
        System.out.println("Created product");
    }
}
