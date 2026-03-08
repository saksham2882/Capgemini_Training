package create_write;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {

    public static void doWrite() throws IOException {

        FileWriter writer = new FileWriter("data/student.txt", true);    // here true is used to append the data

        writer.write("\nName: James Bond");
        writer.write("\nCourse: GoLang");
        writer.write("\nMarks: 85");

        writer.close();
    }

    public static void main(String[] args) {

        try {
            doWrite();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
