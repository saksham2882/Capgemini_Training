public class CheckValidation {

    public void checkName(String name) throws InvalidNameException {
        if(!name.matches("[a-zA-Z ]+")){
            throw new InvalidNameException("Student name is invalid");
        }
    }

    public void checkMarks(int marks) {
        if(marks < 0 || marks > 100){
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
    }
}
