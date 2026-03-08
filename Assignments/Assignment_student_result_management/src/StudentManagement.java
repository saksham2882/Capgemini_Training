import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        CheckValidation check = new CheckValidation();
        StoreData store = new StoreData();

        System.out.println("How many students would you like to add? : ");
        int std_count = sc.nextInt();
        int idx = 1;

        System.out.println("\nEnter Students Details: \n");

        while (std_count > 0) {
            // Student Id:
            System.out.print(idx + ". Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            // Student Name
            String name;
            while (true) {
                System.out.print(idx + ". Enter Student Name: ");
                name = sc.nextLine();
                try {
                    check.checkName(name);
                    break;
                }
                catch (InvalidNameException e) {
                    System.out.println("Invalid name! Only alphabets allowed. Try again.");
                }
            }


            // Student Course
            System.out.print(idx + ". Enter Student Course: ");
            String course = sc.next();

            // Student Marks
            int marks;
            while (true) {
                System.out.print(idx + ". Enter Student Marks: ");
                marks = sc.nextInt();
                try {
                    check.checkMarks(marks);
                    break;
                }
                catch (IllegalArgumentException e) {
                    System.out.println("Invalid marks! Enter between 0 and 100.");
                }
            }

            // Save Student Data
            Student st =  new Student(id, name, course, marks);
            list.add(st);
            store.storeStudentData(st);
            System.out.println("\n" + idx +  "th Student Added Successfully\n");

            std_count--;
            idx++;
        }


        // Reading Data form file
        System.out.println("Do you want to see the Student Data (Yes/No): ");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("Yes")) {
            System.out.println("Reading data from file.....");
            store.getStudentData();
        }


        // Find maximum marks
        System.out.println("\nDo you want to see the highest student marks (Yes/No): ");
        choice = sc.next();
        if(choice.equalsIgnoreCase("Yes")) {
            int maxMarks = list.stream().map(m -> m.getMarks()).max((m1,  m2) -> m1.compareTo(m2)).orElse(0);
            System.out.println("Highest marks is: " + maxMarks);
        }


        // Total Number of student enrolled in java
        System.out.println("\nDo you want to see the total numbers of student enrolled in 'Java Course' (Yes/No): ");
        choice = sc.next();
        if(choice.equalsIgnoreCase("Yes")){
            long count = list.stream().filter(f -> f.getCourse().equalsIgnoreCase("Java")).count();
            System.out.println("Total number of students enrolled in 'Java Course': " + count);
        }


        // Search student by name
        System.out.println("\nDo you want to search student by name (Yes/No): ");
        choice = sc.next();
        if(choice.equalsIgnoreCase("Yes")){
            System.out.print("Enter Student name: ");
            String name = sc.next();
            for(Student s : list){
                if(s.getStudentName().toLowerCase().contains(name.toLowerCase())){
                    System.out.println(s);
                }
            }
        }
    }
}
