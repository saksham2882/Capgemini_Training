package com.cg.bean;

public class Book {
    private int bookId;
    private String title;
    private String author;


    // ================= Using the Constructor Injection ==================
    public Book() {}

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }


    // ================ Using the Setter Injection =================
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ']';
    }

    public void displayBookDetails(){
        System.out.println("Book Details:");
        System.out.println("----------------------");
        System.out.println("Book Id: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
