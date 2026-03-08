package lambda_expression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee2 {
    private String name;
    private int salary;

    public Employee2(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + " - Salary: " + salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


public class Example_2 {
    public static void main(String[] args) {

        List<Employee2> list = new ArrayList<>();

        list.add(new Employee2("Ashtam", 64000));
        list.add(new Employee2("Deep", 87000));
        list.add(new Employee2("Yogendra", 44000));
        list.add(new Employee2("Shubhi", 63987));


        Comparator<Employee2> c = (e1, e2) -> {
            return e1.toString().compareTo(e2.toString());
        };
        list.sort(c);
        // list.forEach(System.out::println);

        list.forEach(e -> {
            if(e.getSalary() > 50000)  {
                System.out.println(e.toString());
            }
        });
    }
}
