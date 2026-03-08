package stream_api;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Atul", 56000));
        employees.add(new Employee(102, "Saurabh", 76000));
        employees.add(new Employee(103, "Karim", 90000.32));
        employees.add(new Employee(103, "Karim", 90000.87));
        employees.add(new Employee(104, "Neha", 40000));



        // employees.stream().filter(e -> e.getSalary() < 50000).forEach(e -> System.out.println(e));

        // print maximum salary
        // double maxSal = (int) employees.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get().getSalary();
        // System.out.println(maxSal);

        // print maximum salary
        // Employee emp = employees.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
        // System.out.println(emp);

        // print maximum salary
        // Employee emp1 = employees.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).get();
        // System.out.println(emp1);


        // print total salary - (also compare the timing between seq, parallel)
        // long start = System.currentTimeMillis();
        // double totalSal = employees.stream().collect(Collectors.summingDouble(e -> e.getSalary()));
        // long end = System.currentTimeMillis();
        // System.out.println("Total salary: " + totalSal);
        // System.out.println("Time Taken by Seq Stream -> " + (end - start));

        // long start1 = System.currentTimeMillis();
        // double totalSal1 = employees.parallelStream().collect(Collectors.summingDouble(e -> e.getSalary()));
        // long end1 = System.currentTimeMillis();
        // System.out.println("Total salary: " + totalSal1);
        // System.out.println("Time Taken by Par Stream -> " + (end1 - start1));



    }
}
