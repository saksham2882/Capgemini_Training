package com.cg.entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity                                                        // Mapping file for the database (if you want to persist then use @Entity)
@Table(name = "productData")
public class Product {
    @Id                                                        // this particular attribute acts as a primary key
    @Column(name = "product_id")
//    @GeneratedValue(strategy = GenerationType.AUTO)          // auto generate id field
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(name = "my_seq", sequenceName = "prod_seq", allocationSize = 1, initialValue = 100)
    private int pid;

    @Column(name = "product_name", nullable = false, length = 50)
    private String name;

    @Column(name = "product_price")
    private double price;

    // @Transient
    @Column(name = "product_qty")
    private int qty;

    @Column(name = "product_dom")
    private LocalDate dom;


    public Product() {
    }


    public Product(String name, double price, int qty, LocalDate dom) {
        super();
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.dom = dom;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public LocalDate getDom() {
        return dom;
    }

    public void setDom(LocalDate dom) {
        this.dom = dom;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", dom=" + dom +
                '}';
    }
}
