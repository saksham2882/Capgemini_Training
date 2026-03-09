package singleton_class;

public class SingletonExample {
    public static void main(String[] args) {

        Emp e = Emp.getInstance();
        Emp e2 = Emp.getInstance();

        System.out.println(e);
        System.out.println(e2);
    }
}
