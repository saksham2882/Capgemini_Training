package dao;

import entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BookDao {
    private static EntityManagerFactory emf;
    private static EntityManager em;

    static {
        emf = Persistence.createEntityManagerFactory("my-pu");
        em = emf.createEntityManager();
    }

    // 3. Update Book Price
    public void updateBookPrice(int id, int price){
        em.getTransaction().begin();
        Book book = em.find(Book.class, id);

        if(book != null){
            System.out.println("Old Price: " + book.getPrice());
            book.setPrice(price);
            System.out.println("New Price: " + price);
            em.getTransaction().commit();
        }
    }

    // 4. Delete Book
    public void deleteBook(int id){
        em.getTransaction().begin();
        Book b = em.find(Book.class, id);

        if(b != null){
            em.remove(b);
            System.out.println("Book Delected");
            em.getTransaction().commit();
        }
    }
}
