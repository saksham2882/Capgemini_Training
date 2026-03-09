package Exercise_03;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {

        LibraryDao dao = new LibraryDao();
        Scanner sc = new Scanner(System.in);


        // --------- Question 2: -----------
//        System.out.print("Author Name: ");
//        String an = sc.nextLine();
//        System.out.print("Book Title: ");
//        String bt = sc.nextLine();
//        System.out.print("Price: ");
//        double pr = sc.nextDouble();
//
//        dao.insertBookAuthor(an, bt, pr);



        // --------- Question 1: -----------
//        System.out.print("Author Name: ");
//        dao.getBooksByAuthor(sc.nextLine());



        // --------- Question 3: -----------
        System.out.print("Author Name: ");
        String name = sc.nextLine();
        System.out.print("New Price: ");
        double price = sc.nextDouble();

        dao.updatePriceByAuthor(name, price);

    }
}
