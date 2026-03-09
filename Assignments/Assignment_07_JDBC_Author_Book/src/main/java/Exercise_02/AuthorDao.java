package Exercise_02;

import java.sql.*;


public class AuthorDao {
    private  static Connection con;

    static {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Saksham");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    // 1. Insert:
    public String insertAuthor(Author a) {
        try {
            PreparedStatement ps = con.prepareStatement("insert into author values(?,?,?,?,?)");

            ps.setInt(1, a.getAuthorId());
            ps.setString(2, a.getFirstName());
            ps.setString(3, a.getMiddleName());
            ps.setString(4, a.getLastName());
            ps.setString(5, a.getPhoneNo());

            int rows = ps.executeUpdate();
            if (rows > 0) {
                return "Author Inserted";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Author Not Inserted";
    }


    // 2. Find by ID:
    public Author findById(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("select * from author where authorId=?");

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Author(rs.getInt("authorId"), rs.getString("firstName"), rs.getString("middleName"), rs.getString("lastName"), rs.getString("phoneNo"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }


    // 3. Update:
    public String updatePhone(int id, String phone) {
        try {
            PreparedStatement ps = con.prepareStatement("update author set phoneNo=? where authorId=?");

            ps.setString(1, phone);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                return "Author Updated";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Author Not Updated";
    }


    // 4. Delete:
    public String deleteAuthor(int id) {
        try {
            PreparedStatement ps = con.prepareStatement("delete from author where authorId=?");

            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                return "Author Deleted";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Author Not Deleted";
    }
}
