package CollectionsExample;

public class ObjectHashCode {
    public static void main(String[] args) {

        Employee e = new Employee("Ram");
        Employee e1 = new Employee("Ram");

        System.out.println(e);
        System.out.println(e1);

        System.out.println(e.hashCode());
        System.out.println(e1.hashCode());

        String s = new String("aaaaa");
        System.out.println(e.equals(s));

        System.out.println(e.equals(e1));
    }
}
