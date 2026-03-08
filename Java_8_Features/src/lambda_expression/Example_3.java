package lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example_3 {

    public static void filterEmployee(List<Employee2> emp, Predicate<Employee2> p) {
//        for (Employee2 e : emp) {
//            if(e.getSalary() > 50000){
//                System.out.println(e.toString());
//            }
//        }

        for (Employee2 e : emp) {
            if(p.test(e)){
                System.out.println(e.toString());
            }
        }
    }

    public static void main(String[] args) {

        List<Employee2> list = new ArrayList<>();

        list.add(new Employee2("Ashtam", 64000));
        list.add(new Employee2("Deep", 87000));
        list.add(new Employee2("Yogendra", 44000));
        list.add(new Employee2("Shubhi", 63987));

        // filter based on salary greater than 50000
        // filterEmployee(list);

        Predicate<Employee2> p = (e) -> e.getSalary() >= 50000;
        filterEmployee(list, p);


        filterEmployee(list, e -> e.getName().startsWith("D"));

        filterEmployee(list, e -> e.getSalary() == 64000);
    }
}
