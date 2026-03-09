package singleton_class;

public class Emp1 {
    private String name;
    private static Emp1 emp = new Emp1();

    private Emp1(){
        System.out.println("Emp1 Object Created");
    }

    public static Emp1 getInstance(){
        return emp;
    }

    public static void m1() {
        System.out.println("Static method m1 of Emp1");
    }
}
