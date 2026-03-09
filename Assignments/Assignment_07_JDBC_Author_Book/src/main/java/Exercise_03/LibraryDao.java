package Exercise_03;

import java.sql.*;
import java.util.Random;


public class LibraryDao {
    private  static Connection con;

    static {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root", "Saksham");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // --------- Question 1: ---------
    public void getBooksByAuthor(String authorName) {
        try {
            PreparedStatement ps = con.prepareStatement(
                            "select b.title from book b " +
                            "join book_author ba on b.isbn = ba.book_isbn " +
                            "join author a on a.id = ba.author_id " +
                            "where a.name = ?"
            );

            ps.setString(1, authorName);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("title"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    // --------- Question 2: ---------
    public void insertBookAuthor(String authorName, String title, double price) {
        try {
            int authorId = new Random().nextInt(1000);
            int isbn = Math.abs(new Random().nextInt() % 1000);

            // Insert Author
            PreparedStatement ps1 = con.prepareStatement("insert into author values(?,?)");
            ps1.setInt(1, authorId);
            ps1.setString(2, authorName);
            ps1.executeUpdate();

            // Insert Book
            PreparedStatement ps2 = con.prepareStatement("insert into book values(?,?,?)");
            ps2.setLong(1, isbn);
            ps2.setString(2, title);
            ps2.setDouble(3, price);
            ps2.executeUpdate();

            // Insert into main table
            PreparedStatement ps3 = con.prepareStatement("insert into book_author values(?,?)");
            ps3.setLong(1, isbn);
            ps3.setInt(2, authorId);
            ps3.executeUpdate();

            System.out.println("Inserted Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    // --------- Question 3: ----------
    public void updatePriceByAuthor(String authorName, double newPrice) {
        try {
            PreparedStatement ps = con.prepareStatement(
                    "update book b " +
                            "join book_author ba on b.isbn = ba.book_isbn " +
                            "join author a on a.id = ba.author_id " +
                            "set b.price = ? " +
                            "where a.name = ?"
            );

            ps.setDouble(1, newPrice);
            ps.setString(2, authorName);

            int rows = ps.executeUpdate();
            if(rows > 0)
                System.out.println("Price Updated");
            else
                System.out.println("No Records Found");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
