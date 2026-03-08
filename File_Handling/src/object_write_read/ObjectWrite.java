package object_write_read;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWrite {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Harry");
        Student s2 = new Student(2, "Kim");
        Student s3 = new Student(3, "Jack");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data/studentObj.txt", true))){

            out.writeObject(s1);
            out.writeObject(s2);
            out.writeObject(s3);

            System.out.println("Object Saved Successfully");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
