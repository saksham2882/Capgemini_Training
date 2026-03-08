package create_write;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        File file = new File("data/student.txt");

        try {
            if(file.createNewFile()){
                System.out.println("File created");
            } else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
