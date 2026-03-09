package singleton_class;

public class Emp {
    private String name;

    private Emp(){
        System.out.println("Object Created");
    }

    public static Emp getInstance(){
        return new Emp();
    }

    // Till now, it is factory pattern
}
