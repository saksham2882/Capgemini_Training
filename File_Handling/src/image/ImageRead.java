package image;

import java.io.FileInputStream;

public class ImageRead {
    public static void main(String[] args) {

        String path = "output/copied.jpg";

        try {

            FileInputStream fis = new FileInputStream(path);

            int size = 0;

            while(fis.read() != -1){
                size++;
            }

            fis.close();

            System.out.println("Image Read Successfully");
            System.out.println("Image Size: " + size + " bytes");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
