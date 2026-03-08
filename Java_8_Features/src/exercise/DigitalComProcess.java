package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitalComProcess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        GameService service = new GameService();

        int choice;

        while(true){
            System.out.println("\n ---------- CUSTOMER PORTAL -------- \n");
            System.out.println("1. Register User");
            System.out.println("2. ViewGames");
            System.out.println("3. searchByName");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n ---------- Register User --------- \n");

                    System.out.println("Enter your ID");
                    String userid = sc.next();
                    System.out.println("Enter your Password");
                    String password = sc.next();

                    user.addUser(userid, password);
                    break;

                case 2:
                    System.out.println("\n ---------- Please Authenticate First ----------- \n");
                    System.out.println("Enter your ID");
                    String gid = sc.next();
                    System.out.println("Enter your Password");
                    String pwd = sc.next();

                    if(user.IsAuthenticated(gid,pwd)){
                        System.out.println("\n --------- View Games ---------- \n");

                        ArrayList<Game> gameList = service.viewAll();
                        for (Game g : gameList) {
                            System.out.println(g);
                        }
                    }
                    else {
                        System.out.println("\n ----------- You are not Authenticated --------- \n");
                    }
                    break;

                case 3:
                    System.out.println("\n ----------- Please Authenticate First ---------- \n");
                    System.out.println("Enter your ID");
                    String gid1 = sc.next();
                    System.out.println("Enter your Password");
                    String pwd1 = sc.next();

                    if(user.IsAuthenticated(gid1,pwd1)){
                        System.out.println("\n ------------ search By Name --------- \n");

                        System.out.print("Enter Author Name: ");
                        String author = sc.next();

                        String ans = service.authorSearch(author);
                        System.out.println("Game Name: " + ans);
                    }
                    else {
                        System.out.println("\n -------- You are not Authenticated ----------- \n");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Application...");
                    System.exit(0);

                default:
                    System.out.println("\n --------- Invalid choice ---------- \n");
            }
        }
    }
}
