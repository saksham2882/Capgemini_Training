import java.io.*;

public class StoreData {

    public void storeStudentData(Student s){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/students.txt", true));
            writer.write(s.getStudentId() + "," + s.getStudentName() + "," + s.getCourse() + "," + s.getMarks());
            writer.newLine();
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getStudentData() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/students.txt"));
            String data;

            while ((data = reader.readLine()) != null){
                System.out.println(data);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
