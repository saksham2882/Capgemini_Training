public class Student {
    private int studentId;
    private String studentName;
    private String course;
    private int marks;

    public Student(){}


    public Student(int studentId, String studentName, String course, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", course='" + course + '\'' +
                ", marks=" + marks +
                '}';
    }
}
