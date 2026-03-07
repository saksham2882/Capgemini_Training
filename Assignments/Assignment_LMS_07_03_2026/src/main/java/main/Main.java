package main;

import entity.Author;
import entity.Book;
import service.AuthorService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AuthorService s = new AuthorService();

        while (true) {
            System.out.println("======= Library Management System =======");
            System.out.println("1. Add Author");
            System.out.println("2. Read Authors and Books");
            System.out.println("3. Update Book Price");
            System.out.println("4. Delete Author");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Author Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Author Email: ");
                    String email = sc.nextLine();

                    Author a = new Author();
                    a.setAuthorName(name);
                    a.setEmail(email);

                    System.out.println("\nHow many Books you want to create? : ");
                    int bookCount = sc.nextInt();
                    sc.nextLine();
                    List<Book> books = new ArrayList<>();

                    while(bookCount > 0){
                        System.out.print("Enter Book Title:");
                        String title = sc.nextLine();
                        System.out.print("Enter Book Price: ");
                        int price = sc.nextInt();

                        books.add(new Book(title, price));
                        bookCount--;
                    }

                    s.createAuthor(a,books);
                    break;

                case 2:
                    s.readAuthors();
                    break;

                case 3:
                    System.out.println("Enter Book Id: ");
                    int id = sc.nextInt();
                    System.out.println("Enter Book New Price: ");
                    int price = sc.nextInt();

                    s.updatePrice(id, price);
                    break;

                case 4:
                    System.out.println("Enter Book Id: ");
                    int bid = sc.nextInt();
                    s.deleteBook(bid);
                    break;

                case 5:
                    System.out.println("Enter Author Id: ");
                    int aid = sc.nextInt();
                    s.deleteAuthor(aid);
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
