package object_write_read;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Object_Reader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/studentObj.txt"));

        while (true) {
            try {
                Student student = (Student) in.readObject();
                System.out.println(student.id);
                System.out.println(student.name);
            }  catch (EOFException e) {
                break;
            }
        }


//        Student s = (Student) in.readObject();
//
//        System.out.println(s.id);
//        System.out.println(s.name);
//
//        Student s2 = (Student) in.readObject();
//
//        System.out.println(s2.id);
//        System.out.println(s2.name);
    }
}
