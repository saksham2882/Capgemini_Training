package service;

import dao.AuthorDao;
import dao.BookDao;
import entity.Author;
import entity.Book;

import java.util.List;
import java.util.Scanner;

public class AuthorService {
    AuthorDao authorDao = new AuthorDao();
    BookDao bookDao = new BookDao();
    Scanner sc = new Scanner(System.in);

    // 1. Create Author with Books
    public void createAuthor(Author author, List<Book> books) {
        if(books.isEmpty()) {
            System.out.println("Please enter books");
            return;
        }
        authorDao.createAuthorWithBooks(author,books);
        System.out.println("Author created successfully");
    }


    // 2. Read Author
    public void readAuthors(){
        authorDao.getAllAuthorsAndBooks();
    }

    // 3. Update book price
    public void updatePrice(int id, int price){
        if(id < 0 || price < 0){
            System.out.println("Please enter valid id");
            return;
        }
        bookDao.updateBookPrice(id, price);
    }

    // 4. Delete Book
    public void deleteBook(int id){
        if(id < 0){
            System.out.println("Please enter valid id");
            return;
        }
        bookDao.deleteBook(id);
    }

    // 5. Delete Author
    public void deleteAuthor(int id){
        if(id < 0){
            System.out.println("Please enter valid id");
            return;
        }
        authorDao.deleteAuthor(id);
    }
}
