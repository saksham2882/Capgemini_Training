package Exercise_02;

import java.util.Scanner;


public class AuthorMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AuthorDao dao = new AuthorDao();


        // ------ 1. Insert: -------
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("First Name: ");
        String fn = sc.nextLine();
        System.out.print("Middle Name: ");
        String mn = sc.nextLine();
        System.out.print("Last Name: ");
        String ln = sc.nextLine();
        System.out.print("Phone: ");
        String ph = sc.nextLine();

        System.out.println(dao.insertAuthor(new Author(id, fn, mn, ln, ph)));



        // -------- 2. Find By Id: ---------
//        System.out.print("Enter ID: ");
//        Author a = dao.findById(sc.nextInt());
//
//        if (a != null) {
//            System.out.println(a.getFirstName() + " " + a.getMiddleName() + " " + a.getLastName() + " " + a.getPhoneNo());
//        }
//        else {
//            System.out.println("Not Found");
//        }



        // -------- 3. Update: ---------
//        System.out.print("Enter ID: ");
//        int uid = sc.nextInt();
//        sc.nextLine();
//        System.out.print("New Phone: ");
//        String newPhone = sc.nextLine();
//
//        System.out.println(dao.updatePhone(uid, newPhone));



        // --------- 4. Delete: ---------
//        System.out.print("Enter ID: ");
//        System.out.println(dao.deleteAuthor(sc.nextInt()));
    }
}
