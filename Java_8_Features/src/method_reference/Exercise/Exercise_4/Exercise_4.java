package method_reference.Exercise.Exercise_4;

public class Exercise_4 {
    public static void main(String[] args) {

        IConstructorCreator c = Emp::new;

        Emp obj = c.create("John", 1);

        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
