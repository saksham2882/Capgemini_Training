package lambda_expression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


class Employee1 {
    private String name;

    public Employee1(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}


public class Example_1 {
    public static void main(String[] args) {

        List<Employee1> list = new ArrayList<>();

        list.add(new Employee1("Jack"));
        list.add(new Employee1("John"));
        list.add(new Employee1("Sam"));
        list.add(new Employee1("Jane"));

        // Way 1:
        list.forEach(System.out::println);


        // Way 2:
        Consumer<Employee1> consumer = a -> System.out.println(a);
        list.forEach(consumer);


        // Way 3:
        list.forEach(e -> System.out.println(e));


        // ====================== Sorting ==================

        // Way 1:
        Comparator<Employee1> c = (e1, e2) -> {
            return e1.toString().compareTo(e2.toString());
        };
        list.sort(c);
        list.forEach(System.out::println);

        // Way 2:
        list.sort((e1, e2) -> e1.toString().compareTo(e2.toString()));
    }
}
