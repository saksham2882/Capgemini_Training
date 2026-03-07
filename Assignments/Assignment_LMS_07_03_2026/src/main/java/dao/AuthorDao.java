package dao;

import entity.Author;
import entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class AuthorDao {
    private static EntityManagerFactory emf;
    private static EntityManager em;

    static {
        emf = Persistence.createEntityManagerFactory("my-pu");
        em = emf.createEntityManager();
    }

    // 1. Create Author with multiple Books
    public void createAuthorWithBooks(Author author, List<Book> books) {
        em.getTransaction().begin();
        author.setBooks(books);
        em.persist(author);
        em.getTransaction().commit();
    }

    // 2. Read All authors with their books
    public void getAllAuthorsAndBooks() {
        List<Author> authors = em.createQuery("from Author", Author.class).getResultList();

        for (Author author : authors) {
            System.out.println("Author Id: " + author.getAuthorId());
            System.out.println("Author Name: " + author.getAuthorName());

            System.out.println("Books Written:");
            System.out.println("----------------------");

            for(Book b : author.getBooks()){
                System.out.println(b.getTitle() + " - " + b.getPrice());
            }
        }
    }


    // 4. Delete Author
    public void deleteAuthor(int id){
        em.getTransaction().begin();
        Author author = em.find(Author.class, id);

        if(author != null){
            em.remove(author);
            System.out.println("Author Deleted");
            em.getTransaction().commit();
        }
    }
}
