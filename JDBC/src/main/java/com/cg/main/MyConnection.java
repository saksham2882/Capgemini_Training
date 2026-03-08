package main.java.com.cg.main;

import java.sql.*;
import java.util.Scanner;

public class MyConnection {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded.....");


            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Saksham");
            System.out.println("Connected to database...");

            Statement stat = con.createStatement();

//            ResultSet rs = stat.executeQuery("SELECT * FROM emp");           // return ResultSet
//            // rs.next();                                                    // return boolean value (return true when it is able to move to next row)

//            while (rs.next()) {
//                // System.out.println(rs.getString(2));
//                System.out.println(rs.getString("ENAME") + "\t" + rs.getString("JOB") + "\t\t" + rs.getString("SAL") + "\t\t\t" + rs.getDate(5));
//            }


              // 1. Using "Statement"
              // Example: Read the Data
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter Employee ID Number: ");
//            int eid = sc.nextInt();
//            ResultSet rs = stat.executeQuery("SELECT * FROM emp WHERE EMPNO = " + eid);
//
//            if(rs.next()) {
//                System.out.println("Employee Name: " + rs.getString("ENAME") + ", JOB: " + rs.getString("JOB"));
//            } else {
//                System.out.println("Employee ID: N/A");
//            }


            // 2. Using "PreparedStatement" (for dynamic statement)
            // Example 1: Read the Data
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter Employee ID Number: ");
//            int eid = sc.nextInt();
//
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM emp WHERE EMPNO=?");
//            ps.setInt(1, eid);
//
//            ResultSet rs = ps.executeQuery();
//
//            if(rs.next()) {
//                System.out.println("Employee Name: " + rs.getString("ENAME") + ", JOB: " + rs.getString("JOB"));
//            } else {
//                System.out.println("Employee ID: N/A");
//            }


            // 2. Using "PreparedStatement" (for dynamic statement)
            // Example 2:
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM emp WHERE EMPNO=? AND ENAME=?");
//            ps.setInt(1, 7499);
//            ps.setString(2, "ALLEN");
//
//            ResultSet rs = ps.executeQuery();
//
//            if(rs.next()) {
//                System.out.println("Employee Name: " + rs.getString("ENAME") + ", JOB: " + rs.getString("JOB") + ", SAL: " + rs.getString("SAL") + ", Hire Date: " +  rs.getString("HIREDATE"));
//            } else {
//                System.out.println("Employee ID: N/A");
//            }



            // 2. Using the "PreparedStatement"
            // Example 3: Inserting the new Data
//            PreparedStatement ps = con.prepareStatement("INSERT INTO EMP VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
//            ps.setInt(1, 143);
//            ps.setString(2, "Saksham");
//            ps.setString(3, "Developer");
//            ps.setInt(4, 7902);
//            // ps.setDate(5, new Date(System.currentTimeMillis()));
//            ps.setString(5, "2026-01-01");
//            ps.setFloat(6, 43000.0F);
//            ps.setFloat(7, 1000.0F);
//            ps.setInt(8, 10);
//
//            int rows = ps.executeUpdate();
//            if(rows > 0) {
//                System.out.println("Inserted records in table EMP");
//            }



            // 2. Using the "PreparedStatement"
            // Example 4: Updating the Data
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter employee id no.: ");
//            int id = sc.nextInt();
//            System.out.println("Enter employee new salary: ");
//            float sal = sc.nextFloat();
//            System.out.println("Enter updated job role: ");
//            String role = sc.next();
//
//            PreparedStatement ps = con.prepareStatement("UPDATE EMP SET SAL=?, JOB=? WHERE EMPNO=?");
//            ps.setFloat(1, sal);
//            ps.setString(2, role);
//            ps.setInt(3, id);
//
//            int rows = ps.executeUpdate();
//            if(rows > 0) {
//                System.out.println("Employee updated.");
//            } else {
//                System.out.println("Employee not updated.");
//            }



            // 2. Using the "PreparedStatement"
            // Example 5: Delete the Data
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter Employee ID: ");
//            int id = sc.nextInt();
//            PreparedStatement ps1 = con.prepareStatement("DELETE FROM EMP WHERE EMPNO=?");
//            ps1.setInt(1, id);
//
//            int rows1 = ps1.executeUpdate();
//
//            if(rows1 > 0) {
//                System.out.println("Employee deleted.");
//            } else {
//                System.out.println("Employee not deleted.");
//            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
