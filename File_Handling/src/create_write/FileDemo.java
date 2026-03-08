package create_write;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {

        // Step 1: Create folder reference
        File folder = new File("data");

        // Step 2: Check if folder exists
        if(!folder.exists()){
            boolean created = folder.mkdir();

            if(created){
                System.out.println("Folder created");
            } else {
                System.out.println("Failed to create folder");
            }
        } else {
            System.out.println("Folder already exists");
        }
    }
}
