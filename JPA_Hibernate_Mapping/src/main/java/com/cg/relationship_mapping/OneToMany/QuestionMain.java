package com.cg.relationship_mapping.OneToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QuestionMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
        EntityManager em = emf.createEntityManager();

        // ======== 1. Using Three Table ==========
//        em.getTransaction().begin();
//        Question q = new Question("What is Java", "Medium");
//        List<Answer> li = new ArrayList<Answer>();
//
//        li.add(new Answer("Java is OOP Programming"));
//        li.add(new Answer("Java is Platform Independent"));
//        li.add(new Answer("Java is Simple"));
//
//        q.setAnswer(li);
//        em.persist(q);
//        em.getTransaction().commit();
//        System.out.println("Question Added successfully");


//        Question q = em.find(Question.class, 1);
//        System.out.println(q.getQuestionName());



        // ======= 2. Using Two Table ========
//        em.getTransaction().begin();
//        Question q = new Question("What is Java", "Medium");
//        List<Answer> li = new ArrayList<Answer>();
//
//        li.add(new Answer("Java is OOP Programming", q));
//        li.add(new Answer("Java is Platform Independent", q));
//        li.add(new Answer("Java is Simple", q));
//
//        q.setAnswer(li);
//        em.persist(q);
//        em.getTransaction().commit();
//        System.out.println("Question Added successfully");

        Answer ans = em.find(Answer.class, 2);
        System.out.println("======= Answer ========");
        System.out.println(ans.getAnswer());
        System.out.println("======== Question =======");
        System.out.println(ans.getQuestion().getQuestionName());

    }
}
